# Práctico: Interfaces y Excepciones en Java

## 📌 Datos del estudiante
- **Nombre:** Alfredo de Inocenti  
- **Materia:** Programación II  
- **Carrera:** Tecnicatura Universitaria en Programación  

---

## 📚 Contenido
1. [E-commerce por interfaces](#1-e-commerce-por-interfaces)  
2. [Ejercicios sobre Excepciones](#2-ejercicios-sobre-excepciones)  

---

## 1. E-commerce por interfaces

### 📝 Descripción
Se implementa un sistema de e-commerce aplicando **interfaces**.  
- `Producto` y `Pedido` implementan **`Pagable`** para calcular totales.  
- `PayPal` implementa **`Pago`** (procesa pagos sin descuento).  
- `TarjetaCredito` implementa **`PagoConDescuento`** (extiende `Pago` y aplica un porcentaje de descuento).  
- `Cliente` implementa **`Notificable`** y recibe alertas cuando `Pedido` cambia de estado (por ejemplo, a **`PAGADO`**).

### 🧩 Clases principales
- `Producto` **implements** `Pagable`  
- `Pedido` **implements** `Pagable`  
- `Cliente` **implements** `Notificable`  
- `PayPal` **implements** `Pago`  
- `TarjetaCredito` **implements** `PagoConDescuento`  
- `EstadoPedido` (**enum**)

### 📁 Archivos
- `Pagable.java`, `Producto.java`, `Pedido.java`, `Notificable.java`, `Cliente.java`  
- `Pago.java`, `PagoConDescuento.java`, `PayPal.java`, `TarjetaCredito.java`, `EstadoPedido.java`  
- `Principal.java`

---

## 2. Ejercicios sobre Excepciones

### 📝 Descripción
Conjunto de ejercicios para practicar **manejo específico de errores**, lectura de archivos y **try-with-resources**, además de una **excepción personalizada** con datos de contexto (`EdadInvalidaException`).

### 🎯 Conceptos trabajados
- `ArithmeticException`, `NumberFormatException`, `FileNotFoundException`, `IOException`.  
- **`try-with-resources`** para cierre automático de recursos.  
- **Excepciones personalizadas**, mensajes claros y campos útiles (edad, rango).

### 🧩 Clases principales
- `DivisionSegura` — división con manejo de `ArithmeticException`.  
- `ConversionCadenaNumero` — parseo con `NumberFormatException`.  
- `LecturaArchivoSimple` — `Scanner(File)` + `FileNotFoundException` (ruta por defecto).  
- `LecturaArchivoTryWithResources` — `BufferedReader` + `IOException`.  
- `EdadInvalidaException` — límites por defecto **0..120**, helpers y mensaje descriptivo.  
- `Principal` — menú principal para ejecutar cada ejercicio.

### 📁 Archivos
- `Principal.java`  
- `DivisionSegura.java`, `ConversionCadenaNumero.java`  
- `LecturaArchivoSimple.java`, `LecturaArchivoTryWithResources.java`  
- `EdadInvalidaException.java`

