# SistemaPasajes

## Requisitos del Sistema
### 1. Diseño orientado a objetos:
  - Crear una clase abstracta llamada VehiculoTransporte con atributos comunes como
    patente, capacidad, empresa, y un método abstracto calcularCostoBase().
  - Implementar las subclases Colectivo, Tren y Subte, cada una con una implementación
    específica del método calcularCostoBase().
### 2. Gestión de pasajes:
  - Crear una interfaz Pasaje con el método calcularCostoFinal().
  - Implementar esta interfaz en las clases PasajeComun, PasajeEstudiante y
    PasajeJubilado.
  - PasajeComun: paga el costo base.
  - PasajeEstudiante: paga el 50% del costo base.
  - PasajeJubilado: paga el 25% del costo base.
### 3. Modelo de herencia y polimorfismo:
  - Todos los pasajes deben poder ser tratados de forma polimórfica.
  - Debe poder calcular el costo total de todos los pasajes emitidos sin conocer su tipo
    concreto.
### 4. Entrada/Salida por consola (menú):
  - Crear un menú que permita:
  - Registrar un nuevo viaje (solicitando datos por consola)
  - Mostrar todos los viajes realizados
  - Ordenar los viajes por costo (Comparable)
  - Ordenar los viajes por nombre de pasajero (Comparator)
  - Mostrar el total recaudado
### 5. Encapsulación y validación:
  - Todos los atributos deben estar encapsulados (privados o protegidos) y accederse
    mediante getters y setters.
  - Validar que los datos de entrada no sean vacíos o inválidos (capacidad > 0, costo base >
    0, etc.).
### 6. Sobrescritura de métodos:
  - Sobrescribir el método toString() en todas las clases relevantes para mostrar los datos
    de forma legible.
