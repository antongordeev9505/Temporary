pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Birbank Invest"
include(":app")
include(":splash_screen_module")
include(":component_manager")
include(":authorization")
include(":authorization_api")
include(":core")
