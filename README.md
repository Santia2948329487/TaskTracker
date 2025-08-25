# 📝 Gestor de Tareas en Kotlin

## 📌 Descripción  
Este es un proyecto de consola en **Kotlin** que permite gestionar tareas de manera sencilla.  
Los usuarios pueden crear, listar, completar y eliminar tareas, además de asignarles **prioridad** y **categoría**.

---

## 🎯 Funcionalidades  

- ✅ **Agregar tareas** con título, descripción, fecha límite, prioridad y categoría.  
- ✅ **Listar todas las tareas** registradas.  
- ✅ **Completar tareas** marcándolas como finalizadas.  
- ✅ **Eliminar tareas** por ID.  
- ✅ Manejo de **prioridades** (ALTA, MEDIA, BAJA).  
- ✅ Soporte para **categorías** de tareas.  

---

## 🏗️ Estructura del Proyecto  

```
src/
│
├── model/
│   ├── Tarea.kt
│   ├── EstadoTarea.kt
│   ├── Prioridad.kt
│   └── Categoria.kt
│
├── service/
│   └── GestorTareas.kt
│
└── ui/
    └── Menu.kt

Main.kt
```

---

## ▶️ Ejecución  

### 1️⃣ Compilar  
Desde la terminal, dentro del proyecto:  
```bash
kotlinc src -include-runtime -d gestor-tareas.jar
```

### 2️⃣ Ejecutar  
```bash
java -jar gestor-tareas.jar
```

---

## 📚 Uso  

Al ejecutar el programa se mostrará un menú interactivo:

```
=== 📋 GESTOR DE TAREAS ===
1. Agregar tarea
2. Listar tareas
3. Completar tarea
4. Eliminar tarea
0. Salir
Selecciona una opción:
```

Ejemplo de salida al listar tareas:  
```
ID: 1 | Comprar víveres | Estado: PENDIENTE | Prioridad: ALTA | Categoría: Hogar | Límite: 2025-08-30
```

---

## 🏆 Desafíos Implementados  

### 🟢 Nivel Básico  
- [x] Agregar propiedad `prioridad` al modelo (con enum `Prioridad`).  

### 🟡 Nivel Intermedio  
- [x] Crear clase `Categoria` y asociarla a las tareas.  

---

## ⚙️ Tecnologías Utilizadas  

- **Lenguaje:** Kotlin  
- **Editor:** IntelliJ IDEA  

---

## 👤 Autor  

- **Nombre:** Santiago Castaño  
