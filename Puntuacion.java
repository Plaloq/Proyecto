import greenfoot.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a description of class Puntuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntuacion extends Actor
{
    private static ArrayList<Integer> Puntuacion = new ArrayList<Integer>();

    public Puntuacion(){
        int punt;

        if(Puntuacion.isEmpty()){
            try{
                File Archivo = new File("ArchivoPuntuaciones.txt");

                Scanner Entrada = new Scanner(new FileReader(Archivo));

                do{
                    punt = Entrada.nextInt();
                    Puntuacion.add(punt);
                }while(Entrada.hasNext());
            }catch(IOException e){

            }
        }
    }

    public static ArrayList<Integer> getPuntuaciones(){
        return Puntuacion;
    }

    public static void insertarPuntuacion(int p)
    {
        Puntuacion.add(p);
        Collections.sort(Puntuacion, Collections.reverseOrder());
        Puntuacion.remove(Puntuacion.size()-1);
    }

    public static void guardarPuntuaciones(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("ArchivoPuntuaciones.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Puntuacion.size(); i++)
                pw.println(Puntuacion.get(i));

        } catch (Exception e) {
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void act(){}

}
