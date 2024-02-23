package org.example

//Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false.
// Terdapat 3 (tiga) operator yang dapat digunakan pada Boolean.

// 1.Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.

/*
val officeOpen = 7
val officeClosed = 16
val now = 20

val isOpen = if (now >= officeOpen && now <= officeClosed){
    true
} else {
    false
}

print("Office is open : $isOpen")


        Output : Office is open : false
     */

//Cara membaca kode di atas adalah sebagai berikut.

//Membuat sebuah variabel bernama isOpen dengan tipe data Boolean.
//Variabel isOpen akan bernilai true (1) ketika nilai variabel nowlebih besar sama dengan (>=) variabel officeOpen dan (&&) variabel nowlebih kecil sama dengan (<=) variabel officeClosed.
//Variabel isOpen akan bernilai false (0) ketika kondisi sebelumnya tidak terpenuhi.

//If expressions di atas bisa Anda sederhanakan menjadi seperti berikut.

/*
val isOpen = now >= officeOpen && now <= officeClosed

print("Office is open : $isOpen")

        Output : Office is open : false
     */


//2.Berbeda dengan operator AND (&&), operator OR (||) akan mengembalikan nilai true jika hasil evaluasi
// dari salah satu expressions yang diberikan bernilai true.

/*
val isClose = now < officeOpen || now > officeClosed

print("Office is closed : $isClose

        output : Office is closed : true
 */

//Variabel isClose di atas bernilai true. Alasannya, hasil evaluasi salah satu expression yang diberikan,
// bernilai true, yaitu expression disebelah kanan.

//3.operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan. Contoh, Jika hasil
// expressions setelah dievaluasi bernilai true, operator NOT akan mengembalikan nilai false.

/*
if (!isOpen) {
    print("Office is closed")
} else {
    print("Office is open")
}
        Output : Office is open
 */

