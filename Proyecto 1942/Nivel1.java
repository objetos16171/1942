import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Niveles
{

    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {      
        super();
    }
    
   @Override
   public void act(){
       if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo();
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addPunto();
        }
    super.scroll();
    }
}
