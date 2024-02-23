package org.example

//Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen yang kita masukkan ketika
// fungsi tersebut dipanggil. Contoh dari penggunaan vararg adalah sebagai berikut.

/*

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
 */

//Bisa kita perhatikan pada contoh kode di atas bahwa kata kunci vararg ditempatkan sebelum nama parameter.
// Ketika ingin memanggil fungsi tersebut, kita bisa melampirkan beberapa argumen seperti berikut.

/*

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

/*
   output : 100
*/
 */


//kita bisa memanggil fungsi atau properti yang tersedia pada kelas Array dari dalam fungsi tersebut, contohnya seperti properti size.

/*

fun main() {
    val number = getNumberSize(10, 20, 30, 40, 50)
    print(number)
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

/*
   output : 5
*/
 */