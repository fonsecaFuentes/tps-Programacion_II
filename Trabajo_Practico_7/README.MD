# Práctico: Herencia y Polimorfismo en Java

## 📌 Datos del estudiante
- **Nombre:** Alfredo de Inocenti  
- **Materia:** Programación II  
- **Carrera:** Tecnicatura Universitaria en Programación  

---

## 📚 Contenido

1. [Vehículos y herencia básica](#1-vehículos-y-herencia-básica)
2. [Figuras geométricas y métodos abstractos](#2-figuras-geométricas-y-métodos-abstractos)
3. [Empleados y polimorfismo](#3-empleados-y-polimorfismo)
4. [Animales y comportamiento sobrescrito](#4-animales-y-comportamiento-sobrescrito)

---

## 1. Vehículos y herencia básica

### 📝 Descripción
Se modela una jerarquía simple de vehículos donde la clase base `Vehiculo` contiene los datos comunes (marca y modelo) y la subclase `Auto` agrega un atributo propio (cantidadPuertas). Se instancia un auto y se muestra toda su información. Se practica el uso de `super.mostrarInfo()` para reutilizar comportamiento.

### 🎯 Conceptos trabajados
- Herencia simple (`Auto extends Vehiculo`)
- Encapsulamiento de atributos (`private final`)
- Llamada al constructor de la superclase (`super(...)`)
- Sobrescritura de métodos (`@Override`)
- Reutilización de código con `super.mostrarInfo()`
- Clase base abstracta para evitar instanciar vehículos genéricos

**Clases principales:**
- `Vehiculo` (abstracta)
- `Auto`
- `Principal`

**Archivos:**
- `Vehiculo.java`
- `Auto.java`
- `Principal.java`

---

## 2. Figuras geométricas y métodos abstractos

### 📝 Descripción
Se define una clase abstracta `Figura` que obliga a sus subclases a implementar el método `calcularArea()`. A partir de ella se crean `Circulo` y `Rectangulo`, cada una con su propia fórmula. En el main se arma una colección de figuras y se recorre polimórficamente, llamando a `calcularArea()` sin importar el tipo concreto.

### 🎯 Conceptos trabajados
- Clase abstracta con método abstracto
- Polimorfismo al recorrer una lista de la superclase (`ArrayList<Figura>`)
- Sobrescritura obligatoria de métodos (`@Override`)
- Uso de `Math.PI` para el círculo
- Colecciones de objetos de distintos tipos que comparten un mismo padre

**Clases principales:**
- `Figura` (abstracta)
- `Circulo`
- `Rectangulo`
- `Principal`

**Archivos:**
- `Figura.java`
- `Circulo.java`
- `Rectangulo.java`
- `Principal.java`

---

## 3. Empleados y polimorfismo

### 📝 Descripción
Se modela una jerarquía de empleados donde `Empleado` es abstracta y define el contrato `calcularSueldo()`. Dos subclases (`EmpleadoPlanta` y `EmpleadoTemporal`) calculan el sueldo de manera distinta. En el main se carga una lista de empleados y se invoca el método polimórficamente. Además, se usa `instanceof` para clasificar el tipo real de cada empleado.

### 🎯 Conceptos trabajados
- Clase abstracta con método abstracto (`Empleado`)
- Polimorfismo en lista de tipo padre (`ArrayList<Empleado>`)
- Sobrescritura de métodos (`@Override`)
- Diferentes estrategias de cálculo de sueldo según la subclase
- Uso de `instanceof` para distinguir tipos concretos
- Upcasting implícito al guardar subclases en una colección del tipo padre

**Clases principales:**
- `Empleado` (abstracta)
- `EmpleadoPlanta`
- `EmpleadoTemporal`
- `Principal`

**Archivos:**
- `Empleado.java`
- `EmpleadoPlanta.java`
- `EmpleadoTemporal.java`
- `Principal.java`

---

## 4. Animales y comportamiento sobrescrito

### 📝 Descripción
Se crea una clase base `Animal` con los métodos `hacerSonido()` y `describirAnimal()`. Luego se definen las subclases `Perro`, `Gato` y `Vaca`, que sobrescriben el comportamiento para mostrar sonidos específicos y más datos propios (raza, color de pelaje, peso). En el main se arma una lista de animales y se invoca polimórficamente `hacerSonido()` y `describirAnimal()`.

### 🎯 Conceptos trabajados
- Herencia con múltiples subclases que comparten un mismo padre
- Sobrescritura de métodos (`@Override`)
- Polimorfismo al recorrer una sola colección de `Animal`
- Reutilización de comportamiento llamando al método de la superclase (`super.describirAnimal()`)
- Diferenciación de comportamiento según el tipo concreto del animal

**Clases principales:**
- `Animal`
- `Perro`
- `Gato`
- `Vaca`
- `Principal`

**Archivos:**
- `Animal.java`
- `Perro.java`
- `Gato.java`
- `Vaca.java`
- `Principal.java`

---
