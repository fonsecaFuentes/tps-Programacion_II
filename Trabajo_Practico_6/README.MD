# Práctico: Gestión de Objetos y Colecciones en Java

## 📌 Datos del estudiante
- **Nombre:** Alfredo de Inocenti  
- **Materia:** Programación II  
- **Carrera:** Tecnicatura Universitaria en Programación  

---

## 🧩 Trabajo 1 – Sistema de Stock de Productos

**Descripción breve:**  
Se modela un sistema de inventario para una tienda.  
Permite gestionar productos, stock, precios y categorías usando clases, `ArrayList` y `enum`.

**Relaciones / conceptos trabajados:**  
- `Inventario` contiene muchos `Producto` (1 → N).  
- Cada `Producto` pertenece a una `CategoriaProducto` (enum).  
- Búsqueda, filtrado, actualización de stock, y obtención de métricas.

**Clases principales:**
- `Producto`
  - Atributos: `id`, `nombre`, `precio`, `cantidad`, `categoria`.
  - Métodos clave: `mostrarInfo()`, `actualizarProducto(int nuevaCantidad)`.
- `CategoriaProducto` (enum)
  - Categorías predefinidas (`ALIMENTOS`, `ELECTRONICA`, `ROPA`, `HOGAR`)  
  - Cada una con una descripción legible.
- `Inventario`
  - Administra una lista de productos (`ArrayList<Producto>`).
  - Funciones principales:
    - `agregarProducto(...)`, `eliminarProducto(id)`
    - `buscarProductoPorId(id)`
    - `actualizarStock(id, nuevaCantidad)`
    - `filtrarPorCategoria(categoria)`
    - `filtrarProductosPorPrecio(min, max)`
    - `obtenerTotalStock()`
    - `obtenerProductoConMayorStock()`
    - `mostrarCategoriasDisponibles()`
- `Principal`
  - Crea productos de distintas categorías.
  - Carga el inventario.
  - Prueba las operaciones (listar, buscar, filtrar, etc.).

**Archivos principales:**
- `Producto.java`  
- `CategoriaProducto.java`  
- `Inventario.java`  
- `Principal.java`  

---

## 📚 Trabajo 2 – Sistema de Biblioteca

**Descripción breve:**  
Se modela una biblioteca que administra libros y autores.  
La relación central es de **composición 1 → N**: una `Biblioteca` contiene varios `Libro`.  
Si se elimina la biblioteca, los libros dejan de tener sentido.

**Relaciones / conceptos trabajados:**  
- `Biblioteca` tiene muchos `Libro`.  
- Cada `Libro` tiene exactamente un `Autor`.  
- Se practican operaciones clásicas: alta, baja, búsqueda, filtrado y conteo.

**Clases principales:**
- `Autor`
  - Datos básicos del autor (`id`, `nombre`, `nacionalidad`).
  - Método `mostrarInfo()` para imprimirlo prolijo.
- `Libro`
  - Atributos: `isbn`, `titulo`, `anioPublicacion`, `autor`.
  - Métodos clave:
    - `mostrarInfo()`
    - `toString()`
- `Biblioteca`
  - Atributos: `nombre`, `ArrayList<Libro>`.
  - Funciones principales:
    - `agregarLibro(isbn, titulo, anioPublicacion, autor)`
    - `listarLibros()`
    - `buscarLibroPorIsbn(isbn)`
    - `eliminarLibro(isbn)`
    - `obtenerCantidadLibros()`
    - `filtrarLibrosPorAnio(anio)`
    - `mostrarAutoresDisponibles()` (sin repetir autores)
- `Principal`
  - Crea autores.
  - Agrega libros a la biblioteca.
  - Muestra libros, busca por ISBN, filtra por año, elimina libros, etc.

**Archivos principales:**
- `Autor.java`  
- `Libro.java`  
- `Biblioteca.java`  
- `Principal.java`  

---

## 🏫 Trabajo 3 – Sistema Académico (Universidad / Profesor / Curso)

**Descripción breve:**  
Se modela una mini estructura académica con una `Universidad` que administra profesores y cursos.  
La parte interesante es la relación bidireccional entre `Profesor` y `Curso`.

**Relaciones / conceptos trabajados:**  
- `Universidad` mantiene listas de `Profesor` y `Curso`.  
- `Profesor` ↔ `Curso` es una relación bidireccional controlada:
  - Un profesor sabe qué cursos dicta.
  - Un curso sabe qué profesor lo dicta.
  - Se mantiene la coherencia al asignar o desasignar.

**Clases principales:**
- `Profesor`
  - Atributos: `id`, `nombre`, `especialidad`, lista de cursos.
  - Métodos clave:
    - `agregarCurso(curso)` / `eliminarCurso(curso)`
    - `listarCursos()`
    - `getCursos()` devuelve una lista inmodificable (protege la encapsulación).
    - `mostrarInfo()`
- `Curso`
  - Atributos: `codigo`, `nombre`, `profesor`.
  - Método clave: `setProfesor(profesor)`
    - Actualiza ambos lados de la relación (Curso y Profesor).
- `Universidad`
  - Administra colecciones de `Profesor` y `Curso`.
  - Funciones principales:
    - `agregarProfesor(p)`, `eliminarProfesor(id)`
    - `agregarCurso(c)`, `eliminarCurso(codigo)`
    - `buscarProfesorPorId(id)`, `buscarCursoPorCodigo(codigo)`
    - `listarProfesores()`, `listarCursos()`
    - `asignarProfesorACurso(codigoCurso, idProfesor)`

**Archivos principales:**
- `Profesor.java`  
- `Curso.java`  
- `Universidad.java`  
- `Principal.java`

---

## ✅ Conceptos de POO trabajados en los 3 ejercicios
- Manejo de colecciones dinámicas (`ArrayList`).
- Búsqueda y filtrado dentro de listas.
- Relaciones entre objetos:
  - Composición 1 → N (`Biblioteca` → `Libro`)
  - Asociación con enumeraciones (`Producto` → `CategoriaProducto`)
  - Asociación bidireccional controlada (`Profesor` ↔ `Curso`)

---