// package Database;

// import javax.swing.*;

// import HomePage.Dashboard;
// import HomePage.HotelBranches;

// import java.awt.*;
// import java.awt.event.*;

// public class HomePage {

//     public HomePage() {
//         JFrame frame = new JFrame("History");
//         frame.setVisible(true);
//         frame.getContentPane().setBackground(Color.BLACK);
//         frame.setSize(1300, 1300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(null);

//         // ================== ABOUT ======================= //
//         JLabel aboutLabel = label("About Hotel", 100, 30, 180, 30);
//         aboutLabel.addMouseListener(new MouseAdapter() {
            
//             public void mouseEntered(MouseEvent e)
//             {
//                 // new AboutHotel();
//                 frame.dispose();
//             }   
//         });
//         frame.add(aboutLabel);

//         // ================== Branches ======================= //
//         JLabel branchesLabel = label("Hotel Branches", 
//                                     250, 
//                                     30, 
//                                     180,
//                                     30, 
                                 
//                                 );
//         branchesLabel.addMouseListener(new MouseAdapter() {
//             public void mouseEntered(MouseEvent e)
//             {
//                 new HotelBranches();
//                 frame.dispose();
//             }
//         });
//         frame.add(branchesLabel);

//         // ================== DASHOARD ========================== //
//         JLabel dashboardLabel = label("Dashboard", 430, 30, 120, 30);
//         dashboardLabel.addMouseListener(new MouseAdapter() {
//             public void mouseEntered(MouseEvent e)
//             {
//                 new Dashboard();
//                 frame.dispose();
//             }
//         });
//         frame.add(dashboardLabel);

//         // ================== About Infracture ==================== //

//         String text = """             
//                 <html>
//                 Welcome to Al-Zafran Khan Restaurant,<br>
//                 The Legacy of Khan's Family built in 2000<br>
//                 Established with a passion for excellence,<br>
//                 our hotel proudly continues a tradition of <br>
//                 exceptional hospitality. Every guest is welcomed<br>
//                 as part of our family and every stay<br>
//                 is crafted with care.Its branches are<br>
//                 in all over Pakistan.It is famous for its delecious<br>
//                 food taste.It is one of the biggest food<br>
//                 bussiness in Pakistan.
//                 </html>
//                 """;

//         JLabel welComeNote = label(text,
//                 50,
//                 100,
//                 450,
//                 290
//                 );
//         Timer timer = new Timer(100, null);
//         timer.addActionListener(new ActionListener() {

//             int index = 0;

//             public void actionPerformed(ActionEvent e) {
//                 if (index < text.length()) {
//                     welComeNote.setText(text.substring(0, index + 1));
//                     index++;
//                 } else {
//                     timer.stop();
//                 }
//             }
//         });

//         timer.start();
//         frame.add(welComeNote);

//         // ====================== OWNER NAME ================== //
//         JLabel onwerLabel = label("<html> Owner <br>Zafran Khan</br> </html>",
//                 950, 70, 300, 100);
//         frame.add(onwerLabel);
//         // ====================== IMAGE ====================== //
//         ImageIcon icon = new ImageIcon("HomePage/owner.jpg");
//         Image img = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
//         JLabel label = new JLabel(new ImageIcon(img));
//         label.setBounds(900, 150, 200, 250);
//         frame.add(label);

//         String imges[][] = {
//                  {
//                 "HomePage/dinner.png"  , "HomePage/front.png",
//                 "HomePage/hotelName.png" , "HomePage/location.png"
//                  },
//                  {
//                     "HomePage/image.png" , "HomePage/reception.png" ,
//                     "HomePage/room.png" , "HomePage/owner.jpg"
//                  }
//         };

//         for (int i=0; i<imges.length; i++)
//         {
//             for (int j=0; j<imges[i].length; j++)
//             {
//                 JLabel book = createImage(
//                                                 imges[i][j],
//                                                 i * 250,
//                                                 j * 350,
//                                                 220,
//                                                 300);
//                           frame.add(book);
//             }
//         }
        
//     }

//     // ======================== LABEL METHOD LOGIC ====================== //
//     JLabel label(String text, int x, int y, int width, int height) {
//         JLabel lbl = new JLabel(text);
//         lbl.setBounds(x, y, width, height);
//         lbl.setFont(new Font("Arial", Font.BOLD, 18));
//         lbl.setForeground(Color.WHITE);
//         lbl.setLayout(null);
//         lbl.addMouseListener(new MouseAdapter() {

//             public void mouseEntered(MouseEvent e) {
//                 lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                
//             }
//         });

//         return lbl;
//     }
//         public JLabel createImage(String path, int x, int y, int width, int height) {

//                 ImageIcon icon = new ImageIcon(path);

//                 Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

//                 JLabel label = new JLabel(new ImageIcon(img));

//                 label.setBounds(x, y, width, height);

//                 return label;
//         }
//     }


