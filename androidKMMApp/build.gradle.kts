plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.igorpk.kmmpoc.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.igorpk.kmmpoc.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.2")
    implementation("androidx.compose.ui:ui-tooling:1.4.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.2")
    implementation("androidx.compose.foundation:foundation:1.4.2")
    implementation("androidx.compose.material3:material3:1.0.1")
    implementation("androidx.activity:activity-compose:1.7.1")
    implementation ("androidx.navigation:navigation-compose:2.5.3")
    implementation("androidx.compose.material3:material3-window-size-class:1.0.1")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.4.3")
}