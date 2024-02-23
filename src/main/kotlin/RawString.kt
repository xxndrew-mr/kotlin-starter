package org.example

//Dengan Raw String, kita dapat membuatnya dengan
// cara yang lebih mudah yaitu seperti berikut.

fun main() {
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}

//Pada kode di atas,
// kita mendefinisikan sebuah Raw String menggunakan triple quote (""" """). Raw String memungkinkan kita untuk membuat beberapa baris
// String tanpa penggabungan (concatenation) dan penggunaan karakter escaped.