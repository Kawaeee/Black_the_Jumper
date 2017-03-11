import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rain1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rain1 extends Actor
{
    /**
     * Act - do whatever the Rain1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+1);
        isFalldown();
    }    
    public void isFalldown(){
        if(getY()==399){
            getWorld().removeObject(this);
        }
    }
}
