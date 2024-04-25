package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpGUI extends JFrame implements ActionListener {
    private JTextField nameField, passwordField;
    private JButton signUpButton;
    private static User NewUser;

    public SignUpGUI() {
        setTitle("User Sign Up");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        nameField = new JTextField();
        panel.add(nameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        panel.add(signUpButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == signUpButton) {
            String name = nameField.getText();
            String password = passwordField.getText();
            NewUser =  new User(name, password);
            dispose();// Close the page 
            
        }
    }
    
    public static User getUser() {
        return NewUser;
    }
}

