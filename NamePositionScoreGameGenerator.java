//NamePositionScoreGameGenerator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**This is an instantiable Name, Position & Score Generator class.
 *@author Paul Kennedy
 *@Version 1.5
 *@4-12-14
 */

public class NamePositionScoreGameGenerator extends JFrame { //Project name, which extends JFrame
	
	private String teamPlayers; //Used in randomPlayerName();
    private String rating; //Used in randomPlayerName();
    private float[] rate; //Used in randomPlayerName();
      
public static void main(String [] args){
		NamePositionScoreGameGenerator jFrame1 = new NamePositionScoreGameGenerator();
		jFrame1.setVisible(true);
	}//End of public static void main(String [] args)
	
		
	/* ===== Creation of JFrame ===== */
	private JMenuBar jmenubar; //Can be used across all methods
	private JLabel background = new JLabel(new ImageIcon("image2.png")); //Can be used across all methods
	private JButton playGameButton = new JButton("View Your Players");
	private JFrame pbframe = new JFrame("Please Hold");
	
	/** Method to return the JFrame
	 *@return JFrame */
		
	public NamePositionScoreGameGenerator(){ //The JFrame
		setTitle("Paul Kennedy Project"); //Name of JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Closing of JFrame
		setSize(500, 500); //Size of JFrame
		setLocation(250, 150); //Location of JFrame
		setLayout(new FlowLayout()); //Layout of JFrame
				
    	add(background); //Adding a background to JFrame
    	background.setLayout(new FlowLayout()); //Background layout
		
		jmenubar = new JMenuBar(); //Creating Menu, new JMenuBar();
		setJMenuBar(jmenubar); //Setting JMenuBar
		fileMenu(); //Using a method - contains the items for the JMenu
		
		
		JLabel welcomeMessage = new JLabel("<html><h3>Welcome To The Random Name, Position, Score Generator</h3></html>"); //Creating a JLabel welcome message
		add(welcomeMessage); //Adding the welcome message
		
		String sBsMessage = "---> Press Game -> New Game\n\n---> Click The 'View Your Players' Button\n\n---> Your Players Will Be Displayed On Screen\n\n---> Click The 'Play Game' Button To Play";
		//Creating a String message to put into the JTextArea		
		JTextArea stepByStep = new JTextArea(sBsMessage); //Creating the JTextArea
		add(stepByStep); //Adding the JTextArea
		stepByStep.setEditable(false); //Setting JTextArea's editbility to false
		
		Font font = new Font("Verdana", Font.BOLD, 12); //Creating a font
        stepByStep.setFont(font); //Adding the Font to the JTextArea
        stepByStep.setForeground(Color.BLUE); //Setting the color of the Font
        
        progressBar();
	
        }//End of NamePositionScoreGameGenerator()
	
	
	/* ===== Creation of FileMenu() ===== */

	public void fileMenu(){
		JMenu file_menu = new JMenu("Game"); //Creating the words in the JMenuBar
		jmenubar.add(file_menu); //Adding JMenuBar
		FileHandler filehandler = new FileHandler(); //New object for MyHandler
		
		/* Adding Items To The 'File' MenuBar */
		
		JMenuItem newitem = new JMenuItem("New Game"); //Creating the item under 'Game'
		file_menu.add(newitem); //Adding of item
		newitem.addActionListener(filehandler); //Using object name to call item
		
		file_menu.addSeparator(); //Seperator
		
		JMenuItem quit = new JMenuItem("Quit"); //Creating the item under 'Game'
		file_menu.add(quit); //Adding of item
		quit.addActionListener(filehandler); //Adding a actionListener to the quit button
	}//End of fileMenu()
	
	/** Method to return the progress bar
	 *@Display progress bar, and message */
	
	/* ===== Creation of ProgressBar() ===== */
		
	 	public void progressBar(){
		final JProgressBar pb = new JProgressBar(); //Declared final due to error, Creation of JProgressBar
		JFrame pbFrame = new JFrame("Please Hold"); //Creation of the Frame for the progress bar
		
		/*********************
		 *Title: progressBar(), lines 92 - 147,
		 *Author: Unknown, ZenTuts
		 *Site ownder/Sponcer: http://www.zentut.com/java-swing/jprogressbar/
		 *Date: Unknown, Copyright © 2014
		 *Code Version: 1.0
		 *Modified: JFrame Renamed, Added Font To ProgressBar, Scaled Down in Size
		 *Accessed: Fri 6th December 14
		 *********************/
 		
 		int max = 100; //Max number in bar
 
        //creates progress bar
        pb.setMinimum(0);
        pb.setMaximum(max);
        pb.setStringPainted(true);
 
        //add progress bar
        pbframe.setLayout(new FlowLayout());
        pbframe.add(pb);
 
        pbframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pbframe.setSize(300, 150);
        pbframe.setVisible(true);
        pbframe.setLocation(250, 250);
        
        // -- //
        
        String pMessage = "Please hold on...\nIt may take a little while but it will happen...\nThe monkeys are just fixing little bugs...\nEventually";
        JTextArea progressMessage = new JTextArea(pMessage);
        pbframe.add(progressMessage);
        progressMessage.setEditable(false); //Setting JTextArea's editbility to false
        
        Font font = new Font("Verdana", Font.BOLD, 10); //Creating a font
        progressMessage.setFont(font); //Adding the Font to the JTextArea
        progressMessage.setForeground(Color.RED); //Setting the color of the Font
 		
 		//update progressbar
        for (int i = 0; i <= max; i++) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pb.setValue(currentValue);
                    }
                });
                java.lang.Thread.sleep(70);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(pbframe, e.getMessage());
            }
        }
	}//End of progressBar()
	

	/* ===== Creation of randomPlayerName() ===== */
	
	/** Acessor method to return the randomized player names, and ratings
	 *@return the name and rating of player */
	
	public void randomPlayerName(){ //Random Player Method, This Randomizes The Names Of The Players By Using A For Loop
		String[] firstName = {"Luke", "Sam", "Nazmul", "JohnJoe", "Ross", "James", "Ciaran", "Gary", "Darryl", "Edward", "Matt", "Daniel", "Paul", "Niall", 
            					"Alex", "Kyle", "John", "Alan"}; //The first names of the players are stored in an array
	 	String[] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"}; //The second names of the players are stored in an array	
		 
            					
        int random = (int) (Math.random() * firstName.length); //Randomising the first names of the players by using Math.random()
        int random2 = (int) (Math.random() * secondName.length); //Randomising the second names of the players by using Math.random()
        
         
        String[] names = new String[12]; //Amount of Arrays I want
        rate = new float[12]; //Amount of Array I want
                 
         
         for(int i = 0; i <= 11; i++){
         	names[i] = firstName[(int)(Math.random() * firstName.length)] + " " + secondName[(int)(Math.random() * secondName.length)];
         	rate[i] = (float)(Math.random() * 10);
         } //End of For Loop
         
         teamPlayers = "<html><H2>Goalkeeper</H2></html>\n" + names[1] + "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "\n" + names[3] + "\n" + names[4] + "\n" + names[5] + 
         						"\n<html><H2>Midfielders</H2></html>" + "\n" + names[6] + "\n" + names[7] + "\n" + names[8] + "\n" + names[9] + 
         							"\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "\n" + names[11]; //String message to print out the players names & positions
         							
         rating = "<html><H2>Goalkeeper</H2></html>\n" + names[1] + "   " + rate[1] + "\n<html><H2>Defenders</H2></html>" + "\n" + names[2] + "   " + rate[2] + "\n" + names[3] + "   " + rate[3] + "\n" + 
         						names[4] + "   " + rate[4] + "\n" + names[5] + "   " + rate[5] + "\n<html><H2>Midfielders</H2></html>" + "\n" + 
         							names[6] + "   " + rate[6] + "\n" + names[7] + "   " + rate[7] + "\n" + names[8] + "   " + rate[8] + "\n" + 
         						 		names[9] + "   " + rate[9] + "\n<html><H2>Strikers</H2></html>" + "\n" + names[10] + "   " + rate[10] + 
         						 		"\n" + names[11] + "   " + rate[11]; //String message to print out players name, position & rating
                     
  	}//End of randomPlayerName()
  	
  	
  	/* ===== FileHandler w/ ActionListener & actionPerformed ===== */
	
	public class FileHandler implements ActionListener{ //Inner Class - FileHandler
		public void actionPerformed(ActionEvent e){
		
		if(e.getActionCommand().equals("New Game")){ //If 'New Game' is clicked, do the following...
		
		add(playGameButton); //Adding 'Play Game' button to JFrame
		setVisible(true); //Making it visible
				
		ButtonHandler buttonhandler = new ButtonHandler(); //Creating a new button handler
		playGameButton.addActionListener(buttonhandler); //Adding actionListener to this button handler
		}
		
		else if(e.getActionCommand().equals("Quit")){ //If 'Quit is clocked, shut down the program
			System.exit(0); //Exiting the System
		}
	}//End of ActionPerformed
	}//End of FileHandler - ActionListener

	
	/* ===== ButtonHandler w/ ActionListener & actionPerformed ===== */

	public class ButtonHandler extends JFrame implements ActionListener{ //Inner Class - ButtonHandler
		public void actionPerformed(ActionEvent f){
				
		 if(f.getActionCommand().equals("View Your Players")){ //If 'View Your Players' is clicked, do the following...
		 	playGameButton.setVisible(false); //Set the 'Play Game' button to hidden
		 	background.setVisible(true); //Keep the background visible
		 			 
		 	randomPlayerName(); //This holds all the player details, and also randomises the names and ratings.
		 	
		 	//Object[] options - https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
        	Object[] options = {"Play Game", "Quit"};
        	int answer = JOptionPane.showOptionDialog(null, teamPlayers, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    	    	  
        		if (answer == JOptionPane.YES_OPTION){ //If 'Yes' is clicked, do the following..
           			Object[] optionsagain = {"Continue", "Quit"};
      				
      				int playOn = JOptionPane.showOptionDialog(null, rating, "Game", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionsagain, optionsagain[0]);
      					
      					if (playOn == JOptionPane.YES_OPTION){
      						int exit = JOptionPane.showConfirmDialog(null, "Would You Like To Exit The Game?", "Exit?",
      							JOptionPane.YES_NO_OPTION); //Asking user would they like to exit the game
      						if(exit == JOptionPane.YES_OPTION){ //If 'Yes' to exiting is clicked, do the following...
      							String thankYou = "Thank You For Playing The Random Name, Position & Score Game.\n\nPlease Play Again Soon!"; //String message
      							JOptionPane.showMessageDialog(null, thankYou); //Printing out the String message
      							System.exit(0); //Exit the system
      						}
      						
      						else if(exit == JOptionPane.NO_OPTION){//If 'No' is clicked, do the following...
      							String noOption = "Well Too Bad, Please Run The Programme Again To Play!"; //String message
      							JOptionPane.showMessageDialog(null, noOption); //Printing out the String message
      							System.exit(0); //Exit the system
      						}
      					}
      		
      					else if (playOn == JOptionPane.NO_OPTION){ //If 'No' is clicked, close the system
      						String thankYou = "Thank You For Playing The Random Name, Position & Score Game.\n\nPlease Play Again Soon!"; //String message
      						JOptionPane.showMessageDialog(null, thankYou); //Printing out the String message
      						System.exit(0); //Exit the system
      					}
      	
    			}//End of if(answer) == JOptionPane.YES_OPTION)
    	 
    			else if (answer == JOptionPane.NO_OPTION){ //Play Game, or Quit
      			System.exit(0); //Exit the system
    			}
         
        }//End of ActionCommand "View You Players"
	}//End of ActionPerformed - ActionEvent F
	}//End of ButtonHandler - ActionListener
	
		
}//End of main