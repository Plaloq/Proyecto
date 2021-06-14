import greenfoot.*;
import java.util.ArrayList; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldPuntuaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldPuntuaciones extends World
{
    public WorldPuntuaciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepararPuntuaciones();
        
        int i=0;
        
        addObject(new Regresar(), 50, 550);

        ArrayList<Integer> Punt = Puntuacion.getPuntuaciones();
        String t;
        
        for(i = 0; i < Punt.size(); i++){
            t = Integer.toString(i + 1) + ".-   \t\t    " + Integer.toString(Punt.get(i));
            addObject(new Label(t,50),150,50 + (75 * i));
        }
    }
    
    private void prepararPuntuaciones(){
        setBackground(new GreenfootImage("fondoPunt.jpg"));
    }
}
