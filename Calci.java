/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Priyanshu Raturi
 */
public class Calci extends javax.swing.JFrame {

   
    public Calci() {
        initComponents();
        
    }
static String opreation1="",opreation2="";
static String ress;
static int count=0;
static int opreant;  
static float op1,op2,res;
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jButton8.setText("jButton8");

        jButton15.setText("jButton15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(5, 5, 1, 0));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jPanel2.add(jButton2);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton7.setText("Enter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton9.setText("/");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setText("1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton20.setText("2");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        jButton18.setText("3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton16.setText("jButton16");
        jPanel2.add(jButton16);

        jButton21.setText("jButton21");
        jPanel2.add(jButton21);

        jButton12.setText("4");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton11.setText("5");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton25.setText("6");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);

        jButton24.setText("jButton24");
        jPanel2.add(jButton24);

        jButton10.setText("jButton10");
        jPanel2.add(jButton10);

        jButton23.setText("7");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);

        jButton17.setText("8");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton26.setText("9");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);

        jButton13.setText("jButton13");
        jPanel2.add(jButton13);

        jButton19.setText("jButton19");
        jPanel2.add(jButton19);

        jButton14.setText("jButton14");
        jPanel2.add(jButton14);

        jButton22.setText("0");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);

        jButton27.setText(".");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addComponent(jTextField1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jTextField1.setText(jTextField1.getText()+" + ");  
opreant=1;
count++;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTextField1.setText(jTextField1.getText()+" X ");  
opreant=2;
count++;// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jTextField1.setText(jTextField1.getText()+" / ");  
opreant=3;
count++;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText(jTextField1.getText()+"1");
       if(count==0)
        opreation1 = opreation1+"1";
       else
         opreation2=opreation2+"1";
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
jTextField1.setText(jTextField1.getText()+"3");    
if(count==0)
        opreation1 = opreation1+"3";
       else
         opreation2=opreation2+"3";// TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
jTextField1.setText(jTextField1.getText()+"9");   
if(count==0)
        opreation1 = opreation1+"8";
       else
         opreation2=opreation2+"8";// TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       jTextField1.setText(jTextField1.getText()+"2");
       if(count==0)
        opreation1 = opreation1+"2";
       else
         opreation2=opreation2+"2";// TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
jTextField1.setText(jTextField1.getText()+"4");
if(count==0)
        opreation1 = opreation1+"4";
       else
         opreation2=opreation2+"4";// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
jTextField1.setText(jTextField1.getText()+"5"); 
if(count==0)
        opreation1 = opreation1+"5";
       else
         opreation2=opreation2+"5";// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
jTextField1.setText(jTextField1.getText()+"6"); 
if(count==0)
        opreation1 = opreation1+"6";
       else
         opreation2=opreation2+"6";// TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
jTextField1.setText(jTextField1.getText()+"7"); 
if(count==0)
        opreation1 = opreation1+"7";
       else
         opreation2=opreation2+"7";// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

       jTextField1.setText(jTextField1.getText()+"8");
       if(count==0)
        opreation1 = opreation1+"8";
       else
         opreation2=opreation2+"8";// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
jTextField1.setText(jTextField1.getText()+"0");
if(count==0)
        opreation1 = opreation1+"0";
       else
         opreation2=opreation2+"0";// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jTextField1.setText(jTextField1.getText()+" - ");  
        opreant=4;
count++;// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jTextField1.setText(jTextField1.getText()+".");
if(count==0)
        opreation1 = opreation1+"1";
       else
         opreation2=opreation2+"1";// TODO add  handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
            op1=Float.parseFloat(opreation1);
            op2=Float.parseFloat(opreation2);
            /*
            1 For Additon
            2 For Multiplication
            3 For Divide
            4 For Subtract
            */
              if(opreant==1)
                    res=op1+op2;
              else if(opreant==4)
                    res=op1-op2;
              else if(opreant==2)
                    res=op1*op2;
              else if(opreant==3)
                    res=op1/op2;
               else
                 res=-1;
         
           ress=String.valueOf(res);
           jTextField1.setText(jTextField1.getText()+" = "+ress);
    
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        opreation1="";
        opreation2="";
        jTextField1.setText("");
        count=0;
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
            
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new Calci().setVisible(true);
        }
    }
}
