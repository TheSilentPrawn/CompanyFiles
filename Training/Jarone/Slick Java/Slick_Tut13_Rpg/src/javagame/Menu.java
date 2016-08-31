/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.lwjgl.input.Mouse; //Imports lwjgl mouse functionality
import org.newdawn.slick.*; //imports all slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits the basic game state class
public class Menu extends BasicGameState{
    
    Image bPlay; //Image object for play button
    Image bExit; //Image object for exit button
    
    private final int bWidth = 200;
    private final int bHeight = 30;
    
    //Constructor
    public Menu(int state){
    
    }
    
    //Initializes window; parameters(GameContainer, StateBasedGame)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        //Load playnow image
        bPlay = new Image("res/playNow.png");
        //Load exit image
        bExit = new Image("res/exitGame.png");
    }
    
    //Draws objects on screen
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        //Draws text on screen("Text", x-coor, y-coor)
        g.drawString("Welcome to Isaac Land!", 220, 50);
        //Draw play button(x-coor, y-coor)
        bPlay.draw(220,100);
        //Draw exit button(x-coor, y-coor)
        bExit.draw(220,200);
    }
    
    //Updates images on screen
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        int posX = Mouse.getX();
        int posY = Mouse.getY();
        
        //If mouse enters play button
        if((posX > 220 && posX < 220+bWidth)&&(posY > 260-bHeight && posY < 260)){
            //If mouse left button down
            if(Mouse.isButtonDown(0)){
                //Enters play state
                sbg.enterState(1);
            }
        }
        
        //If mouse enters exit button
        if((posX > 220 && posX < 220+bWidth)&&(posY > 160-bHeight && posY < 160)){
            //If left mouse button is pressed
            if(Mouse.isButtonDown(0)){
                //Exit system(return 0 for successful run)
                System.exit(0);
            }
        }
        
        
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
