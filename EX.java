import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EX extends Button
{
    /**
     * Act - do whatever the EX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public EX() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            EXstage x = new EXstage();
            Greenfoot.setWorld(x);
        }
    }     
}
