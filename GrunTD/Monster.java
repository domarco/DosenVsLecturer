import greenfoot.*;

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//protected degree = 0;

public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }   
    
    
    protected void mover()
    {
        move(1);
    }
    
    protected void turnUp()
    {
        if (this.isTouching(Up.class)) {
            setLocation(getX(), getY()-1);
        }
        else {
            setLocation(getX()+1, getY());
        }
    }
}
