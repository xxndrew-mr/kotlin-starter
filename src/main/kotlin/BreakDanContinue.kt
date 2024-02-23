package org.example

//Break dan Continue
//Ketika melakukan perulangan, terkadang kita
// dihadapkan dengan data yang tak sesuai harapan. Contoh, seperti berikut:

/*
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        print(i)
    }
}
   output: 123null5null7
 */

//Continue,Pada kode di bawah kita menggunakan kata kunci continue. Jika hasil evaluasi expression yang diberikan bernilai true,
// maka proses iterasi akan dilewatkan dan lanjut ke proses iterasi berikutnya.

/*
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
}

   output: 12357
 */

//Penggunaan break pada kode di bawah akan langsung
// menghentikan proses iterasi jika variabel i bernilai null.

/*
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}

     output :123

 */


//Break dan continue,Label pada Kotlin memiliki sebuah identifier yang diikuti
// dengan tanda @. Contoh dari sebuah label adalah foo@ atau bar@.
//Untuk melabeli sebuah expression, kita cukup menempatkan label di depannya

/*
fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}


   output :
       Outside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop

 */

//Pada kode diatas, break yang
// sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label.
// break akan menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil.