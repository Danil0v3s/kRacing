plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "br.com.firstsoft.kracing"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.11.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}