package org.example


//salah satu alternatif solusi yang bisa dipakai
// adalah mengisinya dengan nilai null terlebih dahulu seperti berikut.

/*
var name : String? = null
fun main() {
    name = "Andre"
    println(name?.length)
}
*/

//1.Lateinit merupakan keyword yang ditambahkan sebelum variabel
// untuk membuat proses inisialisasi bisa ditunda. Berikut ini contohnya.

/*
lateinit var  name : String
fun main() {
    name = "Andre"
    print(name.length)
}
*/

//Kita juga dapat memeriksa apakah variabel tersebut sudah
//diinisialisasi dengan menggunakan fungsi isInitialized seperti ini

/*
lateinit var  name: String
fun main() {
    name = "Dicoding Miaw"
    if (::name.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}
*/

//2.kita juga bisa menggunakan lazy property untuk membuat property
// yang bukan null dan menunda inisialisasi. Berikut ini contoh kodenya.

val name : String by lazy {
    "Andre"
}
fun main() {
    print(name.length)
}
