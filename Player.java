import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int holdtime;
    int vSpeed;
    static int hSpeed = 0;
    static int check = 0;
    public Player(){
    vSpeed = -10;
    hSpeed = 0;
    check = 0;
    }
    public void act()
    {
        
        setStart();  
        checkKey();
        
   }
   public void checkKey(){
            if (!onGround()) 
        {
            if (vSpeed == 0 && holdtime > 0) holdtime--; 
            if (vSpeed == 0 && holdtime > 0) return; 
            vSpeed++;
            turn(10);
            setLocation(getX()+hSpeed, getY()+vSpeed);
            Greenfoot.getKey(); 
        }
        else 
        {
            if ("space".equals(Greenfoot.getKey()))
            {
                if(check==0) vSpeed = -5;
                else if(check==1) vSpeed = -10;
                else if(check==2) vSpeed = -15;
                else if(check==3) vSpeed = -20;
                Greenfoot.playSound("jump_sound.wav");
                setLocation(getX(), getY()+vSpeed); 
                holdtime = 1;  
            }
            if (Greenfoot.isKeyDown("shift")){ //y
                check++;
                if(check==4){
                    check = 0;
                }
            }
            if (Greenfoot.isKeyDown("control")){ //x
                hSpeed++;
                if(hSpeed>5){
                    hSpeed = 0;
                }
                
            }
        }

   }
    public boolean onGround()
    {
          Actor x = getOneObjectAtOffset(0,getImage().getHeight()/2,Block.class);
          return x != null;
   }
   public void setStart(){
       if(this.getY()>=390){
          hSpeed = 0;
          check = 0;
          Greenfoot.playSound("dead_sound.wav");
          this.setLocation(33,170);
          Deathcount.dead++;
        }
       if(this.getX()>=770){
           Sound.stopped();
           End x = new End();
           Greenfoot.setWorld(x);
           Greenfoot.playSound("end_sound.wav");
        }
    }
}

