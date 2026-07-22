package HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {

    public HomePage() {
        JFrame frame = new JFrame("History");
        frame.setVisible(true);
        frame.setSize(1300, 1300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ================== PANEL ======================= //
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1280, 700);
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(1280, 2200));
        frame.add(panel);

        // ================= SCROLLABLE =================== //
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1280, 700);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scroll);

        // ================== ABOUT ======================= //
        JLabel aboutLabel = label("About Hotel", 100, 30, 180, 30);
        aboutLabel.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                // new AboutHotel();
                frame.dispose();
            }
        });
        panel.add(aboutLabel);

        // ================== Branches ======================= //
        JLabel branchesLabel = label("Hotel Branches",
                250,
                30,
                180,
                30);
        branchesLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                new HotelBranches();
                frame.dispose();
            }
        });
        panel.add(branchesLabel);

        // ================== DASHOARD ========================== //
        JLabel dashboardLabel = label("Menu", 430, 30, 120, 30);
        dashboardLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                new Menu();
                frame.dispose();
            }
        });
        panel.add(dashboardLabel);

        // ================== About Infracture ==================== //

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

        JLabel welComeNote = label(text,
                50,
                60,
                630,
                390);
        Timer timer = new Timer(10, null);
        timer.addActionListener(new ActionListener() {

            int index = 0;

            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    welComeNote.setText(text.substring(0, index + 1));
                    welComeNote.setForeground(Color.BLUE);
                    index++;
                } else {
                    timer.stop();
                }
            }
        });

        timer.start();
        panel.add(welComeNote);

        // ====================== OWNER NAME ================== //
        JLabel onwerLabel = label("<html> Owner <br>Zafran Khan</br> </html>",
                950, 70, 300, 100);
        panel.add(onwerLabel);
        // ====================== IMAGE ====================== //
        ImageIcon icon = new ImageIcon("HomePage/owner.jpg");
        Image img = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(img));
        label.setBounds(900, 150, 200, 250);
        panel.add(label);

        String imges[][] = {
                {
                        "HomePage/dinner.png", "HomePage/front.png", "HomePage/image.png",
                        "HomePage/hotelName.png", "HomePage/location.png","HomePage/reception.png"
                },
                {
                        "HomePage/image.png", "HomePage/reception.png", "HomePage/reception.png",
                        "HomePage/room.png", "HomePage/owner.jpg","HomePage/reception.png"
                },
                {
                        "HomePage/image.png", "HomePage/reception.png", "HomePage/reception.png",
                        "HomePage/room.png", "HomePage/owner.jpg","HomePage/reception.png"
                }
        };

        for (int i = 0; i < imges.length; i++) {
            for (int j = 0; j <imges[i].length; j++) {
                JLabel book = createImage(
                        imges[i][j],
                        i * 350 +100,
                        j * 350 +450,
                        300,
                        300);
                panel.add(book);
            }
        }

    }

    // ======================== LABEL METHOD LOGIC ====================== //
    JLabel label(String text, int x, int y, int width, int height) {
        JLabel lbl = new JLabel(text);
        lbl.setBounds(x, y, width, height);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setForeground(Color.WHITE);
        lbl.setLayout(null);
        lbl.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }
        });

        return lbl;
    }

    public JLabel createImage(String path, int x, int y, int width, int height) {

        ImageIcon icon = new ImageIcon(path);

        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        JLabel label = new JLabel(new ImageIcon(img));

        label.setBounds(x, y, width, height);

        return label;
    }
}
