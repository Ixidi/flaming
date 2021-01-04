apply(plugin = "org.jetbrains.kotlin.jvm")

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":api"))
    compileOnly(project(":mc1_12_2"))
}
