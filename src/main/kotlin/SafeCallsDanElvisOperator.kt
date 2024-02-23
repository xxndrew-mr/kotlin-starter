package org.example

//bagaimana menangani objek nullable dengan cara yang lebih mudah,
// yaitu menggunakan Safe Calls dan Elvis Operator.

//1.Safe Calls.Dalam menggunakan safe call, kita akan mengganti tanda titik (.)
// dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable seperti berikut.

/*
val text : String? = null
text?.length
 */

//2.Elvis operator memungkinkan kita untuk menetapkan default value
// atau nilai dasar jika objek bernilai null.

/*
val text : String? = null
val textLength = text?.length?: 7
 */

//Elvis akan mengembalikan nilai text.length jika text tidak bernilai null. Sebaliknya,
// jika text bernilai null, default value yang akan dikembalikan.