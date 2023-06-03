import java.io.*;

class Plantillas {

  // Objetos
  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
  int option = 0;

  public void menuGenerico() {

    do {
      try {
        System.out.println("Instruccion");
           

        break; // salir del bucle
      } catch (Exception e) {
        System.out.println("ERROR" + e);
      }

    } while (true);
  }
}
