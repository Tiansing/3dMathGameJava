/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Lbby.java
 *
 * Created on Mar 7, 2020, 12:37:56 PM
 */

package gaime;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Lbby extends javax.swing.JFrame {

    /** Creates new form Lbby */
    public Lbby() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        abs = new javax.swing.JLabel();
        pl = new javax.swing.JLabel();
        ex = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/jinAVA.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 220, 280);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/circleeffect.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-90, 200, 430, 130);

        abs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/txt/ab1.png"))); // NOI18N
        abs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                absMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                absMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                absMouseExited(evt);
            }
        });
        jPanel1.add(abs);
        abs.setBounds(210, 130, 270, 80);

        pl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/txt/pl1.png"))); // NOI18N
        pl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plMouseExited(evt);
            }
        });
        jPanel1.add(pl);
        pl.setBounds(210, 50, 270, 80);

        ex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/txt/ex1.png"))); // NOI18N
        ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exMouseExited(evt);
            }
        });
        jPanel1.add(ex);
        ex.setBounds(220, 220, 270, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/lby.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 380);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-517)/2, (screenSize.height-421)/2, 517, 421);
    }// </editor-fold>//GEN-END:initComponents

    private void plMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plMouseEntered
ImageIcon sec = new ImageIcon(getClass().getResource("/txt/pl2.png"));
pl.setIcon(sec);
    }//GEN-LAST:event_plMouseEntered

    private void plMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plMouseExited
ImageIcon sec = new ImageIcon(getClass().getResource("/txt/pl1.png"));
pl.setIcon(sec);
    }//GEN-LAST:event_plMouseExited

    private void absMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absMouseEntered
     ImageIcon sec = new ImageIcon(getClass().getResource("/txt/ab2.png"));
     abs.setIcon(sec);
    }//GEN-LAST:event_absMouseEntered

    private void absMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absMouseExited
ImageIcon sec= new ImageIcon(getClass().getResource("/txt/ab1.png"));
abs.setIcon(sec);
    }//GEN-LAST:event_absMouseExited

    private void exMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseEntered
ImageIcon sec1= new ImageIcon(getClass().getResource("/txt/ex2.png"));
ex.setIcon(sec1);
    }//GEN-LAST:event_exMouseEntered

    private void exMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseExited
ImageIcon sec1= new ImageIcon(getClass().getResource("/txt/ex1.png"));
ex.setIcon(sec1);
    }//GEN-LAST:event_exMouseExited

    private void plMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plMouseClicked
entr en = new entr();
en.show();
this.dispose();
    }//GEN-LAST:event_plMouseClicked

    private void absMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absMouseClicked
new abt().setVisible(true);
this.hide();
    }//GEN-LAST:event_absMouseClicked

    private void exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseClicked
 if( JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?","Quit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){

          System.exit(0);
        }
    }//GEN-LAST:event_exMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lbby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abs;
    private javax.swing.JLabel ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pl;
    // End of variables declaration//GEN-END:variables

}
