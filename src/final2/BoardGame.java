package final2;
	import java.awt.Color;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.BorderFactory;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;


	public class BoardGame {
		//private int click = 1;
		private JFrame j;
		private JPanel panel= new JPanel();
		private JLabel l= new JLabel("HelloS");
		private buttonsTG[] buttons = new buttonsTG[12];
		private GridLayout layout = new GridLayout(4,3);
		boolean gameStatus= false;
		
		public BoardGame(){	
			frame();
		}
		
		public void frame()
		{
			j= new JFrame("Tic Tac Toe Game");
			j.setSize(500, 500);
			j.setLocationRelativeTo(null);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		//11make the game board layout
		public void createPanel(){		
			panel.setLayout(layout);
			panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 50));
			
				for(int i = 0; i<9;i++)
				{									//1 improvement 
					buttons[i]= new buttonsTG("");//This is where 9 buttonsTG are instantiated.
												// Inside this class buttonsTG. I created the objects values,
												// aswell as implementing an ActionListenr, as soon as an new object is created.
					panel.add(buttons[i]);
			
				}
		
			//miscellaneous buttons
					for(int i = 9; i<buttons.length;i++){
							switch(i){
								case 9:
										buttons[i]= new buttonsTG("RESET");
										buttons[i].setBackground(Color.YELLOW);
										panel.add(buttons[i]);;	
										buttons[i].addActionListener(new ActionListener(){
													//1 improvement
											//This action listener overides the super class listener in class buttonsTG
													// The actionListner in buttonsTG[] will not be call and executed.
													// because i created a new listener with a new function, it will overide any other 
													// different functions from the super, they provide other tasks that need to be performed
											@Override
								public void actionPerformed(ActionEvent miscell){
								JButton newButton = (JButton) miscell.getSource();
									if(miscell.getActionCommand()=="RESET")
									   {  panel.removeAll();
									createPanel();
										}
									}});
										break;
								case 10:
									buttons[i]= new buttonsTG("1VPC");
									panel.add(buttons[i]);;	
									break;
								case 11:
									buttons[i]= new buttonsTG("PCvsPC");
									panel.add(buttons[i]);;	
									break;
							}		
		}

			j.add(panel);
			j.setVisible(true);	
			
			//declareWin();
	}//createPanel method

		
		
		
		
		
		
		


	}

