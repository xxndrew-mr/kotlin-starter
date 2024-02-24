package org.example

//Dengan menentukan hak akses tersebut, kita dapat membatasi akses data
// pada sebuah kelas, inilah yang disebut dengan encapsulation pada salah satu pilar OOP.

// 1. Public ,Pada pembahasan sebelumnya kita sudah memiliki sebuah kelas Animal dengan properti publik seperti name,
// age, weight dan isMammal. Properti tersebut dapat kita akses dari luar kelas Animal.

//2.Private,Untuk menggunakan modifier private kita perlu menambahkan keyword private seperti contoh berikut:
//private val name: String,

//Satu satunya cara untuk mengakses properti private dari sebuah kelas adalah
// dengan menambahkan fungsi getter dan setter secara manual.

/*
class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

 */

//Fungsi getName() bertujuan untuk mengembalikan nilai name yang memiliki tipe data String. Kemudian fungsi setName() bertujuan
// untuk mengubah nilai properti name dengan nilai baru. Fungsi setName() membutuhkan satu parameter bertipe String yang nantinya
// akan dimasukkan nilainya ke dalam properti name.

/*
class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}

    output:
        Dicoding Miaw
        Gooose
 */


//3.Protected,Hak akses protected digunakan ketika kita
// menginginkan sebuah anggota dari induk kelas dapat diakses
// hanya oleh kelas yang merupakan turunannya.

/*
open class Animal(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)

*/

//Pada kode tersebut, properti weight pada kelas Animal memiliki
// hak akses protected. Kita tetap bisa mengaksesnya dari kelas
// Cat yang termasuk dalam hirarki kelas Animal. Namun kita tidak
// dapat mengakses properti tersebut secara langsung dari luar hirarki
// kelasnya. Eror akan terjadi jika kita melakukan hal tersebut.

//4.Internal,Hak akses ini membatasi suatu anggota untuk dapat
// diakses hanya pada satu modul.

/*
internal class Animal(val name: String)
 */

//Pada contoh di atas, kelas Animal telah ditetapkan sebagai
// kelas internal, maka kelas tersebut hanya dapat diakses dari
// modul yang sama. Hak akses ini sangat berguna ketika kita mengembangkan
// sebuah aplikasi yang memiliki beberapa modul di dalamnya.