package org.example

fun main() {
    val numbers = listOf(10,8,0,15,-5,20,25)
    for (number in numbers) {
        if (number < 0) {
            println("Pengecekan dihentikan karena ditemukan angka negatif: $number")
            break
        }
        if (number == 0) {
            continue
        }
        println("Angka: $number")
    }
}