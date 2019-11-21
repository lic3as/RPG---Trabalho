
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class Level13 extends javax.swing.JFrame {

    public Level13() {
        initComponents();
        setTitle("Super Mario - Level 13");
        setSize(790,480);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
        
            //----LABELS----//
        levelup.setVisible(false);
        gameover.setVisible(false);
    }

    
     public void moeda(){
        URL som = getClass().getResource("../sounds/Coin Sound.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.play();
    }
     
    public void gameover(){
        URL som = getClass().getResource("../sounds/GAME OVER.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.play();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        levelup = new javax.swing.JLabel();
        gameover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 310, 116, 104);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 310, 60, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 304, 60, 100);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 310, 60, 90);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 310, 116, 104);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\koopatroopa.gif")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 320, 70, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mario1.gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 290, 120, 130);

        levelup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fffff.gif"))); // NOI18N
        getContentPane().add(levelup);
        levelup.setBounds(540, 30, 220, 130);

        gameover.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\gameover2.gif")); // NOI18N
        getContentPane().add(gameover);
        gameover.setBounds(530, 80, 250, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fases/fase13.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 520, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta 13.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta 13 b.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 130, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cenario23.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -5, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        moeda();
        levelup.setVisible(true);
        JOptionPane.showMessageDialog(null,"Isso mesmo. Provavelmente eles estão ajudando Bowser,que deve estar por perto. \nContinue...");
        dispose();
        new Level14().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        gameover();
        gameover.setVisible(true);
        JOptionPane.showMessageDialog(null,"Talvez você estaja querendo ser sorrateiro demais... Tenha cuidado mas não se esconda. \nProvavelmente Bowser está tendo a ajuda dos Koopa Troopa. GAME OVER.");
        dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Level13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel levelup;
    // End of variables declaration//GEN-END:variables
}
