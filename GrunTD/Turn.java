import greenfoot.*;

/**
 * Write a description of class Turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Turn extends Object
{
    public int degree = 0;
    /**
     * Act - do whatever the Turn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    protected abstract void setDegree();
    //protected abstract void getDegree();
}
