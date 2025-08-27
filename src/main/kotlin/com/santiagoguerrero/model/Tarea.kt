package com.herreradavid.tasktracker.model

import com.herreradavid.tasktracker.model.enums.EstadoTarea
import com.herreradavid.tasktracker.model.enums.PrioridadTarea
import java.time.LocalDate

data class Tarea(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val estado: EstadoTarea,
    val fechaCreacion: LocalDate,
    val categoria: Categoria,
    val prioridad: PrioridadTarea
)
