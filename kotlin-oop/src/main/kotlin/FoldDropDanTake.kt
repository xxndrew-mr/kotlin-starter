package org.example

//1.kita bisa dengan mudah melakukan perhitungan setiap
// nilai yang berada di dalam sebuah collection tanpa
// harus melakukan iterasi item tersebut satu-persatu
// menggunakan fungsi fold()

/*
fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    /*
      output:
         current 10
         item 1

         current 11
         item 2

         current 13
         item 3

         Fold result: 16
   */
}
 */

//2.Selanjutnya adalah fungsi drop(), fungsi yang bisa kita manfaatkan untuk
// memangkas item yang berada di dalam sebuah objek collection berdasarkan
// jumlah yang kita tentukan.

/*
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)
    /*
      output: [4, 5, 6]
   */
}
 */

//bagaimana jika kita ingin memangkas nilai dari indeks terakhir?
// Kita bisa menggunakan fungsi dropLast().

/*
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)

    /*
      output: [1, 2, 3]
   */
}
 */

//3.fungsi take() bisa kita manfaatkan untuk menyaring item yang
// berada di dalam sebuah objek collection.

/*
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    /*
      output: [1, 2, 3]
   */
}
 */

//operasi dari posisi atau indeks terakhir yaitu takeLast().
// Contohnya seperti berikut:

/*
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(3)

    println(take)

    /*
      output: [4, 5, 6]
   */
}
 */


