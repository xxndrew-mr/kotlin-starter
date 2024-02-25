package org.example

//Collections sendiri merupakan sebuah objek yang bisa menyimpan
// kumpulan objek lain termasuk data class. Dengan collection kita
// bisa menyimpan banyak data sekaligus.

//1.List,Sebagai contoh, kita bisa membuat sebuah List yang berisi
// sekumpulan data angka, karakter atau yang lainnya. Yang menarik,
// sebuah List tidak hanya bisa menyimpan data dengan tipe yang sama.

/*
val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
 */

//Namun, untuk membuat List dengan tipe data yang berbeda,
// cukup masukkan saja data tersebut seperti kode berikut.

fun main() {
    val anyList = listOf('a', "Kotlin", 3, true)

    print(anyList)
}

//Ketika bermain dengan sebuah List, tentunya ada saat di mana kita ingin
// mengakses posisi tertentu dari List tersebut. Untuk melakukannya, kita
// bisa menggunakan fungsi indexing seperti berikut.

/*
print(anyList[3])
 */

//2.Mutable List,Anda hanya perlu menggunakan fungsi mutableListOf seperti berikut:

/*
val anyList = mutableListOf('a', "Kotlin", 3, true, User())

 */
