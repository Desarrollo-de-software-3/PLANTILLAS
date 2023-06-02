import java.io.*;

// Nombre del archivo
class Archivos {
  private FileWriter f;
  private PrintWriter s;
  private File archivo = new File("archivo.csv");

  // Constructor de la clase
  public Archivos() throws Exception {
    try {
      f = new FileWriter(archivo, true); // Modo append para agregar al archivo existente
      s = new PrintWriter(f, true);
    } catch (IOException e) {
      throw new Exception("Mensaje para el usuario: El archivo no existe en la ruta indicada." +
          "\nMensaje para el programador: " + e.getMessage());
    }
  }

  // Funciones

  // Se guarda cada dato en una línea nueva
  public void grabar(String placa, String centroRegional) throws Exception {
    try {
      s.println(placa + ";" + centroRegional + ";");
    } catch (Exception e) {
      throw new Exception("Error al grabar los datos: " + e.getMessage());
    }
  }

  // Colocar los métodos get que permiten retornar cada dato de la clase

  public void cerrar() throws Exception {
    try {
      f.close();
      s.close();
    } catch (IOException e) {
      throw new Exception("Error al cerrar el archivo: " + e.getMessage());
    }
  }

  // Gets y Setters

  public PrintWriter getWriter() {
    return s;
  }

  public FileWriter getFileWriter() {
    return f;
  }

  public File getArchivo() {
    return archivo;
  }

  public void setArchivo(File archivo) {
    this.archivo = archivo;
  }

}
