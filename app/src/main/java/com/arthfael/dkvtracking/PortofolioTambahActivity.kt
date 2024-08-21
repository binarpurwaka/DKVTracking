package com.arthfael.dkvtracking

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PortofolioTambahActivity : AppCompatActivity() {
    lateinit var etJudul: EditText
    lateinit var etLink: EditText
    lateinit var btSimpan: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portofolio_tambah)
        init()
        btSimpan.setOnClickListener {
            val judul = etJudul.text.toString()
            val link = etLink.text.toString()
            if (judul.isEmpty()) {
                etJudul.error = "Judul tidak boleh kosong"
                etJudul.requestFocus()
            }else if (link.isEmpty()) {
                etLink.error = "Link tidak boleh kosong"
                etLink.requestFocus()
            }else{
                Toast.makeText(this, "Data portofolio berhasil ditambahkan", Toast.LENGTH_SHORT).show()
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
        etJudul=findViewById(R.id.etPORTOFOLIO_TAMBAH_Judul)
        etLink=findViewById(R.id.etPORTOFOLIO_TAMBAH_Link)
        btSimpan=findViewById(R.id.btPORTOFOLIO_TAMBAH_SIMPAN)
    }
}