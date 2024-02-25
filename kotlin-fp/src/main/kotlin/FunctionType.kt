package org.example

//itu function type. Seperti namanya,
// Anda dapat membuat sebuah fungsi menjadi tipe data.

//Ketika kita mempunyai beberapa fungsi yang memiliki function
// type yang sama, kita bisa menyederhanakannya. Bagaimana caranya?
// Manfaatkan kata kunci typealias

/*
typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
}
 */

//Sedangkan untuk menggunakan instance-nya, kita bisa memanfaatkan
// operator invoke() seperti berikut:


/*
typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}
 */

//Atau kita bisa menuliskannya secara
// langsung dengan menghilangkan operator invoke():

/*
typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum(10, 10)
    val multiplyResult = multiply(20, 20)

    println(sumResult)
    println(multiplyResult)
}
 */

//Kita juga bisa menandai function type sebagai nullable dengan
// menempatkannya di dalam tanda kurung dan diakhiri dengan safe
// call seperti berikut:

/*
typealias Arithmetic = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val sumResult = sum?.invoke(10, 10)

    println(sumResult)
}
 */