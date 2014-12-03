package stock;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JButton;
  
public class RoundButton extends JButton {
	 
	  public RoundButton(Icon icon) {
	    super(icon);
	    setBorderPainted(false);
	    setFocusPainted(false);
	    setContentAreaFilled(false);
	  }
	 
	  /**
	   * détermine si le point (x, y) est à l'intérieur de l'icône circulaire
	   */
	  public boolean contains(int x, int y) {
	    Dimension size = getSize();
	    float x0 = size.width / 2F;
	    float y0 = size.height / 2F;
	 
	    Icon icon = getIcon();
	    float w = icon.getIconWidth() / 2F;
	    float h = icon.getIconHeight() / 2F;
	 
	    return (x - x0) * (x - x0) + (y - y0) * (y - y0) <= w * h;
	  }
	}