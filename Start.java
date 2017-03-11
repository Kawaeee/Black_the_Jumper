import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
     private boolean mouseDown;
    public Start() {
        mouseDown = false;
    }
 
    public void act() {
        if (!mouseDown && Greenfoot.mousePressed(this)) {  
            Greenfoot.playSound("click_sound.wav");
            Difficulty x = new Difficulty();
            Greenfoot.setWorld(x);
        }
    }
     
}
