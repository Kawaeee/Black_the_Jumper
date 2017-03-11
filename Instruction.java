import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new Back(),742,29);
        addObject(new Howtoplay(),400,200);
    }
    public void act(){
    if(getObjects(Rain1.class).isEmpty()){ 
        for(int i =0; i<2; i++){
           addObject(new Rain1(),Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    }
}
