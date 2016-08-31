/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.lwjgl.input.Mouse; //Imports lwjgl mouse functionality
import org.newdawn.slick.*; //imports all slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits the basic game state class
public class Menu extends BasicGameState{
    
    private Image face; //image type for face
    int faceX = 200; //Face x-coor
    int faceY = 80; //Face y-coor
    
    
    //Constructor
    public Menu(int state){
    
    }
    
    //Initializes window; parameters(GameContainer, StateBasedGame)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        //Loads face image
        face = new Image("deps/face.png"); 
    }
    
    //Draws objects on screen
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        g.drawImage(face, faceX, faceY);
    }
    
    //Updates images on screen
    public void update(GameContainer gc, StateBasedGame stGame, int delta) throws SlickException{
        //Create variable to contain input
        Input userIn = gc.getInput();
        //If up arrow is pressed, alter y-coor -1
        if(userIn.isKeyDown(Input.KEY_UP)){ faceY -= 1;}
        //If down arrow is pressed, alter y-coor +1
        if(userIn.isKeyDown(Input.KEY_DOWN)){ faceY += 1;}
        //If right arrow is pressed, alter x-coor +1
        if(userIn.isKeyDown(Input.KEY_RIGHT)){ faceX += 1;}
        //If left arrow is pressed, alter x-coor -1
        if(userIn.isKeyDown(Input.KEY_LEFT)){ faceX -= 1;}
    }
    
    //Returns the Id of the state
    public int getID(){
        return 0;
    }
}
