package com.example.fernando.usandoandroidroom

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Evento(
    @PrimaryKey
    var id: Long = 0,
    var nome: String = "",
    var descricao: String = ""
)



