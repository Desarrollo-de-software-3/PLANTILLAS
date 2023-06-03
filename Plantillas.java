import java.io.*;

class Plantillas {

  // Objetos
  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
  int option = 0;

  public void menuGenerico() {

    do {
      try {
        System.out.println("Instruccion");
        System.out.println("Introduzca la matricula del vehiculo");
        // matricula = leer.readLine();
        // obj.setMatricula(matricula);

        break; // salir del bucle
      } catch (Exception e) {
        System.out.println("ERROR" + e);
      }

    } while (true);
  }
}