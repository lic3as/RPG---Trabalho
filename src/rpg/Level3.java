
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class Level3 extends javax.swing.JFrame {

    public Level3() {
        initComponents();
         setTitle("Super Mario - Level 3");
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

        jLabel5 = new javax.swing.JLabel();
        mario = new javax.swing.JLabel();
        levelup = new javax.swing.JLabel();
        gameover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\seta11.gif")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 90, 90, 100);

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mario1.gif"))); // NOI18N
        getContentPane().add(mario);
        mario.setBounds(300, 170, 120, 130);

        levelup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fffff.gif"))); // NOI18N
        getContentPane().add(levelup);
        levelup.setBounds(540, 30, 220, 130);

        gameover.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\gameover2.gif")); // NOI18N
        getContentPane().add(gameover);
        gameover.setBounds(530, 80, 250, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fases/fase3.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 350, 520, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 3 B.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 290, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 3.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 290, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cena2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -5, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        moeda();
        levelup.setVisible(true);
        JOptionPane.showMessageDialog(null,"Ótima escolha! Havia uma planta piranha lá dentro, \nalém disso, a princesa Peach precisa de você. Rápido!");
        dispose();
        new Level4().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        gameover();
        gameover.setVisible(true);
        JOptionPane.showMessageDialog(null, "Oh não, uma armadilha! Não havia moeda nenhuma, apenas uma planta piranha dentro do cano e, /nlembrando, ela é carnívora. GAME OVER.");
        dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel levelup;
    private javax.swing.JLabel mario;
    // End of variables declaration//GEN-END:variables
}
