/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librery_management_system;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.UIManager;
import librery_management_system.commen.ButtonColor;

/**
 *
 * @author geeth
 */
public class MainDash extends javax.swing.JFrame {

    /**
     * Creates new form MainDash
     */
    public MainDash() {
        initComponents();
        screenSize();
        jScrollPane1.setVisible(false);
        btnClear.setVisible(false);
        txtSearchDash.grabFocus();
     
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btnMemberManagement = new javax.swing.JButton();
        btnAddNewBook = new javax.swing.JButton();
        btnIssueBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbAruna = new javax.swing.JLabel();
        lbLibrary = new javax.swing.JLabel();
        btnRetriveBook = new javax.swing.JButton();
        DashLeyed = new javax.swing.JLayeredPane();
        searchDash = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtSearchDash = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbMemberName = new javax.swing.JLabel();
        lbBook01 = new javax.swing.JLabel();
        lbReDate = new javax.swing.JLabel();
        lbBook02 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbCategory = new javax.swing.JLabel();
        lbAuthor = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        memberTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btnMemberManagement.setBackground(new java.awt.Color(0, 102, 204));
        btnMemberManagement.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnMemberManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnMemberManagement.setText("Members Management");
        btnMemberManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMemberManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMemberManagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMemberManagementMouseExited(evt);
            }
        });
        btnMemberManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberManagementActionPerformed(evt);
            }
        });

        btnAddNewBook.setBackground(new java.awt.Color(0, 102, 204));
        btnAddNewBook.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnAddNewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewBook.setText("Books Management");
        btnAddNewBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddNewBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewBookMouseExited(evt);
            }
        });
        btnAddNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBookActionPerformed(evt);
            }
        });

        btnIssueBook.setBackground(new java.awt.Color(0, 102, 204));
        btnIssueBook.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnIssueBook.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBook.setText("Issue Book");
        btnIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIssueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIssueBookMouseExited(evt);
            }
        });
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\geeth\\Downloads\\lbBook.png")); // NOI18N

        lbAruna.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lbAruna.setForeground(new java.awt.Color(255, 255, 255));
        lbAruna.setText("Aruna");
        lbAruna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbArunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbArunaMouseExited(evt);
            }
        });

        lbLibrary.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbLibrary.setForeground(new java.awt.Color(255, 255, 255));
        lbLibrary.setText("Library");
        lbLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLibraryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLibraryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAruna, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbLibrary)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbAruna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRetriveBook.setBackground(new java.awt.Color(0, 102, 204));
        btnRetriveBook.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnRetriveBook.setForeground(new java.awt.Color(255, 255, 255));
        btnRetriveBook.setText("Retrive Book");
        btnRetriveBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRetriveBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetriveBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetriveBookMouseExited(evt);
            }
        });
        btnRetriveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetriveBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMemberManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddNewBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRetriveBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMemberManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetriveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1010));

        DashLeyed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchDash.setBackground(new java.awt.Color(255, 255, 255));
        searchDash.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(204, 0, 51));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search Books");
        jLabel10.setOpaque(true);
        searchDash.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        txtSearchDash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSearchDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchDashMouseClicked(evt);
            }
        });
        txtSearchDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDashActionPerformed(evt);
            }
        });
        txtSearchDash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchDashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchDashKeyReleased(evt);
            }
        });
        searchDash.add(txtSearchDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 340, 40));

        btnSearch.setBackground(new java.awt.Color(0, 102, 204));
        btnSearch.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        searchDash.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 150, 50));

        list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        searchDash.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 340, 90));

        DashLeyed.add(searchDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 790, 240));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Details");
        jLabel1.setOpaque(true);

        lbMemberName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbMemberName.setText("Author");

        lbBook01.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbBook01.setText("Name");

        lbReDate.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbReDate.setText("Status");

        lbBook02.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbBook02.setText("Category");

        lbName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbName.setText(" ");

        lbCategory.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbCategory.setText(" ");

        lbAuthor.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbAuthor.setText(" ");

        lbStatus.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lbStatus.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbReDate)
                .addGap(85, 85, 85)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbMemberName)
                        .addGap(76, 76, 76)
                        .addComponent(lbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbBook02, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbBook01, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBook01)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBook02)
                    .addComponent(lbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMemberName)
                    .addComponent(lbAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReDate)
                    .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        DashLeyed.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, 250));

        btnClear.setBackground(new java.awt.Color(0, 102, 204));
        btnClear.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        DashLeyed.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 150, 50));

        jLayeredPane1.add(DashLeyed, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 1660, 1010));

        memberTitle.setBackground(new java.awt.Color(0, 102, 204));
        memberTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 60)); // NOI18N
        memberTitle.setForeground(new java.awt.Color(255, 255, 255));
        memberTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberTitle.setText("Dashboard");
        memberTitle.setOpaque(true);
        jLayeredPane1.add(memberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 0, 1660, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMemberManagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberManagementMouseEntered
           ButtonColor.buttonHiliter(btnMemberManagement);
    }//GEN-LAST:event_btnMemberManagementMouseEntered

    private void btnAddNewBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBookMouseEntered
       ButtonColor.buttonHiliter(btnAddNewBook);
    }//GEN-LAST:event_btnAddNewBookMouseEntered

    private void btnIssueBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBookMouseEntered
       ButtonColor.buttonHiliter(btnIssueBook);
    }//GEN-LAST:event_btnIssueBookMouseEntered

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed
        new Issue().setVisible(true);
    }//GEN-LAST:event_btnIssueBookActionPerformed

    private void btnMemberManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberManagementActionPerformed
        new MemberManegement().setVisible(true);
       
        
        
    }//GEN-LAST:event_btnMemberManagementActionPerformed

    private void btnMemberManagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberManagementMouseExited
      ButtonColor.defaultColor(btnMemberManagement);
    }//GEN-LAST:event_btnMemberManagementMouseExited

    private void btnAddNewBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBookMouseExited
        ButtonColor.defaultColor(btnAddNewBook);
    }//GEN-LAST:event_btnAddNewBookMouseExited

    private void btnIssueBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBookMouseExited
        ButtonColor.defaultColor(btnIssueBook);
    }//GEN-LAST:event_btnIssueBookMouseExited

    private void lbLibraryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLibraryMouseEntered
       lbAruna.setForeground(Color.YELLOW);
       lbLibrary.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbLibraryMouseEntered

    private void lbLibraryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLibraryMouseExited
       lbAruna.setForeground(Color.WHITE);
       lbLibrary.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbLibraryMouseExited

    private void lbArunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArunaMouseEntered
       lbAruna.setForeground(Color.YELLOW);
       lbLibrary.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbArunaMouseEntered

    private void lbArunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArunaMouseExited
       lbAruna.setForeground(Color.WHITE);
       lbLibrary.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbArunaMouseExited

    private void btnAddNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBookActionPerformed
     new BookManegement().setVisible(true);
      
        
    }//GEN-LAST:event_btnAddNewBookActionPerformed

    private void btnAddNewBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewBookMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            ResultSet serch = DB.serch("Select * from book_tb where book_id='"+txtSearchDash.getText().toUpperCase()+"'");
            if(serch.next()){
            lbName.setText(serch.getString("book_name"));
            lbAuthor.setText(serch.getString("author"));
            lbCategory.setText(serch.getString("category"));
            
            int count =serch.getInt("qty");
            if(count>0){
            lbStatus.setText("Available Book Count ="+count);
            btnClear.setVisible(true);
            }
            }else{
                System.out.println("rong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDashActionPerformed

    private void btnRetriveBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetriveBookMouseEntered
       btnRetriveBook.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnRetriveBookMouseEntered

    private void btnRetriveBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetriveBookMouseExited
        ButtonColor.defaultColor(btnRetriveBook);
    }//GEN-LAST:event_btnRetriveBookMouseExited

    private void btnRetriveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetriveBookActionPerformed
      new Retriue().setVisible(true);
    }//GEN-LAST:event_btnRetriveBookActionPerformed

    private void txtSearchDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchDashMouseClicked

    }//GEN-LAST:event_txtSearchDashMouseClicked

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
   if(evt.getClickCount()==2){
           txtSearchDash.setText(list1.getSelectedValue().split("-")[0]);
           jScrollPane1.setVisible(false);
          
       }
    }//GEN-LAST:event_list1MouseClicked

    private void txtSearchDashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDashKeyPressed
        
    }//GEN-LAST:event_txtSearchDashKeyPressed

    private void txtSearchDashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDashKeyReleased
              try {
                  if(txtSearchDash.getText().toUpperCase().contains("BN")){
                       jScrollPane1.setVisible(true);
      ResultSet rs=  DB.serch("select * from book_tb where book_id  like '"+txtSearchDash.getText().toUpperCase()+"%'"); 
        Vector v = new Vector();
        while(rs.next()){
        v.add(rs.getString("book_id")+"-"+rs.getString("book_name"));
        }
        list1.setListData(v);
                  }else{
                       jScrollPane1.setVisible(true);
                    ResultSet rs=  DB.serch("select * from book_tb where book_name like '"+txtSearchDash.getText().toUpperCase()+"%'"); 
        Vector v = new Vector();
        while(rs.next()){
        v.add(rs.getString("book_id")+"-"+rs.getString("book_name"));
        }
        list1.setListData(v);
                  }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_txtSearchDashKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     txtSearchDash.setText(null);
     lbStatus.setText(null);
     lbAuthor.setText(null);
     lbName.setText(null);
     lbCategory.setText(null);
     btnClear.setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          try {
          UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDash().setVisible(true);
            }
        });
    }

    private void screenSize() {
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane DashLeyed;
    private javax.swing.JButton btnAddNewBook;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JButton btnMemberManagement;
    private javax.swing.JButton btnRetriveBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAruna;
    private javax.swing.JLabel lbAuthor;
    private javax.swing.JLabel lbBook01;
    private javax.swing.JLabel lbBook02;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbLibrary;
    private javax.swing.JLabel lbMemberName;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbReDate;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JList<String> list1;
    private javax.swing.JLabel memberTitle;
    private javax.swing.JPanel searchDash;
    private javax.swing.JTextField txtSearchDash;
    // End of variables declaration//GEN-END:variables
   
  
}
