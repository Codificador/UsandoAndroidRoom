package com.example.fernando.usandoandroidroom

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(this, AppDatabase::class.java, "firstdb1")
                    .allowMainThreadQueries()
                    .build()
        val dao = db.eventoDao()
        dao.insert(Evento(1, "me", "GOOGLE I/O"))

        val eventos = dao.listar()
        var strLs : String = ""
        eventos.forEach {
             strLs += it.nome + "\n"
        }
        textView.setText(strLs)
    }
}
