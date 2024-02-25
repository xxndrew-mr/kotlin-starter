package org.example

//1.Nested Class,Anda bisa membuat Class baru di dalam sebuah Class.
// Berikut ini contohnya.

/*
class house {
    class room{

    }
}

fun main() {
    val room = House.Room()
}
 */

//Hal yang perlu diperhatikan adalah
// member class tidak dapat mengakses property yang ada di outer class

/* contoh yang salah
class House {
    // Properti outer class
    val buildingArea = 100
    class Room {

        val totalRooms = 4
        fun measureRoomArea() {
            // Member class tidak dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }
    }
}
 */

//2.Inner Class,Inner Class memungkinkan kita untuk mengakses member
// (property dan method) dari outer class-nya.

class House {
    // Properti outer class
    val buildingArea = 100
    inner class Room {
        val totalRooms = 4
        fun dibagi() {
            // Inner class dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.dibagi()
}

//ada dasarnya, jika Anda hanya memanggil nama property, Kotlin akan mengambil
// property dari inner class terlebih dahulu. Namun, apabila ingin mengambil property
// dari outer class, Anda bisa menggunakan qualified this.

/*
class House {
    // Properti atau anggota outer class
    val buildingArea = 100
    val totalRooms = 4

    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
            print(buildingArea/this@House.totalRooms)
        }
    }
}

 */



