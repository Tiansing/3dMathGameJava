/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * stage2.java
 *
 * Created on Mar 3, 2020, 8:16:10 PM
 */

package gaime;


import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Admin
 */
public class stage2 extends javax.swing.JFrame {
int enemy = 10;
int def=5;
 Timer t;

 static int k;

static int tout=5;
static Timer tr;

 static int interv=50;
 static Timer timr;
    /** Creates new form stage2 */
    public stage2() {
        initComponents();
     btnsub.setVisible(false);



jinA.setVisible(false);
correct.setVisible(false);
jinAW.setVisible(false);
wrong.setVisible(false);

       megAw.setVisible(false);
megA.setVisible(false);

 prog.setValue(enemy);
prog.setMaximum(enemy);

prog1.setValue(def);
prog1.setMaximum(def);
    }
public void Random(){
    int ad1 = (int)(Math.random()*1000)+100;
        int ad2 =(int)(Math.random()*1000)+100;

        s1.setText(Integer.toString(ad1));
        s2.setText(Integer.toString(ad2));

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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        prog1 = new javax.swing.JProgressBar();
        prog = new javax.swing.JProgressBar();
        lblst = new javax.swing.JLabel();
        oras = new javax.swing.JLabel();
        megP = new javax.swing.JLabel();
        megA = new javax.swing.JLabel();
        megAw = new javax.swing.JLabel();
        jinP = new javax.swing.JLabel();
        jinAW = new javax.swing.JLabel();
        jinA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ans = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        s2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnsub = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        correct = new javax.swing.JPanel();
        s3 = new javax.swing.JLabel();
        wrong = new javax.swing.JPanel();
        s4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 820, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        prog1.setBackground(new java.awt.Color(0, 0, 204));
        prog1.setForeground(new java.awt.Color(51, 255, 51));
        prog1.setMaximum(10);
        prog1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prog1.setBorderPainted(false);
        jPanel2.add(prog1);
        prog1.setBounds(70, 10, 290, 30);

        prog.setBackground(new java.awt.Color(0, 0, 204));
        prog.setForeground(new java.awt.Color(51, 255, 51));
        prog.setMaximum(10);
        prog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prog.setBorderPainted(false);
        jPanel2.add(prog);
        prog.setBounds(490, 10, 290, 30);

        lblst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/button.gif"))); // NOI18N
        lblst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblstMouseClicked(evt);
            }
        });
        jPanel2.add(lblst);
        lblst.setBounds(340, -10, 170, 150);

        oras.setFont(new java.awt.Font("Courier New", 1, 36));
        oras.setForeground(new java.awt.Color(255, 255, 255));
        oras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oras.setText("50");
        jPanel2.add(oras);
        oras.setBounds(370, 0, 110, 70);

        megP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KASUMI/kasuP_1.gif"))); // NOI18N
        jPanel2.add(megP);
        megP.setBounds(440, 50, 250, 360);

        megA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        megA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KASUMI/kasuA.gif"))); // NOI18N
        jPanel2.add(megA);
        megA.setBounds(220, -10, 600, 400);

        megAw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KASUMI/kasuAW.gif"))); // NOI18N
        jPanel2.add(megAw);
        megAw.setBounds(410, -50, 360, 450);

        jinP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gaime/JIN/jinP.gif"))); // NOI18N
        jPanel2.add(jinP);
        jinP.setBounds(230, 100, 350, 250);

        jinAW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gaime/JIN/jinAW.gif"))); // NOI18N
        jPanel2.add(jinAW);
        jinAW.setBounds(150, 60, 410, 290);

        jinA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jinA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gaime/jinA.gif"))); // NOI18N
        jPanel2.add(jinA);
        jinA.setBounds(290, 100, 260, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STAGE/Animated-GIF-The-King-of-Fighters-98-USA-Stage-Background-Sprites-Wallpaper-KOF-98-Dream-Match-Never-Ends-KOF-98-The-Slugfest-SNK-Neo-Geo-1998.gif"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 820, 350);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 820, 350);

        jPanel4.setLayout(null);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(320, 110, 160, 10);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(60, 110, 160, 10);

        ans.setBackground(new java.awt.Color(0, 0, 0));
        ans.setFont(new java.awt.Font("Courier New", 1, 36));
        ans.setForeground(new java.awt.Color(255, 255, 255));
        ans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ans);
        ans.setBounds(560, 10, 140, 110);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("=");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(460, 20, 100, 100);

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setFont(new java.awt.Font("Courier New", 0, 18));
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("< BACK");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(0, 0, 100, 20);

        s2.setFont(new java.awt.Font("Courier New", 1, 36));
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("jLabel1");
        jPanel4.add(s2);
        s2.setBounds(340, 20, 100, 100);

        s1.setFont(new java.awt.Font("Courier New", 1, 36));
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("jLabel1");
        jPanel4.add(s1);
        s1.setBounds(90, 20, 100, 100);

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 36));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(210, 20, 100, 100);

        btnsub.setBackground(new java.awt.Color(0, 11, 0));
        btnsub.setFont(new java.awt.Font("Courier New", 1, 36));
        btnsub.setForeground(new java.awt.Color(255, 255, 0));
        btnsub.setText("SUBMIT");
        btnsub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 204, 0), null, new java.awt.Color(255, 255, 0)));
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        jPanel4.add(btnsub);
        btnsub.setBounds(130, 130, 290, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/botd.gif"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 820, 210);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 410, 820, 210);

        correct.setBackground(new java.awt.Color(102, 255, 51));
        correct.setLayout(null);

        s3.setFont(new java.awt.Font("Courier New", 0, 24));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("C O R R E C T !");
        correct.add(s3);
        s3.setBounds(240, 0, 340, 30);

        jPanel1.add(correct);
        correct.setBounds(0, 380, 820, 30);

        wrong.setBackground(new java.awt.Color(255, 51, 51));
        wrong.setLayout(null);

        s4.setFont(new java.awt.Font("Courier New", 0, 24));
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s4.setText("W R O N G !");
        wrong.add(s4);
        s4.setBounds(240, 0, 340, 30);

        jPanel1.add(wrong);
        wrong.setBounds(0, 380, 820, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 620);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-836)/2, (screenSize.height-659)/2, 836, 659);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
    try{

            int ss1 =Integer.parseInt(s1.getText());
        int ss2 = Integer.parseInt(s2.getText());
        int sum = ss1+ss2;
        int anss =Integer.parseInt(ans.getText());

        if(sum==anss){
            jinA.setVisible(true);
            jinP.setVisible(false);
       correct.setVisible(true);
       wrong.setVisible(false);
       megAw.setVisible(true);
       megA.setVisible(false);
       megP.setVisible(false);
       jinAW.setVisible(false);
       ans.setText(null);
       over sic = new over();
    sic.scorr++;

prog.setValue(prog.getValue()-1);

        Random();
    }else {
            megAw.setVisible(false);
           wrong.setVisible(true);
           correct.setVisible(false);

           megA.setVisible(true);
           megP.setVisible(false);
           jinAW.setVisible(true);
           jinA.setVisible(false);
           jinP.setVisible(false);
           prog1.setValue(prog1.getValue()-1);

    }

int en = prog.getValue();
int d = prog1.getValue();
if(en==0){
    over sc = new over();
    sc.sco++;
    lod3 st = new lod3();
    st.setUpLoading1();
    st.setVisible(true);
    this.setVisible(false);
}else if(d==0){
    over ov = new over();
    ov.setUpLoading();
    ov.setVisible(true);
    this.setVisible(false);

}
   int delay = 100;
int period = 1000;
tr = new Timer();

tr.scheduleAtFixedRate(new TimerTask(){
    public void run(){
       setIntout();
        if(tout==0){
         correct.setVisible(false);
wrong.setVisible(false);
jinA.setVisible(false);
 jinP.setVisible(true);
jinAW.setVisible(false);
  megAw.setVisible(false);
megA.setVisible(false);
megP.setVisible(true);
tout=5;
                }
    }
},delay , period);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"PLEASE PUT YOUR ANSWER","ERROR",JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btnsubActionPerformed

    private void lblstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblstMouseClicked


        Random();
        int delay = 100;
        int period = 1000;
        timr = new Timer();

        timr.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                oras.setText(Integer.toString(setInterval()));
                if(interv==0){
                      over ov = new over();
    ov.setUpLoading();
    ov.setVisible(true);
    setVisible(false);
                }
            }
        },delay , period);

        lblst.setVisible(false);
        btnsub.setVisible(true);
}//GEN-LAST:event_lblstMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( JOptionPane.showConfirmDialog(null,"Are you sure you want to back to Main?","Back",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            new Lbby().setVisible(true);
            this.setVisible(false);
        }
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton btnsub;
    private javax.swing.JPanel correct;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jinA;
    private javax.swing.JLabel jinAW;
    private javax.swing.JLabel jinP;
    private javax.swing.JLabel lblst;
    private javax.swing.JLabel megA;
    private javax.swing.JLabel megAw;
    private javax.swing.JLabel megP;
    public static javax.swing.JLabel oras;
    private javax.swing.JProgressBar prog;
    private javax.swing.JProgressBar prog1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JPanel wrong;
    // End of variables declaration//GEN-END:variables
private static final int setInterval(){
    if(interv==1)
        timr.cancel();
    return--interv;
}
private static final int setIntout(){
    if(tout==1)
        tr.cancel();
    return--tout;
}
}
