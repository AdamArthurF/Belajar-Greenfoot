import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Adam Arthur Faizal) 
 * @version (7 April 2020)
 */
public class BeeWorld extends World
{
    private int scores = 0;
    /**
     * Constructor for objects of class MyWorld.
     */
    public BeeWorld(){    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for (int i = 0; i < 10; i++){
            int direction = Greenfoot.getRandomNumber(360);
            int x = Greenfoot.getRandomNumber(this.getWidth());
            int y = Greenfoot.getRandomNumber(this.getHeight());
            addObject(new Fly(direction), x, y);
            if (i < 3){
            int a = Greenfoot.getRandomNumber(this.getWidth());
            int b = Greenfoot.getRandomNumber(this.getHeight());
            addObject(new Spider(direction), a, b);
            }
            if (i < 1){
                addObject(new Bee(direction), 30, 30);
            }
        }
    }
    
    /**
     * updateScore - Method untuk memperbarui nilai score ketika kelas Bee memakan kelas Fly
     */
    public void updateScore()
    {
        scores++;
        showText("Score : " + scores, 60, 480);
    }

}
