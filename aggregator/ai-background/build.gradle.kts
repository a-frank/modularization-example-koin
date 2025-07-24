import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.kotlin.ksp)
}

android {
    namespace = "com.photoroom.aggregator.aibackground"
    compileSdk = libs.versions.targetSdkVersion.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdkVersion.get().toInt()
        targetSdk = libs.versions.targetSdkVersion.get().toInt()
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

ksp {
    arg("KOIN_CONFIG_CHECK", "true")
}

dependencies {
    implementation(project(":data-provider:user"))
    implementation(project(":data-provider:outpaint"))
    implementation(project(":util:di"))

    implementation(libs.kotlinx.coroutines.core)

    implementation(libs.koin.android)
    implementation(libs.koin.startup)
    implementation(libs.koin.annotations)
    ksp(libs.koin.ksp.compiler)
}
