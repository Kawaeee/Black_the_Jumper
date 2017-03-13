import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BacktoMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BacktoMenu extends Button
{
    /**
     * Act - do whatever the BacktoMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public BacktoMenu() {
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            Greenfoot.playSound("click_sound.wav");
            Sound.stopped1();
            Sound.stopped();
            Menu1 x = new Menu1();
            Greenfoot.setWorld(x);
        }
    }    
}
