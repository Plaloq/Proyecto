import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tamia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tamia extends Actor
{
    private static final int OFFSET = 5;
    private int currentImage;
    private int counter;
    
    private String []currentImagesSet;
    
    private String []estarParadoImageSet = new String[]{"images/ArdillaComun1.png", "images/ArdillaComun2.png"};
    private String []caminarDerechaImageSet = new String[]{"images/ArdillaCorriendo .png", "images/ArdillaCorriendo2 .png"};
    private String []caminarIzquierdaImageSet = new String[]{"images/ArdillaCorriendoAtras.png", "images/ArdillaCorriendoAtras2.png"};
    
    /**
     * Act - do whatever the Tamia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleDirection();
    }
    
    public Tamia()
    {
        setImage("images/ArdillaComun1.png");
        currentImagesSet = estarParadoImageSet;
    }
    
    public void handleDirection(){
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("right")){
            currentImagesSet = caminarDerechaImageSet;
            setLocation(x + OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("left")){
            currentImagesSet = caminarIzquierdaImageSet;
            setLocation(x - OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y - OFFSET);
        }
        else{
            currentImagesSet = estarParadoImageSet;
        }
        mover();
    }
    
    public void mover(){
        if(counter == 0){
            if(currentImage == 0){
                setImage(currentImagesSet[0]);   
            } else if (currentImage == 4){
                setImage(currentImagesSet[1]); 
                currentImage = -1;
            }

            currentImage = (currentImage + 1);
        }
        counter = (counter + 1)%10;
    }
    
    public void estarParado(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/ArdillaComun1.png");
            } else if (currentImage == 4){
                setImage("images/ArdillaComun2.png");
                currentImage = -1;
            }

            currentImage = (currentImage + 1);
        }
        counter = (counter + 1)%10;
    }
    
    public void caminarDerecha(){
        
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/ArdillaCorriendo .png");
            } else if (currentImage == 4){
                setImage("images/ArdillaCorriendo2 .png");
                currentImage = -1;
            }

            currentImage = (currentImage + 1);
        }
        counter = (counter + 1)%10;
    }
    
    public void caminarIzquierda(){
        
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/ArdillaCorriendoAtras.png");
            } else if (currentImage == 4){
                setImage("images/ArdillaCorriendoAtras2.png");
                currentImage = -1;
            }

            currentImage = (currentImage + 1);
        }
        counter = (counter + 1)%10;
    }
}
