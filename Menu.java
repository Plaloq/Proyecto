import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion=0;
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
        addObject(new jugar(), 400,200);
        addObject(new records(), 400,250);
        addObject(new instrucciones(), 400, 300);
        addObject(new salir(), 400, 350);
        addObject(flecha, 200, 200);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("UP"))
        {
            opcion--;
            Greenfoot.delay(8);
        }
        if(Greenfoot.isKeyDown("DOWN"))
        {
            opcion++;
            Greenfoot.delay(8);
        }
        if(opcion>=4)
        {
            opcion=0;
        }
        if(opcion<0)
        {
            opcion=3;
        }
        flecha.setLocation(200, 200+(opcion*50));
        
        if (Greenfoot.isKeyDown("SPACE"))
        {
            switch(opcion)
            {
                case 0:
                    //Greenfoot.setWorld(new Juego());
                    break;
                case 1:
                    //Greenfoot.setWorld(new Records());
                    break;
                case 2:
                    //Greenfoot.setWorld(new Instrucciones());
                    break;
                case 3:
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
