package HomePage;

import javax.swing.*;
import java.awt.*;

public class HotelBranches {

    public HotelBranches() {

        JFrame frame = new JFrame("Hotel Branches");
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        // ===================== TITLE ===================== //
        JLabel title = new JLabel("AL-ZAFRAN KHAN HOTEL BRANCHES");
        title.setBounds(330, 30, 700, 40);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        frame.add(title);

        // ===================== BRANCHES ===================== //

        String branches[][] = {
                {"Karachi", "Main Shahrah-e-Faisal"},
                {"Lahore", "Mall Road"},
                {"Islamabad", "Blue Area"},
                {"Peshawar", "University Road"},
                {"Quetta", "Jinnah Road"},
                {"Gilgit", "Airport Road"},
                {"Muzaffarabad", "Main City"},
                {"Multan", "Cantt"},
                {"Faisalabad", "Susan Road"}
        };

        int x = 80;
        int y = 120;

        for (int i = 0; i < branches.length; i++) {

            JPanel card = new JPanel();
            card.setLayout(null);
            card.setBackground(new Color(40, 40, 40));
            card.setBounds(x, y, 320, 150);

            JLabel hotel = new JLabel("Al-Zafran Khan Hotel");
            hotel.setBounds(20, 20, 250, 25);
            hotel.setFont(new Font("Arial", Font.BOLD, 20));
            hotel.setForeground(Color.WHITE);
            card.add(hotel);

            JLabel city = new JLabel("City : " + branches[i][0]);
            city.setBounds(20, 60, 250, 25);
            city.setFont(new Font("Arial", Font.PLAIN, 18));
            city.setForeground(Color.LIGHT_GRAY);
            card.add(city);

            JLabel address = new JLabel("Address : " + branches[i][1]);
            address.setBounds(20, 95, 280, 25);
            address.setFont(new Font("Arial", Font.PLAIN, 18));
            address.setForeground(Color.LIGHT_GRAY);
            card.add(address);

            frame.add(card);

            x += 370;

            if ((i + 1) % 3 == 0) {
                x = 80;
                y += 190;
            }
        }

        frame.setVisible(true);
    }
}