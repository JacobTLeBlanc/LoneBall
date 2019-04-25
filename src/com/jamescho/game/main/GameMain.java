package com.jamescho.game.main;

// Imports
import javax.swing.JFrame;

public class GameMain {
	// Game Info
	private static final String GAME_TITLE = "LoneBall (Chapter 5)";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static Game sGame;
	
	// Main method
	public static void main(String[] args) {
		// Create window with game title
		JFrame frame = new JFrame(GAME_TITLE);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Prevent manual resizing of window
		frame.setResizable(false);
		
		// Create game instance and add to frame
		sGame = new Game(GAME_WIDTH, GAME_HEIGHT);
		frame.add(sGame);
		frame.pack();
		
		// Set visibility of frame
		frame.setVisible(true);
		
		// Set icon 
		frame.setIconImage(Resources.iconimage);
	}
	
}
