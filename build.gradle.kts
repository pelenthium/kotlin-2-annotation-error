import java.net.URI

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation("io.swagger.core.v3:swagger-annotations:2.2.26")
}

repositories {
    maven {
        url = URI("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    }
}