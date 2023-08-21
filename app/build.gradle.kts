plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    defaultConfig {
        applicationId = ConfigurationData.applicationId
        namespace = ConfigurationData.namespace
    }
}

dependencies {
    // Core
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)

    // Design
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)

    // Test
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.junitTest)

    // DI
    implementation(Libraries.implementationDagger)
}