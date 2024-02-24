package org.example

//Primary Constructor,Kita dapat langsung menginisialisasi pada properti tertentu atau menginisialisasinya melalui constructor (konstruktor). Konstruktor merupakan fungsi spesial yang
// digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.

//Penulisan primary constructor mirip seperti parameter pada fungsi. Properti cukup dituliskan pada header class
// diawali dengan var atau val. Perhatikan kode berikut.

/*
fun main() {
    val catMiaw = animal("Kucing Miaw",4.2,2,true)
    println("Nama : ${catMiaw.name},Berat : ${catMiaw.weight}, Umur : ${catMiaw.age},Mamalia : ${catMiaw.isMammal}")
}

class animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
*/


//Untuk membuat nilai default pada sebuah primary constructor, kita perlu menginisialisasi nilai pada saat
// kita menuliskan properti pada kelas. Perhatikan kode berikut.


/*class animal(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)
*/

//2.init Block,Pada kelas Animal contohnya, kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol.
//
//Untuk membuatnya, kita dapat menggunakan keyword init kemudian inisialisasikan semua properti di dalam blok tersebut dengan parameter kelas.

class binatang (pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}
fun main() {
    val dicodingCat = binatang("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

//Untuk menghindari ambiguitas kita dapat menggunakan keyword this dalam
// menginisialisasi properti tersebut dalam blok init.

/*
class binatang(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}
*/


