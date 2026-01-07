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
    flatDir { dirs("libs") }
}

dependencies {
    implementation(files(
        "libs/runelite-api.jar",
        "libs/runescape-api.jar",
        "libs/injected-client.jar",
        "libs/client.jar",
        "libs/feroxlauncher.jar",
        "libs/okhttp-3.14.9.jar"
    ))
}

tasks.named<org.gradle.jvm.tasks.Jar>("jar") {
    manifest {
        attributes(
            "Premain-Class" to "agent.Agent",
            "Can-Redefine-Classes" to "true",
            "Can-Retransform-Classes" to "true"
        )
    }
}

application {
    mainClass.set("net.runelite.launcher.Launcher")
}

val agentJar = tasks.named<org.gradle.jvm.tasks.Jar>("jar").flatMap { it.archiveFile }

tasks.named<org.gradle.api.tasks.JavaExec>("run") {
    dependsOn(tasks.named("jar"))
    jvmArgs("-javaagent:${agentJar.get().asFile.absolutePath}")
}

tasks.register<org.gradle.api.tasks.JavaExec>("runClient") {
    dependsOn(tasks.named("jar"))
    // Copy launcher’s full classpath from ~/.ferox/repository2/
    classpath = files(fileTree(System.getProperty("user.home") + "/.ferox/repository2/").include("*.jar")) + files(agentJar.get().asFile)
    mainClass.set("net.runelite.client.RuneLite")
    jvmArgs("-javaagent:${agentJar.get().asFile.absolutePath}")
}

tasks.register("dumpCp") {
    doLast {
        println("implementation deps = " + configurations.getByName("implementation").dependencies.joinToString())
        println("compileClasspath files:")
        configurations.getByName("compileClasspath").files.forEach { println(it.absolutePath) }
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release.set(17)
    options.isWarnings = true
    options.compilerArgs.addAll(listOf(
        "-Xlint:deprecation",
        "-Xlint:unchecked"
    ))
}
