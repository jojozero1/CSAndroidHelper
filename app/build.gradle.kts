

plugins {
    id("com.android.application")
    id ("com.huawei.agconnect")
    id("org.jetbrains.kotlin.android")

}

android {
    namespace = "com.example.csphonehelper"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.csphonehelper"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

    }
    signingConfigs {
        create("release") {
            storeFile = file("CSPH.jks")
            keyAlias = "CSPhoneHelper"
            keyPassword = "159357"
            storePassword = "159357"
//            v1SigningEnabled = true
//            v2SigningEnabled = true
        }
    }

    buildTypes {

    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
//            minifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            signingConfig = signingConfigs.getByName("release")
//            debuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    configurations {
        all {
            exclude (group= "org.jetbrains", module= "annotations")
        }
    }

}

dependencies {

    implementation ("com.huawei.agconnect:agconnect-core:1.9.1.300")

    implementation ("com.huawei.hms:ml-computer-voice-asr:3.12.0.301")

    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(project(":asr_core"))

    implementation ("androidx.localbroadcastmanager:localbroadcastmanager:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")

    implementation ("io.noties.markwon:core:4.6.2")
    implementation ("io.noties.markwon:ext-latex:4.6.2")
    implementation ("io.noties.markwon:ext-tables:4.6.2")
    implementation ("io.noties.markwon:linkify:4.6.2")
    implementation ("io.noties.markwon:image:4.6.2")
    implementation ("io.noties.markwon:syntax-highlight:4.6.2")
    implementation (group = "com.unfbx", name = "chatgpt-java", version= "1.1.3")

    annotationProcessor ("io.noties:prism4j-bundler:2.0.0")


    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
//apply (plugin= "com.huawei.agconnect")