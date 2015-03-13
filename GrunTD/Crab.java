import greenfoot.*;

/**
 * Write a description of class Crab here.
 * 
 * @author Domarco
 * @version (a version number or a date)
 */
public class Crab extends AnimatedActor
{
    public Crab()
    {
        super("crab", ".png", 40);
    }
    /**
     * Act - do whatever the Slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        //move(1);
        parent:turnUp();
        removeAtWorldEdge();
        parent:mover();
    }    
    
    private void removeAtWorldEdge()
    {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
