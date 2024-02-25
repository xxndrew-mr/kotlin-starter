package org.example

//Function References
//Pada suatu kondisi, terkadang kita butuh mereferensikan sebuah fungsi.
// Sebagai contoh, misal kita memiliki fungsi seperti berikut:

/*
fun isEvenNumber(number: Int) = number % 2 == 0
 */

//Sebagai contoh, penggunaan fungsi filter()
// yang menjadi bagian dari kelas List berikut:

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)
}

/*
   output = [2, 4, 6, 8, 10]
*/

fun isEvenNumber(number: Int) = number % 2 == 0

//2.Property References,Selain digunakan untuk mereferensikan sebuah fungsi. Operator ::
// juga dapat digunakan untuk mereferensikan sebuah properti.

/*
var message = "Kotlin"

fun main() {
   println(::message.name)
   println(::message.get())

   ::message.set("Kotlin Academy")

   println(::message.get())
}
 */