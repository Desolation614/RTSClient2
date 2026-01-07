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
    implementation(":runelite-api:")
    implementation(":injected-client:")
    implementation(":client:")
    implementation(":feroxlauncher:")
}

application {
    mainClass.set("net.runelite.launcher.Launcher")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
