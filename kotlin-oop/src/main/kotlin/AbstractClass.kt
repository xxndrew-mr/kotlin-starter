package org.example

//konsep abstract class perlu diterapkan agar kelas Animal
// tidak dapat direalisasikan dalam bentuk objek namun tetap
// dapat menurunkan sifatnya kepada child class-nya.

//kita hanya perlu menambahkan keyword abstract
// sebelum menuliskan nama kelas

/*
abstract class animol(val name:String, val weight : Double, val age : Int, val isCarnivora : Boolean){
    open fun eat(){
        println("$name sedang makan")
    }

    open fun sleep(){
        println("$name sedang tidur")
    }
}

fun main() {
    val animol = animal("Andre",2.1,4,true)
}

 */