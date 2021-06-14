import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.WHITE;
    private Color fillColor = Color.BLACK;
    
    private static final Color transparent = new Color(0,0,0,0);

    public Label(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }


    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }
    
    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }
    
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }
    
    private void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, transparent, lineColor));
    }
}
