package org.example

class cat () {
    var name : String = "Kucing"
    var weight : Double = 3.2
    var age : Int = 2
    var isMammal : Boolean = true

    fun eat(){
        println("$name makan!")
    }

    fun sleep(){
        println("$name tidur!")
    }
}

fun main() {
    val rumahCat = cat()
    println("Nama: ${rumahCat.name}), Berat: ${rumahCat.weight}, Umur : ${rumahCat.age}, Mamalia : ${rumahCat.isMammal}")
    rumahCat.eat()
    rumahCat.sleep()

    //Mengubah Properti dari class rumahCat

    rumahCat.name = "Kucing Putih"
    rumahCat.weight = 6.0
    rumahCat.age = 3
    println("Nama: ${rumahCat.name}, Berat: ${rumahCat.weight}, Umur : ${rumahCat.age}, Mamalia : ${rumahCat.isMammal}")
    rumahCat.eat()
    rumahCat.sleep()
}