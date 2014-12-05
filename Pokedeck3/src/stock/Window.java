package stock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Window extends JFrame implements ActionListener 
{
	//Instanciation d'un objet JPanel
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	private Panel panPok = new Panel();
	private Screen screen = new Screen();
	private JLabel label = new JLabel("fsfsf");
	private JLabel label2 = new JLabel("fsfsf");
	private JLabel label3 = new JLabel("fsfsf");
	
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
    screen.setLayout(new FlowLayout());
    
    //On charge nos composants
    initComponent();
    //On prévient notre JFrame que notre panPok sera son content pane
    this.setContentPane(panPok);    
    this.setVisible(true);
  }
  
  private void initComponent()
  {
	  	//Création et chargement des boutons
	    Icon cancelButton = new ImageIcon("button_cancel.png");
	    Icon cancelButtonPressed = new ImageIcon("button_cancel_pressed.png");
	    
	    Icon validationButton = new ImageIcon("button_validation.png");
	    Icon validationButtonPressed = new ImageIcon("button_validation_pressed.png");
	    
	    RoundButton cButton = new RoundButton(cancelButton, cancelButtonPressed);
	    cButton.setBounds(258, 384, 25, 25 );
	    RoundButton vButton = new RoundButton(validationButton, validationButtonPressed);
	    vButton.setBounds(271, 413, 35, 35 );
	    
	    vButton.setPressedIcon(validationButtonPressed);
	    cButton.setPressedIcon(cancelButtonPressed);
	    
	    //Ce sont maintenant nos classes internes qui écoutent nos boutons 
	    vButton.addActionListener(new BoutonListener());
	    cButton.addActionListener(new Bouton2Listener());
	    
	    panPok.add(cButton);
	    panPok.add(vButton);
	    	   
	    //ecran.setBounds(30, 80, 263, 263 );
	    //ecran.setBackground(Color.ORANGE);
	    screen.setPreferredSize(new Dimension(263, 263));
	    screen.setBounds(30, 83, 300, 263);
	    screen.add(label);
	    screen.add(label2);
	    screen.add(label3);
	    panPok.add(screen);
  }
  
  //Classe écoutant notre premier bouton
  class BoutonListener implements ActionListener
  {
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent arg0) 
    {
    	System.out.println("bouton validation");       
    }
  }
      
  //Classe écoutant notre second bouton
  class Bouton2Listener implements ActionListener
  {
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent e) 
    {
    	System.out.println("bouton cancel");     
    }
  }      

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}
