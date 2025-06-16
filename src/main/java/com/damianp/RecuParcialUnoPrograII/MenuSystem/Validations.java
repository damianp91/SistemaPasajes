package com.damianp.RecuParcialUnoPrograII.MenuSystem;

import java.util.Scanner;

public class Validations {
  // Atributes
  private Scanner scanner;

  // Constructor
  public Validations() {
    this.scanner = new Scanner(System.in);
  }

  // Methods
  /**
   * Reads an integer value from user input with validation.
   * Continuously prompts the user until a valid integer is entered.
   * 
   * @return the validated integer value entered by the user
   * @see java.util.Scanner#hasNextInt()
   * @see java.util.Scanner#nextInt()
   */
  public int integerRead() {
    while (!scanner.hasNextInt()) {
      System.err.print("The input must be a integer: ");
      scanner.next();
    }
    return scanner.nextInt();
  }

  /**
   * Reads a double value from user input with validation.
   * Continuously prompts the user until a valid decimal number is entered.
   * 
   * @return the validated double value entered by the user
   * @see java.util.Scanner#hasNextDouble()
   * @see java.util.Scanner#nextDouble()
   */
  public double doubleRead() {
    while (!scanner.hasNextDouble()) {
      System.err.print("The input must be a decimal number: ");
      scanner.next();
    }
    return scanner.nextDouble();
  }

  /**
   * Reads a non-empty string from user input with validation.
   * Continuously prompts the user until a non-blank string is entered.
   * 
   * @return the validated, trimmed string entered by the user
   * @see java.util.Scanner#nextLine()
   */
  public String stringRead() {
    String word = "";
    do {
      word = scanner.nextLine().trim();
      if(word.isEmpty()) {
        System.err.print("The input mustn't be empty: ");
      }
    } while(word.isEmpty());
    return word;
  }

  /**
   * Converts a string to title case (capitalize first letter of each word).
   * Handles multi-word strings and normalizes the rest of each word to lowercase.
   * 
   * @param word the string to be converted to title case
   * @return the formatted string in title case
   * @example "hello world" becomes "Hello World"
   */
  public String toCapitalize(String word) {
    String[] array = word.split(" ");
    for(int i = 0; i < array.length; i ++) {
      array[i] = array[i].substring(0, 1).toUpperCase() +
      array[i].substring(1).toLowerCase();
    }
    word = String.join(" ", array);
    return word;
  }

  /**
   * Validates that a number falls within a specified range [min, max].
   * Continuously prompts the user until a valid number in range is entered.
   * 
   * @param number the initial number to validate
   * @param min the minimum allowed value (inclusive)
   * @param max the maximum allowed value (inclusive)
   * @return the validated number within the specified range
   * @see #integerRead()
   */
  public int intervals(int number, int min, int max) {
    while (number < min || number > max) {
      System.err.print("The input must be a range between " + min + "-" + max);
      number = integerRead();
    }
    return number;
  }
}
