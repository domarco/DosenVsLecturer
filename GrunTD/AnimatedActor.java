import greenfoot.*;

/**
 * We will change the image with every act step.
 * 
 * @author Domarco 
 * @version 1.0
 */
public class AnimatedActor extends Monster
{
    private GreenfootImage[] images; //kita punya gambar slime1.png - slime7.png
    private int currentImage = 0; // awal monster Slime dibuat set gambar slime1.png
    private int animationControl = 4;
    private int times = 0;
    /*
     * Membuat constructor AnimatedActor.
     * format fileName = basename[currentImage].suffix
     */
    public AnimatedActor(String basename, String suffix, int maxImages)
    {
        images = new GreenfootImage[maxImages+1];
        // mengisi array images dengan gambar slime1 - slime7
        for (int i = 1; i <= maxImages; i++) {
            images[i] = new GreenfootImage(basename + i + suffix);
        }
        setImage(images[currentImage+1]);
    }
    /**
     * Act - do whatever the AnimatedActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        times = (times+1)%animationControl;
        if (times == 0) {
            currentImage = (currentImage + 1)%images.length; //currentImage = 8 -> 8%7 = 1, balik lagi ke awal   
            setImage(images[currentImage]);
        
        }
    }    
}
