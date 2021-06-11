import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldInstrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldInstrucciones extends World
{

    /**
     * Constructor for objects of class WorldInstrucciones.
     * 
     */
    public WorldInstrucciones()
    {    
        super(800, 600, 1); 
        GreenfootImage bg = new GreenfootImage("FondoInstrucciones.png");
        addObject(new Regresar(), 50, 550);
    }
}
