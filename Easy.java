import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Button
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean mouseDown;
    
    public Easy() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {  
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Easystage x = new Easystage();
            Greenfoot.setWorld(x);
        }
    }    
}
