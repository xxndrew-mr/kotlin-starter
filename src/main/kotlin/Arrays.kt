package org.example

//Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size.
// Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut:

/*
val array = arrayOf(1,2,3,70)
 */

// Kita juga dapat memasukkan nilai dengan berbagai jenis tipe data ke dalam arrayOf()

//Kita juga bisa mendapatkan nilai tunggal dari sekumpulan nilai yang berada di dalam sebuah
// Array dengan memanfaatkan indexing seperti berikut:

/*
val intArray = intArray(1,3,5,7)
print(intArray[2])

    output : 5
 */

//Nilai 2 pada kode di atas merupakan indeks atau posisi dari nilai tunggal yang ingin kita dapatkan. Perlu diketahui
// bahwa sebuah indeks selalu dimulai dari 0. Selain mendapatkan nilai tunggal, dengan indexing kita juga bisa mengubah
// nilai tunggal tersebut. Sebagai contoh:

/*
val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
intArray[2] = 11                       // [1, 3, 11, 7]

print(intArray[2])


        Output: 11

 */