plugins {
    kotlin("jvm") version "2.1.21"
}


group = "org.Boucher"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.21.2")
    testImplementation(kotlin("test"))


}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}