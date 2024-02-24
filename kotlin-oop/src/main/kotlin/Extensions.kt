package org.example

//1.Extension Functions,Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type,
// kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.). Contohnya seperti berikut:

/*
fun Int.printInt() {
    print("value $this")
}
*/

//Untuk memanggil extension functions di atas, lakukan dengan cara berikut.

/*
fun main() {
    110.printInt()
}

/*
   output : value 110
*/

fun Int.printInt() {
    print("value $this")
}

 */

//Selain itu, jika extension functions tersebut dapat mengembalikan nilai

/*
fun main() {
    println(10.plusThree())
}

fun Int.plusThree(): Int {
    return this + 3
}

 */

//Extension Properties,extension untuk menambah
// sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.

//Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut. Contoh seperti berikut:

/*
val Int.slice: Int
    get() = this / 2
 */

//Untuk memanggil extension di atas, lakukan dengan cara berikut:

fun main() {
    println(10.potong)
}

/*
   output : 5
*/

val Int.potong: Int
    get() = this / 2

//Anda bisa menggunakan infix function
// untuk memanggil suatu fungsi dengan
// cara yang lebih ringkas dan mirip dengan
// pemakaian operator matematika.

//Contohnya Anda memiliki sebuah function
// untuk menambahkan dua nilai angka seperti berikut.

/*
infix fun Int.sum(value: Int): Int {
    return this + value
}

fun main(){
    val result = 5 sum 3
    println(result)
}
 */

//Namun, ada beberapa syarat untuk menggunakan infix function.
//
//Infix function harus merupakan sebuah member function atau extension function.
//
//Harus memiliki satu parameter saja.
//
//Parameter tidak boleh berupa generic dan tidak memiliki nilai default.


//Ketika memanggil method dengan notasi infix, Anda bisa menggunakan
// this yang nantinya akan mereferensikan ke method tersebut.

/*
class MyHero {
    infix fun addHero(s: String) { /*...*/ }

    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}
 */
