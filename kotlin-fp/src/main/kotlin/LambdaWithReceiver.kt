package org.example

//vKonsep ini digunakan sebagai dasar Kotlin
// untuk digunakan sebagai Domain Specific Languages (DSL).

//Berikut adalah contoh membuat Lambda with Receiver:

/*
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
 */

//Pada kode di atas, StringBuilder dijadikan sebagai receiver
// untuk tipe deklarasi parameter action. Dengan begitu kita
// dapat memanggil parameter action tersebut dari variabel yang
// bertipekan StringBuilder. Untuk memanggil fungsi di atas bisa
// seperti berikut:

/*
fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

/*
   output : Hello from lambda
*/

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
 */



