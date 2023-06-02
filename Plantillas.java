import java.util.Scanner;

class Plantillas {

  // Objetos
  Scanner sc = new Scanner(System.in);

  int option = 0;

  public void menuGenerico() {

    do {
      try {
        System.out.println("Instruccion");
        while (!sc.hasNextInt()) {
          System.out.println("El valor ingresado no es un numero entero. Intentelo de nuevo:");
          sc.next();
        }
        option = sc.nextInt();
        sc.nextLine(); // lectura
        break; // salir del bucle 
      } catch (Exception e) {
        System.err.println(e); // mensaje de error
      }
    } while (true);
  }
}