import java.awt.*; // Import all classes from the java.awt package (for GUI components)
import java.awt.event.*; // Import all classes from the java.awt.event package (for event handling)
import javax.swing.*; // Import all classes from the javax.swing package (for Swing GUI components)

public class Buttons extends JFrame implements ActionListener { // Define the Buttons class, which is a JFrame and implements ActionListener

	JButton button; // Declare a JButton named button
	JLabel label; // Declare a JLabel named label

	public static void main(String[] args) { // Main method, entry point of the program
		// JButton = a button that performs an action when clicked on
		new Buttons(); // Create a new instance of the Buttons class
	}

	public Buttons() { // Constructor for the Buttons class
		ImageIcon icon = new ImageIcon("point.png"); // Create an ImageIcon from the file "point.png"
		ImageIcon icon2 = new ImageIcon("face.png"); // Create an ImageIcon from the file "face.png"

		label = new JLabel(); // Create a new JLabel and assign it to label
		label.setIcon(icon2); // Set the icon of the label to icon2
		label.setBounds(150, 250, 150, 150); // Set the position and size of the label
		label.setVisible(false); // Make the label initially invisible

		button = new JButton(); // Create a new JButton and assign it to button
		button.setBounds(100, 100, 250, 100); // Set the position and size of the button
		button.addActionListener(this); // Add this class as the ActionListener for the button
		button.setText("I'm a button!"); // Set the text of the button

		button.setFocusable(false); // Make the button not focusable (removes the focus border)
		button.setIcon(icon); // Set the icon of the button to icon
		button.setHorizontalTextPosition(JButton.CENTER); // Set the horizontal position of the text to center
		button.setVerticalTextPosition(JButton.BOTTOM); // Set the vertical position of the text to bottom
		button.setFont(new Font("Comic Sans", Font.BOLD, 25)); // Set the font of the button text
		button.setIconTextGap(-15); // Set the gap between the icon and text to -15 pixels
		button.setForeground(Color.cyan); // Set the text color of the button to cyan
		button.setBackground(Color.lightGray); // Set the background color of the button to light gray
		button.setBorder(BorderFactory.createEtchedBorder()); // Set the border of the button to an etched border

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit the application
		this.setLayout(null); // Set the layout manager to null (absolute positioning)
		this.setSize(500, 500); // Set the size of the frame to 500x500 pixels
		this.setVisible(true); // Make the frame visible
		this.add(button); // Add the button to the frame
		this.add(label); // Add the label to the frame
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Method called when an action event occurs
		if (e.getSource() == button) { // Check if the event source is the button
			System.out.println("poo"); // Print "poo" to the console
			button.setEnabled(false); // Disable the button so it can't be clicked again
			label.setVisible(true); // Make the label visible
		}
	}
}