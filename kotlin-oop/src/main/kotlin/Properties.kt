package org.example

//Contoh sebelumnya pada kelas Animal, properti yang dimiliki
// berupa name, weight, age dan isMammal.

//properti dapat dideklarasikan sebagai nilai mutable dengan
// menggunakan var atau sebagai nilai read-only dengan menggunakan val.

//kotlin mampu memebuat dua fungsi getter dan setter pada kasus tertentu saja,contohnya di bawah
//ini

class hewan(){
    var name: String = "Dicoding Miaw"
}

fun main(){
    val dicodingCat = hewan()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

//Tetapi jika kita melakukan override pada fungsi getter dan juga setter , maka kita dapat menambahkan
// kode lain pada fungsi getter sesuai dengan kebutuhan. Mari kita coba modifikasi kode sebelumnya menjadi:


/*class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

}
*/
