
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

<<<<<<< HEAD
public final class Victory extends javax.swing.JFrame {
=======
public class Victory extends javax.swing.JFrame {
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97

    public Victory() {
        initComponents();
        setTitle("Super Mario - VICTORY!");
        setSize(800,470);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
        sommario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
=======
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

<<<<<<< HEAD
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MISSÕES.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(560, 20, 240, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
=======
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair_1.png"))); // NOI18N
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
<<<<<<< HEAD
        jLabel2.setBounds(30, 380, 200, 60);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 360, 200, 60);
=======
        jLabel2.setBounds(30, 360, 200, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MISSÕES.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(560, 20, 240, 60);
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Meu-Vídeo.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       int opc = JOptionPane.showConfirmDialog(null,"Deseja iniciar um novo jogo?");
       
       if(opc == 0){
           dispose();
           new Inicio().setVisible(true);
       }
       if(opc == 1){
           System.exit(0);
           
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       dispose();
       new LevelsWin().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

<<<<<<< HEAD
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int opc = JOptionPane.showConfirmDialog(null,"Deseja iniciar um novo jogo?");

        if(opc == 0){
            dispose();
            new Inicio().setVisible(true);
        }
        if(opc == 1){
            System.exit(0);

        }
    }//GEN-LAST:event_jLabel3MouseClicked

=======
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97
    
    public void sommario(){
        URL som = getClass().getResource("../sounds/See You.wav");
        AudioClip play = Applet.newAudioClip(som);
<<<<<<< HEAD
        play.loop();
=======
        play.play();
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97
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
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Victory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Victory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel3;
=======
>>>>>>> c9d80be6693f8d6c1f9f126fa3e3c6a838c54e97
    // End of variables declaration//GEN-END:variables
}
