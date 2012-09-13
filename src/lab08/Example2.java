package lab08;
/*
 * A example of creating an application with a layout and adding
 * different components to it
 */

import javax.swing.*;
import java.awt.*;

public class Example2 extends JFrame {

	public Example2(){
		//setting up the window
		setTitle("Example 2");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//getting the content pane of the frame
		Container contentPane = getContentPane();
		
		//setting the layout to be a flow layout
		contentPane.setLayout(new FlowLayout());
		
		//creating GUI objects
		
		//creating a button object. The button class can take text as an argument in the constructor. this appears on the button
		JButton submitButton = new JButton("Submit");
		//creating a text field object. It can take a number indicating how wide it will be in columns
		JTextField usernameField = new JTextField(20);
		//create a label. the constructor can take text that will be displayed on the label.
		JLabel usernameLabel = new JLabel("Username: ");
		
		//adding GUI objects to contentPane
		contentPane.add(usernameLabel);
		contentPane.add(usernameField);
		contentPane.add(submitButton);
		
		//setting content pane
		setContentPane(contentPane);
	}
	
}
