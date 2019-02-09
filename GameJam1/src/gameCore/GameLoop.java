package gameCore;

import processing.core.PApplet;
import screens.Screen;
import screens.StartScreen;


/**
 * This class will contain the Setup and Draw functions that are required by the Processing Library
 * It will also implement the core game-loop and hold any global variables (if necessary) 
 * @author Caleb
 *
 */
public class GameLoop extends PApplet{
	/**GLOBAL VARIABLES**/
	/** screenX and screenY will be used to determine how large to draw the screen. 
	 * They will also be used to scale most objects in the scene so that they resize properly 
	 */
	public static int screenX = 900; 
	public static int screenY = 900; 
	/** The screen determines what stage the game is at and what to draw to the screen **/
	public static Screen s;
	
	
	public static void main(String args[]) {
		PApplet.main("gameCore.GameLoop");
	}
	
	/**
	 * This function is required by processing, and keeps track of settings that affect the Papplet class
	 */
	public void settings() {
		size(screenX, screenY); 
	}
	
	/**
	 * This function is required by processing. It will be called once, when the program starts up the 
	 * first time. This function will create the window and determine it's size, and will initialize 
	 * any global variables. 
	 */
	public void setup() {
		/**
		 * Initializing global variables
		 */
		s = new StartScreen(this); //First screen will be the start screen
		/**
		 * Time 1 and 2 will be used to keep a steady frame-rate for updating the screen image
		 */
	}
	
	
	/**
	 * This function is required by processing, and is called as a continuous loop. This is where the core 
	 * game loop will be located. 
	 */
	public void draw() {
		/**
		 * Draw simply funnels function calls to the current screen
		 */
	}
}
