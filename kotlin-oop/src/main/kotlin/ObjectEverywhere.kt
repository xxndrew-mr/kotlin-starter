package org.example

//Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean merupakan sebuah Object.

/*
    val someString = "Dicoding"
 */

//Pada kode tersebut kita melakukan pembuatan variabel yang juga merupakan sebuah objek dengan
// nama someString. Objek tersebut merupakan realisasi dari kelas String, maka objek someString
// memiliki fungsi dan properti yang merupakan anggota dari kelas String.

//Kita bisa menggunakan fungsi reverse() untuk membuat urutan huruf disusun secara terbalik,
// fungsi toUpperCase() yang dapat membuat huruf menjadi kapital atau fungsi toLowerCase()
// yang dapat membuat menjadi huruf kecil.

/*
    fun main () {
        val someString = "Dicoding"
        println(someString.reserved())
        println(someString.uppercase())
        println(someString.lowercase())
        }

        output : gnidociD
                 DICODING
                 dicoding
 */

//Kita juga dapat mengubah tipe data dengan mengakses
// fungsi yang tersedia dari sebuah objek String,contoh nya di bawah

/*

    fun main() {
            val someString = "123"
            val someInt = someString.toInt()
            val someOtherString = "12.34"
            val someDouble = someOtherString.toDouble()

            prinln(someInt is Int)
            println(someDouble is Double)

            output : true
                     true
 */

//Penjelasan,Hasil dari output kode menunjukan nilai true pada kedua
// variabel tersebut, yang artinya kita telah berhasil mengubah suatu
// tipe data String ke tipe data lainnya dengan menggunakan fungsi yang terdapat pada objek String.