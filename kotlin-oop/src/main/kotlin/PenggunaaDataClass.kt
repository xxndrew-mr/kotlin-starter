package org.example

/*
class User(val name : String,val age : Int)
data class DataUser(val name : String,val age : Int)

fun main() {
    val user = User ("Andre",17)
    val dataUser = DataUser ("Andre",17)
    println(user)
    println(dataUser)
}

 */

//Selanjutnya, kelebihan lain dari data
// class adalah ia sudah memiliki fungsi equals()
// secara otomatis

data class DataUser (val name : String,val age : Int)


fun main() {
    val dataUser = DataUser ("Andre",90)
    val dataUser2 = DataUser ("Japar",80)
    val dataUser3 = DataUser ("Ihsan",100)
    val dataUser4 = dataUser.copy(age = 500)
/*
    println(dataUser.equals(dataUser))
    println(dataUser.equals(dataUser3))

 */

    println(dataUser4)
}


