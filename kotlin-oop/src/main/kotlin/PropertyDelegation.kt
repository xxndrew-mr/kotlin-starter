package org.example

//Delegate berfungsi, membuat sebuah kelas yang memang
// bertugas untuk mengatur atau mengelola fungsi getter dan setter untuk sebuah properti kelas.

import kotlin.reflect.KProperty
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

//Kemudian untuk mendelegasikan sebuah properti
// kelas, kita gunakan keyword by dalam menginisialisasi properti tersebut kemudian diikuti dengan namanya. Perhatikan kode berikut:

class Animal {
    var name : String by DelegateName()
}

class Person {
    var name : String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}
//Dengan begitu nilai properti name dikelola melalui kelas DelegateName. Kita dapat mendelegasikan banyak
// properti yang terdapat pada banyak kelas kepada satu kelas Delegate saja.

fun main() {
    val Animal=Animal()
    Animal.name ="Dita"
    println("Nama Hewan : ${Animal.name}")

    val Person = Person()
    Person.name = "Andre"
    println("Nama Orang : ${Person.name}")

    val Hero = Hero()
    Hero.name = "Alucard"
    println("Nama Hero : ${Hero.name}")
}

//Namun kita juga dapat membuat sebuah delegasi kelas umum yang dapat
// digunakan oleh seluruh tipe data dengan memanfaatkan tipe data Any.

//dengan DelegateGenericClass(), pengelolaan properti
// dapat digunakan pada seluruh tipe data properti.


