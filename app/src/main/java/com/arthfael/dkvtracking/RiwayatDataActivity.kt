package com.arthfael.dkvtracking

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RiwayatDataActivity : AppCompatActivity() {
    lateinit var cvRIWAYAT_Portofolio: CardView
    lateinit var cvRIWAYAT_Prakerin: CardView
    lateinit var cvRIWAYAT_Konseling: CardView
    lateinit var cvRIWAYAT_CV: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_riwayat_data)
        init()
        cvRIWAYAT_Portofolio.setOnClickListener {
            val intent = Intent(this, RiwayatPortofolioActivity::class.java)
            startActivity(intent)
        }
        cvRIWAYAT_Prakerin.setOnClickListener {
            val intent = Intent(this, RiwayatPrakerinActivity::class.java)
            startActivity(intent)
        }
        cvRIWAYAT_Konseling.setOnClickListener {
            val intent = Intent(this, RiwayatKonselingActivity::class.java)
            startActivity(intent)
        }
        cvRIWAYAT_CV.setOnClickListener {
            val intent = Intent(this, CurriculumVitaeActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        cvRIWAYAT_Portofolio = findViewById(R.id.cvRIWAYAT_Portofolio)
        cvRIWAYAT_Prakerin = findViewById(R.id.cvRIWAYAT_Prakerin)
        cvRIWAYAT_Konseling = findViewById(R.id.cvRIWAYAT_Konseling)
        cvRIWAYAT_CV = findViewById(R.id.cvRIWAYAT_CV)
    }
}