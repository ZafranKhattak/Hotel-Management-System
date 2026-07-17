package Dashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelHistory {

    public HotelHistory() {
        JFrame frame = new JFrame("History");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(1300, 1300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // ================== About Infracture ==================== //

        String text = """             
                <html>
                Welcome to Al-Zafran Khan Restaurant<br>
                The Legacy of Khan's Family built in <br>
                Its branches are in all over Pakistan.<br>
                It is famous for its delecious food taste.<br>
                It is one of the biggest food bussiness <br>
                in Pakistan. 
                </html>
                """;

        JLabel welComeNote = label(text,
                50,
                20,
                600,
                300,
                Color.YELLOW);
        Timer timer = new Timer(100, null);
        timer.addActionListener(new ActionListener() {

            int index = 0;

            public void actionPerformed(ActionEvent e) {
                if (index < text.length()) {
                    welComeNote.setText(text.substring(0, index + 1));
                    index++;
                } else {
                    timer.stop();
                }
            }
        });

        timer.start();
        frame.add(welComeNote);

        // ====================== OWNER NAME ================== //
        JLabel onwerLabel = label("<html> Owner <br>Zafran Khan</br> </html>",
                950, 70, 300, 100, Color.WHITE);
        frame.add(onwerLabel);
        // ====================== IMAGE ====================== //
        ImageIcon icon = new ImageIcon("Dashboard/owner.jpg");
        Image img = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(img));
        label.setLayout(null);
        label.setBounds(900, 150, 200, 250);
        frame.add(label);
    }

    // ======================== LABEL METHOD LOGIC ====================== //
    JLabel label(String text, int x, int y, int width, int height, Color col) {
        JLabel lbl = new JLabel(text);
        lbl.setBounds(x, y, width, height);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setForeground(col);
        lbl.setLayout(null);
        lbl.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                
            }
        });

        return lbl;
    }
}
