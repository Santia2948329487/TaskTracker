package com.tuempresa.service

import com.tuempresa.model.Tarea
import com.tuempresa.model.EstadoTarea
import com.tuempresa.model.Prioridad
import com.tuempresa.model.Categoria
import java.time.LocalDate

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()  // Lista dinámica de tareas
    private var contadorId = 1                   // Para asignar IDs únicos

    // Crear una nueva tarea con prioridad y categoría
    fun agregarTarea(
        titulo: String,
        descripcion: String,
        fechaLimite: LocalDate?,
        prioridad: Prioridad = Prioridad.MEDIA,
        categoria: Categoria? = null
    ): Tarea {
        val nuevaTarea = Tarea(
            id = contadorId++,
            titulo = titulo,
            descripcion = descripcion,
            fechaCreacion = LocalDate.now(),
            fechaLimite = fechaLimite,
            prioridad = prioridad,
            estado = EstadoTarea.PENDIENTE,
            categoria = categoria
        )
        tareas.add(nuevaTarea)
        return nuevaTarea
    }

    // Listar todas las tareas
    fun listarTareas(): List<Tarea> = tareas

    // Buscar tarea por ID
    fun buscarTareaPorId(id: Int): Tarea? = tareas.find { it.id == id }

    // Marcar tarea como completada
    fun completarTarea(id: Int): Boolean {
        val tarea = buscarTareaPorId(id)
        return if (tarea != null) {
            tarea.estado = EstadoTarea.COMPLETADA
            true
        } else {
            false
        }
    }

    // Eliminar tarea
    fun eliminarTarea(id: Int): Boolean {
        return tareas.removeIf { it.id == id }
    }
}
