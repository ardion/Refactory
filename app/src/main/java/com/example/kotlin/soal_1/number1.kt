package com.example.kotlin

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    print("Nama Warung :")
    var namaWarung = readLine()!!.toString()
    val date: LocalDateTime? = LocalDateTime.now()
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    val text: String = date!!.format(formatter)
    print("Nama Kasir:")
    var namaKasir = readLine()!!.toString()
    var menu: ArrayList<String> = arrayListOf()
    var harga: ArrayList<Int> = arrayListOf()

    do {
        print("Input Menu:")
        menu.add(readLine()!!.toString())
        print("Input Harga:")
        harga.add(readLine()!!.toInt())
        print("input lagi (Y/T)?:")
        var perintah = readLine()!!.toString()

    } while (perintah.toUpperCase() == "Y")

    var nmenu = menu.size
    println()
    println(rataTengah(namaWarung, 30))
    println(alignkarakter("Tanggal :", text, 30))
    println(alignkarakter("Nama Kasir :", namaKasir, 30))
    for (line in 1..30) print("=")
    println()
    for (i in 0..nmenu - 1) {
        println(alignharga(menu[i], harga[i].toString(), 30))
    }
    println()
    println(alignharga("total", harga.sum().toString(), 30))

}


fun rataTengah(teks: String, panjang: Int): String {
    val nTeks = teks.length
    val nspasi = (panjang - nTeks) / 2
    var spasi = ""
    if (nTeks % 2 == 0) {
        for (i in 1..nspasi) {
            spasi += " "
        }
        var combine = spasi + teks + spasi
        return combine
    } else {
        for (i in 1..nspasi) {
            spasi += " "
        }
        var combine = spasi + teks + spasi + ""
        return combine
    }
}

fun alignharga(nama: String, harga: String, panjang: Int): String {
    val nnama = nama.length
    val nharga = harga.length


    var minus = ""
    if (nnama > panjang / 2) {
        for (i in 0..(panjang / 2) - 1) {
            minus += nama[i]
        }
        val nspasi = panjang - (panjang / 2) - nharga - 2
        var spasi = ""

        for (i in 1..nspasi) {
            spasi += "."
        }
        var combine = minus + spasi + "Rp" + harga
        return combine
    } else {
        val nspasi = panjang - nnama - nharga - 2
        var spasi = ""

        for (i in 1..nspasi) {
            spasi += "."
        }
        var combine = nama + spasi + "Rp" + harga
        return combine
    }


}


fun alignkarakter(nama: String, ket: String, panjang: Int): String {
    val nnama = nama.length
    val nharga = ket.length
    val nspasi = panjang - nnama - nharga
    var spasi = ""

    for (i in 1..nspasi) {
        spasi += " "
    }
    var combine = nama + spasi + ket
    return combine

}
