plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.todoapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.todoapp"
        minSdk = 24
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
    buildFeatures{
        viewBinding=true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.navigation.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    val nav_version= "2.5.2"
    implementation("androidx.navigation:navigation-fragment-ktx:nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:nav_version")
//    val nav_version = "2.8.5"
//    implementation("androidx.navigation:navigation-compose:nav_version")
//
//    // Views/Fragments integration
//    implementation("androidx.navigation:navigation-fragment:nav_version")
//    implementation("androidx.navigation:navigation-ui:nav_version")
//
//    // Feature module support for Fragments
//    implementation("androidx.navigation:navigation-dynamic-features-fragment:nav_version")
//
//    // Testing Navigation
//    androidTestImplementation("androidx.navigation:navigation-testing:nav_version")
//
//    // JSON serialization library, works with the Kotlin serialization plugin
//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")

}