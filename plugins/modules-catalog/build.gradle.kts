plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "pinkbunny.modulesCatalog"
            displayName = "Pink Bunny Modules"
            description = "Add DSL for reference Project modules"
            implementationClass = "PinkBunnyModulesCatalogPlugin"
        }
    }
}

dependencies {
    implementation(project(":kotlin"))
    implementation(libs.gradle.kotlin)
    testImplementation(libs.bundles.test.kotlin)
}
