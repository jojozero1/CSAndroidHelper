// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {

    repositories {
        google()
//        mavenCentral()
        // Add the Maven address

        maven {
            url = uri ("https://developer.huawei.com/repo/")

        }

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.2.2")
        classpath ("com.huawei.agconnect:agcp:1.9.1.300")

    }

}

//allprojects {
//    repositories {
//        // Add the Maven address.
//        maven {
//            url = uri("https://developer.huawei.com/repo/")
//        }
//    }
//
//}

plugins {
    id("com.android.application") version "8.2.0" apply false
//    id ("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
//    id ("com.huawei.agconnect") version "1.9.1.300"
}

