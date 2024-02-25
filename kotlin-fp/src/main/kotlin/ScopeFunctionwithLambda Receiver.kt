package org.example

//1.Fungsi run akan mengembalikan nilai berdasarkan expression yang berada
// di dalam blok lambda. Untuk mengakses konteks dari objek, ia akan
// menggunakan receiver (this). Fungsi run akan sangat berguna jika di
// dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.

/*
fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}


   output : result : replace text from Hello to Kotlin

 */

//2.Selanjutnya fungsi with. Pada dasarnya fungsi with bukanlah sebuah extension
// melainkan hanyalah fungsi biasa. Konteks objeknya disematkan sebagai argumen
// dan dari blok lambda diakses sebagai receiver. Contohnya seperti berikut:

/*
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
}
 */

//3.nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek
// konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat melakukan inisialisasi
// atau konfigurasi dari receiver-nya. Perhatikan kode berikut:

/*
fun main() {
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())
}

/*
   output : Hello Kotlin
*/
 */

//Dengan fungsi apply kita bisa menuliskannya seperti di bawah ini:

/*
fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}


   output : Hello Kotlin

 */
