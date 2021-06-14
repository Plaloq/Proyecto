import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel extends World
{
    public static GreenfootSound backgroundMusic = new GreenfootSound("fondo.mp3");
    protected Counter Puntuacion;
    /**
     * Constructor for objects of class Nivel.
     * 
     */
    public Nivel()
    {    
        super(800, 600, 1); 
        Puntuacion = new Counter("Puntuacion: ");

        Puntuacion.resetear();
        addObject(new Nubes(), 400,400);
        addObject(new Ciudad(), 400,470);
        addObject(new Tamia(), 50, 500);
        addObject(Puntuacion, 100, 50);
        preparar();
    }

    public Counter getCounter(){
        return Puntuacion;
    }

    public void preparar(){
        int counter=0;
        String []sueloImageSet = new String[]{"images/Materiales2.png","images/Materiales3.png","images/Materiales4.png", "images/Materiales5.png"};
        String []rocaImageSet = new String[]{"images/Roca2.png","images/Roca3.png","images/Roca4.png", "images/Roca5.png"};
        Bellota bellota1 = new Bellota();
        Bellota bellota2 = new Bellota();
        Bellota bellota3 = new Bellota();
        Bellota bellota4 = new Bellota();
        Bellota bellota5 = new Bellota();
        
        Fuego fuego1 = new Fuego("Fuego1.png");
        Fuego fuego2 = new Fuego("Fuego2.png");
        Fuego fuego3 = new Fuego("Fuego3.png");
        Fuego fuego4 = new Fuego("Fuego4.png");
        Fuego fuego5 = new Fuego("Fuego4.png");
        for(int i=25; i<810; i=i+49){
            addObject(new PastoTierra(sueloImageSet[counter]), i, 575);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=0; i<110; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 400);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=0; i<60; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 120);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=160; i<250; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 250);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=260; i<410; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 400);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=160; i<250; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 500);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=360; i<600; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 200);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=600; i<810; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 100);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        for(int i=550; i<750; i=i+49){
            addObject(new Roca(rocaImageSet[counter]), i, 450);
            counter++;
            if(counter==4){
                counter=0;
            }
        }
        
        addObject(fuego1, 300, 530);
        addObject(fuego2, 350, 530);
        addObject(fuego3, 400, 530);
        
        addObject(fuego4, 20,80);
        
        addObject(fuego5, 430,160);

        addObject(bellota1, 550, 500);
        addObject(bellota2, 50, 50);
        addObject(bellota3, 250, 250);
        addObject(bellota4, 250, 500);
        addObject(bellota5, 750, 50);
    }

    public static void backgroundStop(){
        backgroundMusic.stop();
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
