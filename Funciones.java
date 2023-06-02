import java.io.*;

// Nombre del archivo
class Funciones extends Archivos{
    private String placa;
    private String centroRegional;
    private PrintWriter s = getWriter();

    public Funciones() throws Exception {
        super();
    }

    public void asignar(String placa, String centroRegional) {
        this.placa = placa;
        this.centroRegional = centroRegional; 
    }

    // Se guarda cada dato en una línea nueva
    public void grabar() throws Exception {
        try {
            s.println(placa + ";" + centroRegional + ";");
        } catch (Exception e) {
            throw new Exception("Error al grabar los datos: " + e.getMessage());
        }
    }


    public boolean buscarPlaca(String placa) throws Exception {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(getArchivo()));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length >= 1 && campos[0].equals(placa)) {
                    return true; // La placa se encontró en el archivo
                }
            }
            return false; // La placa no se encontró en el archivo
        } catch (IOException e) {
            throw new Exception("Error al buscar la placa: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new Exception("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }

    public String getPlaca() {
        return placa;
    }
}
