plugins {
    java
    kotlin("jvm") version "1.4.21" apply false
    id("com.github.johnrengelman.shadow") version "5.2.0" apply false
}

subprojects {

    group = "xyz.ixidi.flaming"
    version = "1.0"

    apply(plugin = "java")
    apply(plugin = "com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        main {
            java.setSrcDirs(listOf("src"))
            resources.setSrcDirs(listOf("resources"))
        }
    }

}
