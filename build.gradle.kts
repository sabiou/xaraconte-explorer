plugins {
    id("org.jetbrains.kotlin.js") version "1.4.10"
}

// val kotlinWrappersSuffix = project.property("kotlin.wrappers.suffix") as String

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        setUrl("https://dl.bintray.com/kotlin/kotlin-eap")
    }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

kotlin {
    js {
        useCommonJs()
        browser{}
        binaries.executable()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))

    //React, React DOM + Wrappers
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.110-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.110-kotlin-1.4.0")
    implementation(npm("core-js", "2.6.5"))
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))
    implementation(npm("react-is", "16.13.1"))

    implementation(npm("@jetbrains/logos", "1.1.6"))
    implementation(npm("@jetbrains/ring-ui", "3.0.4"))

    //Kotlin Styled
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.110-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-css:1.0.0-pre.110-kotlin-1.4.0")
    implementation(npm("styled-components", "~5.1.1"))
    implementation(npm("inline-style-prefixer", "~6.0.0"))

    //Video Player
    implementation(npm("react-player", "~2.6.0"))

    //Share Buttons
    implementation(npm("react-share", "~4.2.1"))

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
}