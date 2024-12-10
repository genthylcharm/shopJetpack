plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.dvl.shoponline"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dvl.shoponline"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    // Coil - Load images in Jetpack Compose
    implementation("io.coil-kt:coil-compose:2.4.0")

// Accompanist - ViewPager and Indicators for Compose
    implementation("com.google.accompanist:accompanist-pager:0.28.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.28.0")

// Lifecycle - Handle lifecycle-aware components
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")

// Jetpack Compose - LiveData integration
    implementation("androidx.compose.runtime:runtime-livedata:1.7.5")

// Glide - Load and manage images in Android
    implementation("com.github.bumptech.glide:glide:4.13.0")

// Gson - Handle JSON serialization and deserialization
    implementation("com.google.code.gson:gson:2.10.1")

// ConstraintLayout for Jetpack Compose
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.0")

// Jetpack Compose Foundation - Core building blocks for UI
    implementation("androidx.compose.foundation:foundation:1.5.0")

// UI Tooling - For debugging and previewing Compose UIs
    implementation("androidx.compose.ui:ui-tooling:1.7.5")

// Material Design - UI components based on Material Design
    implementation("com.google.android.material:material:1.12.0")

}