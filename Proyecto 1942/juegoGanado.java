import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class juegoGanado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class juegoGanado extends World
{

    /**
     * Constructor for objects of class juegoGanado.
     * 
     */
    public juegoGanado()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public  void act()
    {
        regresaMenu();
    }
     /**
     * regresa crea un Objeto de tipo menu y y te regresa al menu principal
     */
    private void regresaMenu()
    { 
       Greenfoot.delay(150);
       Greenfoot.setWorld(new Portada());
    }
}
