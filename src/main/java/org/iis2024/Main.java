package org.iis2024;

public class Main {
  public static void main(String[] args) {
    Date fecha1 = new Date(29, 2, 2024);  // Año bisiesto, debería ser válido
    Date fecha2 = new Date(31, 4, 2023);  // Abril tiene 30 días, debería ser inválido

    System.out.println("Fecha 1 válida: " + fecha1.validate());
    System.out.println("Fecha 2 válida: " + fecha2.validate());
  }
}
