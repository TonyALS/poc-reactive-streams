import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.tony"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.projectreactor:reactor-core:3.4.0")

    //log - logback
    implementation("ch.qos.logback:logback-classic:1.2.3")

    //reactor-debug-agent
    implementation("io.projectreactor:reactor-tools:3.4.0")

    //testing
    testImplementation("io.projectreactor:reactor-test:3.4.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.1")
    testImplementation("org.mockito:mockito-core:3.2.4")
    testImplementation("org.mockito:mockito-junit-jupiter:3.2.4")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}