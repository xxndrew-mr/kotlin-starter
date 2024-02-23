package org.example

//kita juga bisa gunakan  When Expression,
// yakni mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program.

/*

fun main() {
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
        output: value is 7

}
 */

//Di dalam when kita juga bisa menambahkan branch else seperti berikut:

/*

fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
        output: value cannot be reached

}
 */

//Sama halnya seperti if expression, when expression dapat mengembalikan nilai dan
// dapat disimpan di dalam sebuah variabel seperti berikut:

/*

fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)


        output : value is 7

 */

//Jika kita memiliki dua atau lebih baris kode yang akan kita jalankan di setiap branch,
// kita bisa memindahkannya ke dalam curly braces seperti berikut:

/*
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
             "value cannot be reached"
        }
    }

    println(stringOfValue)

        output :
            Seven
            value is 7

}
 */

//when juga memungkinkan kita untuk memeriksa instance dengan tipe
// tertentu dari sebuah objek menggunakan is atau !is. Contohnya seperti berikut:

/*
fun main() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
        output : the value has a Long type
}
 */

//Selain itu, when expression juga bisa kita gunakan untuk
// memeriksa nilai yang terdapat pada sebuah Range atau Collection.

/*

val value =  27
val ranges = 10..50

when(value){
    in ranges -> println("value is in the range")
    !in ranges -> println("value is outside the range")
}

/*
    output : value is in the range
    */
 */