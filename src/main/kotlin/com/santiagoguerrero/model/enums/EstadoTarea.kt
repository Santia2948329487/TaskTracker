package com.herreradavid.tasktracker.model.enums

enum class EstadoTarea(val descripcion: String, val icono: String) {
    PENDIENTE("Por hacer", "⏳"),
    EN_PROGRESO("En progreso", "🔄"),
    COMPLETADA("Completada", "✅")
}
