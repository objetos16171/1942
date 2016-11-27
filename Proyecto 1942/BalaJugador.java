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
        try{
        Enemigo1 Avion1=(Enemigo1)getOneIntersectingObject(Enemigo1.class);
        if(Avion1!=null){
            touch=true;
            getWorld().removeObject(Avion1);
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
    /**Este metodo Elimina a los enemigos tocados por una bala
     *y lo desaparece junto con la bala
     *La intruccion "getOneIntersectingObject" Devuelve un objeto que se cruza con
    el objeto Tanque, en este caso la bala*/
   /* public void desapareceEnemigos(){
        boolean touch1=false; //Bandera que me indica si la bala toco al tanque
        Niveles mundo=(Niveles)getWorld();
        try{
            Enemigo1 Tanque= (Enemigo1)getOneIntersectingObject(Enemigo1.class);
            if(Tanque!=null){
                touch1=true; //Si la bala lo toco
                //getWorld().removeObject(Tanque);
                Tanque.bajaVida();
            }
            else{
                touch1=false; // Si no lo toco
            }
            if(touch1==true){ //Si la bala toco al tanque
                getWorld().removeObject(this); //borra la la bala, el "this" hace referencia al objeto mismo osea la bala
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Mensaje de error 
        }
        /**Codigo para el Enemigo 2*/
        
    /*    boolean touch2=false; //Bandera que me indica si la bala toco al tanque
        try{
            Actor Tanque2=getOneIntersectingObject(Enemigo2.class);
            if(Tanque2!=null){
                touch2=true; //Si la bala lo toco
                getWorld().removeObject(Tanque2);
            }
            else{
                touch2=false; // Si no lo toco
            }
            if(touch2==true){ //Si la bala toco al tanque
                getWorld().removeObject(this); //borra la la bala, el "this" hace referencia al objeto mismo osea la bala

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /**Codigo para el enemigo 3*/
    /*    boolean touch3=false; //Bandera que me indica si la bala toco al tanque
        try{
            Actor Tanque3=getOneIntersectingObject(Enemigo3.class);
            if(Tanque3!=null){
                touch3=true; //Si la bala lo toco
                getWorld().removeObject(Tanque3);
            }
            else{
                touch3=false; // Si no lo toco
            }
            if(touch3==true){ //Si la bala toco al tanque
                getWorld().removeObject(this); //borra la la bala, el "this" hace referencia al objeto mismo osea la bala
            }

            if(bordeMundo()) //Elimina la bala del jugador
            {
                getWorld().removeObject(this); 
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }*/
    }
