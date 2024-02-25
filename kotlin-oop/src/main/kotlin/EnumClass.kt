package org.example

import java.awt.Color

//merupakan salah satu fitur yang bisa kita gunakan untuk
// menyimpan kumpulan objek yang telah didefinisikan menjadi
// tipe data konstanta.

/* contoh
fun main() {
    val colorRed = Color.RED
    val colorGreed = Color.GREEN
    val colorBlue= Color.BLUE
}




enum class Color (val value : Int){
    RED(0xFF000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}

 */


//Berikut contoh ketika kita ingin mengakses objek
// yang berada di dalam kelas Enum:


/*
fun main() {
    val color : Color = Color.GREEN
    print(color)
}

enum class Color{
    RED, GREEN, BLUE
}

 */

//Setiap enum class memiliki sebuah synthetic method yang memungkinkan
//kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.

/*
fun main() {
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

    /*
        output :
        Color is RED
        Color value is ff0000
    */

}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

 */

//kita juga bisa mendapatkan posisi tiap objek menggunakan
// properti ordinal seperti berikut:

/*
fun main() {
    val color: Color = Color.GREEN

    print("Position GREEN is ${color.ordinal}")

    /*
        output : Position GREEN is 1
    */
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
 */

//Lantas bagaimana cara kita mengecek instance dari Enum itu sendiri? Nah, untuk mengeceknya,
// gunakan When Expression seperti berikut:
fun main() {
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }

    /*
        output : Color is Green
    */
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}








