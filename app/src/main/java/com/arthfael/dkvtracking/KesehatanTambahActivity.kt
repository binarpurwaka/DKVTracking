package com.arthfael.dkvtracking

import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KesehatanTambahActivity : AppCompatActivity() {
    lateinit var spKelas: Spinner
    lateinit var etRiwayatPenyakit: EditText
    lateinit var btSimpan: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kesehatan_tambah)
        init()
        etRiwayatPenyakit.requestFocus()
        btSimpan.setOnClickListener {
            if (etRiwayatPenyakit.text.toString().isEmpty()){
                etRiwayatPenyakit.error = "Masukkan Riwayat Penyakit"
                etRiwayatPenyakit.requestFocus()
            }else{
                Toast.makeText(this, "Data Riwayat Penyakit Berhasil Ditambahkan", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        spKelas = findViewById(R.id.spKESEHATAN_TAMBAH_Kelas)
        etRiwayatPenyakit = findViewById(R.id.etKESEHATAN_TAMBAH_RiwayatPenyakit)
        btSimpan = findViewById(R.id.btKESEHATAN_TAMBAH_SIMPAN)
    }
}