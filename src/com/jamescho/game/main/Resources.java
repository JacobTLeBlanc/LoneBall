package com.jamescho.game.main;

// Imports
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

@SuppressWarnings("deprecation")

public class Resources {
	
	// Initialize images
	public static BufferedImage welcome, iconimage, line;
	// Initialize sounds
	public static AudioClip hit, bounce;
	// Colors
	public static Color darkBlue, darkRed;
	
	public static void load() {
		// Load images
		welcome = loadImage("welcome.png");
		iconimage = loadImage("iconimage.png");
		line = loadImage("line.png");
		// Load sounds
		hit = loadSound("hit.wav");
		bounce = loadSound("bounce.wav");
		// Create colors
		darkBlue = new Color(25, 83, 105);
		darkRed = new Color(105, 13, 13);
	}
	
	
	private static AudioClip loadSound(String filename) {
		// Get audio file
		URL fileURL = Resources.class.getResource("/resources/" + filename);
		
		// Return as audio
		return Applet.newAudioClip(fileURL);
	}
	
	private static BufferedImage loadImage(String filename) {
		// Create new usable image object
		BufferedImage img = null;
		
		// try to get image from resources
		try {
			img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
		} catch (IOException e) {
			System.out.println("Error while reading: " + filename);
			e.printStackTrace();
		}
		return img;
	}
}
