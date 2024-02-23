package org.example

//Kotlin mendukung sebuah fitur bernama String Template. Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel ke
// dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +) seperti berikut:

/*val name = "Kotlin"
print("My name is " + name)


        output : My name is Kotlin
    */

//Untuk menggunakan string template, kita hanya perlu menambahkan karakter $ sebelum nama variabel yang akan disisipkan seperti berikut:

/* val name = "Kotlin"
print("My name is $name")

        output : My name is Kotlin
    */

//Kita juga bisa menyisipkan objek lain misal Int atau Double seperti berikut:

/* val name = "Kotlin"
val old = 3
print("My name is $name, im $old years old")


        output : My name is Kotlin, im 3 years old
    */

//Anda juga bisa menyisipkan sebuah expression ke dalam sebuah string template. Caranya, sisipkan expression ke dalam
// curly braces yang diikuti karakter $.

/*val hour = 7
print("Office ${if (hour > 7) "already close" else "is open"}")


        output : Office is open
    */