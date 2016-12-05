import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Niveles
{
    private Nivel2 level2;
    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {      
        super();
        level2= new Nivel2();
    }
    
   @Override
   public void act(){
       if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo();
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addVida();
        }
    super.scroll();
    if(cambiaNivel())
    {
        Greenfoot.setWorld(level2);
    }
    }
}
