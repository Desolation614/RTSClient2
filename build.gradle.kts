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
    mavenCentral()
    flatDir {
        dirs("libs")  // <-- your local JARs folder
    }
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

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
