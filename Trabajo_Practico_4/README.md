# Práctico: Programación Orientada a Objetos (POO)

## 📌 Datos del estudiante
- **Nombre:** Alfredo de Inocenti
- **Materia:** Programación II
- **Carrera:** Tecnicatura Universitaria en Programación

## 🔹 Conceptos aplicados
- `this` en constructores para distinguir parámetros de atributos.  
- **Constructores sobrecargados**:  
  - Completo: `(int id, String nombre, String puesto, double salario)`  
  - Reducido: `(String nombre, String puesto)` → asigna `id` automático y salario por defecto.  
- **Sobrecarga de métodos** `actualizarSalario`:  
  - `actualizarSalario(int porcentaje)`  
  - `actualizarSalario(double monto)`  
- `toString()` sobrescrito para salida legible.  
- **Atributo estático** `totalEmpleados` + **método estático** `mostrarTotalEmpleados()`.



## 🔹 Ejecución
1. Se creó una clase `Empleado` aplicando los conceptos nombrados en el punto anterior.
2. En la clase `Principal` se instancia varios objetos usando ambos constructores.
3. Se aplicó el método `actualizarSalario()` sobre distintos objetos.
4. Se sobrecargó `toString()` para mostrar la información de cada objeto.
5. Mostramos el total de los empleados con el método `mostrarTotalEmpleados()`.

**Archivos principales:**  
  - `Empleado.java`  
  - `Principal.java`