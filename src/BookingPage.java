/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rakha
 */
import javax.swing.*;

class BookingPage extends JFrame {
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField();
    JLabel lengthLabel = new JLabel("Length of Stay (nights):");
    JTextField lengthField = new JTextField();
    JLabel guestLabel = new JLabel("Number of Guests:");
    JComboBox<Integer> guestCount = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
    JLabel genderLabel = new JLabel("Gender:");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JButton bookButton = new JButton("Book");
    JButton resetButton = new JButton("Reset");
    Room room;
    
    public BookingPage(Room room) {
        this.room = room;
        setTitle("Hotel Booking - Booking Page");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        nameLabel.setBounds(20, 20, 100, 20);
        nameField.setBounds(120, 20, 150, 20);
        lengthLabel.setBounds(20, 50, 150, 20);
        lengthField.setBounds(180, 50, 90, 20);
        guestLabel.setBounds(20, 80, 150, 20);
        guestCount.setBounds(180, 80, 90, 20);
        genderLabel.setBounds(20, 110, 100, 20);
        male.setBounds(120, 110, 70, 20);
        female.setBounds(200, 110, 70, 20);
        bookButton.setBounds(50, 160, 100, 30);
        resetButton.setBounds(200, 160, 100, 30);
        
        add(nameLabel);
        add(nameField);
        add(lengthLabel);
        add(lengthField);
        add(guestLabel);
        add(guestCount);
        add(genderLabel);
        add(male);
        add(female);
        add(bookButton);
        add(resetButton);
        
        bookButton.addActionListener(e -> processBooking());
        resetButton.addActionListener(e -> resetForm());
        
        setVisible(true);
    }
    
    private void processBooking() {
        try {
            String name = nameField.getText();
            if (name.isEmpty()) throw new Exception("Name cannot be empty");

            int nights = Integer.parseInt(lengthField.getText());
            if (nights <= 0) throw new Exception("Invalid length of stay");

            int totalCost = nights * room.getPricePerNight();
            JOptionPane.showMessageDialog(this, "Total Price: Rp " + totalCost);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for nights", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void resetForm() {
        nameField.setText("");
        lengthField.setText("");
        guestCount.setSelectedIndex(0);
        male.setSelected(false);
        female.setSelected(false);
    }
}

