import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemigo extends Disparo
{
    private int dir;
    /**
     * Act - do whatever the BalaEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveDisparo();
        if(bordeMundo())
            getWorld().removeObject(this);
    }    
    
    BalaEnemigo(int direccion){
       super(direccion);
    }
        
    
}
