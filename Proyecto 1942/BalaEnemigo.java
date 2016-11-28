import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemigo extends Disparo
{
    private int dir;
    /**
     * Act - do whatever the BalaEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveDisparo();
        desapareceAvion();
    }    
    /**
     * Contructor de la clase BalaEnemigo
     */
    BalaEnemigo(int direccion){
       super(direccion);
    }
    /**
     * Desapacere al tanque cuando es tocadopor una bala
     */
    public void desapareceAvion(){
        boolean touch =false;
        World mundo=getWorld();
        Niveles MYWorld= (Niveles) mundo;
        Actor Avion=getOneIntersectingObject(AvionJugador.class);
        try{
        if(Avion!=null){
            touch=true;
            getWorld().removeObject(Avion);
            ReapareceJugador(1);
            getWorld().removeObject(this);
        }
        else
            touch=false;
            
        if(touch){
            getWorld().removeObject(this);
        }
         if(bordeMundo())
            getWorld().removeObject(this);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        } 
    }
    /**
     * Metodo para crear un nuevo jugador, una vez tocado por una bala del enemigo
     */
    public void ReapareceJugador(int i){
        if(i==1){
            World mundo=getWorld();
            Niveles MYWorld= (Niveles) mundo;
            MYWorld.quitaVida(1);
        }
        if(i==0)
        {
            World mundo=getWorld();
            Niveles MYWorld= (Niveles) mundo;
            MYWorld.quitaVida(2);
        }

    }    
    
}
