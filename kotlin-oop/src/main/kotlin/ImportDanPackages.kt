package org.example

//Package tersebut digunakan untuk mengelompokkan kelas,
// fungsi dan variabel yang mempunyai kemiripan fungsionalitas.

//Importing Package.Untuk mengimpor suatu package kelas,
// fungsi atau variabel, kita cukup menuliskan keyword import

/*
import packagename.ClassName
import packagename.functionName
import packagename.propertyName
 */

//Karena kelas Alamak berada pada package kotlin.random,
// maka penulisannya menjadi seperti ini:

/*
import kotlin.random.Alamak
 */

//kita dapat menuliskan kelas Random
// secara langsung tanpa menulis seluruh alamat package-nya.

/*
import kotlin.random.Random

val someInt = Random(0).nextInt(1, 10)

 */

//Kita dapat mengimpor seluruh kelas, fungsi dan variabel yang
// berada pada suatu package dengan menggunakan tanda  * pada akhir package tersebut.

import kotlin.math.*

fun main(){
    println(PI)
    println(cos(120.0))
    println(sqrt(9.0))
}




