plugins {
    kotlin("jvm") version "2.0.20" // Kotlin version to use
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
