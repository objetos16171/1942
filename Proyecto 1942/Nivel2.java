import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Niveles
{
    int puntos=10;
    private Nivel3 level3;
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {
        //super();
        puntos(puntos);
        level3= new Nivel3();
    }
    
    public void act(){
         if(super.agregaEnemigo(1) && !super.getAmbiente()){      
           super.creaEnemigo(2);
        }
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addVida();
        }
        if(cambiaNivel())
        {
            //Greenfoot.delay(100);
            //setBackground("Nivel2.png");
            Greenfoot.setWorld(level3);
        }
        super.terminaJuego();
    }
}
