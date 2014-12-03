		titlep = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlewrap = new JPanel(new GridLayout(2,1));
        mainp = new JPanel(new BorderLayout());
        wrap = new JPanel(new BorderLayout());

        titlep.add(title);
        titlewrap.add(titlep);
        titlewrap.add(blankp1);
        
        
        
        
        
        =========================================
        
        
        
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
         
         
         
         
         
         
         
         
         
         
         /* String[] firstName = {"Luke", "Sam", "Nazmul", "JohnJoe", "Ross", "James", "Ciaran", "Gary", "Darryl", "Edward", "Matt", "Dan", "Paul", "Niall", 
            					"Alex", "Mohammed", "Kyle", "John", "Alan"};
         String[] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"};
            					
         //int random = (int) (Math.random()*firstName.length);
        // int random2 = (int) (Math.random()*secondName.length);
         
         
         JLabel label = new JLabel();
         label.setText("Your name & position is: "  + firstName[random] +" "+ secondName[random2]);
         
         String[] names = new String[11];
         int[] rate = new int[11];
         
         for(int i = 0 ; i < 11; i++){
         	names[i] = firstName[(int)(Math.random()*firstName.length)]; */
         	
         	
         	
         	
         	
         	
         	
         	
         	
  import java.util.*;
import java.io.*;

public class SaveFriends{
	
	public static void main(String args[])throws FileNotFoundException,IOException{
		
		//LinkedList <Person> myFriends;
		//myFriends = new LinkedList<Person>();
		
		
		Person f1 = new Person("kerry",21,'f');
		Person f2 = new Person("Ann",25,'f');
		myFriends.add(f1);
		myFriends.add(f2);
		
		File friendsFile = new File("Information.txt");
		FileOutputStream fos = new FileOutputStream(friendsFile);
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(myFriends);
		os.close();
	}
}




   try{
      byte bWrite [] = {teamPlayers, ratings};
      OutputStream os = new FileOutputStream("test.txt");
      for(int x=0; x < bWrite.length ; x++){
         os.write( bWrite[x] ); // writes the bytes
      }
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for(int i=0; i< size; i++){
         System.out.print((char)is.read() + "  ");
      }
      is.close();
   }catch(IOException e){
      System.out.print("Exception");
   }	
   }
}