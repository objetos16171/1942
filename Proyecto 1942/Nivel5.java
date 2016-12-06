import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel5 extends Niveles
{

    /**
     * Constructor for objects of class Nivel5.
     * 
     */
    public Nivel5()
    {
        super();
    }
    public void act(){
        if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo(1);
           super.creaEnemigo(2);
           super.creaEnemigo(3);
           super.creaEnemigo(4);
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addVida();
        }     
        if(cambiaNivel())
        {
            //Greenfoot.delay(100);
            //setBackground("Nivel2.png");
            //Greenfoot.setWorld(level5);
        }
    super.terminaJuego();
    }
}
