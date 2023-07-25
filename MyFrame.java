import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("My first project"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); // prevent the frame from being resized
        this.setSize(420,420); // sets the x-dimension and y-dimension of frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("src\\assets\\logo.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of the frame

        this.getContentPane().setBackground(new Color(0x123456)); //change the background
    }
}
