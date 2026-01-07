println("LOADED build.gradle.kts from: " + project.projectDir)

plugins {
    java
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    flatDir { dirs("libs") }  // local jars
    mavenCentral()            // fetch ASM
}

dependencies {
    // ASM for instrumentation
    implementation("org.ow2.asm:asm:9.5")
    implementation("org.ow2.asm:asm-commons:9.5")

    // Local jars
    implementation(files(
        "libs/runelite-api.jar",
        "libs/runescape-api.jar",
        "libs/injected-client.jar",
        "libs/client.jar",
        "libs/feroxlauncher.jar",
        "libs/okhttp-3.14.9.jar"
    ))
}

// =======================
// Build fat agent jar (includes ASM + all dependencies)
// =======================
tasks.named<Jar>("jar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    // Include runtime classpath (ASM + local jars)
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    manifest {
        attributes(
            "Premain-Class" to "agent.Agent",
            "Can-Redefine-Classes" to "true",
            "Can-Retransform-Classes" to "true"
        )
    }
}

// Vanilla run (optional)
tasks.named<JavaExec>("run") {
    dependsOn(tasks.named("jar"))
    jvmArgs("-javaagent:${tasks.named<Jar>("jar").get().archiveFile.get().asFile.absolutePath}")
}

// Run RuneLite client with agent attached
tasks.register<JavaExec>("runClient") {
    dependsOn(tasks.named("jar"))
    classpath = files(
        fileTree(System.getProperty("user.home") + "/.ferox/repository2/").include("*.jar")
    )
    mainClass.set("net.runelite.client.RuneLite")
    jvmArgs("-javaagent:${tasks.named<Jar>("jar").get().archiveFile.get().asFile.absolutePath}")
}


// Helper to dump classpath
tasks.register("dumpCp") {
    doLast {
        println("implementation deps = " + configurations.getByName("implementation").dependencies.joinToString())
        println("compileClasspath files:")
        configurations.getByName("compileClasspath").files.forEach { println(it.absolutePath) }
    }
}

// Compiler options
tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release.set(17)
    options.isWarnings = true
    options.compilerArgs.addAll(listOf(
        "-Xlint:deprecation",
        "-Xlint:unchecked"
    ))
}
