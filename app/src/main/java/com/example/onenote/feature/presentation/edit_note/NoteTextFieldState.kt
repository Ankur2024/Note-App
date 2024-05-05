package com.example.onenote.feature.presentation.edit_note

data class NoteTextFieldState(
    val text:String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)