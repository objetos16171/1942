import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private background ima0;
    private background ima1;
    private Contador vida; 
    private int vidas;
    private Enemigo1 enemigo;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
         ima0 = new background();
        addObject(ima0,getWidth()/2,getHeight()/2);
        
        ima1 = new background();
        addObject(ima1,getWidth()/2,0 - getHeight()/2);
        
        vidas=5;
        prepare();
    }
public void act(){
    scroll();
}
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AvionJugador avionjugador = new AvionJugador();
        addObject(avionjugador,262,354);     
        avionjugador.setLocation(311,457);
        avionjugador.setLocation(311,458);
        ponContador();
        detenerFuego detenerfuego = new detenerFuego();
        addObject(detenerfuego,387,367);
        detenerfuego.setLocation(204,448);
        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,136,89);
        Enemigo1 enemigo12 = new Enemigo1();
        addObject(enemigo12,328,67);        
    }


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
}
