package stock;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Window extends JFrame 
{
	//Instanciation d'un objet JPanel
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	private Panel panPok = new Panel();
	
  public Window()
  {
    this.setTitle("Ma première fenêtre Java");
    this.setSize(333, 500);
    this.setLocationRelativeTo(null);
    this.setUndecorated(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable(false);

    //On définit le layout manager
    panPok.setLayout(null);

    Icon cancelButton = new ImageIcon("button_cancel.png");
    Icon validationButton = new ImageIcon("button_validation.png");
    
    RoundButton cButton = new RoundButton(cancelButton);
    cButton.setBounds(258, 384, 25, 25 );
    RoundButton vButton = new RoundButton(validationButton);
    vButton.setBounds(271, 413, 35, 35 );
    
    panPok.add(cButton);
    panPok.add(vButton);

    //On prévient notre JFrame que notre panPok sera son content pane
    this.setContentPane(panPok);    
    this.setVisible(true);
  }
}
