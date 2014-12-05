package stock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Screen extends JPanel
{
	private String txt = "Bienvenue dans mon Pokedeck";
	public Screen() 
	{
		setBackground(Color.GREEN);
	}

	public void paintComponent(Graphics g)
	  {	
		
		
		g.setColor( new Color( 141, 199, 63 ) );
		g.fillRect(0, 0, 267, 250);
		//g.setColor(Color.BLACK);
		//g.drawString(txt, 10, 20);
	  }
}
