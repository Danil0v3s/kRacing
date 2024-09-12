import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    kotlin("jvm") version libs.versions.kotlin
    kotlin("plugin.serialization") version libs.versions.kotlin
    id("com.diffplug.spotless") version "6.1.0"

    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "20"
}