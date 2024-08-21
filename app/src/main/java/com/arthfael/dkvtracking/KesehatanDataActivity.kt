package com.arthfael.dkvtracking

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class KesehatanDataActivity : AppCompatActivity() {
    lateinit var fabTambah: FloatingActionButton
    lateinit var btEdit1: AppCompatButton
    lateinit var btEdit2: AppCompatButton
    lateinit var btEdit3: AppCompatButton
    lateinit var btEdit4: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kesehatan_data)
        init()
        fabTambah.setOnClickListener {
            startActivity(Intent(this, KesehatanTambahActivity::class.java))
        }
        btEdit1.setOnClickListener {
            val goEdit = Intent(this, KesehatanUbahActivity::class.java)
            goEdit.putExtra("kelas", 0)
            goEdit.putExtra("penyakit", "ASMA")
            startActivity(goEdit)
        }
        btEdit2.setOnClickListener {
            val goEdit = Intent(this, KesehatanUbahActivity::class.java)
            goEdit.putExtra("kelas", 0)
            goEdit.putExtra("penyakit", "OBESITAS")
            startActivity(goEdit)
        }
        btEdit3.setOnClickListener {
            val goEdit = Intent(this, KesehatanUbahActivity::class.java)
            goEdit.putExtra("kelas", 1)
            goEdit.putExtra("penyakit", "MIGRAIN")
            startActivity(goEdit)
        }
        btEdit4.setOnClickListener {
            val goEdit = Intent(this, KesehatanUbahActivity::class.java)
            goEdit.putExtra("kelas", 1)
            goEdit.putExtra("penyakit", "MAAG")
            startActivity(goEdit)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        fabTambah = findViewById(R.id.fabKESEHATAN_DATA_Tambah)
        btEdit1 = findViewById(R.id.btnKESEHATAN_DATA_Edit1)
        btEdit2 = findViewById(R.id.btnKESEHATAN_DATA_Edit2)
        btEdit3 = findViewById(R.id.btnKESEHATAN_DATA_Edit3)
        btEdit4 = findViewById(R.id.btnKESEHATAN_DATA_Edit4)
    }
}