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

class MainMenuPage extends JFrame {
    JLabel smallRoomLabel = new JLabel("Small Room - Rp 50,000/night");
    JLabel largeRoomLabel = new JLabel("Large Room - Rp 100,000/night");
    JButton smallRoomButton = new JButton("Book Small Room");
    JButton largeRoomButton = new JButton("Book Large Room");
    
    public MainMenuPage() {
        setTitle("Hotel Booking - Main Menu");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        smallRoomLabel.setBounds(20, 20, 200, 20);
        smallRoomButton.setBounds(20, 50, 150, 30);
        largeRoomLabel.setBounds(20, 100, 200, 20);
        largeRoomButton.setBounds(20, 130, 150, 30);
        
        add(smallRoomLabel);
        add(smallRoomButton);
        add(largeRoomLabel);
        add(largeRoomButton);
        
        smallRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BookingPage(new SmallRoom());
            }
        });
        
        largeRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BookingPage(new LargeRoom());
            }
        });
        
        setVisible(true);
    }
}

