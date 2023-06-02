public class App {
  public static void main(String[] args)  {
    try {
      Funciones f = new Funciones();
      f.cerrar();
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
