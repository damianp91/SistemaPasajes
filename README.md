# 🌐 Idioma / Language  
> 📌 **Select your language:**  
> - [🇪🇸Español](README.es.md)  
> - [🇬🇧**English**](README.md) (current)  
---

# 🎫 TicketSystem

## System Requirements

### 1. Object-Oriented Design:
  - Create an abstract class named ```javaTransportVehicle``` with common attributes such as license
    plate, capacity, company, and an abstract method ```java calculateBaseCost()```.
  - Implement the subclasses ```javaBus```, ```javaTrain```, and ```javaSubway```, each with its own
    specific implementation of ```javacalculateBaseCost()```.

### 2. Ticket Management:

  - Create an interface Ticket with the method ```javacalculateFinalCost()```.
  - Implement this interface in the classes ```javaRegularTicket```, ```javaStudentTicket```, and ```javaSeniorTicket```:
    * RegularTicket: **_Pays the full base cost_**.
    * StudentTicket: **_Pays 50% of the base cost_**.
    * SeniorTicket:  **_Pays 25% of the base cost_**.

### 3. Inheritance and Polymorphism Model:

  - All tickets must be treated polymorphically.
  - The system should be able to calculate the total cost of all issued tickets without knowing their concrete type.

### 4. Console Input/Output (Menu):

  - Create a menu that allows:
    * Registering a new trip (requesting data via console).
    * Displaying all completed trips.
    * Sorting trips by cost (using Comparable).
    * Sorting trips by passenger name (using Comparator).
    * Displaying the total revenue collected.

### 5. Encapsulation and Validation:

  - All attributes must be encapsulated (private/protected) and accessed via getters and setters.
  - Validate input data to ensure it is not empty or invalid (e.g., capacity > 0, base cost > 0).

### 6. Method Overriding:

  - Override the toString() method in all relevant classes to display data in a readable format.
