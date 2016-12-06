import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * clase donde se crean metodos que se utilizaran en los demas niveles
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niveles extends World
{
    private background ima0;
    private background ima1;
    private Contador vida; 
    private Contador Puntaje;
    private int vidas;
    private Enemigo1 enemigo;
    private SimpleTimer timer;
    private SimpleTimer timerVida;
    private boolean ambiente;
    private int enemigosMuertos=0;
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
        timerVida = new SimpleTimer();//timepo para agregar puntos
        vidas=5;    
        //enemigosMuertos=0;
        ambiente = false;
        creaInterfaz();
    }
    
    public void creaInterfaz(){
        creaJugador();
        ponContador();                
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
        
        Puntaje= new Contador("Puntos: ");
        addObject(Puntaje,60,477);
        Puntaje.setValue(0);
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
     * Agrega puntos 
     */
    public void agregaPuntos(int numero){
       switch (numero)
       {
           case 1:
                    enemigosMuertos++;
                    Puntaje.setValue(enemigosMuertos);
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
    public void creaEnemigo(int nivel){                         
        switch(nivel){
            case 1:
            int x1;
            x1 = Greenfoot.getRandomNumber(getWidth() - 45);
            x1+=30;
            Enemigo1 e1 = new Enemigo1();
            addObject(e1,x1,20);
            break;
            case 2:
            int x2;
            x2 = Greenfoot.getRandomNumber(getWidth() - 45);
            x2+=30;
            Enemigo2 e2 = new Enemigo2();
            addObject(e2,x2,20);
            break;
            case 3:
            int x3;
            x3 = Greenfoot.getRandomNumber(getWidth() - 45);
            x3+=30;
            Enemigo3 e3 = new Enemigo3();
            addObject(e3,x3,20);
    }
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
     * Agrega una vida, el metodo genera su posicion y lo agrega al  mundo
     */
    public void addVida()
    {
        int x =  Greenfoot.getRandomNumber((getWidth() - 20) + 10);
        Vida v = new Vida();
        addObject(v,x,5);               
    }
    /**
     * Agrega el poder de detener el fuego enemigo
     */
    public void addDetenFuego()
    {
        int x =  Greenfoot.getRandomNumber((getWidth() - 20) + 10);
        detenerFuego f = new detenerFuego();
        addObject(f,x,5);               
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
    
    /**
     * metodo usado chechar tiempo de agregar un puntos extra.
     * @parama segundo es el tiempo en segundos para agregar puntos extra
     * @return regresa un true si a pasado el tiempo indicado
     */
    public boolean timeAddPunto(int segundo)//12
    {
        if(timerVida.millisElapsed() > (segundo * 1000)){
            timerVida.mark();
            //System.out.println("agregar punto");
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Metodo que regresa F/V cuando el jugador destruye N Enemigos
     */
    public boolean cambiaNivel(){
        if(enemigosMuertos==10)
            return true;
        else
            return false;
    }
    /**
     * Este metodo evalua las vidas del jugador si llega a 0 
     * se manda a la pantalla Game Over.
     */
    public void terminaJuego()
    {
        if(vidas== 0){
            Greenfoot.setWorld(new GameOver()); 
        }
    }
    /**
     * Cambia el valor de los puntos
     */
    public void puntos(int p)
    {
        Puntaje.setValue(p);
    }
}
