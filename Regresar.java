import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Regresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regresar extends Boton
{
    /**
     * Act - do whatever the Regresar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Regresar(){
        setImage("images/Regresar.png");
    }
    
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
