import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que representa a los aviones enemigos y a la nave del jugador
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends MoverObjeto
{
     private boolean isShot;
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    /**
     * Constructor de la clase, isShot indica que la nave dispara
     */
    public Avion(){
        isShot = false;
    }
    /**
     * Movimiento de las naves enemigas
     */
    public void mover(){
        setRotation(90);
        move(4);      
    }
    
     /**
     * @return la variable para saber si se disparo
     */
    public boolean getIsShot()
    {
        return isShot;
    }
    
    /**
     * @return cambia el estado de disparo
     */
    public void setIsShot(boolean shot)
    {
        isShot = shot;
    }
    
}
