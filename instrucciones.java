import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Instrucciones extends Boton
{
    public Instrucciones(){
   
        GreenfootImage botonInstrucciones = new GreenfootImage(260, 60);
        Font adjustFont = new Font(true, false, 40);
        botonInstrucciones.setFont(adjustFont);
        botonInstrucciones.setColor(Color.BLACK);
        botonInstrucciones.drawString("Instrucciones", 0,50);
        setImage(botonInstrucciones);
    }
    /**
     * Act - do whatever the instrucciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {            
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            //Greenfoot.setWorld(new Instrucciones());
        }
    }
    /*public void presBoton(){
        //Greenfoot.setWorld(new Instruccion());
    }*/
}
