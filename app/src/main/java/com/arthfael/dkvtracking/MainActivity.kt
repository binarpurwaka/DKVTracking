package com.arthfael.dkvtracking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNIS: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        init()
        btnLogin.setOnClickListener {
            login()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun init(){
        etNIS = findViewById(R.id.etNIS)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btLogin)
    }

    fun login(){
        val nis = etNIS.text.toString()
        val password = etPassword.text.toString()
        if(nis.isEmpty()){
            etNIS.error = "NIS Tidak Boleh Kosong"
            etNIS.requestFocus()
        }else if(password.isEmpty()){
            etPassword.error = "Password Tidak Boleh Kosong"
            etPassword.requestFocus()
        }else{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}