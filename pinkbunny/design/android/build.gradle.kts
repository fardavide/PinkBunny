plugins {
    id("pinkbunny.android")
}

pinkBunnyAndroid.useCompose()

dependencies {
    implementation(libs.bundles.base)
    implementation(libs.bundles.compose.common)

    debugImplementation(libs.compose.uiTooling)
    debugImplementation(libs.compose.uiTest.manifest)

    testImplementation(libs.bundles.test.kotlin)

    androidTestImplementation(libs.bundles.test.android)
}
