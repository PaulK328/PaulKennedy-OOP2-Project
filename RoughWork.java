	welcomeText(); //Up where JFrame is OR where new is clicked!
	
	public void welcomeText(){
		JLabel welcomeText = new JLabel("Welcome To The Game"); //CREATE METHOD FOR THIS
		add(welcomeText);
		setVisible(true);
	}
	
	JLabel welcomeText = new JLabel("Welcome To The Game"); //CREATE METHOD FOR THIS
	add(welcomeText);
	


	public void newGame(){ //Create New Game Here? Include Label etc..
		JLabel welcomeText = new JLabel(welcomeTextInJLabel());
		add(welcomeText);
		setVisible(true);
	}
		
	JLabel welcomeTextLong = new JLabel("<html><i><b>Welcome To The Game</i></b><br>To Play The Game Simply:<br><li><ul>Press The Button</ul></li></html>");
	
		
		
		
		JButton playGameButton = new JButton("Start Game"); //AND THIS
		add(playGameButton);
	}//End of newGame()
	
	
	
	
		public void randomPlayerName(){ //randomPlayerName()
		 String[19] firstNames = {"Luke", "Sam", "Nazmul", "JohnJoe", "Ross", "James", "Ciaran", "Gary", "Darryl", "Edward", "Matt", "Dan", "Paul", "Niall", 
            					"Alex", "Mohammed", "Kyle", "John", "Alan"};
         String[20] secondName = {"Bluett", "Dowling", "Alam", "Landers", "Killian", "Nagel", "McGarr", "Griffen", "Naughton", "Moynihan", "Sin", "Lyne", 
            					"O'Sullivan", "Kennedy", "Stack", "Zoric", "Maloudi", "Mulvihal", "Rigney", "Moriarty"};
            					
         int random = (int) (Math.random()*firstNames.length);
         int random2 = (int) (Math.random()*secondName.length);
         int i=0;
         
         for(random <= 16;random2 <= 16; i++){
         	int random = (int) (Math.random()*firstNames.length);
         	int random2 = (int) (Math.random()*secondName.length);
         }
         	
         
    
         
         
         
         JLabel label = new JLabel();
         label.setText("Your name & position is: "  + firstNames[random] +" "+ secondName[random2]);
	}//End of randomPlayerName()