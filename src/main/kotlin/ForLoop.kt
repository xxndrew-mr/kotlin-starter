package org.example

//For merupakan konsep perulangan pada blok yang sama selama hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai true. For dapat digunakan pada Ranges, Collections, Arrays dan apa pun yang
// menyediakan iterator. Contoh dari For loop sendiri adalah sebagai berikut.

/*
fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }
}

   output :
       value is 1!
       value is 2!
       value is 3!
       value is 4!
       value is 5!

 */

//Karena menggunakan range expression,
// kita juga dapat menuliskannya seperti berikut.

/*
fun main() {
    val ranges = 1.rangeTo(5)
    for (i in ranges){
        println("value is $i!")
    }
}

   output :
       value is 1!
       value is 2!
       value is 3!
       value is 4!
       value is 5!
 */

//Selain itu, kita juga dapat menuliskan For loop
// menggunakan range expression seperti berikut.

/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }
}

   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!

 */

//Kita juga dapat mengakses indeks untuk setiap elemen yang ada
// pada ranges dengan memanfaatkan fungsi withIndex() seperti berikut.

/*

fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}

   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3

 */

//Kita menggunakan kata kunci for untuk memulai proses perulangan. Untuk tujuan yang sama, kita juga bisa memanfaatkan
// salah satu ekstensi pada Kotlin yaitu forEach. Contohnya seperti berikut.

/*

fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}
 */

//Dengan menggunakan forEach , kita tidak perlu lagi menggunakan for secara terpisah seperti sebelumnya. Ia akan otomatis melakukan perulangan pada setiap item dari variabel tersebut sampai akhir. Untuk mendapatkan
// nilainya, kita definisikan variabel value seperti contoh di atas.




