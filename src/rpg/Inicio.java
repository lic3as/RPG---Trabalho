
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public final class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        setTitle("Super Mario - Deluxe");
        setSize(790,490);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
        sominicio();
    }
    public void sominicio(){
        URL som = getClass().getResource("../sounds/Super Mario som.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.loop();
    }

   
    public void começar(){
        URL som = getClass().getResource("../sounds/Let's GO.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.play();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jogar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 260, 190, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SOBRE.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 330, 200, 70);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(570, 400, 190, 60);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ggg.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(790, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(790, 480));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new Levels().setVisible(true);
        começar();     
       
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        new Sobre1().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        int opc = JOptionPane.showConfirmDialog(null,"Deseja sair?");
        
        if(opc==0){
        System.exit(0);
        }
    }//GEN-LAST:event_sairMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables
}
