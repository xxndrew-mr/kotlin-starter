package org.example

//If akan mengeksekusi sebuah statement atau expression jika hasil evaluasi dari expressions yang diberikan pada blok if
// bernilai true. Sebaliknya, jika bernilai false maka proses yang ditentukan akan dilewatkan.

/*val openHours = 7
val now = 20
if (now > openHours){
    println("office already open")
}

 */

//Jika if digunakan untuk mengembalikan nilai atau menetapkan nilai dari sebuah variabel maka if wajib memiliki
// branch else. Contohnya seperti berikut:

/*
val openHours = 7
val now = 20
val office: String
if (now > openHours) {
    office = "Office already open"
} else {
    office = "Office is closed"
}

print(office)
 */

//If merupakan sebuah expressions yang dapat mengembalikan nilai,
//sehingga kita dapat menyimpan hasilnya ke dalam sebuah variabel.

/*val openHours = 7
val now = 20
val office: String
office = if (now > openHours) {
    "Office already open"
} else {
    "Office is closed"
}

print(office)
 */

//Pada kode di atas, kita hanya menggunakan If untuk menguji 2 (dua) kondisi. Lalu bagaimana jika kita memiliki beberapa
// kondisi? Kita bisa menggabungkan else dan if seperti berikut:

/*val openHours = 7
val now = 7
val office: String
office = if (now > 7) {
    "Office already open"
} else if (now == openHours){
    "Wait a minute, office will be open"
} else {
    "Office is closed"
}

print(office)
 */
