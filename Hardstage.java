import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hardstage extends World
{
    int i;
    int x;
    int z = 40;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public Hardstage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        Restart.count = 3;
        addObject(new Block(8),33,300);
        addObject(new Block(9),770,315);
        addObject(new Block(7),160,213);
        addObject(new Block(6),241,302);
        addObject(new Block(7),338,139);
        addObject(new Block(7),340,358);
        addObject(new Block(4),475,152);
        addObject(new Block(6),478,298);
        addObject(new Block(6),629,254);
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
            End x = new End();
            Greenfoot.setWorld(x);
            Sound.stopped();
        }
        if(getObjects(Rain.class).isEmpty()){ 
            for(int i =0; i<10; i++){
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
        
        
       
    
