import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * clase para simular el scroll del escenario
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends Actor
{
    /**
     * Act - do whatever the background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * En el metodo se mueve la imagen con respecto a las cordenadas en Y
     */
    public void scroll()
    {
        if(getY() > 3 * getImage().getHeight() / 2){
            setLocation(getX() ,0 - (250 - 2));
        }        
        setLocation(getX(),getY()+2);
        /*System.out.println("getY: "+getY());
        System.out.println("getImage: "+(3*getImage().getHeight()/2));*/
    }
}
