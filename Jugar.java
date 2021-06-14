import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Boton
{
    public Jugar(){
        GreenfootImage botonJugar = new GreenfootImage(110, 60);
        Font adjustFont = new Font(true, false, 40);
        botonJugar.setFont(adjustFont);
        botonJugar.setColor(Color.BLACK);
        botonJugar.drawString("Jugar", 0,50);
        setImage(botonJugar);
    }
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Nivel());
            Tamia.setPuntuacion(0);
        }
    }
    
}
