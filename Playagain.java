import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playagain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playagain extends Button
{
    /**
     * Act - do whatever the Playagain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private boolean mouseDown;
    public Playagain() {
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
