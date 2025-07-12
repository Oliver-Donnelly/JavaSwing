import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panels {

	public static void main(String[] args) throws InterruptedException {

		// JPanel = a GUI component that functions as a container to hold other
		// components
		JLabel label = new JLabel(); // Create a new JLabel
		label.setText("Hi"); // Set the text of the label to "Hi"
		label.setForeground(Color.black);
		label.setVerticalAlignment(JLabel.TOP); // Align the label's contents to the top vertically
		label.setHorizontalAlignment(JLabel.LEFT); // Align the label's contents to the left horizontally
		label.setBounds(0, 0, 25, 25); // (Commented out) Set the position and size of the label
		Border border = BorderFactory.createLineBorder(Color.black, 3); // creates a border (color , thickness)
		label.setBorder(border); // sets the label's border to border

		JPanel redPanel = new JPanel(); // Create a new JPanel for the red panel
		redPanel.setBackground(Color.red); // Set the background color of the red panel to red
		redPanel.setBounds(0, 0, 250, 250); // Set the position and size of the red panel
		// redPanel.setLayout(new BorderLayout()); // Set the layout manager of the red panel to BorderLayout

		JPanel bluePanel = new JPanel(); // Create a new JPanel for the blue panel
		bluePanel.setBackground(Color.blue); // Set the background color of the blue panel to blue
		bluePanel.setBounds(250, 0, 250, 250); // Set the position and size of the blue panel
		// bluePanel.setLayout(new BorderLayout()); // Set the layout manager of the blue panel to BorderLayout

		JPanel greenPanel = new JPanel(); // Create a new JPanel for the green panel
		greenPanel.setBackground(Color.green); // Set the background color of the green panel to green
		greenPanel.setBounds(0, 25, 500, 250); // Set the position and size of the green panel
		// greenPanel.setLayout(new BorderLayout()); // Set the layout manager of the green panel to BorderLayout

		JFrame frame = new JFrame(); // Create a new JFrame (main window)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit the application
		frame.setLayout(null); // Set the layout manager of the frame to null (absolute positioning)
		frame.setSize(500, 500); // Set the size of the frame to 750x750 pixels
		frame.setVisible(true); // Make the frame visible
		greenPanel.add(label); // Add the label to the green panel
		label.setLocation(100, 100);
		frame.add(redPanel); // Add the red panel to the frame
		frame.add(bluePanel); // Add the blue panel to the frame
		frame.add(greenPanel); // Add the green panel to the frame
	}
}