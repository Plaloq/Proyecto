import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    public GreenfootSound backgroundMusic = new GreenfootSound("fondo.mp3");
    protected Counter puntuacion;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600, 1);
        int counter=0;
        String []sueloImageSet = new String[]{"images/Materiales2.png","images/Materiales3.png","images/Materiales4.png", "images/Materiales5.png"};
        String []rocaImageSet = new String[]{"images/Roca2.png","images/Roca3.png","images/Roca4.png", "images/Roca5.png"};
        
        puntuacion.resetear();
        
        addObject(new Nubes(), 400,400);
        addObject(new Ciudad(), 400,470);
        addObject(new Tamia(), 50, 500);
        addObject(new Bellota(), 550, 525);
        for(int i=25; i<810; i=i+49){
            addObject(new PastoTierra(sueloImageSet[counter]), i, 575);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        puntuacion = new Counter("Puntuacion: ");
        addObject(puntuacion, 100, 50);
        
    }
    
    public Counter getCounter(){
        return puntuacion;
    }

    public void act(){
        super.act();
        if(!backgroundMusic.isPlaying())
        {
            backgroundMusic = new GreenfootSound("fondo.mp3");
            backgroundMusic.play();
        }
    }
}
