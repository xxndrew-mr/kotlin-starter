package org.example

//Kotlin mampu membedakan objek yang boleh bernilai null dan objek yang tidak boleh bernilai null
// pada saat objek tersebut dibuat.

/*
val text: String = null // compile time error
 */

//Jika ingin sebuah objek bisa bernilai null, kita bisa menambahkan tanda ?
// setelah menentukan tipe dari objek tersebut.

/*
val text: String? = null // ready to go
 */

//Anda juga bisa menggunakan is atau !is untuk memastikan sebuah variabel. Compiler akan memastikan
// tipe data dari variabel tersebut. Contohnya sebagai berikut.

/*
var obj: Any = "Dicoding"

if(obj is String) {
    // Tidak membutuhkan casting secara eksplisit.
    println("String length is ${obj.length}")
}
 */


/*
var string: String? = "Dicoding"
if(string != null) { // smart cast
    print(string.length) // It works now!
}
 */
