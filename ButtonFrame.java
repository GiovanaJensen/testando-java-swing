import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonFrame extends JFrame implements ActionListener{
    JButton button;
    ButtonFrame(){

        ImageIcon icon = new ImageIcon("src\\assets\\logo.png");

        button = new JButton();
        button.setBounds(100,100,200, 200);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.BOTTOM);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Done");
        }
    }
}
