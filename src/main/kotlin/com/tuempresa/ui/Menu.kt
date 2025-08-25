package com.tuempresa.ui

import com.tuempresa.service.GestorTareas
import com.tuempresa.model.Prioridad
import com.tuempresa.model.Categoria
import java.time.LocalDate
import java.util.Scanner

class Menu {
    private val gestor = GestorTareas()
    private val scanner = Scanner(System.`in`)

    fun iniciar() {
        var opcion: Int

        do {
            println("\n=== 📋 GESTOR DE TAREAS ===")
            println("1. Agregar tarea")
            println("2. Listar tareas")
            println("3. Completar tarea")
            println("4. Eliminar tarea")
            println("0. Salir")
            print("Selecciona una opción: ")

            opcion = scanner.nextInt()
            scanner.nextLine() // limpiar buffer

            when (opcion) {
                1 -> agregarTarea()
                2 -> listarTareas()
                3 -> completarTarea()
                4 -> eliminarTarea()
                0 -> println("👋 Saliendo del programa...")
                else -> println("❌ Opción inválida")
            }
        } while (opcion != 0)
    }

    private fun agregarTarea() {
        print("Título: ")
        val titulo = scanner.nextLine()

        print("Descripción: ")
        val descripcion = scanner.nextLine()

        print("Fecha límite (YYYY-MM-DD) o vacío: ")
        val fechaInput = scanner.nextLine()
        val fechaLimite = if (fechaInput.isNotBlank()) LocalDate.parse(fechaInput) else null

        // Seleccionar prioridad
        println("Seleccione la prioridad:")
        println("1. ALTA")
        println("2. MEDIA")
        println("3. BAJA")
        print("Opción: ")
        val opcionPrioridad = scanner.nextInt()
        scanner.nextLine() // limpiar buffer

        val prioridad = when (opcionPrioridad) {
            1 -> Prioridad.ALTA
            2 -> Prioridad.MEDIA
            3 -> Prioridad.BAJA
            else -> {
                println("⚠️ Opción inválida, se asigna MEDIA por defecto.")
                Prioridad.MEDIA
            }
        }

        // Categoría
        print("Categoría (opcional, escribe un nombre o deja vacío): ")
        val categoriaInput = scanner.nextLine()
        val categoria = if (categoriaInput.isNotBlank()) {
            Categoria(1, categoriaInput) // por ahora ID fijo
        } else {
            null
        }

        val tarea = gestor.agregarTarea(titulo, descripcion, fechaLimite, prioridad, categoria)
        println("✅ Tarea agregada con ID: ${tarea.id}")
    }

    private fun listarTareas() {
        val tareas = gestor.listarTareas()
        if (tareas.isEmpty()) {
            println("📭 No hay tareas registradas.")
        } else {
            println("\n=== LISTA DE TAREAS ===")
            tareas.forEach {
                println(
                    "ID: ${it.id} | ${it.titulo} | Estado: ${it.estado} | Prioridad: ${it.prioridad} | " +
                    "Categoría: ${it.categoria?.nombre ?: "Sin categoría"} | Límite: ${it.fechaLimite ?: "Sin fecha"}"
                )
            }
        }
    }

    private fun completarTarea() {
        print("ID de la tarea a completar: ")
        val id = scanner.nextInt()
        scanner.nextLine()

        if (gestor.completarTarea(id)) {
            println("✅ Tarea completada.")
        } else {
            println("❌ No se encontró la tarea con ID $id")
        }
    }

    private fun eliminarTarea() {
        print("ID de la tarea a eliminar: ")
        val id = scanner.nextInt()
        scanner.nextLine()

        if (gestor.eliminarTarea(id)) {
            println("🗑️ Tarea eliminada.")
        } else {
            println("❌ No se encontró la tarea con ID $id")
        }
    }
}
