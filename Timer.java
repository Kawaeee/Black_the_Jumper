import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    static int time;
    public Timer(){
        time = 10800;
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
    
        setImage(new GreenfootImage("Time :  "+((time/60)), 18, Color.BLACK, Color.WHITE));
    }     
}
