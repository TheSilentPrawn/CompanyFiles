/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.lwjgl.input.Mouse; //Imports lwjgl mouse functionality
import org.newdawn.slick.*; //imports all slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits the basic game state class
public class Menu extends BasicGameState{
    

    //Constructor
    public Menu(int state){
    
    }
    
    //Initializes window; parameters(GameContainer, StateBasedGame)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        
    }
    
    //Draws objects on screen
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        //Draws filled in oval(x-coor, y-coor, width, height)
        g.fillOval(75, 100, 100, 100);
        //Draws text ("text", x-coor, y-coor)
        g.drawString("Play Now!", 80, 70);
    }
    
    //Updates images on screen
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        //Receives user input
        Input userIn = gc.getInput();
        //int var for mouse x-coor
        int posX = Mouse.getX();
        //int var for mouse y-coor
        int posY = Mouse.getY();
        
        //if mouse is within oval coordiantes
        if((posX > 75 && posX < 175) && (posY > 160 && posY < 260)){
            //If mouse button is down
            if(userIn.isMouseButtonDown(0)){
                //Enter new state(stateId)
                sbg.enterState(1);
            }
        }
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
