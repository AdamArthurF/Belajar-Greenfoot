import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movement here.
 * 
 * @author (Adam Arthur Faizal) 
 * @version (7 April 2020)
 */
public abstract class Movement extends Actor
{
    /**
     * Act - do whatever the Movement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(int movement){
        gerak(movement);
    }
    
    /**
     * gerak - Method untuk menggerakkan object
     */
    public void gerak(int speed)
    {
        turn(speed);
        if (Greenfoot.getRandomNumber(100) < 50){
            turn(15);
        } else {
            turn(-15);
        }
    }
     
    /**
     * handleTepi - Method untuk membuat object berbalik 180 derajat ketika mencapai edge of the world
     */
    public void handleTepi()
    {
        if (isAtEdge()){
            turn(180);
        }
    }
}
