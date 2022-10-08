plugins {
    id("pinkbunny.android")
}

pinkBunnyAndroid.useCompose()

moduleDependencies {
    design.android()
}

dependencies {
    implementation(libs.bundles.base)
    implementation(libs.bundles.compose.common)
    implementation(libs.bundles.compose.wear)

    debugImplementation(libs.compose.uiTooling)
    debugImplementation(libs.compose.uiTest.manifest)

    testImplementation(libs.bundles.test.kotlin)

    androidTestImplementation(libs.bundles.test.android)
}
