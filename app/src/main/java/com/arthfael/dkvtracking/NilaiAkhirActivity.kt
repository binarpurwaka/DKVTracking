package com.arthfael.dkvtracking

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NilaiAkhirActivity : AppCompatActivity() {
    lateinit var btCetak1: AppCompatButton
    lateinit var btUnduh1: AppCompatButton
    lateinit var btCetak2: AppCompatButton
    lateinit var btUnduh2: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nilai_akhir)
        init()
        btCetak1.setOnClickListener {
            Toast.makeText(this, "Data Kelas X Semester 1 dicetak", Toast.LENGTH_SHORT).show()
        }
        btUnduh1.setOnClickListener {
            Toast.makeText(this, "Data Kelas X Semester 1 diunduh", Toast.LENGTH_SHORT).show()
        }
        btCetak2.setOnClickListener {
            Toast.makeText(this, "Data Kelas X Semester 2 dicetak", Toast.LENGTH_SHORT).show()

        }
        btUnduh2.setOnClickListener {
            Toast.makeText(this, "Data Kelas X Semester 2 diunduh", Toast.LENGTH_SHORT).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        btCetak1=findViewById(R.id.btnNILAI_AKHIR_DATA_Cetak1)
        btUnduh1=findViewById(R.id.btnNILAI_AKHIR_DATA_Unduh1)
        btCetak2=findViewById(R.id.btnNILAI_AKHIR_DATA_Cetak2)
        btUnduh2=findViewById(R.id.btnNILAI_AKHIR_DATA_Unduh2)
    }
}