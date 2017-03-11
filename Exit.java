import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mouseDown;
    
    public Exit() {
        mouseDown = false;
    }
    
    public void act() 
    {
     if (!mouseDown && Greenfoot.mousePressed(this)) {  
        Greenfoot.playSound("click_sound.wav");
        System.exit(0);
        }
    }
 }           