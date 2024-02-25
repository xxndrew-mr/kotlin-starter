package org.example

//data class yang merupakan sebuah kelas sederhana yang
// bisa berperan sebagai data container. Data class adalah
// sebuah kelas yang tidak memiliki logika apapun dan juga
// tidak memiliki fungsionalitas lain selain menangani data

//untuk mengelola data hanya dengan sebuah keyword "data"

data class User(val name: String,val age: Int)

//Hanya dengan satu baris kode di atas, kompiler
// akan secara otomatis menghasilkan constructor,
// toString(), equals(), hashCode(), copy() dan juga
// fungsi componentN().

/*Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:

    1.Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;

    2.Semua konstruktor utama perlu dideklarasikan sebagai val atau var;

    3.Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.

 */
