import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niveles extends World
{
    private background ima0;
    private background ima1;
    private Contador vida; 
    private int vidas;
    private Enemigo1 enemigo;
    private SimpleTimer timer;
    private boolean ambiente;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Niveles()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        //setBackground("portada.png");
        ima0 = new background();
        addObject(ima0,getWidth()/2,getHeight()/2);

        ima1 = new background();
        addObject(ima1,getWidth()/2,0 - getHeight()/2);
        timer= new SimpleTimer();
        vidas=5;    
        ambiente = false;
        creaInterfaz();
    }
    
    public void creaInterfaz(){
        creaJugador();
        ponContador();                
    }
    
    public void juego(){
        creaEnemigo();
    }
    //public void act(){
    //scroll();
    //}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /* private void prepare()
    {
    AvionJugador avionjugador = new AvionJugador();
    addObject(avionjugador,262,354);     
    avionjugador.setLocation(311,457);
    avionjugador.setLocation(311,458);
    ponContador();
    detenerFuego detenerfuego = new detenerFuego();
    addObject(detenerfuego,387,367);
    detenerfuego.setLocation(204,448);
    /*Enemigo1 enemigo1 = new Enemigo1();
    addObject(enemigo1,136,89);
    Enemigo1 enemigo12 = new Enemigo1();
    addObject(enemigo12,328,67);        
    
   //creaEnemigo();
    }¨/

    /**
     * mueve las imagenes de Scroll
     */
    public void scroll()
    {
        ima0.scroll();
        ima1.scroll();
    }

    /**
     * Agrega un contador de vidas y puntaje
     */
    public void ponContador()
    {
        vida=new Contador("Vidas: ");
        addObject(vida,450,480);
        vida.setValue(5);
    }

    /**
     * Quita una vida al jugador
     */
    public void quitaVida(int V)
    {
        switch(V)
        {
            case 1:
            vidas--;
            creaJugador();
            vida.setValue(vidas);
            break;
            case 2:
            vidas++;
            vida.setValue(vidas);
            break;
        }
    }  

    /**
     * Crea al jugador
     */
    public void creaJugador()
    {    
        Avion a=new AvionJugador();
        addObject(a,218,456);
    }

    public void setDisparo(int disparo){
        enemigo.setDisparo(0);
    }

    /**
     * Crea Enemigos
     */
    public void creaEnemigo(){
        //int x;
        //x = Greenfoot.getRandomNumber(getWidth() - 45);
        //x+=30;
        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,136,89);
        Enemigo1 enemigo12 = new Enemigo1();
        addObject(enemigo12,328,67);        
        
        
       //int x;
     //x = Greenfoot.getRandomNumber(getWidth() - 45);
     //x+=30;
     //Enemigo1 e1 = new Enemigo1();
     //addObject(e1,x,0);
    }

    /**
     * Metodo para checar si ha pasado un segundo
     */
    public boolean agregaEnemigo(int segundo)//3
    {
        if(timer.millisElapsed() > (segundo * 1000)){
            timer.mark();
            return true;
        } 
        else{
            return false;
        }
    }
    
    /**
     * cuando la instancia es false esta en la parte inicial del nivel
     * cuando esta en true esta en la parte del enemigo final
     * @return  es el indicador de el mundo  
     */
    public boolean getAmbiente()
    {
        return ambiente;
    }
    /**
     * Metodo usado para cambiar el estado del ambiente
     */
    public void setAmbiente(boolean ambiente)
    {
        this.ambiente = ambiente;
    }
}
