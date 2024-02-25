package org.example

//1.fungsi slice() membutuhkan sebuah argumen berupa Range
// yang digunakan untuk menentukan posisi pertama dan
// terakhir yang akan disaring. Berikut contohnya:

/*
fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

    /*
    output: [4, 5, 6, 7]
    */
}
 */

//Karena menggunakan Range, kita juga bisa menggunakan
//operator step ketika argumennya disematkan seperti berikut:

/*
fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6 step 2)

    println(slice)

    /*
    output: [4, 6]
    */
}
 */

//Kemudian jika ingin menentukan posisi yang lebih
// spesifik, kita bisa mendefinisikannya di dalam sebuah
// collection, kemudian disematkan sebagai argumen

/*
fun main(args: Array<String>) {
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)

    println(slice)

    /*
    output: [3, 4, 6, 9]
    */
}
 */

//2.fungsi distinct()untuk menyaring item yang sama
/*
fun main(args: Array<String>) {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    /*
    output: [1, 2, 3, 4, 5]
    */

}
 */

//Kita juga bisa menggunakannya pada collection
// dengan tipe parameter seperti data class.
// Misal seperti berikut:

/*
data class Item(val key: String, val value: Any)

fun main(args: Array<String>) {
    val items = listOf(
    Item("1", "Kotlin"),
    Item("2", "is"),
    Item("3", "Awesome"),
    Item("3", "as"),
    Item("3", "Programming"),
    Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
    println("${it.key} with value ${it.value}")
    }


    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */
}
 */

//kita bisa juga menentukan proses penyaringan item yang sama seperti
//apa yang akan dijalankan dengan menggunakan fungsi distinctBy()

/*
fun main(args: Array<String>) {
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct = text.distinctBy {
        it.length
    }

    println(distinct)

    /*
    output: [A, CC, EEE, GGGG]
    */
}
 */

//3.fungsi chunked() bisa kita gunakan untuk memecah nilai
// String menjadi beberapa bagian kecil dalam bentuk Array
//chunked() membutuhkan nilai yang akan digunakan sebagai jumlah
//indeks untuk pemisah. Contoh penggunaannya seperti berikut:

/*

fun main(args: Array<String>) {
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

    /*
    output:[QWE, RTY]
    */
}
 */

//hasil dari nilai yang sudah dipecah ingin kita buat menjadi huruf kecil,
// maka kita bisa menggunakan fungsi chunked() seperti berikut:

/*
val word = "QWERTY"
val chunkedTransform = word.chunked(3) {
    it.toString().toLowerCase()
}

println(chunkedTransform)

/*
    output: [qwe, rty]
    */
 */