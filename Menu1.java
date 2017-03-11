import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu1 extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        addObject(new Title(),247,63);
         addObject(new Start(),224,148);
         addObject(new Instructions(),232,210);
         addObject(new Exit(),226,285);
         addObject(new Player1(),515,198);
         Sound.started1();
    }
    public void act(){
    if(getObjects(Rain1.class).isEmpty()){ 
        for(int i =0; i<5; i++){
           addObject(new Rain1(),Greenfoot.getRandomNumber(getWidth()),0);
        }
    }
    }
       }

