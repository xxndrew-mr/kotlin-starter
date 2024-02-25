package org.example

//Singleton merupakan pattern yang berguna untuk memastikan
// suatu object hanya memiliki satu instance dengan satu titik
// akses global.


/*
object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

fun main() {
    CentralLibrary.borrowBookById(21)
}
 */

//Companion Object,Anda tidak dapat membuat inner
// object secara langsung di dalam class.

/*
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

fun main() {
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)
}

 */

//Anda bisa menggunakan keyword const val. Sayangnya, const val hanya
//bisa dideklarasikan di top level atau di dalam object. Di sinilah
//Companion Object berperan untuk mengatasinya.

class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object{
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

fun main() {
    val name = MyLibrary.LIBRARY_NAME
}

//Lalu, apa bedanya antara const val dengan val pada umumnya?
//
//Hal yang paling terlihat adalah kondisi ketika mendeklarasikannya. Val didefinisikan ketika runtime, sedangkan const
// val harus didefinisikan ketika compile time. Jadi, const val harus didefinisikan secara langsung, bukan dalam bentuk pemanggilan fungsi.
//
//
//Kedua adalah lokasi ketika dideklarasikan. Val bisa Anda
// letakkan di mana saja, sedangkan const val hanya bisa dideklarasikan pada top level file atau berada dalam object.
//
//Const val dapat meningkatkan kinerja dengan menghilangkan
// komputasi ketika runtime, sedangkan val nilainya perlu dievaluasi ketika runtime.

//3.Anonymous Chat,nonymous adalah class yang tak memiliki nama. Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung mendefinisikan
// isi dari sebuah class dengan menggunakan keyword object.

/*
interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })
}
 */

//Perhatikan bahwa kita tidak membuat class Bird lagi, tetapi langsung mendefinisikan isi
// dari kelas tersebut dengan menggunakan keyword object.

//4.Function(SAM)Interface,,Function Interface atau biasa disebut Single Abstract Method (SAM)
// Interface adalah sebuah interface yang memiliki satu method abstract. Anda cukup menambahkan keyword “fun” sebelum keyword “interface” .

/*
fun interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}
fun main() {
    flyWithWings {
        println("The Bird flying")
    }
}

 */



