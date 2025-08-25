package com.tuempresa.model

import java.time.LocalDate

// Representa una tarea dentro del sistema
data class Tarea(
    val id: Int,                  // Identificador único de la tarea
    var titulo: String,           // Título breve
    var descripcion: String,      // Descripción más detallada
    var fechaCreacion: LocalDate, // Fecha en que se creó
    var fechaLimite: LocalDate?,  // Fecha límite opcional
    var prioridad: Prioridad = Prioridad.MEDIA, // ← Nueva propiedad
    var estado: EstadoTarea,      // Estado actual de la tarea
    var categoria: Categoria? = null   // 🔹 Nueva propiedad
)

data class Categoria(
    val id: Int,
    val nombre: String
)


// Estados posibles de una tarea
enum class EstadoTarea {
    PENDIENTE,
    EN_PROGRESO, 
    COMPLETADA
}

enum class Prioridad {
    ALTA,
    MEDIA,
    BAJA
}
