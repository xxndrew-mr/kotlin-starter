package org.example

//Escaped String memungkinkan kita untuk mengurangi ambiguitas nilai yang berada di dalam sebuah String.
// Misalnya, ketika kita mendefinisikan sebuah String berikut.

//val statement = "Kotlin is Awesome!"

//Kemudian, kita ingin menambahkan tanda petik ganda di dalam sebuah String seperti berikut.

//val statement = "Kotlin is "Awesome!""

//Maka akan terjadi ambiguitas nilai pada variabel statement karena kompiler tidak dapat mengetahui akhir
// dari baris nilai untuk variabel statement. Untuk mengatasinya, kita bisa melakukan escaped dengan menambahkan karakter
// backslash (\) sebelum tanda petik ganda seperti berikut:

//val statement = "Kotlin is \"Awesome!\""

//Selain itu, kita juga bisa menambahkan sebuah Unicode ke dalam sebuah String seperti berikut.

fun main() {
    val name = "Unicode test: \u00A9"
    print(name)

}