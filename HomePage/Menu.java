package HomePage;

import javax.swing.*;
import java.awt.*;

public class Menu {

    public Menu() {

        JFrame frame = new JFrame("Hotel Menu");
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        // ================= TITLE ================= //
        JLabel title = new JLabel("AL-ZAFRAN KHAN HOTEL MENU");
        title.setBounds(350, 20, 600, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        frame.add(title);

        // ================= MENU ================= //
        String[][] menu = {
                {"Chicken Biryani", "Rs. 450"},
                {"Chicken Karahi", "Rs. 1200"},
                {"Mutton Karahi", "Rs. 2200"},
                {"Chicken Handi", "Rs. 1400"},
                {"BBQ Platter", "Rs. 1800"},
                {"Seekh Kabab", "Rs. 500"},
                {"Zinger Burger", "Rs. 650"},
                {"Pizza", "Rs. 1500"},
                {"French Fries", "Rs. 300"},
                {"Cold Drink", "Rs. 180"},
                {"Tea", "Rs. 150"},
                {"Coffee", "Rs. 250"}
        };

        int x = 150;
        int y = 100;

        for (int i = 0; i < menu.length; i++) {

            JPanel card = new JPanel();
            card.setLayout(null);
            card.setBackground(new Color(45, 45, 45));
            card.setBounds(x, y, 400, 70);

            JLabel food = new JLabel(menu[i][0]);
            food.setBounds(20, 20, 220, 30);
            food.setFont(new Font("Arial", Font.BOLD, 18));
            food.setForeground(Color.WHITE);

            JLabel price = new JLabel(menu[i][1]);
            price.setBounds(280, 20, 100, 30);
            price.setFont(new Font("Arial", Font.BOLD, 18));
            price.setForeground(Color.GREEN);

            card.add(food);
            card.add(price);

            frame.add(card);

            y += 85;

            if ((i + 1) % 6 == 0) {
                x += 500;
                y = 100;
            }
        }

        frame.setVisible(true);
    }
}