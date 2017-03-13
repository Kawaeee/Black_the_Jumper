import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Button
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    static int count;
    
    public Restart() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this) && count==1) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Greenfoot.setWorld(new Easystage());
        }
        if (!mouseDown && Greenfoot.mousePressed(this) && count==2) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Greenfoot.setWorld(new Normalstage());
        }
        if (!mouseDown && Greenfoot.mousePressed(this) && count==3) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Greenfoot.setWorld(new Hardstage());
        }
        if (!mouseDown && Greenfoot.mousePressed(this) && count==4) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Greenfoot.setWorld(new EXstage());
        }
    }   
}
