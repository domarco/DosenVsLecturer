import greenfoot.*;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1);
        createNewSlime();
        createNewCrab();
        createObjectTurnUp();
    }
    
    public void act()
    {
        /*
        if(Greenfoot.getRandomNumber(100) < 20) {
            createNewSlime();
        }
        */
    }
    
    private void createNewSlime()
    {
        addObject(new Slime(), 100,200);
    }
    
    private void createNewCrab()
    {
        addObject(new Crab(), 100, 300);
    }
    
    private void createObjectTurnUp()
    {
        addObject(new Up(), 250, 200);
    }
}
