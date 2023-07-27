import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class LabelFrame extends JFrame{
    LabelFrame(){
        Border border = BorderFactory.createLineBorder(new Color(0x800080),3);

        JLabel label = new JLabel("Speak now (Taylor's version)"); //create a label

        ImageIcon image = new ImageIcon("src\\assets\\taylor.jpeg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // CENTER, LEFT, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // CENTER, LEFT, RIGHT of ImageIcon
        label.setForeground(new Color(0x800080)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        // label.setBounds(100, 100, 350, 350); //set x,y position within frame as well as dimension

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        // frame.setSize(500,500);
        this.setVisible(true);

        this.add(label); // add the label inside the frame
        this.pack();
    }
        
}
