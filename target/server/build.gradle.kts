import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("com.diffplug.spotless")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

group = "br.com.firstsoft"
version = "0.0.1"

dependencies {
    implementation(libs.ktor.auth)
    implementation(libs.ktor.serialization)
    implementation(libs.ktor.server)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.websockets)

    implementation(libs.logback)

    implementation(libs.kotlinx.serialization)
    implementation(libs.jackson.module)
    implementation(libs.jackson.dataformat)

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
        mainClass = "ServerMainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Msi)
            packageName = "kMonitor Server"
            packageVersion = "0.0.1"
        }
    }
}