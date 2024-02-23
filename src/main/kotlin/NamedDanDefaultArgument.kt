package org.example

//1. Named Argument

/*
        fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}
 */

//Nah, dengan memanfaatkan named argument, kita bisa menuliskannya seperti di bawah ini:

/*
fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

 */

//2.Default Argument,Untuk menambahkan nilai default itu sendiri pun cukup mudah, yaitu dengan cara menempatkannya langsung tepat di samping dari
// parameter seperti halnya ketika ingin menginisialisasikan sebuah nilai untuk variabel. Contohnya seperti berikut:

/*

fun getFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName()
    print(fullName)
}

   output : Kotlin is Awesome
 */

//Tentunya ini menghindari kita dari eror. Meskipun begitu,
// kita tetap bisa melampirkan sebuah argumen. Contohnya seperti berikut:

/*

fun getFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)
}

    output : Dicoding is Awesome

 */

