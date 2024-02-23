package org.example

//1.While,Untuk menggunakan While, kita membutuhkan kata kunci while, lanjut ke kondisi di dalam tanda kurung,
// dan diakhiri oleh blok body dari while itu sendiri. Berikut adalah contoh dari penggunaan While:

/*

fun main() {
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }
}
   output :
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!

 */

//Dengan While kita tidak perlu menuliskan fungsi println() secara berulang
// untuk mencetak teks ke dalam konsol seperti contoh kasus di awal.

//2.Do While,Berbeda dengan While, Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal.
// Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.

/*

fun main() {
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}

 */

//While dan Do While sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka. Untuk melakukannya kita bisa
// menggunakan For Loop yang akan kita pelajari pada sub-modul selanjutnya.