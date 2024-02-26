package org.example

//Recursive function adalah sebuah mekanisme di mana sebuah fungsi
// digunakan dari dalam fungsi itu sendiri. Ini memungkinkan sebuah
// fungsi dapat berjalan beberapa kali.

/*
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
 }
 */

//Tail Call Recursion
//Namun kita tidak perlu khawatir dengan masalah seperti di atas. Kotlin
// mendukung gaya pemrograman fungsional yang bernama tail recursion yakni
// sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine)
// yang dijalankan terakhir pada sebuah prosedur.

//otlin menyediakan modifier agar kita bisa tetap menerapkannya, yaitu modifier tailrec.
// Penggunaannya adalah seperti berikut:

/*
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}
 */

//Pada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai dengan modifier tailrec, maka fungsi tersebut hanya boleh
// dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.

/*
fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    val numbers3 = ListNumber<String>()


    println("Values: " + numbers)
    println("Values: " + numbers)
    println("Values: " + numbers)
}

 */