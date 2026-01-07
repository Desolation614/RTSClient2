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
}

dependencies {
    implementation(files("libs/injected-client.jar"))
    implementation(files("libs/runelite-api.jar"))
    implementation(files("libs/client-57b3fe11d3.jar"))
    implementation(files("libs/feroxlauncher.jar"))
}

application {
    mainClass.set("net.runelite.launcher.Launcher")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
