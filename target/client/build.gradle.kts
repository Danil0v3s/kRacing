import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

group = "br.com.firstsoft.kracing"
version = "0.0.1"

dependencies {
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.json)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.serialization)
    implementation(libs.ktor.auth)
    implementation(libs.ktor.websockets)

    implementation(libs.kotlinx.collections.immutable)

    implementation(compose.desktop.currentOs)
    implementation(libs.compose.material.icons)

    implementation(projects.core.common)
    implementation(projects.core.native)
}

sourceSets {
    main {
        java {
            srcDir("src/main/kotlin")
        }
    }
}

compose.desktop {
    application {
        mainClass = "ClientMainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Msi, TargetFormat.Deb)
            packageName = "kMonitor"
            packageVersion = "0.0.1"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(20)
}