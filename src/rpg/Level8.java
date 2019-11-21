
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class Level8 extends javax.swing.JFrame {

    public Level8() {
        initComponents();
        setTitle("Super Mario - Level 8");
        setSize(790,480);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
        
            //----LABELS----//
        levelup.setVisible(false);
        gameover.setVisible(false);
        bro.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        bro = new javax.swing.JLabel();
        mario = new javax.swing.JLabel();
        coisaverde = new javax.swing.JLabel();
        levelup = new javax.swing.JLabel();
        gameover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\seta11.gif")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 290, 90, 100);

        bro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2000.gif"))); // NOI18N
        bro.setText("jLabel7");
        getContentPane().add(bro);
        bro.setBounds(470, 320, 170, 100);

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mario1.gif"))); // NOI18N
        getContentPane().add(mario);
        mario.setBounds(290, 220, 120, 130);

        coisaverde.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\personagens\\green.gif")); // NOI18N
        getContentPane().add(coisaverde);
        coisaverde.setBounds(520, 380, 120, 130);

        levelup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fffff.gif"))); // NOI18N
        getContentPane().add(levelup);
        levelup.setBounds(540, 30, 220, 130);

        gameover.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Desktop\\RPG MARIO\\GIFS\\gameover2.gif")); // NOI18N
        getContentPane().add(gameover);
        gameover.setBounds(530, 80, 250, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fases/fase8.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 520, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta 8.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta 8 B.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 130, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cena3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -5, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        gameover();
        gameover.setVisible(true);
        JOptionPane.showMessageDialog(null,"Que azar! Aquele era Luigi com seu uniforme verde, você o perdeu. \nGAME OVER.");
        dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        moeda();
        levelup.setVisible(true);
        bro.setVisible(true);
        mario.setVisible(false);
        coisaverde.setVisible(false);
        jLabel7.setVisible(false);
        JOptionPane.showMessageDialog(null,"Você encontrou Luigi com seu uniforme verde, \nele disse que também estava a sua procura e irá ajudar na missão. Continuem...");
        dispose();
        
        new Level9().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Level8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bro;
    private javax.swing.JLabel coisaverde;
    private javax.swing.JLabel gameover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel levelup;
    private javax.swing.JLabel mario;
    // End of variables declaration//GEN-END:variables
}
