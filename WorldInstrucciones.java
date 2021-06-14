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
        int i=200;
        GreenfootImage bg = new GreenfootImage("FondoInstrucciones.png");
        addObject(new Regresar(), 50, 550);
        addObject(new Label("Tamia's Adventure es un juego de plataforma",30),400,120);
        addObject(new Label("donde tendras que recolectar todas las bellotas",30),400,160);
        addObject(new Label("posibles sin ser tocado por un enemigo, recolectalas",30),400,200);        
        addObject(new Label("todas y gana.",30),400,240);        
        addObject(new Label("utiliza las flechas de movimiento laterales para",30),400,280);        
        addObject(new Label("moverte y la flecha de arriba para saltar",30),400,320);
    }
}
