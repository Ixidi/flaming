apply(plugin = "org.jetbrains.kotlin.jvm")

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":api"))
    implementation("net.sf.jopt-simple:jopt-simple:4.7")
    implementation(fileTree("lib"))
}