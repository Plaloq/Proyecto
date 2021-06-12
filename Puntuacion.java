import greenfoot.*;
import java.util.*;
import java.util.ArrayList;
import java.io.*;

/**
 * Write a description of class Puntuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntuacion extends Actor
{
    private static ArrayList<Integer> puntuacion = new ArrayList<Integer>();

    public Puntuacion(){
        int points;

        if(puntuacion.isEmpty()){
            try{
                File Archivo = new File("Puntuaciones.txt");

                Scanner entrada = new Scanner(new FileReader(Archivo));

                do{
                    points = entrada.nextInt();
                    puntuacion.add(points);
                }while(entrada.hasNext());
            }catch(IOException e){

            }
        }
    }

    public static ArrayList<Integer> getPuntuacion(){
        return puntuacion;
    }

    public static void insertarPuntuacion(int p)
    {
        puntuacion.add(p);
        Collections.sort(puntuacion, Collections.reverseOrder());
        puntuacion.remove(puntuacion.size()-1);
    }

    public static void guardarPuntuaciones(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("Puntuaciones.txt");
            pw = new PrintWriter(fichero);

            for(int i = 0; i< puntuacion.size(); i++)
            {
                pw.println(puntuacion.get(i));
            }
        }catch(Exception e){
        }finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }

}
