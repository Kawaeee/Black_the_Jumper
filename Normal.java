import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Button
{
    /**
     * Act - do whatever the Normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean mouseDown;
    
    public Normal() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) { 
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Normalstage x = new Normalstage();
            Greenfoot.setWorld(x);
        }
    }     
}
