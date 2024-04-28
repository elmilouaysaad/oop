package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mello
 */

public class LoginGUI extends JFrame implements ActionListener {
    private JTextField nameField, passwordField;
    private JButton loginButton;
    private static String username,password;
    public LoginGUI() {
        setTitle("User Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("UserName:");
        panel.add(nameLabel);

        nameField = new JTextField();
        panel.add(nameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            username = nameField.getText();
            password = passwordField.getText();
            dispose();
        } 
    }
    
    public static String getUsername() {
        return username;
    }
    public static String getPassword() {
        return password;
    }
}