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
    implementation(libs.jna)
    implementation(libs.jackson.module)
    implementation(libs.jackson.dataformat)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization)
    implementation(projects.core.common)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}