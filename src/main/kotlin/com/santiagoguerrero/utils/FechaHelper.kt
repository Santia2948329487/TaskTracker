package com.herreradavid.tasktracker.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object FechaHelper {
    private val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    fun formatear(fecha: LocalDate): String {
        return fecha.format(formatter)
    }
}
