import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normalstage extends World
{
    int i;
    int x;
    int z = 40;
    static int time = 0;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public Normalstage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        Restart.count = 2;
        addObject(new Block(8),33,300);
        addObject(new Block(9),770,315);
        addObject(new Block(4),115,207);
        addObject(new Block(7),219,260);
        addObject(new Block(3),318,251);
        addObject(new Block(2),365,169);
        addObject(new Block(1),438,103);
        addObject(new Block(5),540,203);
        addObject(new Block(6),670,271);
        addObject(new Player(),33,160);
        addObject(new Counter(),33,220);
        addObject(new Timer(),760,20);
        addObject(new Deathcount(),680,20);
        addObject(new Restart(),480,370);
        addObject(new BacktoMenu(),628,374);
        Sound.started();
    }
    
    public void act(){ 
        Timer.time--;
        if(Timer.time<=0){
            Sound.stopped();
            End x = new End();
            Greenfoot.setWorld(x);
        }
        if(getObjects(Rain.class).isEmpty()){ 
        for(int i =0; i<5; i++){
           addObject(new Rain(),Greenfoot.getRandomNumber(getWidth()),0);
        }
           }
        }
        public int getRandomNumber(int start,int end)
       {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
        } 
        
        
       
    
