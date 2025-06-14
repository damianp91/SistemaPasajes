# 🌐 Idioma / Language  
> 📌 **Selecciona tu idioma:**  
> - [🇪🇸**Español**](README.es.md) (actual)  
> - [🇬🇧English](README.md)  
---

# 🎫 SistemaPasajes

## Requisitos del Sistema

### 1. Diseño orientado a objetos:

  - Crear una clase abstracta llamada ```javaVehiculoTransporte``` con atributos comunes como
    _patente_, _capacidad_, _empresa_, y un método abstracto ```javacalcularCostoBase()```.
  - Implementar las subclases ```javaColectivo```, ```javaTren``` y ```javaSubte```, cada una con una implementación
    específica del método ```javacalcularCostoBase()```.
    
### 2. Gestión de pasajes:

  - Crear una interfaz Pasaje con el método ```javacalcularCostoFinal()```.
  - Implementar esta interfaz en las clases ```javaPasajeComun```, ```javaPasajeEstudiante``` y
    ```javaPasajeJubilado```.
  - PasajeComun:      **__paga el costo base__**.
  - PasajeEstudiante: **__paga el 50% del costo base__**.
  - PasajeJubilado:   **__paga el 25% del costo base__**.

### 3. Modelo de herencia y polimorfismo:

  > [!NOTE] 
  > - Todos los pasajes deben poder ser tratados de forma polimórfica.
  > - Debe poder calcular el costo total de todos los pasajes emitidos sin conocer su tipo
  >    concreto.

### 4. Entrada/Salida por consola (menú):

  - Crear un menú que permita:
    * Registrar un nuevo viaje (solicitando datos por consola)
    * Mostrar todos los viajes realizados
    * Ordenar los viajes por costo (Comparable)
    * Ordenar los viajes por nombre de pasajero (Comparator)
    * Mostrar el total recaudado
      
### 5. Encapsulación y validación:
   > [!IMPORTANT]
   > - Todos los atributos deben estar encapsulados (privados o protegidos) y accederse
   >   mediante getters y setters.
   > - Validar que los datos de entrada no sean vacíos o inválidos **(capacidad > 0, costo base >
   >   0, etc.)**.
### 6. Sobrescritura de métodos:
  - Sobrescribir el método  ```javatoString()``` en todas las clases relevantes para mostrar los datos
    de forma legible.
