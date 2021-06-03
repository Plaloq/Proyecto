import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Records extends Boton
{
    public Records(){
        GreenfootImage botonRecords = new GreenfootImage(160, 60);
        Font adjustFont = new Font(true, false, 40);
        botonRecords.setFont(adjustFont);
        botonRecords.setColor(Color.BLACK);
        botonRecords.drawString("Records", 0,50);
        setImage(botonRecords);
    }
    /**
     * Act - do whatever the records wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            //Greenfoot.setWorld(new Records());
        }
        // Add your action code here.
    }
    
    /*public void presBoton(){
        //Greenfoot.setWorld(new Record());
    }*/
}
