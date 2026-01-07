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



application {
    mainClass.set("net.runelite.launcher.Launcher")
}

tasks.register("dumpCp") {
    doLast {
        println("implementation deps = " + configurations.getByName("implementation").dependencies.joinToString())
        println("compileClasspath files:")
        configurations.getByName("compileClasspath").files.forEach { println(it.absolutePath) }
    }
}


tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
