package com.ayam.konversimatauang

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    internal var input_uang: EditText? = null
    internal var rp_usd: Button?  = null
    internal var rp_euro: Button?  = null
    internal var rp_yen: Button?  = null
    internal var rp_yuan: Button?  = null
    internal var rp_won: Button?  = null
    internal var rp_lire: Button?  = null
    internal var hasil_konversi: TextView? = null

    internal var angka: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input_uang = findViewById<View>(R.id.uang_input) as EditText
        rp_usd = findViewById<View>(R.id.rpusd) as Button
        rp_euro = findViewById<View>(R.id.rpeuro) as Button
        rp_yen = findViewById<View>(R.id.rpyen) as Button
        rp_yuan = findViewById<View>(R.id.rpyuan) as Button
        rp_won = findViewById<View>(R.id.rpwon) as Button
        rp_lire = findViewById<View>(R.id.rplire) as Button
        hasil_konversi = findViewById<View>(R.id.hasil_konversi) as TextView
    }

    fun cek(): Boolean {
        if (input_uang?.text.toString().isEmpty()) {
            Toast.makeText(this, "Silahkan masukan jumlah uang", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    fun toYEN(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (ex: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 132
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil)
        Toast.makeText(this, "1 Yen = Rp 132", Toast.LENGTH_SHORT).show()
    }

    fun toEuro(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 17228
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil)
        Toast.makeText(this, "1 Euro = Rp 17.228", Toast.LENGTH_SHORT).show()
    }


    fun toUSD(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 14808
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.US).format(hasil)
        Toast.makeText(this, "1 U\$D = Rp 14808", Toast.LENGTH_SHORT).show()
    }


    fun toYuan(v: View) {

        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 2033
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.CHINA).format(hasil)
        Toast.makeText(this, "1 Yuan = Rp 2.033", Toast.LENGTH_SHORT).show()
    }

    fun toWon(v: View) {

        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 12302
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.KOREA).format(hasil)
        Toast.makeText(this, "1 Won = Rp 12.302", Toast.LENGTH_SHORT).show()
    }

    fun toLire(v: View) {

        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang?.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 8007
        hasil_konversi?.text = NumberFormat.getCurrencyInstance(Locale.ITALY).format(hasil)
        Toast.makeText(this, "1 Lire = Rp 8.007", Toast.LENGTH_SHORT).show()
    }
}
