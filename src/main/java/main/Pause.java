package main;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GAME
 */
public class Pause extends javax.swing.JDialog {

    String returnString = "";
    FullScreen j;

    /**
     * Creates new form test
     */
    public Pause(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.j = (FullScreen) parent;

        initComponents();
        if (j.GameTickerPlayer.audioClip != null) {
            if (j.GameTickerPlayer.audioClip.isRunning()) {

                j.GameTickerPlayer.audioClip.stop();

            }
        }
        jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\continue.png"));
        jLabel3.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\restart.png"));
        jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\Pause Menu.png"));
        jLabel4.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\stop.png"));
        jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\quit.png"));
        this.getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(this);
        if (!j.gameRunning) {
            jLabel3.setEnabled(false);
            jLabel4.setEnabled(false);

        } else {
            jLabel3.setEnabled(true);
            jLabel4.setEnabled(true);
            j.t.stop();
            j.tRemaining = j.gTime - j.time;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 400, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 400, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 400, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        returnString = "c";
        j.setReturnString("c");
        j.setDispose(true);
        j.returnPaused(this);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    AudioPlayerExample1 player;


    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\continue2.png"));
        player = new AudioPlayerExample1();
        player.setLabel(jLabel1);
        player.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\continue2.png");
        player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\continue.png"));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:   jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\continue2.png"));
        if (jLabel3.isEnabled()) {
            jLabel3.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\restart2.png"));

            player = new AudioPlayerExample1();
            player.setLabel(jLabel3);
            player.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\restart2.png");
            player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
        }
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here: 
        if (jLabel3.isEnabled()) {
            jLabel3.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\restart.png"));
        }
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (jLabel3.isEnabled()) {
            this.setVisible(false);
            player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
            JDialog yn = new YesNo(j, true, "restart");
            yn.setVisible(true);
            input = j.input;

            if (input == 0) {
                returnString = "r";
                j.setReturnString("r");
                j.setDispose(true);
                j.returnPaused(this);
                this.dispose();
            } else {
                this.setVisible(true);

            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (jLabel4.isEnabled()) {
            this.setVisible(false);
            player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
            JDialog yn = new YesNo(j, true, "stop");
            yn.setVisible(true);
            input = j.input;
            if (input == 0) {
                returnString = "s";
                j.setReturnString("s");
                j.setDispose(true);
                j.returnPaused(this);
                this.dispose();
            } else {
                this.setVisible(true);

            }

        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        if (jLabel4.isEnabled()) {
            jLabel4.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\stop2.png"));

            player = new AudioPlayerExample1();
            player.setLabel(jLabel4);
            player.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\stop2.png");
            player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
        }
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        if (jLabel4.isEnabled()) {
            jLabel4.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\stop.png"));
        }
    }//GEN-LAST:event_jLabel4MouseExited
    int input = 0;
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
        JDialog yn = new YesNo(j, true, "quit");
        yn.setVisible(true);
        input = j.input;

        if (input == 0) {
            returnString = "q";
            j.setReturnString("q");
            j.setDispose(true);
            j.returnPaused(this);
            this.dispose();
        } else {
            this.setVisible(true);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\quit2.png"));

        player = new AudioPlayerExample1();
        player.setLabel(jLabel5);
        player.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\quit2.png");
        player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\quit.png"));
    }//GEN-LAST:event_jLabel5MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        player = new AudioPlayerExample1();
        player.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
    }//GEN-LAST:event_formWindowOpened
    AudioPlayerExample1 lobbyPlayer;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        lobbyPlayer = new AudioPlayerExample1();
        lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
        lobbyPlayer.audioClip.loop(10000);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
        lobbyPlayer.audioClip.stop();
    }//GEN-LAST:event_formWindowDeactivated

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
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pause.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pause dialog = new Pause(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
