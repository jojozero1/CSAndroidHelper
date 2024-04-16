pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
//
        maven {
            url = uri("https://developer.huawei.com/repo/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
//
        maven {
            url = uri("https://developer.huawei.com/repo/")
        }
    }
}

rootProject.name = "CSPhoneHelper"
include(":app")
include(":asr_core")



