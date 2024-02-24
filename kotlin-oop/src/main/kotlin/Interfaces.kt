package org.example

//Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas. Kelas yang mengimplementasikan sebuah
// interface diharuskan melakukan override seluruh properti dan fungsi sekaligus mendefinisikan isi fungsi yang
// terdapat pada interfaces-nya

//Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital

/*
interface IFly {
    fun fly()
}
 */

//Cara mengimplementasikan sebuah interface pada kelas,
// sama seperti kita melakukan extends pada sebuah super atau parent class.

/*
class Bird : IFly {

}
 */

//Maksud dari eror tersebut adalah kita harus  mengimplementasi sebuah abstract member yang pada kasus ini adalah sebuah fungsi abstract yang terdapat pada IFly.
// Maka untuk menghilangkan eror tersebut, kita harus melakukan override fungsi yang terdapat pada IFly.

/*
class Bird : IFly {
    override fun fly() {
        println("I flying without wings")
    }
}
 */

//Untuk menambahkan sebuah properti pada interface, kita cukup menuliskannya seperti pada kelas namun tanpa melakukan inisialisasi nilai:

/*
interface IFly {
    fun fly()
    val numberOfWings: Int
}
 */

//Sama seperti fungsi, kita juga diharuskan melakukan override properti. Overriding properti bisa dilakukan
// pada sebuah konstruktor kelas seperti berikut:

/*
class Bird(override val numberOfWings: Int) : IFly {

    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}
 */


//abstract class dan interface memiliki beberapa perbedaan.
// Untuk lebih jelasnya, perhatikan kode berikut ini.

/*
abstract class Animal {
    //default value not allowed
    abstract val age: Int //must be overridden
    //default value allowed
    open val isEating = true //optional to be overridden
    val isRespire = true //can not be overridden
}

interface IWalk {
    //default value not allowed
    val numberOfLeg: Int //must be overridden
    fun walk() //must be overridden
}

interface IDrink {
}

class Camel : Animal(), IWalk, IDrink {
    override val age: Int = 7   // this property must exist, try to remove it
    override val isEating = true // this property optional, try to remove it
    override val numberOfLeg = 2 // this property must exist, try to remove it
    override fun walk() { // this method  must exist, try to remove it
        println("Camel can walk")
    }
}

fun main(){
    val camel = Camel()
    camel.walk()
}
 */
