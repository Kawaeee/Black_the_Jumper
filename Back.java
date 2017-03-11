import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public Back() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) { 
            Greenfoot.playSound("click_sound.wav");
            Menu1 x = new Menu1();
            Greenfoot.setWorld(x);
        }
    }    
}
