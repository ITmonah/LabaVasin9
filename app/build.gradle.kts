plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.labavasin9"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.labavasin9"
        minSdk = 24
        targetSdk = 35
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
}

dependencies {
    implementation("androidx.credentials:credentials:1.5.0-alpha05")
    implementation("androidx.credentials:credentials-play-services-auth:1.5.0-alpha05")
    implementation(libs.appcompat)
    implementation("com.google.android.gms:play-services-auth:20.4.0")
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}