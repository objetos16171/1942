import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends Niveles
{
    private Nivel4 level4;
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {
        super();
        level4= new Nivel4();
    }
    
    public void act()
    {
        if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo(3);
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addVida();
        }       
        if(super.timeAddPunto(10) && !super.getAmbiente()){
            super.addDetenFuego();
        }
        if(cambiaNivel())
        {
            //Greenfoot.delay(100);
            //setBackground("Nivel2.png");
            Greenfoot.setWorld(level4);
        }
    super.terminaJuego();
    }
}
