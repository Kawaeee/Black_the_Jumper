import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class Endgame.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new ScoreBoard(),220,200);
        addObject(new Playagain(),620,126);
        addObject(new Exit(),617,250);
    }
    public void act(){
    if(getObjects(Rain1.class).isEmpty()){ 
        for(int i =0; i<3; i++){
           addObject(new Rain1(),Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    }
}
