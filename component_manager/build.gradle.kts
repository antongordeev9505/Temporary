plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    defaultConfig {
        namespace = ConfigurationData.namespace
    }
}

dependencies {
    implementation(Libraries.appCompat)
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}