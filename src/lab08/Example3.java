package lab08;
/*
 * Example of using event handling and different layout managers
 * This program takes the length and width of a rectangle and calculates the area
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Example3 extends JFrame implements ActionListener{

	/*
	 * For the action performed method to have access to the components in the gui
	 * they must be declared before the constructor and then created inside the constructor.
	 * This is similar to attributes/data members for instantiable classes
	 */
	
	//declaring 3 labels to indicate the different components
	JLabel lengthLabel;
	JLabel widthLabel;
	JLabel areaLabel;
	
	//declaring two text fields for input
	JTextField lengthField;
	JTextField widthField;
	
	//declaring a label for the result of the calculation
	JLabel resultLabel;
	
	//declaring a button to submit the information
	JButton submitButton;
	
	//constructor
	public Example3(){
		//setting up the window
		setTitle("Example 3");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//getting the content pane of the frame
		Container contentPane = getContentPane();
		
		//setting the layout to be a grid layout with 2 columns
		contentPane.setLayout(new GridLayout(0,2));
		
		//creating GUI objects	
		
		//creating 3 labels to indicate what each of the fields are for
		lengthLabel = new JLabel("Length:");
		widthLabel = new JLabel("Width:");
		areaLabel = new JLabel("Area:");
		
		//creating two text fields for user input for length and width
		lengthField = new JTextField(10);
		widthField = new JTextField(10);
		
		//creating label to show the result of the calculation
		resultLabel = new JLabel();
		
		//creating submit button
		submitButton = new JButton("Submit");
		//adding event listener to button
		submitButton.addActionListener(this);
		
		//adding the components to the container
		contentPane.add(lengthLabel);
		contentPane.add(lengthField);
		contentPane.add(widthLabel);
		contentPane.add(widthField);
		contentPane.add(areaLabel);
		contentPane.add(resultLabel);
		contentPane.add(submitButton);
		
		//setting the content pane
		setContentPane(contentPane);
		
	}
	
	//action performed
	public void actionPerformed(ActionEvent arg0) {
		//getting the text from the length field
		String lengthInput = lengthField.getText();
		double length = Double.parseDouble(lengthInput);
		
		//getting the text from the width field
		String widthInput = widthField.getText();
		double width = Double.parseDouble(widthInput);
		
		//performing calculation
		double area = length * width;
		
		//updating the resultLabel with the calculation
		//the set text method only takes strings so im appending a blank space to the area variable to convert it
		resultLabel.setText(area+"");
		
	}

}
