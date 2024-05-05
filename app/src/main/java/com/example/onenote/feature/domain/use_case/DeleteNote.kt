package com.example.onenote.feature.domain.use_case

import com.example.onenote.feature.domain.model.Note
import com.example.onenote.feature.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
