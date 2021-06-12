import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("fondo.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepararMenu();
    }

    public void prepararMenu(){
        addObject(new Jugar(), 400,200);
        addObject(new Records(), 400,250);
        addObject(new Instrucciones(), 400, 300);
        addObject(new Salir(), 400, 350);
    }
    
    public void act(){
        
    }
}
