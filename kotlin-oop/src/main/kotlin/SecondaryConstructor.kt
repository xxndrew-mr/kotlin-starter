package org.example

//Secondary constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain. Anda dapat membuat lebih dari satu secondary constructor. Sebagai contoh, kita
// bisa menambahkan secondary constructor pada kelas Animal:

class animal(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = animal("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = animal("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}

//Default Constructor,Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat
// sebuah konstruktor secara manual. Perhatikan kode berikut:

/*
class animal{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main(){
    val dicodingCat = animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}


output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/
