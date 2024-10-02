package org.example

fun main() {
    // Kasus 1: Batas awal 1, Batas akhir 10
    val batasAwal1 = 1
    val batasAkhir1 = 10

    // For loop untuk Kasus 1
    var countFor1 = 0
    for (i in batasAwal1..batasAkhir1) {
        if (i % 2 == 0) {
            countFor1++
        }
    }
    println("Jumlah bilangan genap (for loop) untuk batas 1-10: $countFor1")

    // While loop untuk Kasus 1
    var countWhile1 = 0
    var i = if (batasAwal1 % 2 == 0) batasAwal1 else batasAwal1 + 1
    while (i <= batasAkhir1) {
        countWhile1++
        i += 2
    }
    println("Jumlah bilangan genap (while loop) untuk batas 1-10: $countWhile1")

    // Do-while loop untuk Kasus 1
    var countDoWhile1 = 0
    i = if (batasAwal1 % 2 == 0) batasAwal1 else batasAwal1 + 1
    do {
        if (i <= batasAkhir1) {
            countDoWhile1++
        }
        i += 2
    } while (i <= batasAkhir1)
    println("Jumlah bilangan genap (do-while loop) untuk batas 1-10: $countDoWhile1")

    // Kasus 2: Batas awal 1, Batas akhir 20
    val batasAwal2 = 1
    val batasAkhir2 = 20

    // For loop untuk Kasus 2
    var countFor2 = 0
    for (i in batasAwal2..batasAkhir2) {
        if (i % 2 == 0) {
            countFor2++
        }
    }
    println("Jumlah bilangan genap (for loop) untuk batas 1-20: $countFor2")

    // While loop untuk Kasus 2
    var countWhile2 = 0
    i = if (batasAwal2 % 2 == 0) batasAwal2 else batasAwal2 + 1
    while (i <= batasAkhir2) {
        countWhile2++
        i += 2
    }
    println("Jumlah bilangan genap (while loop) untuk batas 1-20: $countWhile2")

    // Do-while loop untuk Kasus 2
    var countDoWhile2 = 0
    i = if (batasAwal2 % 2 == 0) batasAwal2 else batasAwal2 + 1
    do {
        if (i <= batasAkhir2) {
            countDoWhile2++
        }
        i += 2
    } while (i <= batasAkhir2)
    println("Jumlah bilangan genap (do-while loop) untuk batas 1-20: $countDoWhile2")
}