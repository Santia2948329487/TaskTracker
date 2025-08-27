# 📝 Gestor de Tareas en Kotlin

## 📌 Descripción  
Este es un proyecto de consola en **Kotlin** que muestra un **ejemplo fijo de salida** con una lista de tareas precargadas.  
Cada tarea tiene **título, descripción, estado, categoría, prioridad y fecha de creación**.  

---

## 🎯 Funcionalidades  

- ✅ Ejemplo de impresión de tareas en consola.  
- ✅ Manejo de **prioridades** (`ALTA`, `MEDIA`, `BAJA`).  
- ✅ Soporte para **categorías** de tareas.  
- ✅ Manejo de estados (`Por hacer`, `En progreso`, `Completada`).  

---

## 🏗️ Estructura del Proyecto  

```
src/
│
├── model/
│   ├── Tarea.kt
│   ├── Categoria.kt
│   └── enums/
│       ├── EstadoTarea.kt
│       └── PrioridadTarea.kt
│
├── service/
│   └── GestorTareas.kt
│
└── utils/
    └── FechaHelper.kt

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

## 📚 Ejemplo de salida  

Al ejecutar el programa se imprime la siguiente lista de tareas:  

```
Lista de tareas:

ID: 1
Título: Test
Descripción: Descripción
Estado: ⏳ Por hacer
Categoría: Prueba
Prioridad: MEDIA
Fecha de creación: 19/08/2025
------------------------------------------------------------
ID: 2
Título: Aprender Fundamentos en Kotlin
Descripción: Descripción
Estado: ✅ Completada
Categoría: Estudio
Prioridad: ALTA
Fecha de creación: 19/08/2025
------------------------------------------------------------
```

---

## ⚙️ Tecnologías Utilizadas  

- **Lenguaje:** Kotlin  
- **Editor:** IntelliJ IDEA  

---

## 👤 Autor  

- **Nombre:** Santiago Castaño  
