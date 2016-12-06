import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel4 extends Niveles
{
    private Nivel5 level5;
    /**
     * Constructor for objects of class Nivel4.
     * 
     */
    public Nivel4()
    {
        super();
        level5= new Nivel5();
    }
    
    public void act(){
        if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo(1);
           super.creaEnemigo(2);
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addVida();
        }     
        if(cambiaNivel())
        {
            //Greenfoot.delay(100);
            //setBackground("Nivel2.png");
            Greenfoot.setWorld(level5);
        }
    super.terminaJuego();
    }
}
