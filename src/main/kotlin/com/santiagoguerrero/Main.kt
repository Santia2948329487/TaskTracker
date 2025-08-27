package com.herreradavid.tasktracker

import com.herreradavid.tasktracker.model.*
import com.herreradavid.tasktracker.model.enums.*
import com.herreradavid.tasktracker.utils.FechaHelper
import java.time.LocalDate

fun main() {
    // Ejemplo fijo (como en la salida del profesor)
    val tareasEjemplo = listOf(
        Tarea(
            id = 1,
            titulo = "Test",
            descripcion = "Descripción",
            estado = EstadoTarea.PENDIENTE,
            fechaCreacion = LocalDate.of(2025, 8, 19),
            categoria = Categoria("Prueba"),
            prioridad = PrioridadTarea.MEDIA
        ),
        Tarea(
            id = 2,
            titulo = "Aprender Fundamentos en Kotlin",
            descripcion = "Descripción",
            estado = EstadoTarea.COMPLETADA,
            fechaCreacion = LocalDate.of(2025, 8, 19),
            categoria = Categoria("Estudio"),
            prioridad = PrioridadTarea.ALTA
        )
    )

    println("Lista de tareas:\n")
    tareasEjemplo.forEach { tarea ->
        println("ID: ${tarea.id}")
        println("Título: ${tarea.titulo}")
        println("Descripción: ${tarea.descripcion}")
        println("Estado: ${tarea.estado.icono} ${tarea.estado.descripcion}")
        println("Categoría: ${tarea.categoria.nombre}")
        println("Prioridad: ${tarea.prioridad}")
        println("Fecha de creación: ${FechaHelper.formatear(tarea.fechaCreacion)}")
        println("------------------------------------------------------------")
    }

}
