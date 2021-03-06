/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

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
        //Draws text on the screen("Text", x-coor, y-coor)
        g.drawString("Are you ready to blast some foes?",50,50);
        //Draws rectangle(x-coor, y-coor, width, height)
        g.drawRect(50, 100, 60, 120);
        //Draws oval(x-coor, y-coor,width, height)
        g.drawOval(200, 130, 130, 80);
        
        //Create and import image
        Image face = new Image("deps/face.png");
        //Draws image(image, x-coor, y-coor)
        g.drawImage(face, 400, 100);
    }
    
    //Updates images on screen
    public void update(GameContainer gc, StateBasedGame stGame, int delta) throws SlickException{
        
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
