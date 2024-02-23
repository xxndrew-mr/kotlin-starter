package org.example

//Pendeklarasian fungsi pada Kotlin diawali dengan kata kunci fun kemudian dilanjutkan dengan nama fungsi yang dikehendaki. Selanjutnya adalah parameter yang berada pada fungsi yang dideklarasikan. Awali dengan nama parameter dan ikuti dengan tipe parameter itu sendiri yang
// dipisahkan oleh karakter colon (:). Setiap parameter yang berada pada sebuah fungsi dipisahkan oleh karakter koma dan berada di dalam tanda kurung.

/*
fun setUser(name:String,age:Int): String
 */

//Fungsi di atas akan mengembalikan nilai berupa String. Setelah menentukan tipe nilai kembalian, barulah kita menentukan function body di mana di dalamnya terdapat expression atau statement untuk dijalankan. Function body berada di
// dalam curly braces ({}) setelah tipe nilai kembalian.

/*
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}
 */

//Nilai yang akan dikembalikan diikuti oleh kata kunci return. Jika di dalam suatu fungsi hanya memiliki satu expression untuk menentukan nilai kembalian, maka fungsi tersebut bisa diubah menjadi expression body.
// Kita hanya perlu menambahkan tanda = dan menuliskannya seperti berikut:

/*
fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
 */

//Jika kita tidak ingin fungsi yang dibuat mengembalikan nilai, kita bisa menggunakan Unit sebagai tipe nilai kembaliannya. Contohnya seperti berikut:

/*

fun printUser(name: String): Unit {
    print("Your name is $name")
}
 */

//Ketika menggunakan tipe kembalian Unit, Kotlin memungkinkan kita untuk menghilangkannya. Kenapa demikian? Kompiler akan mendeteksinya sebagai tipe kembalian yang redundant:

/*
fun printUser(name: String) {
    print("Your name is $name")
}
 */

//Pemanggilan fungsi, bisa dilakukan dengan pendekatan tradisional seperti berikut:

/*
fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/
 */