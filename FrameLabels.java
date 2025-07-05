import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class FrameLabels {
    public static void main(String[] args) {
        // initialization of frame
        JFrame frame = new JFrame(); // initializes frame object
        // setting frame properties
        frame.setSize(1920, 1080); // sets size of frame
        frame.setResizable(false); // make it so frame cant be resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes the x button exit the window instead of hiding it

        
        //making labels
        JLabel label = new JLabel(); // creates a label
        label.setText("Example label"); // sets text of label
        frame.add(label); // adds label to the frame

        //making an image to add to frame
        ImageIcon image = new ImageIcon("image.png"); // creates image object
        label.setIcon(image); // adds the image to the label

        //making border
        Border border = BorderFactory.createLineBorder(Color.green,3); // creates a border (color , thickness)
        label.setBorder(border); // sets the label's border to border

        //choosing text position
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        
        //choose color of text and background
        label.setForeground(Color.CYAN); // sets text color
        label.setFont(new Font("MV Boli", Font.BOLD,20)); // sets font of text (font type, font bold / italics / underline, font size)
        label.setIconTextGap(10); //sets the gap between text and image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color

        //choose position of contents within the label
        label.setVerticalAlignment(JLabel.BOTTOM); // sets vertical position of label contents within label
        label.setHorizontalAlignment(JLabel.RIGHT); // sets horizontal position of label contents within label

        //setting size of label
        //frame.setLayout(null); // sets the layout to null so that the label doesnt take up the whole screen (this is a much more complicated concept)
        //label.setBounds(0,0,600,600); // sets position and size of the label (x, y, width, height) [if you make it too small it will cut off contents]
        //  frame.pack(); // adjusts the size of the frame to the size of the label
        // making frame appear
        frame.setVisible(true); // makes frame visible
    }
}
