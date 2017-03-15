import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Deathcount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deathcount extends Actor
{
    /**
     * Act - do whatever the Deathcount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int dead;
    public Deathcount(){
        dead = 0;
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
    
        setImage(new GreenfootImage("Death :  "+dead, 18, Color.BLACK, Color.WHITE));
    }      
}
