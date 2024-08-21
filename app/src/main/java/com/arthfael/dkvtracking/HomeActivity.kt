package com.arthfael.dkvtracking

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    lateinit var cvRiwayat: CardView
    lateinit var cvPortofolio: CardView
    lateinit var cvKesehatan: CardView
    lateinit var cvNilaiAkhir: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        init()
        cvRiwayat.setOnClickListener {
            startActivity(Intent(this, RiwayatDataActivity::class.java))
        }
        cvPortofolio.setOnClickListener {
            startActivity(Intent(this, PortofolioDataActivity::class.java))
        }
        cvKesehatan.setOnClickListener {
            startActivity(Intent(this, KesehatanDataActivity::class.java))
        }
        cvNilaiAkhir.setOnClickListener {
            startActivity(Intent(this, NilaiAkhirActivity::class.java))
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        cvRiwayat = findViewById(R.id.cvHOME_Riwayat)
        cvPortofolio = findViewById(R.id.cvHOME_Portofolio)
        cvKesehatan = findViewById(R.id.cvHOME_Kesehatan)
        cvNilaiAkhir = findViewById(R.id.cvHOME_NilaiAkhir)
    }
}