package org.example

//Turunan yang ketiga adalah Map,
// yakni sebuah collection yang dapat menyimpan
// data dengan format key-value.

/*
val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)
 */

/*
fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])

    // Output: Indonesia
}
 */

//Kita dapat menampilkan key apa saja yang ada di
// dalam Map dengan menggunakan fungsi keys().
// Fungsi ini akan mengembalikan nilai berupa Set karena key pada Map haruslah unik.

/*
fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val mapKeys = capital.keys

    // mapKeys: [Jakarta, London, New Delhi]

 */

//Lalu, untuk mengetahui nilai apa saja yang ada di dalam Map,
// kita bisa menggunakan fungsi values().

/*
fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val mapValues = capital.values

    // mapValues: [Indonesia, England, India]

    println(mapValues)
}

 */
