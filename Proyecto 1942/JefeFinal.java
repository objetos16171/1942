import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JefeFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JefeFinal extends Avion
{
    int vida=15;
    private int disparar;
    /**
     * Act - do whatever the JefeFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(90);
        disparar();
        if(bordeMundo()){
        getWorld().removeObject(this);
    }
    }    
    public JefeFinal(){
    //disparar=true;
    disparar=1;
}
    /**
 * Metodo que dibuja el disparo del enemigo
 */
private void setShot(int direction)
    {
        if(super.getIsShot()){
            BalaEnemigo s2 = new BalaEnemigo(direction);
            getWorld().addObject(s2,getX(),getY() - 15);
            super.setIsShot(false);
            //Greenfoot.playSound("Disparo1.wav");
        }
        
        if(!super.getIsShot()){
            super.setIsShot(true);
        }
    }
    
    /**
     * Metodo que hace disparar al jugador
     */
  public void disparar(){
     if(disparar==1){
     int x = 0;
        x = Greenfoot.getRandomNumber(50);//75
        if(x == 5){
            setShot(1); //disparo hacia abajo
        }
    }
    if(disparar==0){
        
    }
  }
    /**
     * Metodo que modifica el valor del boolean para detener el disparo
     */
    public void setDisparo(int disparo){
        this.disparar=disparo;
    }
    /**Metodo que baja la vida del enemigo 1*/
    public void bajaVida()
    {
        vida--;
    }
    public int getVida()
    {
        return vida;
    }
}
