import java.io.*;
public class Lectura {
    BufferedReader b;
    FileReader fr;
    public Lectura(String ruta) throws Exception{
        try {
            fr = new FileReader(ruta);
            b = new BufferedReader(fr);

        } catch (FileNotFoundException y) {
            throw y;
        }
    }

    public void cerrarB() throws Exception {
        try {
            b.close();
        } catch (IOException e) {
            throw e;
        }
    }
}
