import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portada extends World
{
    private Nivel1 level1;
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Portada()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
         setBackground("portada.png");
         level1=new Nivel1();
       prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
     public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(level1); 
            System.out.println("hola");
        }
        if(Greenfoot.isKeyDown("h"))
        {
            removeObjects(getObjects(null));
            setBackground("Ayuda.png");
        }
          
    }
}
