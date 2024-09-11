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
    implementation(libs.kotlinx.serialization)
    implementation(libs.jackson.module)
    implementation(libs.jackson.dataformat)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}