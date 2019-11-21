
package rpg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Levels extends javax.swing.JFrame {

    public Levels() {
        initComponents();
        setTitle("Super Mario - Levels");
        setSize(790,480);
        //largura, altura//
        setResizable(false);
        setLocationRelativeTo(this);
    }

      public void somentrada(){
        URL som = getClass().getResource("../sounds/entrada.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.play();
    }
   
     
      
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        missao1 = new javax.swing.JLabel();
        missao2 = new javax.swing.JLabel();
        missao3 = new javax.swing.JLabel();
        missao4 = new javax.swing.JLabel();
        missao15 = new javax.swing.JLabel();
        missao7 = new javax.swing.JLabel();
        missao8 = new javax.swing.JLabel();
        missao9 = new javax.swing.JLabel();
        missao10 = new javax.swing.JLabel();
        missao11 = new javax.swing.JLabel();
        missao12 = new javax.swing.JLabel();
        missao13 = new javax.swing.JLabel();
        missao14 = new javax.swing.JLabel();
        missao5 = new javax.swing.JLabel();
        missao6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(350, 110, 70, 60);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(630, 290, 60, 60);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel33);
        jLabel33.setBounds(560, 290, 60, 60);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(490, 290, 60, 60);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(420, 290, 60, 60);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(350, 290, 60, 60);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(630, 200, 60, 60);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(560, 200, 60, 60);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(490, 200, 60, 60);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(420, 200, 60, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(350, 200, 70, 60);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(630, 110, 60, 60);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(560, 110, 60, 60);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(490, 110, 60, 60);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(420, 110, 70, 60);

        missao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box1.png"))); // NOI18N
        missao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao1MouseClicked(evt);
            }
        });
        getContentPane().add(missao1);
        missao1.setBounds(350, 110, 60, 60);

        missao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box2.png"))); // NOI18N
        missao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao2MouseClicked(evt);
            }
        });
        getContentPane().add(missao2);
        missao2.setBounds(420, 110, 60, 60);

        missao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box3.png"))); // NOI18N
        missao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao3MouseClicked(evt);
            }
        });
        getContentPane().add(missao3);
        missao3.setBounds(490, 110, 70, 60);

        missao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box4.png"))); // NOI18N
        missao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao4MouseClicked(evt);
            }
        });
        getContentPane().add(missao4);
        missao4.setBounds(560, 110, 60, 60);

        missao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box15.png"))); // NOI18N
        missao15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao15MouseClicked(evt);
            }
        });
        getContentPane().add(missao15);
        missao15.setBounds(630, 290, 60, 60);

        missao7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box7.png"))); // NOI18N
        missao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao7MouseClicked(evt);
            }
        });
        getContentPane().add(missao7);
        missao7.setBounds(420, 200, 60, 60);

        missao8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box8.png"))); // NOI18N
        missao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao8MouseClicked(evt);
            }
        });
        getContentPane().add(missao8);
        missao8.setBounds(490, 200, 60, 60);

        missao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        missao9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box9.png"))); // NOI18N
        missao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao9MouseClicked(evt);
            }
        });
        getContentPane().add(missao9);
        missao9.setBounds(560, 200, 60, 60);

        missao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box10.png"))); // NOI18N
        missao10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao10MouseClicked(evt);
            }
        });
        getContentPane().add(missao10);
        missao10.setBounds(630, 200, 60, 60);

        missao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box11.png"))); // NOI18N
        missao11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao11MouseClicked(evt);
            }
        });
        getContentPane().add(missao11);
        missao11.setBounds(350, 290, 60, 60);

        missao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box12.png"))); // NOI18N
        missao12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao12MouseClicked(evt);
            }
        });
        getContentPane().add(missao12);
        missao12.setBounds(420, 290, 60, 60);

        missao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box13.png"))); // NOI18N
        missao13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao13MouseClicked(evt);
            }
        });
        getContentPane().add(missao13);
        missao13.setBounds(490, 290, 60, 60);

        missao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box14.png"))); // NOI18N
        missao14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao14MouseClicked(evt);
            }
        });
        getContentPane().add(missao14);
        missao14.setBounds(560, 290, 60, 60);

        missao5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box5.png"))); // NOI18N
        missao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao5MouseClicked(evt);
            }
        });
        getContentPane().add(missao5);
        missao5.setBounds(630, 110, 60, 60);

        missao6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box6.png"))); // NOI18N
        missao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missao6MouseClicked(evt);
            }
        });
        getContentPane().add(missao6);
        missao6.setBounds(350, 200, 60, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MISSÕES.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(550, 20, 240, 60);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 390, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/niveis.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -11, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
      dispose();
      new Inicio().setVisible(true);
      
    }//GEN-LAST:event_jLabel17MouseClicked

    private void missao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao1MouseClicked
        dispose();
        new Level1().setVisible(true);
    }//GEN-LAST:event_missao1MouseClicked

    private void missao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao2MouseClicked
         dispose();
        new Level2().setVisible(true);
    }//GEN-LAST:event_missao2MouseClicked

    private void missao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao3MouseClicked
        dispose();
        new Level3().setVisible(true);
    }//GEN-LAST:event_missao3MouseClicked

    private void missao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao4MouseClicked
         dispose();
        new Level4().setVisible(true);
    }//GEN-LAST:event_missao4MouseClicked

    private void missao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao5MouseClicked
         dispose();
        new Level5().setVisible(true);
    }//GEN-LAST:event_missao5MouseClicked

    private void missao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao6MouseClicked
        dispose();
        new Level6().setVisible(true);
    }//GEN-LAST:event_missao6MouseClicked

    private void missao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao7MouseClicked
        dispose();
        new Level7().setVisible(true);
    }//GEN-LAST:event_missao7MouseClicked

    private void missao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao8MouseClicked
       dispose();
        new Level8().setVisible(true);
    }//GEN-LAST:event_missao8MouseClicked

    private void missao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao9MouseClicked
        dispose();
        new Level9().setVisible(true);
    }//GEN-LAST:event_missao9MouseClicked

    private void missao10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao10MouseClicked
         dispose();
        new Level10().setVisible(true);
    }//GEN-LAST:event_missao10MouseClicked

    private void missao11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao11MouseClicked
        dispose();
        new Level11().setVisible(true);
    }//GEN-LAST:event_missao11MouseClicked

    private void missao12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao12MouseClicked
         dispose();
        new Level12().setVisible(true);
    }//GEN-LAST:event_missao12MouseClicked

    private void missao13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao13MouseClicked
         dispose();
        new Level13().setVisible(true);
    }//GEN-LAST:event_missao13MouseClicked

    private void missao14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao14MouseClicked
         dispose();
        new Level14().setVisible(true);
    }//GEN-LAST:event_missao14MouseClicked

    private void missao15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missao15MouseClicked
         dispose();
        new Level15().setVisible(true);
    }//GEN-LAST:event_missao15MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Levels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel missao1;
    private javax.swing.JLabel missao10;
    private javax.swing.JLabel missao11;
    private javax.swing.JLabel missao12;
    private javax.swing.JLabel missao13;
    private javax.swing.JLabel missao14;
    private javax.swing.JLabel missao15;
    private javax.swing.JLabel missao2;
    private javax.swing.JLabel missao3;
    private javax.swing.JLabel missao4;
    private javax.swing.JLabel missao5;
    private javax.swing.JLabel missao6;
    private javax.swing.JLabel missao7;
    private javax.swing.JLabel missao8;
    private javax.swing.JLabel missao9;
    // End of variables declaration//GEN-END:variables
}
