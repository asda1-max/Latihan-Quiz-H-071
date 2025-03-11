/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rakha
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginPage extends JFrame {
    JLabel userLabel = new JLabel("Username:");
    JTextField usernameField = new JTextField();
    JLabel passLabel = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    
    public LoginPage() {
        setTitle("Hotel Booking - Login");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        userLabel.setBounds(20, 20, 100, 20);
        usernameField.setBounds(120, 20, 150, 20);
        passLabel.setBounds(20, 50, 100, 20);
        passwordField.setBounds(120, 50, 150, 20);
        loginButton.setBounds(100, 100, 100, 30);
        
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("adm") && password.equals("adm")) {
                    dispose();
                    new MainMenuPage();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        setVisible(true);
    }
}

