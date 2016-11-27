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
        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,164,83);
        enemigo1.setLocation(164,83);
        enemigo1.setLocation(164,83);
        enemigo1.setLocation(164,83);
        enemigo1.setLocation(141,16);
        enemigo1.setLocation(141,16);
        enemigo1.setLocation(141,16);
        enemigo1.setLocation(141,16);
        enemigo1.setLocation(142,2);
        Enemigo1 enemigo12 = new Enemigo1();
        addObject(enemigo12,408,8);
        Enemigo1 enemigo13 = new Enemigo1();
        addObject(enemigo13,279,13);
        enemigo13.setLocation(279,11);
        enemigo12.setLocation(421,68);
        removeObject(enemigo12);
        removeObject(enemigo13);
        removeObject(enemigo1);
        Enemigo1 enemigo14 = new Enemigo1();
        addObject(enemigo14,111,93);
        Enemigo1 enemigo15 = new Enemigo1();
        addObject(enemigo15,487,84);
        removeObject(enemigo14);
        removeObject(enemigo15);
        Enemigo1 enemigo16 = new Enemigo1();
        addObject(enemigo16,101,86);
        Enemigo1 enemigo17 = new Enemigo1();
        addObject(enemigo17,317,72);
        avionjugador.setLocation(311,457);
        avionjugador.setLocation(311,458);
    }


    /**
     * mueve las imagenes de Scroll
     */
    public void scroll()
    {
        ima0.scroll();
        ima1.scroll();
    }
}
