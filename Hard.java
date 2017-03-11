import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Button
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public Hard() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) { 
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Hardstage x = new Hardstage();
            Greenfoot.setWorld(x);
        }
    }     
}
