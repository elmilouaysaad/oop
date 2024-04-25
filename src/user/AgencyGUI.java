package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgencyGUI extends JFrame implements ActionListener {
    private JButton managerButton, ownerButton,propretyButton,logoutButton;
    private static int choice=0;
    public AgencyGUI() {
        setTitle("Agency");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        managerButton = new JButton("Manager");
        managerButton.addActionListener(this);
        panel.add(managerButton);

        ownerButton = new JButton("Owner");
        ownerButton.addActionListener(this);
        panel.add(ownerButton);

        propretyButton = new JButton("Looking for property");
        propretyButton.addActionListener(this);
        panel.add(propretyButton);

        logoutButton = new JButton("logout");
        logoutButton.addActionListener(this);
        panel.add(logoutButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerButton) {
            choice=1;
            dispose(); // Close 
        } else if (e.getSource() == ownerButton) {
            choice=2;
            dispose(); // Close 
        } else if (e.getSource() == propretyButton) {
            choice=3;
            dispose(); // Close 
        } else if (e.getSource() == logoutButton) {
            choice=4;
            dispose(); // Close 
        }
    }
    public static int getChoice(){
        return choice;
    }
}
