package HomePage;

import javax.swing.*;
import java.awt.*;

public class Dashboard {

    public Dashboard() {

        JFrame frame = new JFrame("Dashboard");
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        // ================= TITLE ================= //
        JLabel title = new JLabel("AL-ZAFRAN KHAN HOTEL");
        title.setBounds(380, 30, 600, 40);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        frame.add(title);

        // ================= WELCOME ================= //
        JLabel welcome = new JLabel("Welcome to the Dashboard");
        welcome.setBounds(430, 90, 400, 30);
        welcome.setFont(new Font("Arial", Font.PLAIN, 22));
        welcome.setForeground(Color.LIGHT_GRAY);
        frame.add(welcome);

        // ================= BUTTONS ================= //
        JButton about = new JButton("About Hotel");
        about.setBounds(120, 200, 250, 60);
        frame.add(about);

        JButton branches = new JButton("Hotel Branches");
        branches.setBounds(470, 200, 250, 60);
        frame.add(branches);

        JButton menu = new JButton("Restaurant Menu");
        menu.setBounds(820, 200, 250, 60);
        frame.add(menu);

        JButton booking = new JButton("Book Room");
        booking.setBounds(120, 350, 250, 60);
        frame.add(booking);

        JButton rooms = new JButton("Available Rooms");
        rooms.setBounds(470, 350, 250, 60);
        frame.add(rooms);

        JButton contact = new JButton("Contact Us");
        contact.setBounds(820, 350, 250, 60);
        frame.add(contact);

        JButton logout = new JButton("Logout");
        logout.setBounds(520, 550, 200, 50);
        frame.add(logout);

        // ================= ACTIONS ================= //
        about.addActionListener(e -> {
            new HomePage();
            frame.dispose();
        });

        branches.addActionListener(e -> {
            new HotelBranches();
            frame.dispose();
        });

        menu.addActionListener(e -> {
            new Menu();
            frame.dispose();
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}