plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.techcos.vibenow"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.techcos.vibenow"
        minSdk = 21
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
        viewBinding = true
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    //Glide for image loading
    implementation("com.github.bumptech.glide:glide:4.14.2")
    implementation("androidx.test:monitor:1.6.1")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("junit:junit:4.12")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")
    //for Notification
    implementation("androidx.media:media:1.6.0")
    //for storing objects in shared preferences
    implementation("com.google.code.gson:gson:2.10")
    //for sending mail
//    implementation 'com.sun.mail:android-mail:1.6.2'
//    implementation 'com.sun.mail:android-activation:1.6.2'

    //for circular seekbar --> volume controls
    implementation("com.github.lukelorusso:VerticalSeekBar:1.2.7")
    //noinspection GradleCompatible
    implementation ("com.android.support:support-v4:27.0.1")
}