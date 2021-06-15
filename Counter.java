import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private static int value = 0;
    private static int target = 0;
    private String prefix;

    public Counter()
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public Counter(String prefix)
    {
        background = getImage(); 
        this.prefix = prefix;
        updateImage();
    }

    /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() 
    {
        if (value < target) {
            value += 5;
            updateImage();
        }
        else if (value > target) {
            value -= 5;
            updateImage();
        }
    }

    public void add(int score)
    {
        if((target += score) > 0)
            target += score;
        else
            target = 0;
    }

    public int getValue()
    {
        return target;
    }

    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);

        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }

        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
            (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }

    public static void resetear(){
        value = 0;
        target = 0;
    }

    public static int getTarget(){
        return target;
    }
}
