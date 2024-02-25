package org.example

//Sequence merupakan collection yang
// bisa dikategorikan ke dalam lazy evaluation.

//lazy evaluation hanya akan mengevaluasi  item jika
// benar-benar diperlukan [6]. Kita ambil contoh..
// Misalnya Anda mempunyai collection dengan jumlah data 10 atau 100 ,
// itu mungkin tidak akan memberi pengaruh besar terhadap performa
// program. Namun apa yang terjadi jika data yang ada pada collection
//mencapai ratusan ribu atau jutaan? Waktu proses pada sebuah program akan
// bertambah signifikan jika semua datanya harus dievaluasi.

/*
fun main() {
    val list = (1..10000).toList()
    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)
}
 */

//Untuk menerapkan lazy atau vertical evaluation, kita perlu mengubah list
// menjadi Sequence. Caranya sangat sederhana, yaitu dengan memanggil fungsi
// asSequence().

/*
fun main() {
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)
}
 */