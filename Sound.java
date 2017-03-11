import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound extends Actor
{
static GreenfootSound music = new GreenfootSound("theme_sound.wav");
static GreenfootSound music1 = new GreenfootSound("title_sound.wav");
public static void started()
{
    music.playLoop();
}
 
public static void stopped()
{
    music.stop();
}
public static void started1()
{
    music1.playLoop();
}
 
public static void stopped1()
{
    music1.stop();
}     

}
