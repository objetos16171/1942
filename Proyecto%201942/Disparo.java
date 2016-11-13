import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Clase que representa al movimiento del disparo y la direccion
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends MoverObjeto
{
    private int position;//Direccion de bala
    private int speedShot = 6;//Velocidad de movimiento
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    /**
     * Asigna la direccion de disparo
     */
    public Disparo(int direction)
    {
        this.position = direction;
        speedShot =6;
    }
    /**
     * Clase que mueve el disparo segun la direccion
     */
    public void mueveDisparo()
    {
        switch(position)
        {
            case 0://Disparo hacia arriba
                setLocation(getX(),getY() - speedShot);
            break;
            case 1: //Disparo hacia abajo
                setLocation(getX(),getY() + speedShot);
            break;
            case 2://Disparo hacia la derecha
                setLocation(getX() + speedShot,getY());
            break;
            case 3://Diaparo hacia la izquierda
                setLocation(getX() - speedShot,getY());
            break;
        }
        
    }
}
