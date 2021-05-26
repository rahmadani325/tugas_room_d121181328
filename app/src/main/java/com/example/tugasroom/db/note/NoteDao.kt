package com.example.tugasroom.db.note

import androidx.lifecycle.LiveData
import androidx.room.*

interface NoteDao {
    @Query("SELECT * FROM note")
    fun getNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun inserNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)
}