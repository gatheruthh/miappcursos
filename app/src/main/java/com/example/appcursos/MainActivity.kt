package com.example.appcursos

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtDato: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtDato=findViewById(R.id.txtDato)
        txtDato.setOnEditorActionListener(this::buscardatos)
    }
    fun buscardatos(v: View,i:Int, event: KeyEvent): Boolean
    {
        if ( i == EditorInfo.IME_ACTION_GO)
        {
            Toast.makeText(this,"Voy a buscar", Toast.LENGTH_SHORT)
        }
        return false
    }
}