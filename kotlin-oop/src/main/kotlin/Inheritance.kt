package org.example

//konsep inheritance atau pewarisan yang merupakan salah satu pilar dari OOP harus diterapkan.
// Pewarisan dapat mencegah kita melakukan perulangan kode. Untuk lebih memahaminya lihatlah
// contoh bagan pada sebuah kelas berikut:

open class animale(val name:String, val weight : Double, val age : Int,val isCarnivora : Boolean){
    open fun eat(){
        println("$name sedang makan")
    }

    open fun sleep(){
        println("$name sedang tidur")
    }
}

class Cat(pName: String, pWeight: Double,pAge: Int,pisCarnivora: Boolean, val funColor: String, val numberOfeet: Int )
    : anim(pName,pWeight,pAge,pisCarnivora){
        fun playWithHuman(){
            println("$name sedang bermain sama andre")
        }

    override fun eat() {
        println("$name sedang makan ikan")
    }

    override fun sleep() {
        println("$name sedang tidur sama andre" )
    }

    }

//Perhatikan bahwa pada kode di atas kita menggunakan keyword override untuk
// mengambil alih atau mengganti implementasi fungsi dari parent class.

fun main() {
    val andreCat = Cat("Andre Cat", 2.3, 3, true, "Brown", 4)

    andreCat.playWithHuman()
    andreCat.eat()
    andreCat.sleep()

}