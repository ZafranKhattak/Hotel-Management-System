package HomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {

    public HomePage() {
        JFrame frame = new JFrame("History");
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(1300, 1300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ================== ABOUT ======================= //
        JLabel aboutLabel = label("About", 100, 30, 120, 30, Color.WHITE);
        aboutLabel.addMouseListener(new MouseAdapter() {
            
            public void mouseEntered(MouseEvent e)
            {
                // new AboutHotel();
                frame.dispose();
            }   
        });
        frame.add(aboutLabel);

        // ================== Branches ======================= //
        JLabel branchesLabel = label("Branches", 
                                    200, 
                                    30, 
                                    120,
                                    30, 
                                    Color.WHITE
                                );
        branchesLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e)
            {
                // new Branches();
                frame.dispose();
            }
        });
        frame.add(branchesLabel);

        // ===================
        // ================== About Infracture ==================== //

        String text = """             
                <html>
                Welcome to Al-Zafran Khan Restaurant,<br>
                The Legacy of Khan's Family built in 2000<br>
                Established with a passion for excellence,<br>
                our hotel proudly continues a tradition of <br>
                exceptional hospitality. Every guest is welcomed<br>
                as part of our family and every stay<br>
                is crafted with care.Its branches are<br>
                in all over Pakistan.It is famous for its delecious<br>
                food taste.It is one of the biggest food<br>
                 bussiness in Pakistan.
                </html>
                """;

        JLabel welComeNote = label(text,
                50,
                100,
                450,
                290,
                Color.YELLOW);
        Timer timer = new Timer(10, null);
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
        ImageIcon icon = new ImageIcon("HomePage/owner.jpg");
        Image img = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(img));
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
