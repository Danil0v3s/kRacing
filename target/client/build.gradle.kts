import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
}

group = "br.com.firstsoft.kracing"
version = "0.0.1"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

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

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "20"
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