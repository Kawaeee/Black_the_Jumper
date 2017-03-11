import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EXstage extends World
{
    int i;
    int x;
    int z = 40;
    static int time = 0;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public EXstage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        addObject(new Block(8),33,300);
        addObject(new Block(9),770,315);
        addObject(new Block(7),144,248);
        addObject(new Block(7),226,172);
        addObject(new Block(7),285,314);
        addObject(new Block(7),359,220);
        addObject(new Block(7),476,147);
        addObject(new Block(7),554,235);
        addObject(new Block(7),682,183);
        addObject(new Player(),33,160);
        addObject(new Counter(),33,220);
        addObject(new Timer(),760,20);
        addObject(new Deathcount(),680,20);
        Sound.started();
    }
    
    public void act(){ 
        Timer.time--;
        if(Timer.time<=0){
            Sound.stopped();
            End x = new End();
            Greenfoot.setWorld(x);
        }
        addObject(new Rain(),Greenfoot.getRandomNumber(getWidth()),0);
        }
        public int getRandomNumber(int start,int end)
       {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
        } 
        
        
       
    
