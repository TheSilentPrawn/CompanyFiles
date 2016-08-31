/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.lwjgl.input.Mouse; //Imports lwjgl mouse functionality
import org.newdawn.slick.*; //imports all slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits the basic game state class
public class Menu extends BasicGameState{
    //String for mouse coordinates
    private String mouse = "No Input Received.";
    
    //Constructor
    public Menu(int state){
    
    
    }
    
    //Initializes window; parameters(GameContainer, StateBasedGame)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
    
    }
    
    //Draws objects on screen
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        //Draws text on the screen("Text", x-coor, y-coor)
        g.drawString(mouse,50,50);
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
        //Receive mouse x-coor
        int xPos = Mouse.getX();
        //Receive mouse y-coor
        int yPos = Mouse.getY();
        mouse = "Mouse Position x: "+xPos+" y:"+yPos;
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
