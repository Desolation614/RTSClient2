plugins {
    java
    application
}

group = "com.rtsclient"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/injected-client.jar"))
    implementation(files("libs/runelite-api.jar"))
    implementation(files("libs/runescape-api.jar"))
    implementation(files("libs/okhttp-3.14.9.jar"))
}

tasks.register<Jar>("scriptsJar") {
    archiveBaseName.set("scripts")
    archiveVersion.set("")
    destinationDirectory.set(file("plugin_build"))

    // Only include scripts folder (examples/)
    from(sourceSets.main.get().output) {
        include("examples/**")
    }
}

tasks.register<JavaExec>("runClient") {
    group = "application"
    description = "Run Ferox with scripts in dev mode"

    classpath = files(
        "libs/injected-client.jar",
        "libs/runelite-api.jar",
        "libs/runescape-api.jar",
        "libs/okhttp-3.14.9.jar",
        "plugin_build/scripts.jar",
        sourceSets.main.get().runtimeClasspath
    )

    mainClass.set("net.runelite.client.RuneLite")
    jvmArgs = listOf("-ea", "--developer-mode")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
