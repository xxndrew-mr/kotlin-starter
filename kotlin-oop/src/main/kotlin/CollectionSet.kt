package org.example

//Set merupakan sebuah collection yang hanya dapat
// menyimpan nilai yang unik. Ini akan berguna ketika
// Anda menginginkan tidak ada data yang sama atau duplikasi
// dalam sebuah collection.

/*
fun main(args: Array<String>) {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

    println(integerSet)

    // Output: [1, 2, 4, 5]
}
 */

//Kita juga dapat melakukan pengecekan apakah sebuah nilai ada
// di dalam Set dengan menggunakan kata kunci in.

/*
fun main(args: Array<String>) {
    val setA = setOf(1, 2, 4, 2, 1, 5)

    print(5 in setA)

    // Output: true
}
 */

//Kemudian ada juga fungsi union dan intersect
// untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set.
// Berikut contohnya.

/*
val setC = setOf(1, 5, 7)
val union = setA.union(setC)
val intersect = setA.intersect(setC)

println(union)
println(intersect)

// union: [1, 2, 4, 5, 7]
// intersect: [1, 5]
 */

//Berikut keterangan dari gambar di atas.
//
//Intersection
//Gunakanlah intersect untuk membuat sebuah set baru dengan nilai yang sama dari kedua set.
//
//Union
//Gunakanlah union untuk membuat sebuah set baru dengan mengambil semua data dari kedua set.
//
//Substracting
//Gunakanlah substract untuk membuat set baru dengan nilai-nilai yang tidak ada didalam set yang ditentukan.
//
//Symmetric Difference
//Berbeda dengan kasus di atas, di Kotlin tidak tersedia untuk mencari nilai symmetric difference. Anda perlu mencari secara manual nilai dalam semua set, tetapi untuk nilai yang sama tidak dimasukkan ke dalam set baru tersebut.