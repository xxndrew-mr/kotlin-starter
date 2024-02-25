package org.example

/*
val message = { println("Hello From Lambda") }
 */

//Kode di atas adalah contoh deklarasi dari lambda versi ringkas, di mana tipe data tidak perlu dituliskan dan fungsi lambda ditandai dengan sepasang kurung kurawal.
// Di dalamnya terdapat fungsi untuk mencetak teks pada konsol.

fun main() {
    message()
}

val message = { println("Hello From Lambda") }

/*
   output : Hello From Lambda
*/

//bagaimana cara mendeklarasi lambda agar dapat mengembalikan nilai?
// Caranya, kita bisa menuliskannya seperti di bawah ini.

/*
fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }

/*
   output : Message length 17
*/
 */

//Ternyata forEach adalah sebuah
// extension function yang menerapkan lambda.

/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}

/*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
*/
 */

//Anda juga dapat menggunakan extension forEachIndexed untuk mendapatkan
// indeks dari tiap nilai yang dicakup.

/*
fun main() {

    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
*/
