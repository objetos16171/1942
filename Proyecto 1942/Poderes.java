import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poderes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poderes extends Actor
{
    /**
     * Act - do whatever the Poderes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.        
    }    
    /**
     * Mueve el objeto de la zona superior de la pantalla a la inferior
     */
    public void mueve()
    {
        setRotation(90);
        move(3);
    }
    
     /**
     * Checa si el avion esta en el borde del mundo y regresa verdadero o falso
     */
    public boolean bordeMundo()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;

        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
}
