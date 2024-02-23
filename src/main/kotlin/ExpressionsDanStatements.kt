package org.example

//contoh kode If sebagai statement berikut.

/*
fun main() {

    val openOffice = 7
    val now = 8
    if (now < openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }
}

 */

//Pada contoh kode di atas, if dikatakan sebagai statement karena ia tidak mengembalikan nilai apapun, hanya sebagai percabangan pada bahasa Kotlin.
//
//Namun, yang menarik If pada bahasa Kotlin juga bisa digunakan sebagai expression. Yang dimaksud dengan expression adalah statement yang dapat
// mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel seperti contoh berikut.

/*
fun main() {
    val openOffice = 7
    val now = 8
    val office = if (now < openOffice) "Office already open" else "Office close"
    print(office)
 */