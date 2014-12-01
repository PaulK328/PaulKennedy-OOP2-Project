//NamePositionScoreGameGenerator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NamePositionScoreGameGenerator extends JFrame {
	
	public static void main(String [] args){
		NamePositionScoreGameGenerator jFrame1 = new NamePositionScoreGameGenerator();
		jFrame1.setVisible(true);
	}//End of public static void main(String [] args)
	
	
	/* ====== Creation of JFrame ===== */
	private JMenuBar jmenubar; //Can be used across all methods
	private JLabel background = new JLabel(new ImageIcon("image2.png")); //Can be used across all methods
	private JButton playGameButton = new JButton("View Your Players");
	
	public NamePositionScoreGameGenerator(){
		setTitle("Paul Kennedy Project");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(265, 400);
		setLocation(250, 150);
		setLayout(new FlowLayout());
				
    	add(background);
    	background.setLayout(new FlowLayout());
		
		jmenubar = new JMenuBar(); //Creating Menu, new JMenuBar();
		setJMenuBar(jmenubar);
		fileMenu();
					
	}//End of NamePositionScoreGameGenerator()
	
	// --------------------------------------- //
	
	public void fileMenu(){
		JMenu file_menu = new JMenu("Game"); //Creating the words in the JMenuBar
		jmenubar.add(file_menu);
		FileHandler filehandler = new FileHandler(); //New object for MyHandler
		
		/* Adding Items To The 'File' MenuBar */
		
		JMenuItem newitem = new JMenuItem("New Game"); //Creating of item under 'File'
		file_menu.add(newitem); //Adding of item
		newitem.addActionListener(filehandler); //Using object name to call item
		
		file_menu.addSeparator(); //Seperator
		
		JMenuItem quit = new JMenuItem("Quit");
		file_menu.add(quit);
		quit.addActionListener(filehandler);
	}//End of fileMenu()
	
	// --------------------------------------- //
	
	/*public void randomPlayerName(){ 
				
		 String[] firstName = {"Luke", "Sam", "Naz", "JJ", "Ross", "James", "Ciaran", "Gary", "Darryl", "Ed", "Matt", "Dan", "Paul", "Niall", 
            					"Alex", "Kyle", "John", "Alan"};
         String[] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"};
            					
         int random = (int) (Math.random()*firstName.length);
         int random2 = (int) (Math.random()*secondName.length);
         
         String[] names = new String[11];
         int[] rate = new int[11];
         
         
         for(int i = 0 ; i < 11; i++){
         	names[i] = firstName[(int)(Math.random()*firstName.length)]+" "+secondName[(int)(Math.random()*secondName.length)];
         	rate[i] = (int)(Math.random()*10); 
         } //End of For Loop 
                     
  	}//End of randomPlayerName() */
	
	// --------------------------------------- //
	
	public class FileHandler implements ActionListener{ //Inner Class - FileHandler is inside of ....
		public void actionPerformed(ActionEvent e){
		
		if(e.getActionCommand().equals("New Game")){
		
		add(playGameButton);
		setVisible(true);
		
		ButtonHandler buttonhandler = new ButtonHandler(); 
		playGameButton.addActionListener(buttonhandler);
		}
		
		else if(e.getActionCommand().equals("Quit")){
			System.exit(0);
		}
	}//End of ActionPerformed
	}//End of FileHandler - ActionListener

	// --------------------------------------- //

	public class ButtonHandler implements ActionListener{ //Inner Class - ButtonHandler is inside of .....
		public void actionPerformed(ActionEvent f){
				
		 if(f.getActionCommand().equals("View Your Players")){
		 playGameButton.setVisible(false);
		 background.setVisible(true);
		 
			
	 
		 String[] firstName = {"Luke", "Sam", "Nazmul", "JohnJoe", "Ross", "James", "Ciaran", "Gary", "Darryl", "Edward", "Matt", "Daniel", "Paul", "Niall", 
            					"Alex", "Kyle", "John", "Alan"};
         String[] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"};
            					
         int random = (int) (Math.random()*firstName.length);
         int random2 = (int) (Math.random()*secondName.length);
         
         String[] names = new String[12]; 
         int[] rate = new int[12];
         
         
         for(int i = 0; i <= 11; i++){
         	names[i] = firstName[(int)(Math.random() * firstName.length)] + " " + secondName[(int)(Math.random() * secondName.length)];
         	rate[i] = (int)(Math.random() * 10); 
         } //End of For Loop
         
         String teamPlayers = "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "\n" + names[3] + "\n" + names[4] + "\n" + names[5] + 
         						"\n<html><H2>Midfielders</H2></html>" + "\n" + names[6] + "\n" + names[7] + "\n" + names[8] + "\n" + names[9] + 
         							"\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "\n" + names[11];
         							
         String rating = "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "   " + rate[2] + "\n" + names[3] + "   " + rate[3] + "\n" + 
         						names[4] + "   " + rate[4] + "\n" + names[5] + "   " + rate[5] + "\n<html><H2>Midfielders</H2></html>" + "\n" + 
         							names[6] + "   " + rate[6] + "\n" + names[7] + "   " + rate[7] + "\n" + names[8] + "   " + rate[8] + "\n" + 
         						 		names[9] + "   " + rate[9] + "\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "   " + rate[10] + 
         						 		"\n" + names[11] + "   " + rate[11];
         
        /* https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html */
        Object[] options = {"Play Game", "Quit"};
		int answer = JOptionPane.showOptionDialog(null, teamPlayers, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    	    	  
        if (answer == JOptionPane.YES_OPTION){
      	//JOptionPane.showMessageDialog(null, rating, "Game", JOptionPane.PLAIN_MESSAGE);
      	
      	Object[] optionsagain = {"Continue", "Quit"};
      	int playOn = JOptionPane.showOptionDialog(null, rating, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsagain, optionsagain[0]);
      		if (playOn == JOptionPane.YES_OPTION){
      		}
      		
      		else if (playOn == JOptionPane.NO_OPTION){
      			System.exit(0);
      		}
      	
    	}
    	 
    	else if (answer == JOptionPane.NO_OPTION){
      	System.exit(0);
    	}
         
	     /* JLabel goalkeeper = new JLabel("<html><h2>Goalkeeper: </h2></html>");
         JTextArea goalkeeper1 = new JTextArea();
         goalkeeper1.setEditable(false);
         add(goalkeeper);
         add(goalkeeper1);                
         goalkeeper1.setEditable(false);
         for(int i = 0; i<1;i++){
         goalkeeper1.append(names[i]);
         goalkeeper.setVisible(true);
         goalkeeper1.setVisible(true);
         }
         
         JLabel defender = new JLabel("<html><h2>Defenders: </h2></html>");
         JTextArea defender1 = new JTextArea();
         defender1.setEditable(false);
         add(defender);
         add(defender1);                
         defender1.setEditable(false);
         for(int i = 1; i<5;i++){
         defender1.append(names[i]+"\n");
         defender.setVisible(true);
         defender1.setVisible(true);
         }
         
         JLabel midfield = new JLabel("<html><h2>Midfielders: </h2></html>");
         JTextArea midfielder1 = new JTextArea();
         midfielder1.setEditable(false);
         add(midfield);
         add(midfielder1);                
         midfielder1.setEditable(false);
         for(int i = 5; i<=9;i++){
         midfielder1.append(names[i]+"\n");
         midfield.setVisible(true);
         midfielder1.setVisible(true);
         }
         
         JLabel forwards = new JLabel("<html><h2>Forwards: </h2></html>");
         JTextArea forwards1 = new JTextArea();
         forwards1.setEditable(false);
         add(forwards);
         add(forwards1);                
         forwards1.setEditable(false);
         for(int i = 10; i<12;i++){
         forwards1.append(names[i]);
         forwards.setVisible(true);
         forwards1.setVisible(true);
         } */
         
        }//End of ActionCommand
	}//End of ActionPerformed
	}//End of ButtonHandler - ActionListener
	
	
	
}//End of main