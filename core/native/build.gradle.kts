import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "br.com.firstsoft.kracing"
version = "0.0.1"


dependencies {
    implementation(libs.diozero.core)
    implementation(libs.diozero.ws281x)
    implementation(libs.jna)
    implementation(libs.jackson.module)
    implementation(libs.jackson.dataformat)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization)

    implementation(projects.core.common)
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