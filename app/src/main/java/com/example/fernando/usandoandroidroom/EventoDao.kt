package com.example.fernando.usandoandroidroom

import android.arch.persistence.room.*

@Dao
interface EventoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(evento: Evento): Long

    @Update
    fun update(evento: Evento): Int

    @Delete
    fun delete(vararg evento: Evento): Int

    @Query("select * from Evento")
    fun listar(): List<Evento>

}