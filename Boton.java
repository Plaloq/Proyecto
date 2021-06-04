import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    private boolean mouseMov = false;
    private static int trans = 255;
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseMov=Greenfoot.mouseMoved(this);
        }
        if(mouseMov)
        {
            adjTrans(trans/2);
        }else{
            adjTrans(trans);
        }
    }
    
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
