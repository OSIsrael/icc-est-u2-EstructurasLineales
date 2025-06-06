# Práctica de Estructuras de Datos
## 📌 Información General
- **Título:** Implementación de Pilas y Colas con Algoritmos de Validación y Ordenamiento
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiantes:** Israel Orellana 
- **Fecha:** 5 de junio del 2025  
- **Profesor:** Ing. Pablo Torres  
---
## 🛠️ Descripción
Este proyecto implementa estructuras de datos fundamentales (**Pilas** y **Colas**) tanto en versiones específicas como genéricas, junto con dos ejercicios prácticos que demuestran su aplicación:

### Estructuras Implementadas:
- **Stack**: Pila para enteros
- **StackG**: Pila genérica que acepta cualquier tipo de dato
- **Cola**: Cola para enteros  
- **ColaG**: Cola genérica con operaciones especializadas para objetos Persona

### Ejercicios Principales:
1. **Validador de Signos (SignValidator)**: Verifica si los paréntesis, corchetes y llaves están balanceados correctamente
2. **Ordenador de Pilas (StackSorter)**: Ordena una pila usando únicamente otra pila auxiliar

---
## 🏗️ Estructura del Proyecto
```
src/
├── App.java                           # Clase principal con ejemplos y pruebas
├── controllers/
│   ├── Stack.java                     # Implementación de pila para enteros
│   ├── StackG.java                    # Implementación de pila genérica
│   ├── Cola.java                      # Implementación de cola para enteros
│   └── ColaG.java                     # Implementación de cola genérica
├── models/
│   ├── Node.java                      # Nodo para estructuras no genéricas
│   ├── NodeGeneric.java               # Nodo genérico
│   └── Persona.java                   # Modelo de datos para pruebas
├── ejercicio_01_sign/
│   └── SignValidator.java             # Validador de signos balanceados
└── ejercicio_02_sorting/
    └── StackSorter.java               # Ordenador de pilas
```

---
## 🚀 Ejecución
Para ejecutar el proyecto:
1. Compila todas las clases Java
2. Ejecuta la clase principal:
```bash
javac src/**/*.java
java -cp src App
```

---
## 🧪 Ejercicios Implementados

### 📋 Ejercicio 1: Validador de Signos
**Objetivo**: Determinar si una cadena de caracteres que contiene paréntesis `()`, corchetes `[]` y llaves `{}` está correctamente balanceada.

**Algoritmo**:
1. Usa una pila para almacenar los signos de apertura
2. Al encontrar un signo de cierre, verifica que coincida con el último signo de apertura
3. La cadena es válida si al final la pila está vacía

**Ejemplo de uso**:
```java
SignValidator valida = new SignValidator();
System.out.println(valida.isValid("([]){}"));  // Output: true
System.out.println(valida.isValid("({)}"));    // Output: false
```

### 📊 Ejercicio 2: Ordenador de Pilas
**Objetivo**: Ordenar una pila de enteros en orden ascendente (el menor en la cima) usando únicamente una pila auxiliar.

**Algoritmo**:
1. Usa una pila temporal para almacenar elementos ordenados
2. Extrae elementos de la pila original y los coloca en la posición correcta en la pila temporal
3. Transfiere todos los elementos de vuelta a la pila original

**Ejemplo de uso**:
```java
StackSorter sorter = new StackSorter();
StackG<Integer> pila = new StackG<>();
pila.push(5); pila.push(1); pila.push(4); pila.push(2);
sorter.sortStack(pila);  // Resultado: [1, 2, 4, 5] (1 en la cima)
```

---
## 📈 Ejemplo de Salida por Consola
```plaintext
--- EJERCICIO 1 ---
Input: "([]){})" Output: true
Input: "({)}" Output: false
Input: "[{()}]" Output: true
Input: "([)]" Output: false

--- EJERCICIO 2 ---
Pila original: Pila: [5, 1, 4, 2]
Pila ordenada: Pila: [1, 2, 4, 5]

Otra pila original: Pila: [10, 3, 8, 1, 6]
Otra pila ordenada: Pila: [1, 3, 6, 8, 10]
```

---
## 🔍 Características Técnicas

### Complejidad Temporal:
- **SignValidator**: O(n) donde n es la longitud de la cadena
- **StackSorter**: O(n²) en el peor caso, donde n es el número de elementos

### Complejidad Espacial:
- **SignValidator**: O(n) para la pila auxiliar
- **StackSorter**: O(n) para la pila temporal

### Ventajas de la Implementación:
- **Genéricos**: Las estructuras `StackG` y `ColaG` pueden trabajar con cualquier tipo de dato
- **Encapsulación**: Cada estructura mantiene su estado interno protegido
- **Reutilización**: Los algoritmos pueden aplicarse a diferentes tipos de datos
- **Manejo de Errores**: Uso apropiado de excepciones para casos límite

---
## ✅ Conclusiones
La implementación demuestra el poder y versatilidad de las estructuras de datos fundamentales:

1. **Las pilas son ideales para problemas que requieren LIFO (Last In, First Out)**, como la validación de signos balanceados, donde necesitamos verificar correspondencias en orden inverso.

2. **El ordenamiento de pilas usando solo otra pila** ilustra cómo las restricciones de acceso (solo el tope) pueden resolverse con algoritmos creativos, aunque con mayor complejidad temporal.

3. **La programación genérica** permite crear estructuras reutilizables que mantienen la seguridad de tipos, demostrando principios fundamentales de la programación orientada a objetos.

4. **El manejo apropiado de casos límite** (pilas vacías, elementos no encontrados) es crucial para crear código robusto y confiable.

---