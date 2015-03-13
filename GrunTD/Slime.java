import greenfoot.*;

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends AnimatedActor
{
    public Slime()
    {
        super("slime", ".png", 7);
    }
    /**
     * Act - do whatever the Slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        //move(1);
        removeAtWorldEdge();
        //parent:turnUp();
        parent:mover();
    }    
    
    
    private void removeAtWorldEdge()
    {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
