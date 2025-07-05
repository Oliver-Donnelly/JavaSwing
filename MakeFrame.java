// Colors, declaration, window name, window icon, setup

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MakeFrame {
    public static void main(String[] args) {
        // initialization of frame
        JFrame frame = new JFrame(); // initializes frame object

        // setting frame properties
        frame.setSize(500, 500); // sets size of frame
        frame.setTitle("Window Title"); // sets title of frame
        frame.setResizable(false); // make it so frame cant be resized

        frame.getContentPane().setBackground(Color.green); // sets the background color of the frame ( need to import java.awt.Color )
        frame.getContentPane().setBackground(new Color(0,0,0)); // sets color using rg (0,0,0) to (255,255,255)
        frame.getContentPane().setBackground(new Color(0x123456)); // sets color using any hex code
        


        //set frame logo
        ImageIcon image = new ImageIcon("images.jpg"); // make logo object to be set ( need to import javax.swing.imageicon )
        frame.setIconImage(image.getImage()); //sets the logo of the frame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes the x button exit the window instead of hiding it
                                                              // options: JFrame.EXIT_ON_CLOSE
                                                              // JFrame.HIDE_ON_CLOSE
                                                              // JFrame.DO_NOTHING_ON_CLOSE

        // making frame appear
        frame.setVisible(true); // makes frame visible
    }
}
