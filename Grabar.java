import java.io.*;
public class Grabar {
      FileWriter fw;
      PrintWriter pw;
      File f;
      String nomArch;
  
     public Grabar(String nomArch) throws Exception{
          try{
               fw = new FileWriter("vehiculo.csv",true);
               pw = new PrintWriter(fw);
          }
          catch (IOException e){
               throw e;
          }
          f=new File(nomArch);
     }


     public void grabar() throws Exception {
          try {
               pw.print(getMatricula() + ";");
               pw.print( getCentroR()+ "\n");

          } catch (SecurityException e) {
               throw e;
          }
     }
     public void cerrar() throws Exception {
          try {
               fw.close();
               pw.close();
          } catch (IOException e) {
               throw e;
          }
     }
     
}
