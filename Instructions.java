import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Button
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public Instructions() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            Greenfoot.playSound("click_sound.wav");
            Instruction x = new Instruction();
            Greenfoot.setWorld(x);
        }
    }   
}
