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
    private int vSpeed = 0;
    private int accelaration = 2;
    private boolean jumping;
    private int jumpStrength = 15;

    private String []currentImagesSet;
    
    private String []estarParadoImageSet = new String[]{"images/ArdillaComun1.png", "images/ArdillaComun2.png"};
    private String []caminarDerechaImageSet = new String[]{"images/ArdillaCorriendo .png", "images/ArdillaCorriendo2 .png"};
    private String []caminarIzquierdaImageSet = new String[]{"images/ArdillaCorriendoAtras.png", "images/ArdillaCorriendoAtras2.png"};
    
    /**
     * Act - do whatever the Tamia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public Tamia()
    {
        setImage("images/ArdillaComun1.png");
        currentImagesSet = estarParadoImageSet;
    }
    
    public void act() 
    {
        checkFall();
        handleDirection();
    }

    
    public void handleDirection(){
        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("right")){
            currentImagesSet = caminarDerechaImageSet;
            setLocation(x + OFFSET, y);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
        }else{
            currentImagesSet = estarParadoImageSet;
        }

        if(Greenfoot.isKeyDown("up") && jumping==false){
            jump();
            setLocation(x, y - OFFSET*15);
        }else if(Greenfoot.isKeyDown("left")){
            currentImagesSet = caminarIzquierdaImageSet;
            setLocation(x - OFFSET, y);
        }
        mover();
    }
    
    public void mover(){
        if(counter == 0){
            if(currentImage == 0){
                setImage(currentImagesSet[0]);   
            } else if (currentImage == 2){
                setImage(currentImagesSet[1]);
                currentImage = -1;
            }

            currentImage = (currentImage + 1);
        }
        counter = (counter + 1)%10;
    }

    public void Falling()
    {
        setLocation(getX(), getY() +vSpeed);
        if(vSpeed <=8)
        {
            vSpeed = vSpeed + accelaration;
        }
        jumping = true;
    }

    public void checkFall(){
        if(onFloor())
        {
            vSpeed=0;
        }else{
            Falling();
        }
    }

    public boolean onGround()
    {
        Actor ground = getOneObjectAtOffset(0, 25, Suelo.class);

        if(ground == null)
        {
            jumping = true;
            return false;
        }else{
            moveToGround(ground);
            return true;
        }
    }

    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        Falling();
    }


    public boolean onFloor()
    {
        Actor ground = getOneObjectAtOffset(0, 25, Suelo.class);

        if(ground == null)
        {
            jumping = true;
            return false;
        }else{
            moveToGround(ground);
            return true;
        }
    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;

        setLocation(getX(), newY);
        jumping = false;
    }

}
