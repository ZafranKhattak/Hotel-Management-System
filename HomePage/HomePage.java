package HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {
    public HomePage() {
        // ================== JFRAME ====================== //

        JFrame frame = new JFrame("HOMEPAGE");
        frame.setSize(1300, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // ================== PANEL ======================= //
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1280, 700);
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(1280, 700));
        frame.add(panel);

        // ================= SCROLLABLE =================== //
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1280, 700);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scroll);

        // ======================= WELCOME AND ABOUT HOTEL HISTORY TEXT
        // =================== //

        String text = """
                    <html>
                    Welcome to Al-Zafran Khan Hotel, where comfort,<br>
                    elegance, and heartfelt hospitality come together<br>
                    to create unforgettable experiences.Established<br>
                    with a passion for excellence, our hotel is dedicated<br>
                    to providing every guest with exceptional service,<br>
                    luxurious accommodations, and a warm, welcoming atmosphere.<br>
                    Whether you are traveling for business, enjoying a family<br>
                    vacation, or celebrating a special occasion, we strive<br>
                    to make every moment of your stay comfortable and memorable.<br>
                    Thank you for choosing Al-Zafran Khan Hotel. We are honored<br>
                    to be your home away from home and look forward to making your<br>
                    stay truly exceptional.Your comfort is our priority, and your<br>
                    satisfaction is our success.
                    </html>
                """;

        // ===================== WELCOME NOTE LOGIC ======================== //
        JLabel label = label(text,
                0,
                50,
                700,
                700);
        // ==================== SET TIME FOR THE TEXT ======================= //
        Timer timer = new Timer(100, null);
        timer.addActionListener(new ActionListener() {

            int index = 0;

            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    label.setText(text.substring(0, index + 1));
                    index++;
                } else {
                    timer.stop();
                }
            }
        });

        timer.start();

        panel.add(label);

    }

    // ======================= SHOW TEXT LABEL METHOD LOGIC
    // ========================= //

    JLabel label(String text, int x, int y, int width, int height) {
        JLabel lbl = new JLabel();

        lbl.setText(text);
        lbl.setLayout(null);
        lbl.setBounds(x, y, width, height);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setForeground(Color.WHITE);
        lbl.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                lbl.setForeground(Color.YELLOW);
                lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        return lbl;
    }
}