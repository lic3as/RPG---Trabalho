
package rpg;

public class Sobre1 extends javax.swing.JFrame {

    public Sobre1() {
        initComponents();
        setTitle("Super Mario - Sobre");
        setSize(790,490);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 10, 180, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noisk.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 280, 240);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pedro Lucas\\Downloads\\ezgif.com-resize (1).gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 90, 440, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alice e pedro.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 330, 280, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -5, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        dispose();
        new Inicio().setVisible(true);

    }//GEN-LAST:event_jLabel17MouseClicked

    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sobre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
