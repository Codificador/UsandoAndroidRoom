package com.example.fernando.usandoandroidroom

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [Evento::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun eventoDao(): EventoDao
}