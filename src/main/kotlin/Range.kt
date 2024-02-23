package org.example

//Kita dapat menentukan nilai awal dan nilai akhir pada Range. Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().

/*
val rangeInt = 1..10
 */

//Jarak antara dua nilai yang dicakup, ditentukan oleh step. Secara default, step bernilai 1. Untuk mendapatkan
// step kita bisa menggunakan properti step seperti contoh berikut:

/*
fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)
}
   output: 1
 */

//Dan untuk mengubah nilai dari step bisa dilakukan ketika
// kita menginisialisasi nilai yang dicakup Range itu sendiri:

/*
fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}
 output: 1 3 5 7 9 2
 */

//Kita juga bisa menentukan nilai yang dicakup pada Range dengan urutan terbalik seperti berikut:

/*
val downInt = 10.downTo(1)
 */

//Kita juga bisa memeriksa apakah suatu nilai ada pada cakupan nilai Range.

/*
fun main() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}
   output: Value 7 available
 */

//Range pada Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange dan CharRange.
// Sehingga selain nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai yang dicakup oleh Range:

/*
val rangeChar = 'A'.rangeTo('F')
 */

//Nilai pada variable rangeChar di atas mencakup A, B, C, D, E, F