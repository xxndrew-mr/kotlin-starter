package org.example

//Nullable Receiver,kita bisa juga
// mendeklarasikan sebuah extension
// dengan nullable receiver type.
// Alhasil, extension tersebut bisa
// dipanggil pada objek yang bahkan nilainya null.

/*
val Int?.potong:Int
    get()=if(this==null)0 else this.div(2)

 */

//Selain menggunakan if expression, kita juga bisa
// menggunakan elvis operator. Misalnya seperti berikut:

/*
val Int?.potong:Int
    get()= this?.div(10)?: 0
fun main() {
    val value: Int? = null

    println(value.potong)
}

 */

//kita perlu memeriksa apakah objek tersebut bernilai null
// atau tidak? Bisa juga dengan menggunakan operator safe
// call setiap kali extension tersebut dipanggil

/*
fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value?.slice)
    println(value1?.slice)
}

val Int.slice: Int
    get() = this.div(0)

 */

//Kita juga bisa menentukan nilai dari receiver object jika bernilai null.
//Sehingga kita tidak perlu lagi menggunakan operator safe call ketika ingin memanggil extension tersebut.

fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slice)
    println(value1.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0
