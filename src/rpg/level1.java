
package rpg;

import javax.swing.JOptionPane;

public class level1 extends javax.swing.JFrame {

    public level1() {
        initComponents();
        setTitle("Super Mario - Level 1");
        setSize(790,480);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fases/FASE1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 520, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 260, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/respostas/resposta da 1 B.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 130, 250, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cenario1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -5, 800, 480);

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
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
