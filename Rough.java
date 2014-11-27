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
         
         JTextArea goalkeeper = new JTextArea("Goalkeeper: ");
         goalkeeper.setEditable(false);
         goalkeeper.append("\n");
         //JLabel goalkeeper = new JLabel("Goalkeeper:");
         add(goalkeeper);                
         goalkeeper.setEditable(false);
         for(int i = 0; i<1;i++){
         goalkeeper.append(names[i]+"\t\t"+rate[i]+"\n");
         goalkeeper.setVisible(true);
         add(goalkeeper);
         }
         
         JTextArea defender = new JTextArea("Defenders: ");
         defender.setEditable(false);
         defender.append("\n");
         add(defender);                
         defender.setEditable(false);
         for(int i = 1; i<5;i++){
         defender.append(names[i]+"\t\t"+rate[i]+ "\n");
         defender.setVisible(true);
         add(defender);
         }
         
         JTextArea midfield = new JTextArea("Midfielders: ");
         midfield.setEditable(false);
         midfield.append("\n");
         add(midfield);                
         midfield.setEditable(false);
         for(int i = 6; i<10;i++){
         midfield.append(names[i]+"\t\t"+rate[i]+ "\n");
         midfield.setVisible(true);
         add(midfield);
         }
         
         JTextArea forward = new JTextArea("Forwards: ");
         forward.setEditable(false);
         forward.append("\n");
         add(forward);                
         forward.setEditable(false);
         for(int i = 9; i<=11;i++){
         forward.append(names[i]+"\t\t"+rate[i]+ "\n");
         forward.setVisible(true);
         add(forward);
         }
         
         
         
         
         
         
         
         
         
         
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