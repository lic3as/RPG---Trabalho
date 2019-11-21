
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public final class Level1 extends javax.swing.JFrame {

    public Level1() {
        initComponents();
        
        setTitle("Super Mario - Level 1");
        setSize(790,470);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
        entradagif.setVisible(true);
        pronto.setVisible(true);
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

        pronto = new javax.swing.JLabel();
        entradagif = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gameover = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        levelup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PRONTO.png"))); // NOI18N
        pronto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prontoMouseClicked(evt);
            }
        });
        getContentPane().add(pronto);
        pronto.setBounds(570, 370, 210, 60);

        entradagif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kkkk.gif"))); // NOI18N
        entradagif.setText("jLabel5");
        getContentPane().add(entradagif);
        entradagif.setBounds(0, 0, 800, 450);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bowser&peach.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 200, 220, 270);

        gameover.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\gameover2.gif")); // NOI18N
        getContentPane().add(gameover);
        gameover.setBounds(540, 80, 250, 60);

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fases/FASE1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 520, 100);

        levelup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fffff.gif"))); // NOI18N
        getContentPane().add(levelup);
        levelup.setBounds(550, 50, 240, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 1 B.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 130, 250, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cena1.png"))); // NOI18N
        background.setText("jLabel2");
        getContentPane().add(background);
        background.setBounds(0, -5, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        gameover.setVisible(true);
        gameover();
        JOptionPane.showMessageDialog(null,"Esse é o reino da princesa Peach e o castelo do Bowser não se encontra aqui, \nentão esse não é o melhor lugar para começarmos. GAME OVER.");
        dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    levelup.setVisible(true);
    moeda();
    JOptionPane.showMessageDialog(null,"Jogada esperta! O Bowser é o rei do Reino dos Koopas e o seu castelo está lá.\n Agora vamos para o próximo nível...");
    dispose();
    new Level2().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void prontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prontoMouseClicked
       entradagif.setVisible(false);
       pronto.setVisible(false);
    }//GEN-LAST:event_prontoMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel entradagif;
    private javax.swing.JLabel gameover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel levelup;
    private javax.swing.JLabel pronto;
    // End of variables declaration//GEN-END:variables
}
