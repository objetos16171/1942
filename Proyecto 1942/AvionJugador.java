import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Esta es la clase del Jugador
 */
public class AvionJugador extends Avion
{
    private int direccion=2;    //Direccion del tanque
    private int velocidad=0;    //Velocidad del tanque
    private GreenfootImage imagenB; //Para cambiar la imagen blindaje
    private GreenfootImage imagenN; //Para cambiar la imagen normal
    int vida;
    private Enemigo1 enemigo;

    
    public AvionJugador()
    {
        //imagenB=new GreenfootImage("Tanque_Jugador_Blindaje_SinFondo.png");
        //imagenN=new GreenfootImage("Tanque_Jugador_SinFondo.png");
        //setImage(imagenN);
        vida=2;
        enemigo= new Enemigo1();
    }

    public void act() 
    {
        //muevete();
        //setRotation(0);
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        
        
        setShot(0);
        detenerFuego();
        //velocidad++;
        //blindaje();
    } 

    

    /**
     * Cambia la Direccion del tanque del jugador dependiendo hacia donde se haya girado
     * 270= Arriba =1
     * 90= Abajo =3
     * 0= Deracha =2
     * 180=Izquierda =4
     */
    public void cambiaDireccion(int Rotacion)
    {
        if (Rotacion==270 || Rotacion==-90) 
            direccion=1;    
        if(Rotacion==0)
            direccion=2;        
        if(Rotacion==90 || Rotacion==-270)
            direccion=3;         
        if(Rotacion==180 || Rotacion==-180)
            direccion=4;
    }    

    /** 
     * Hace que el tanque del usuario dispare con la tecla abajo del las teclas de direccion
     */       
     private void setShot(int direction)
    {
        if(super.getIsShot() && Greenfoot.isKeyDown("space")){
            BalaJugador s1 = new BalaJugador(direction);
            getWorld().addObject(s1,getX(),getY() - 15);
            super.setIsShot(false);
            //Greenfoot.playSound("shot1.wav");
        }
        
        if(!super.getIsShot() && !Greenfoot.isKeyDown("space")){
            super.setIsShot(true);
        }
    } 
    public void detenerFuego(){
        boolean touch =false;
        World mundo=getWorld();
        Niveles MYWorld= (Niveles) mundo;
        Actor Poder=getOneIntersectingObject(detenerFuego.class);
        if(Poder!=null){
            try{
            getWorld().removeObject(Poder);
            MYWorld.setDisparo(0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        } 
        }
    }

    /**Cambia la imagen del tanquue*/
   /* public void cambiaImagen()
    {
        World mundo=getWorld();
        Niveles MYWorld= (Niveles) mundo;
        if(getImage()==imagenN)
        {
            setImage(imagenB);
            MYWorld.quitaVida(2);
        }else
        {
            setImage(imagenN);
        }
    }*/

    /**Modifica la imagen del Tanque, haciendo que paresca que traiga un blindaje alrededor*/
  /*  public void blindaje()
    {
        boolean touch=false;
        Niveles mundo=(Niveles)getWorld();
        Actor blindaje=getOneIntersectingObject(Blindaje.class);
        if(blindaje!=null)
        {
            getWorld().removeObject(blindaje);
            cambiaImagen();
        }
    }
    */
}
