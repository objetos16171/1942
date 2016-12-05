import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 *La clase simula la bala disparada por el avion
 */
public class BalaJugador extends Disparo
{
    private int dir; 
    Enemigo1 E1;

    BalaJugador(int direccion)
    {
        super(direccion);
        
    }

    public void act() 
    {
        
        super.mueveDisparo();
        if(bordeMundo()){
            getWorld().removeObject(this); 
        }
        desapareceAvion();
    }    
    
    public void desapareceAvion(){
        boolean touch=false;
        World mundo=getWorld();
        Niveles MYWorld= (Niveles) mundo;
        try{
        Enemigo1 Avion1=(Enemigo1)getOneIntersectingObject(Enemigo1.class);
        if(Avion1!=null){
            touch=true;
            Avion1.bajaVida();
            if(Avion1.getVida()==0){
            getWorld().removeObject(Avion1);    
            MYWorld.agregaPuntos(1);
        }
        }
        else
            touch=false;
            
        if(touch==true)
            getWorld().removeObject(this);
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
    }
    }
