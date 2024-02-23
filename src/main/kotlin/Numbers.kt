package org.example

//Beberapa tipe bawaan yang merepresentasikan Numbers adalah Double, Long, Int, Short dan Byte

//Untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number, kita bisa menggunakan properti MAX_VALUE.  Sementara untuk mengetahui nilai minimal yang dapat disimpan, gunakan properti MIN_VALUE.

/*
val maxInt = Int.MAX_VALUE
val minInt = Int.MIN_VALUE

println(maxInt)
println(minInt)

     output :
            2147483647
            -2147483648

 */

//Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+), pengurangan (-), perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).

/*
val numberOne = 1
val numberTwo = 2

print(numberOne + numberTwo)

        output : 3
     */

//Perlu diketahui, hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah. Contohnya seperti berikut:

/*
val numberOne: Int = 27
val numberTwo: Int = 10

print(numberOne / numberTwo)

        output : 2
     */

//Operasi 4 * 4 akan dilakukan terlebih dahulu, kemudian diikuti 5 + 16. Jika ingin operasi 5 + 4 dilakukan terlebih dahulu, gunakan tanda kurung:

//lakukan konversi dengan bantuan beberapa fungsi seperti toInt() berikut:

/*
val byteNumber: Byte = 10
val intNumber: Int = byteNumber.toInt() // ready to go
 */

// Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:

//toByte(): Byte
//
//toShort(): Short
//
//toInt(): Int
//
//toLong(): Long
//
//toFloat(): Float
//
//toDouble(): Double
//
//toChar(): Char

/*
val stringNumber = "23"
val intNumber = 3

print(intNumber + stringNumber.toInt())
     output: 26

 */

//Dengan Kotlin kita juga bisa menuliskan nilai numerik yang
// “readable” dengan menggunakan tanda underscores seperti berikut: