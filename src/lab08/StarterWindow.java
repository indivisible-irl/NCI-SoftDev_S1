package lab08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StarterWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	//constructor
	public StarterWindow(){
		//setting up the window
		setTitle("Starter Window");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//getting the content pane of the frame
		Container contentPane = getContentPane();
		
		//setting the layout to be a flow layout
		contentPane.setLayout(new FlowLayout());
		
		//create GUI objects and add action listeners
		
		//add GUI objects to contentPane
		
		//setting content pane
		setContentPane(contentPane);		
	}
	
	//action performed
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
