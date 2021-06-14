import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {
        super(800, 600, 1);
        addObject(new Tejado(), 400,440);
        addObject(new TortaVoladora(), 300, 200);
        addObject(new Label("Game Over", 60), 400, 300);
    }
    
    public void act(){
        Puntuacion.insertarPuntuacion(Tamia.getPuntuacion());
        Puntuacion.guardarPuntuaciones();
        Greenfoot.delay(100);
        Greenfoot.setWorld(new Menu());
    }
}
