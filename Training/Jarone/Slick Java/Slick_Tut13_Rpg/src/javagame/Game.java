/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.newdawn.slick.*; //Imports all slick libraries
import org.newdawn.slick.state.*; //Imports state/scene libraries

public class Game extends StateBasedGame{ //Inherits state based games.
    
    public static final String gName = "Blaster Game"; //Game name
    public static final int gMenu = 0; //Int for main menu
    public static final int gPlay = 1; //Int for playing screen
    
    public Game(String gName){
        super(gName); //Creates window; paremeter(title)
        this.addState(new Menu(gMenu)); //Creates menu state; parementer(screen class)
        this.addState(new Play(gPlay)); //Creates play state; parameter (screen class)
        
    }
    
    
    //GameContainer: Manages game loop, framerate, input system, etc.
    //Method initiates list of states
    //Throws custom slick exception
    public void initStatesList(GameContainer gc) throws SlickException{
        //Gets the menu state and initializes it with game container
        this.getState(gMenu).init(gc, this);
        //Gets the play state and initializes it with game container
        this.getState(gPlay).init(gc, this);
        //Starting screen to enter
        this.enterState(gMenu);
    }
    
    public static void main(String []args){
        //Create game window
        AppGameContainer appGc;
        
        //Attempt to run the code
        try{ 
            //Creates a window that holds the class Game
            appGc = new AppGameContainer(new Game(gName));
            //Sets display mode; paremeters(width, length, fullscreen)
            appGc.setDisplayMode(640, 360, false);
            //Initiates screen
            appGc.start();
            
        //Catch if error
        }catch(SlickException error){
            //Prints error
            error.printStackTrace();
        }
        
    }
    
}
