package org.example

//Apa itu Indexing?
//Indexing merupakan sebuah cara yang memudahkan kita untuk mengakses elemen
// yang berada di dalam sebuah Collection dengan memanfaatkan index atau posisi
// dari elemen tersebut. Posisi dari sebuah elemen pada umumnya dimulai dari angka 0.
fun main() {
    val text  = "Andre"
    val firstChar = text[3]

    print("The 4th character of the $text is $firstChar")

    //kita juga dapat melakukan iterasi terhadap objek String
    // dengan menggunakan for-loop seperti berikut.
    val nama = "Kotlin"
    for (char in text){
        print("$char ")
    }
}



