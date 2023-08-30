plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "az.kapitalbank.splash_screen_module"
    compileSdk = 34

    defaultConfig {
        applicationId = "az.kapitalbank.splash_screen_module"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
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
    kapt(Libraries.kaptDagger)

    implementation("androidx.core:core-splashscreen:1.0.1")

    implementation("com.github.terrakok:cicerone:7.1")

    implementation ("androidx.fragment:fragment-ktx:1.6.1")


}

kapt {
    correctErrorTypes = true
}