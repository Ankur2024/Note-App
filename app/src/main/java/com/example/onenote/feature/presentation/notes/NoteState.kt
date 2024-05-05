package com.example.onenote.feature.presentation.notes

import com.example.onenote.feature.domain.model.Note
import com.example.onenote.feature.domain.util.NoteOrder
import com.example.onenote.feature.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(orderType = OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
