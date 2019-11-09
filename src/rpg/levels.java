
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class levels extends javax.swing.JFrame {

    public levels() {
        initComponents();
        setTitle("Super Mario - Levels");
        setSize(790,480);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 110, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box3.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 110, 70, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box4.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 110, 60, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box15.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 290, 60, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box7.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 200, 60, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box8.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 200, 60, 60);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box9.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 200, 60, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box10.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(630, 200, 60, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box11.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 290, 60, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box12.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(420, 290, 60, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box13.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(490, 290, 60, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box14.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 290, 60, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box5.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(630, 110, 60, 60);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box6.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(350, 200, 60, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MISSÕES.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(550, 20, 240, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 390, 180, 60);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aaa.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(590, 390, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/niveis.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -11, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new levels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
