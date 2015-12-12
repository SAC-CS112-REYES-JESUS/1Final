package final2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class buttonsTG extends JButton implements ActionListener{
									//Implemements actionListner allowing it to use some of the assets of this abstract Class
									// to change and modify.
	
	private String X,O;
	private int click =1;
	private String names;
	private int clicker =1;
	Font myCusFont = new Font("SansSerif",Font.BOLD,50);
	
	
	
	public buttonsTG(String names){
		
		super(names);
		X = "X";
		O = "O";
		this.addActionListener(this);
		
	}
					// actionPerformed for the ActionListener is created here
					//so when new objects get call like the array in Class BoadGame. They will
					// be immediately created with an ActionLister embedded in them, without to having add one.
	public void actionPerformed(ActionEvent var) {			
			//each click becomes a new var object
			// ActionEvent (var) {information} about the event and its source
		
			JButton newButton = (JButton) var.getSource();
			
			 if(clicker ==1){
						newButton.setBackground(Color.GREEN);
						newButton.setActionCommand(X);
						newButton.setText(X);
						newButton.setFont(myCusFont);
						clicker--;
						System.out.println(clicker);//DBUG
			 }
					else{
						
						newButton.setBackground(Color.BLUE);
						newButton.setActionCommand(O);
						newButton.setText(O);
						newButton.setFont(myCusFont);
						clicker++;
						System.out.println(clicker);//DBUG
					}
				}
		
	}

		
		
	
		
		
	

