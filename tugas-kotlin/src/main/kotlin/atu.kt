package org.example

fun kategoriHarga(harga: Int): String {
    return when {
        harga < 0 -> "Harga tidak valid."
        harga < 100_000 -> "Kategori barang: Murah"
        harga in 100_000..500_000 -> "Kategori barang: Sedang"
        else -> "Kategori barang: Mahal"
    }
}

fun main() {
    val inputHarga = listOf(50_000, 250_000, 750_000, -20_000)

    for (harga in inputHarga) {
        println(kategoriHarga(harga))
    }
}