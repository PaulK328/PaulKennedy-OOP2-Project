//NamePositionScoreGameGenerator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NamePositionScoreGameGenerator extends JFrame {
	
	private String teamPlayers; //Used in randomPlayerName();
    private String rating; //Used in randomPlayerName();
    private float[] rate;
                                  
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
	
	public void randomPlayerName(){ 
		String[] firstName = {"Luke", "Sam", "Nazmul", "JohnJoe", "Ross", "James", "Ciaran", "Gary", "Darryl", "Edward", "Matt", "Daniel", "Paul", "Niall", 
            					"Alex", "Kyle", "John", "Alan"};;
	 	String[] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"};		
		 
            					
        int random = (int) (Math.random()*firstName.length);
        int random2 = (int) (Math.random()*secondName.length);
         
        String[] names = new String[12]; 
        rate = new float[12];
                 
         
         for(int i = 0; i <= 11; i++){
         	names[i] = firstName[(int)(Math.random() * firstName.length)] + " " + secondName[(int)(Math.random() * secondName.length)];
         	rate[i] = (float)((Math.random() * 100) / 10);
         } //End of For Loop
         
         teamPlayers = "<html><H2>Goalkeeper</H2></html>\n" + names[1] + "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "\n" + names[3] + "\n" + names[4] + "\n" + names[5] + 
         						"\n<html><H2>Midfielders</H2></html>" + "\n" + names[6] + "\n" + names[7] + "\n" + names[8] + "\n" + names[9] + 
         							"\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "\n" + names[11];
         							
         rating = "<html><H2>Goalkeeper</H2></html>\n" + names[1] + "   " + rate[1] + "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "   " + rate[2] + "\n" + names[3] + "   " + rate[3] + "\n" + 
         						names[4] + "   " + rate[4] + "\n" + names[5] + "   " + rate[5] + "\n<html><H2>Midfielders</H2></html>" + "\n" + 
         							names[6] + "   " + rate[6] + "\n" + names[7] + "   " + rate[7] + "\n" + names[8] + "   " + rate[8] + "\n" + 
         						 		names[9] + "   " + rate[9] + "\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "   " + rate[10] + 
         						 		"\n" + names[11] + "   " + rate[11];
                     
  	}//End of randomPlayerName()
  	
  	// --------------------------------------- //
  	
  	/* public void gameStarted(){
  		randomPlayerName();
  		
  		int[] allRatings[] = {rate};
  		for(int count = 0; count < 11; count++){
  			rate[count] = (int)(Math.random() * 10);
  		}
  	} */	
	
	// --------------------------------------- //
	
	public class FileHandler implements ActionListener{ //Inner Class - FileHandler
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

	public class ButtonHandler implements ActionListener{ //Inner Class - ButtonHandler
		public void actionPerformed(ActionEvent f){
				
		 if(f.getActionCommand().equals("View Your Players")){
		 	playGameButton.setVisible(false);
		 	background.setVisible(true);
		 
		 	randomPlayerName(); //Method - This holds all the player details, and also randomises the names and ratings.
                      
        	//Object[] options - https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        	Object[] options = {"Play Game", "Quit"};
			int answer = JOptionPane.showOptionDialog(null, teamPlayers, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    	    	  
        		if (answer == JOptionPane.YES_OPTION){
           			Object[] optionsagain = {"Continue", "Quit"};
      				int playOn = JOptionPane.showOptionDialog(null, rating, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsagain, optionsagain[0]);
      					if (playOn == JOptionPane.YES_OPTION){
      						int savePlayer = JOptionPane.showConfirmDialog(null, "Would You Like To Save Your Players & Ratings?", "Save",
      							JOptionPane.YES_NO_OPTION);
      							
      						if(savePlayer == JOptionPane.YES_OPTION){
      							System.exit(0);
      						}
      						
      						else if(savePlayer == JOptionPane.NO_OPTION){
      							String thankYou = "Thank You For Playing The Random Name, Position & Score Game.\n\nPlease Play Again Soon!";
      							JOptionPane.showMessageDialog(null, thankYou);
      							System.exit(0);
      						}
      					}
      		
      					else if (playOn == JOptionPane.NO_OPTION){
      						System.exit(0);
      					}
      	
    			}//End of if(answer) == JOptionPane.YES_OPTION)
    	 
    	else if (answer == JOptionPane.NO_OPTION){
      	System.exit(0);
    	}
         
        }//End of ActionCommand "View You Players"
	}//End of ActionPerformed - ActioEvent F
	}//End of ButtonHandler - ActionListener
	
	
	
}//End of main