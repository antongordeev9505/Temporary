plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Core
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)
    implementation(Libraries.cicerone)
    implementation(Libraries.fragments)

    // Design
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Test
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.junitTest)

    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)
}