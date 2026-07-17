package Dashboard;

import javax.swing.*;
import Auth.SignIn;
import java.awt.*;

public class Dashboard {

    public Dashboard(String fullName) {

        // =================== DISPLAY NAME ====================== //
        JLabel welComLabel = label(fullName, 20);

        // =================== JFRAME =========================== //
        JFrame frame = new JFrame("DASHBOARD");
        frame.getContentPane().setBackground(new Color(91, 44, 111));
        frame.setVisible(true);
        frame.setSize(1300, 1300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(welComLabel);

        // ================== JPANEL ==================== //
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(450, 100, 400, 500);
        panel.setBackground(Color.BLACK);
        frame.add(panel);

        // ===================== BACKGROUND IMAGE ==================== //
        ImageIcon icon = new ImageIcon("Dashboard/image.png");
        Image img = icon.getImage();
        Image resize = img.getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(resize);
        JLabel imageLabel = new JLabel(newIcon);
        imageLabel.setBounds(0, 0, 1300, 700);
        frame.add(imageLabel);

        // ===================== MENU ============== //
        JButton wB = button("Menu", 50);
        wB.addActionListener(e -> {
            // new WithdrawCash();
            frame.dispose();
        });
        panel.add(wB);
        // ===================== BOOK A ROOM ============== //
        JButton aB = button("Resturent", 120);
        aB.addActionListener(e -> {
            // new AddCash();
            frame.dispose();
        });
        panel.add(aB);
        // ===================== ABOUT HOTEL HISTORY ============== //
        JButton cB = button("Hotel History", 200);
        cB.addActionListener(e -> {
            new HotelHistory();
            frame.dispose();
        });
        panel.add(cB);
        // ===================== SEND CASH BUTTON ============== //
        JButton sB = button("Transfer Cash", 280);
        sB.addActionListener(e -> {
            // new TransferCash();
            frame.dispose();
        });
        panel.add(sB);
        // ===================== BACK BUTTON ============== //
        JButton bB = button("Back", 360);
        bB.setBounds(50 , 360,300,35);
        bB.setBackground(Color.BLUE);
        bB.addActionListener(e -> {

            new SignIn();
            frame.dispose();
        });
        panel.add(bB);

    }

    // ========================= JBUTTON LOGIC METHOD ========================//
    public JButton button(String text, int y) {
        JButton btn = new JButton(text);
        btn.setLayout(null);
        btn.setBounds(100, y, 200, 30);
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 17));

        return btn;
    }

    // ========================= JLABEL METHOD ========================= //
    public JLabel label(String text, int y)

    {
        JLabel lbl = new JLabel(text);
        lbl.setLayout(null);
        lbl.setForeground(Color.BLACK);
        lbl.setFont(new Font("ARAIL", Font.BOLD, 25));
        lbl.setBounds(500, y, 500, 30);
        return lbl;
    }
}
