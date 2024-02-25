package org.example

//1.Mari kita mulai dari fungsi filter() dan filterNot() terlebih dahulu. Kedua fungsi tersebut akan menghasilkan list
// baru dari seleksi berdasarkan kondisi yang kita berikan. Sesuai dengan namanya, untuk mem-filter atau menyaring suatu
// data dalam sebuah collection.

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    // evenList: [2, 4, 6, 8, 10]

    println(evenList)
}
 */

//Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan.
// Caranya adalah dengan menggunakan fungsi filterNot().

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    // notEvenList: [1, 3, 5, 7, 9]

    println(notEvenList)
}
 */

//2.map(). Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
// Kita ambil contoh dari numberList yang sudah ada.

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    println(multipliedBy5)
}
 */

//it pada kode di atas akan merepresentasikan
// masing-masing item pada numberList.

//3.Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di
// dalam collection.

/*
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
print(numberList.count())

// Output: 10
 */

//kali ini kita akan menampilkan jumlah item pada
// numberList yang merupakan kelipatan dari 3.

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList.count { it % 3 == 0 })

    // Output: 3
}
 */

//4.find(), firstOrNull(), & lastOrNull()
//Selanjutnya adalah fungsi yang digunakan untuk mencari item pada sebuah collection.
// Untuk mencari item pertama yang sesuai dengan
// kondisi yang kita tentukan, kita bisa menggunakan fungsi find()

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // firstOddNumber: 1
    // firstOrNullNumber: null

    println("firstOddNumber: $firstOddNumber")
    println("firstOrNullNumber: $firstOrNullNumber")
}
 */

//Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya,
// jika di dalam collection tidak ditemukan data yang sesuai, fungsi akan mengembalikan nilai
// null. Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item,
// fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian,
// jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().

//5.first() & last()
//Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item
// pertama atau terakhir dari sebuah collection

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)

    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.
}
 */

//6.Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan menjumlahkan
// setiap data yang ada pada collection.

/*
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList.sum()

    // total: 55

    println(total)
}
 */

//7.sorted() digunakan untuk mengurutkan item yang ada di dalam collection.

/*
fun main(args: Array<String>) {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]
}
 */

//Namun, untuk sorting secara descending, kita dapat menggunakan
// fungsi sortedDescending().

/*
fun main(args: Array<String>) {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]
}
 */
