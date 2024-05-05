package com.example.onenote.feature.presentation.notes

import com.example.onenote.feature.domain.model.Note
import com.example.onenote.feature.domain.util.NoteOrder


sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}