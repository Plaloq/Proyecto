import greenfoot.*; 
/**
 * Write a description of class salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salir extends Boton
{
    public Salir(){
        GreenfootImage botonSalir = new GreenfootImage(90, 60);
        Font adjustFont = new Font(true, false, 40);
        botonSalir.setFont(adjustFont);
        botonSalir.setColor(Color.BLACK);
        botonSalir.drawString("Salir", 0,50);
        setImage(botonSalir);
    }
    
    /**
     * Act - do whatever the salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}
