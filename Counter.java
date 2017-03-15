import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
 
/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    static int hSpeed;
    static int check;
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter(){
        hSpeed = 0;
        check = 0;
    }
    public void act() 
    {
        setImage(new GreenfootImage(Player.hSpeed+" : " +Player.check, 18, Color.BLACK, Color.WHITE));
    }    
}
