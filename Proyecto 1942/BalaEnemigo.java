import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemigo extends MoverObjeto
{
    private int dir;
    /**
     * Act - do whatever the BalaEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    
    BalaEnemigo(int direccion){
        dir=direccion;
        setRotation(dir);
    }
        
    
}
