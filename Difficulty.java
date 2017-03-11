import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Difficulty.
     * 
     */
    public Difficulty()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        addObject(new Easy(),192,104);
        addObject(new Normal(),587,106);
        addObject(new Hard(),195,270);
        addObject(new EX(),589,270);
        addObject(new Back(),390,200);
    }
        public void act(){
    if(getObjects(Rain1.class).isEmpty()){ 
        for(int i =0; i<6; i++){
           addObject(new Rain1(),Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    }
}
