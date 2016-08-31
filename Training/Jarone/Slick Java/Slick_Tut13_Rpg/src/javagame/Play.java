/*
 * Project created by Jarone Jabonillo.
 */
package javagame;

import org.newdawn.slick.*; //imports slick libraries
import org.newdawn.slick.state.*; //imports state/scene libraries

//Inherits basic game state class
public class Play extends BasicGameState{
    //Animation var for default, up, down, left, right
    private Animation char0, charUp, charDown, charLeft, charRight;
    //Image var for map
    private Image map;
    //Boolean for quit flag
    private boolean quit = false;
    //Array for frames = {duration of first image/1000, dur of 2nd image/1000}
    private int[] duration = {200,200}; //.2second frames
    //Float to track char x-coor
    private float charPosX = 0;
    //Float to track char y-coor
    private float charPosY = 0;
    //Var to shift map based on char x-coor
    float shiftX = charPosX + 360;
    //Var to shift map based of char y-coor
    float shiftY = charPosY + 160;
    
    
    //Constructor
    public Play(int state){
    
    }
    
    //Initializes window; parameters(Game container, State based game)
    public void init(GameContainer gc, StateBasedGame stGame) throws SlickException{
        //Load map image
        map = new Image("res/world.png");
        //Load image array for up animation{starting image, final image}
        Image[] walkUp = {new Image("res/isaacsBack.png"), new Image("res/isaacsBack.png")};
        //Load image array for down animation{starting image, final image}
        Image[] walkDown = {new Image("res/isaacsFront.png"), new Image("res/isaacsFront.png")};
        //Load image array for right animation{starting image, final image}
        Image[] walkRight = {new Image("res/isaacsRight.png"), new Image("res/isaacsRight.png")};
        //Load image array for left animation{starting image, final image}
        Image[] walkLeft = {new Image("res/isaacsLeft.png"), new Image("res/isaacsLeft.png")};
        
        //Load new animation of up animation(images, duration, autoupdating)
        charUp = new Animation(walkUp, duration, false);
        //Load new animation of down animation(images, duration, autoupdating)
        charDown = new Animation(walkDown, duration, false);
        //Load new animation of right animation(images, duration, autoupdating)
        charRight = new Animation(walkRight, duration, false);
        //Load new animation of left animation(images, duration, autoupdating)
        charLeft = new Animation(walkLeft, duration, false);
        //Set current char animation
        char0 = charDown;
        
    }
    
    //Draws objects on screen; parameters (Game container, state based game, graphics)
    public void render(GameContainer gc, StateBasedGame stGame, Graphics g) throws SlickException{
        //Draws the map on the screen(character x-coor, character y-coor)
        //Centers camera on the character
        map.draw(charPosX, charPosY);
        //Draws the character on the screen(shifting x-coor, shifting y-coor)
        char0.draw(shiftX, shiftY);
        //Draws text (Character's x and y coordinates, x-coor, y-coor);
        g.drawString("Char X-coor: " + charPosX + "\nChar Y-coor:" + charPosY, 480 , 20 );
        
        //If player wants to quit
        if(quit == true){
            //Output Resume option
            g.drawString("Resume (R)", 250, 100);
            //Output Menu option
            g.drawString("Menu (M)", 250, 150);
            //Output Quit option
            g.drawString("Quit(Q)", 250, 200);
            
            //If player doesn't want to quit
            if(quit == false){
                //Clears all graphics
                g.clear();
            }
        }
    }
    
    //Updates screen(game container, statebased game, value passed through update)
    public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException{
        //Recieve user input
        Input userIn = gc.getInput();
        
        //If W key is pressed down
        if(userIn.isKeyDown(Input.KEY_W)){
            //Assign char graphic up
            char0 = charUp;
            
            charPosY += delta *.2f;
            
            /** My Method
            if(charPosY <= 102){
                //Increase Y position by the value passed 
                charPosY += delta *.2f;
            }
            */
            
            
            //If the character's position is > 102
            if(charPosY >= 143){
                //Subtract the change
                charPosY -= delta *.2f;
            }
            
        }
        
        //If A key is pressed
        if(userIn.isKeyDown(Input.KEY_A)){
            //Assign char graphic left
            char0 = charLeft;
            //Decrease X position by value passed
            charPosX += delta *.2f;
            
            if(charPosX >= 306){
                charPosX -= delta *.2f;
            }
            
        }
        
        //If S key is pressed
        if(userIn.isKeyDown(Input.KEY_S)){
            //Assign char graphic down
            char0 = charDown;
            //Decrease Y position by value passed
            charPosY -= delta*.2f;
            
            //If the character's position is > 102
            if(charPosY <= -479){
                //Subtract the change
                charPosY += delta *.2f;
            }
        }
        
        //If D key is pressed
        if(userIn.isKeyDown(Input.KEY_D)){
            //Assign char graphic right
            char0 = charRight;
            //Increase X position by value passed
            charPosX -= delta*.2f;
            
            if(charPosX < -898){
                charPosX += delta *.2f;
            }
        }
        
        //If user presses escape key
        if(userIn.isKeyDown(Input.KEY_ESCAPE)){
            //Initiate user quit flag
            quit = true;
        }
        
        //Is user wants to quit
        if(quit == true){
            //If user presses the R key
            if(userIn.isKeyDown(Input.KEY_R)){
                //Set quit flag to false
                quit = false;
            }
            //If user presses the M Key
            if(userIn.isKeyDown(Input.KEY_M)){
                //Enter menu state
                sbg.enterState(0);
            }
            //If user presses Q key
            if(userIn.isKeyDown(Input.KEY_Q)){
                //Exit game 
                System.exit(0);
            }
        }
        
        
        
    }
    
    //Returns id for state
    public int getID(){
        return 1;
    }
    
    
}
