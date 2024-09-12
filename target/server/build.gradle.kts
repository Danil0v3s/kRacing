plugins {
    kotlin("jvm") version "1.9.0"
}

group = "br.com.firstsoft.kracing"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}