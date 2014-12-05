package stock;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
 



import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Panel extends JPanel 
{ 
  public void paintComponent(Graphics g)
  {	  
    try 
    {
        Image img = ImageIO.read(new File("pokedex.jpg"));
        //g.drawImage(img, 0, 0, this);
        //g.drawImage(Image img, int x, int y, int width, int height, Observer obs);
        //Pour une image de fond
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
     } 
    catch (IOException e) 
    {
        e.printStackTrace();
    }
  }               
}