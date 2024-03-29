/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode_image;
import encode_image.entity.ImageCipher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zGararz
 */
public class Main extends javax.swing.JFrame {
    
    private String imagePath = "";
    private String a = "";
    private String b = "";
    private BufferedImage outputImage;
    private boolean enable = true;
    
    public Main() {
        initComponents();
        jLabelImage.setIcon(new ImageIcon("draw/add1.png"));
        jButtonExecute.requestFocus();     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jPanelImage = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonExecute = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Encryption");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jTextFieldA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("a");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("b");

        jTextFieldB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jTextFieldB))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelImage.setBackground(new java.awt.Color(220, 220, 220));
        jPanelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jLabelImage.setBackground(new java.awt.Color(220, 220, 220));
        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\zGararz\\Documents\\NetBeansProjects\\Encode_Image\\draw\\add1.png")); // NOI18N
        jLabelImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImageMouseMoved(evt);
            }
        });
        jLabelImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encrypt", "Decrypt" }));

        jButtonExecute.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonExecute.setText("Execute");
        jButtonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setPreferredSize(new java.awt.Dimension(97, 31));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExecute)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExecute))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jLabelImageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMouseMoved
       if (enable) {
            jLabelImage.setIcon(new ImageIcon("draw/add1.png"));
            jPanelImage.setBackground(new Color(200, 200, 200));
       }
    }//GEN-LAST:event_jLabelImageMouseMoved

    private void jLabelImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMouseExited
       if (enable) {
            jLabelImage.setIcon(new ImageIcon("draw/add.png"));
            jPanelImage.setBackground(new Color(250, 250, 250)); 
       }   
    }//GEN-LAST:event_jLabelImageMouseExited

    private void jLabelImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMouseClicked
       
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "png", "jpg", "jpeg");
        
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){ 
            File file = chooser.getSelectedFile();
            imagePath = file.getAbsolutePath();
            jLabelImage.setIcon(resizeImage(imagePath));
            enable = false;
        }  
    }//GEN-LAST:event_jLabelImageMouseClicked

    private void jButtonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteActionPerformed
        
        a = jTextFieldA.getText();
        b = jTextFieldB.getText();
        
        if(a.matches("^[0].[0-9]*") && b.matches("^[0].[0-9]*")) {
                  if (!imagePath.isEmpty()) {
                    if(jComboBox1.getSelectedIndex() == 0){
                    System.out.println("Encyption");
                     try {                                          
                        outputImage = ImageCipher.encode(imagePath, Double.parseDouble(a), Double.parseDouble(b));
                         
                           if (outputImage != null) {
                                jLabelImage.setIcon(resizeImage(outputImage));
                                JOptionPane.showMessageDialog(this, "Encrypted!");
                            }        
                     } catch (Exception ex) {
                         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this, "Error!");
                     }                            
                }else{
                    System.out.println("Decryption");
                    try {     
                        outputImage = ImageCipher.decode(imagePath, Double.parseDouble(a), Double.parseDouble(b));
                        
                        if (outputImage != null) {
                                jLabelImage.setIcon(resizeImage(outputImage));
                                JOptionPane.showMessageDialog(this, "Decrypted!");
                            }  
                     } catch (Exception ex) {
                         Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this, "Error!");
                     }
                }
        }
        }else{
            JOptionPane.showMessageDialog(this, " a, b ∈ (0, 1).");
        }
    }//GEN-LAST:event_jButtonExecuteActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "png", "jpg", "jpeg");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(this);
        
        if(result == JFileChooser.APPROVE_OPTION){ 
            try {
                File file = chooser.getSelectedFile();
                ImageIO.write(outputImage, "png", file);
                
                String fileName = getFileName(chooser.getCurrentDirectory().getAbsolutePath(), file.getAbsolutePath());
                String baseName = chooser.getCurrentDirectory().getAbsolutePath() + "\\" + fileName;              
                JOptionPane.showMessageDialog(this, "Saved!");
                jLabelImage.setIcon(new ImageIcon("draw/add.png"));
                enable = true;
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error!");
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBActionPerformed
    
    private ImageIcon resizeImage(String path){
        
        ImageIcon icon = new ImageIcon(path);
        
        float ratio1 = (float) icon.getIconWidth()/icon.getIconHeight();
        float ratio2 = (float) jLabelImage.getWidth()/jLabelImage.getHeight();
        ratio = ratio1;
        
        Image image;
        if(ratio1 > ratio2+0.1){
            image = icon.getImage().getScaledInstance(jLabelImage.getWidth(), (int) (jLabelImage.getWidth()/ratio1), Image.SCALE_SMOOTH);
        }
        else{
            if(ratio1 < ratio2-0.1){
                
                image = icon.getImage().getScaledInstance((int) (jLabelImage.getHeight()*ratio1), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
        }
            else{
                image = icon.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
            }
        }
              
        return new ImageIcon(image);      
    }
    
    float ratio;
    private ImageIcon resizeImage(BufferedImage img){
            
        float ratio2 = (float) jLabelImage.getWidth()/jLabelImage.getHeight();       
        Image image;
        if(ratio > ratio2+0.1){
            image = img.getScaledInstance(jLabelImage.getWidth(), (int) (jLabelImage.getWidth()/ratio), Image.SCALE_SMOOTH);
        }
        else{
            if(ratio < ratio2-0.1){
                
                image = img.getScaledInstance((int) (jLabelImage.getHeight()*ratio), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
        }
            else{
                image = img.getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
            }
        }
               
        return new ImageIcon(image);
        
    }
    
    public String getFileName(String directory, String path) {
        String[] spitPath= path.split("\\\\");
        String[] spitDirectory = directory.split("\\\\");
        String fileName = spitPath[spitDirectory.length];

        return fileName.split("\\.")[0];
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExecute;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    // End of variables declaration//GEN-END:variables
}
