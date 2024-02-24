package org.example

//1. try-catch. Kode yang dapat membangkitkan suatu exception
// disimpan dalam blok try, dan jika exception tersebut terjadi, maka blok catch akan terpanggil

/*
try {
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: SomeException) {
    // Block catch akan terpanggil ketika exception bangkit.
}
 */

//Dengan menuliskan kode dalam blok try, kode kita menjadi terproteksi dari exception.
// Jika terjadi exception maka program tidak akan terhenti atau crash, namun akan dilempar
// menuju blok catch.  Di sana kita dapat menuliskan sebuah kode alternatif untuk menampilkan
// pesan eror atau yang lainnya.

/*
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}

output:
    Nilai String Null

 */

//2.try-catch-finally,finally akan dieksekusi setelah
// program keluar dari blok try ataupun catch. Bahkan
// finally juga tereksekusi ketika terjadi exception
// yang tidak terduga. Exception tidak terduga terjadi
// ketika kita menggunakan NullPointerException pada catch
// namun exception yang terjadi adalah

/*

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}


output:
    Nilai String Null

 */

//Dengan menerapkan finally, fungsi println() cukup dituliskan pada blok finally.

//3.Multiple Catch,Multiple catch memungkinkan untuk penanganan exception dapat
// ditangani lebih dari satu tipe exception. Hal ini sangat berguna ketika kita
// ingin menangani setiap tipe exception dengan perlakuan yang berbeda.

/*

import kotlin.NumberFormatException

fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}

	output:
    Catch block NullPointerException terpanggil!

 */
