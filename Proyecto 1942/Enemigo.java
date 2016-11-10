import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends MoverObjeto
{
     private int velocidadBala;
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mover();
        dispara();
        velocidadBala++;
    }    
    public Enemigo(){
        velocidadBala=0;
    }
    
    public void mover(){
        setRotation(90);
        move(4);
        
    }
    
    public void dispara(){
        if(velocidadBala%20 == 0)
        {
            Actor Bala=new BalaEnemigo(0); //crea la bala del enemigo
            int x=getX();
            int y=getY();
            World world=getWorld();
            world.addObject(Bala,x,y);
        }
    }
}
