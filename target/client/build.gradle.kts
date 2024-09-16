import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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
    implementation(libs.ktor.client.contentNegotiation)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.serialization.json)
    implementation(libs.ktor.client.auth)

    implementation(libs.kotlinx.collections.immutable)

    implementation(compose.desktop.currentOs)
    implementation(libs.compose.material.icons)
    implementation("org.jetbrains.androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0")

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