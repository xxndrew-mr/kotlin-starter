package org.example

//Destructuring Declaration adalah proses memetakan objek menjadi
// sebuah variabel. Ini bisa dengan mudah kita lakukan pada data class.
// Dengan fungsi componentN() yang ada pada data class, kita bisa
// menguraikan sebuah objek menjadi beberapa properti yang dimilikinya.
/*
data class DataUser(val name : String , val age : Int)


fun main() {
    val dataUser =DataUser("Andre",21)

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, i am $age years old")
}


fun main() {
    val dataUser = DataUser ("Andre",80)
    val (name, age) = dataUser

    println("My name is $name, im am a $age years old")
}

 */