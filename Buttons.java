import java.awt.*; // Import all classes from the java.awt package (for GUI components)
import java.awt.event.*; // Import all classes from the java.awt.event package (for event handling)
import javax.swing.*; // Import all classes from the javax.swing package (for Swing GUI components)

public class Buttons extends JFrame implements ActionListener { // Define the Buttons class, which is a JFrame and
																// implements ActionListener

	JButton button; // Declare a JButton named button
	JLabel label; // Declare a JLabel named label

	public static void main(String[] args) { // Main method, entry point of the program
		// JButton = a button that performs an action when clicked on
		new Buttons(); // Create a new instance of the Buttons class
	}

	public Buttons() { // Constructor for the Buttons class
		JFrame frame = new JFrame();

		label = new JLabel(); // Create a new JLabel and assign it to label
		label.setBounds(150, 250, 150, 150); // Set the position and size of the label
		label.setVisible(false); // Make the label initially invisible

		button = new JButton(); // Create a new JButton and assign it to button
		button.setBounds(100, 100, 250, 100); // Set the position and size of the button
        
		button.setText("I'm a button!"); // Set the text of the button
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

		button.setFocusable(false); // Make the button not focusable (removes the focus border)
		button.setFont(new Font("Comic Sans", Font.BOLD, 25)); // Set the font of the button text
		button.setForeground(Color.cyan); // Set the text color of the button to cyan
		button.setBackground(Color.lightGray); // Set the background color of the button to light gray

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit the application
		frame.setLayout(null); // Set the layout manager to null (absolute positioning)
		frame.setSize(500, 500); // Set the size of the frame to 500x500 pixels
		frame.setVisible(true); // Make the frame visible
		frame.add(button); // Add the button to the frame
		frame.add(label); // Add the label to the frame
	}
}