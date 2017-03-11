import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int swap;
    public Block(int i){
        setImage("Block_"+i+".png");
        swap = i;
    }
    public void act() {
        /*if(swap<8){
            turn(1);
        }*/
    }    
}
