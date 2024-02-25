package org.example

//Dengan ditetapkannya tipe deklarasi pada fungsi tersebut, memungkinkan kita untuk bisa menggunakannya
// sebagai argumen untuk fungsi lainnya. Contohnya seperti berikut.

/*
fun main() {
    printResult(10 ,sum)
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

/*
   output : 20
*/
 */

//Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan
// fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.

//kita bisa juga melampirkan isi lambda secara langsung ketika fungsi printResult()
// di atas dipanggil seperti berikut.

/*
fun main() {
    printResult(10, { value ->
        value + value
    })
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

/*
   output : 20
*/
 */

//inline Function




