package stock;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
  
public class RoundButton extends JButton implements MouseListener 
{
	  private Icon iconClick;
	 
	  public RoundButton(Icon icon, Icon iconClick) 
	  {
	    super(icon);
	    this.iconClick = iconClick;
	    setBorderPainted(false);
	    setFocusPainted(false);
	    setContentAreaFilled(false);
	    this.addMouseListener(this);
	  }

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			//super(this.iconClick);
		}
	
		@Override
		public void mouseEntered(MouseEvent e) 
		{
			//change cursor appearance to HAND_CURSOR when the mouse pointed on images
		     Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR); 
		     setCursor(cursor);
		}
		
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}