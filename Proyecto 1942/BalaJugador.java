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
        boolean touch1=false;
        World mundo=getWorld();
        Niveles MYWorld= (Niveles) mundo;
        try{
        Enemigo1 Avion1=(Enemigo1)getOneIntersectingObject(Enemigo1.class);
        if(Avion1!=null){
            touch1=true;
            Avion1.bajaVida();
            if(Avion1.getVida()==0){
            getWorld().removeObject(Avion1);    
            MYWorld.agregaPuntos(1);
        }
        }
        else
            touch1=false;
            
        if(touch1==true)
            getWorld().removeObject(this);
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
        /**Codigo para el enemigo 2*/
        boolean touch2=false;
        
        try{
            Enemigo2 Avion2=(Enemigo2)getOneIntersectingObject(Enemigo2.class);
            if(Avion2!=null){
                touch2=true;
                Avion2.bajaVida();
                if(Avion2.getVida()==0){
                    getWorld().removeObject(Avion2);
                    MYWorld.agregaPuntos(1);
                }                
            }
            else
                touch2=false;
                
            if(touch2==true){
                getWorld().removeObject(this);  
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
        
        /**Codigo para el enemigo 3*/
        boolean touch3=false;
        
        try{
            Enemigo3 Avion3=(Enemigo3)getOneIntersectingObject(Enemigo3.class);
            if(Avion3!=null){
                touch3=true;
                Avion3.bajaVida();
                if(Avion3.getVida()==0){
                    getWorld().removeObject(Avion3);
                    MYWorld.agregaPuntos(1);
                }                
            }
            else
                touch3=false;
                
            if(touch3==true){
                getWorld().removeObject(this);  
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
        
        /**Codigo para el jefe final*/
        boolean touch4=false;
        
        try{
            JefeFinal jefe=(JefeFinal)getOneIntersectingObject(JefeFinal.class);
            if(jefe!=null){
                touch3=true;
                jefe.bajaVida();
                if(jefe.getVida()==0){
                    getWorld().removeObject(jefe);
                    MYWorld.juegoGanado();
                }                
            }
            else
                touch4=false;
                
            if(touch4==true){
                getWorld().removeObject(this);  
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
    }
    }
