plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotlin-starter"
include("src:main:OOP")
findProject(":src:main:OOP")?.name = "OOP"
include("OOP")
include("OOP:src:main:OOP")
findProject(":OOP:src:main:OOP")?.name = "OOP"
include("kotlin-oop")
