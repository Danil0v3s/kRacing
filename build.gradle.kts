import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.libsDirectory
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version libs.versions.kotlin
    kotlin("plugin.serialization") version libs.versions.kotlin
    id("org.jetbrains.compose") version "1.4.3"
    id("com.diffplug.spotless") version "6.1.0"
}

group = "br.com.firstsoft"
version = "0.0.1"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

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

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "20"
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
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Msi)
            packageName = "kMonitor"
            packageVersion = "0.0.1"
        }
    }
}

spotless {
    format("misc") {
        target("*.gradle", "*.md", ".gitignore")

        trimTrailingWhitespace()
        indentWithTabs()
        endWithNewline()
    }
    kotlin {
        ktlint()
    }
}