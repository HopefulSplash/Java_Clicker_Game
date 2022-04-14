package main;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GAME
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    AudioPlayerExample1 selectPlayer;
    AudioPlayerExample1 lobbyPlayer;
    AudioPlayerExample1 errorPlayer;

    public MainMenu() {
        initComponents();
       // getHighscore();
        this.setResizable(false);
        ImageIcon img = new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\icon.png");
        this.setIconImage(img.getImage());
        selectPlayer = new AudioPlayerExample1();

//        jLabel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel2.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel4.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel6.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel9.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel10.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        jLabel2.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jLabel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jLabel5.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jLabel6.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        jLabel3.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\menu.png"));
        jLabel4.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\start.png"));
//        jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\frame.png"));

        if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("grey")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCG.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("default")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCD.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("white")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCW.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("black")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCB.png"));

        }

        if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("slap")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFS.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("COD hit marker")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFH.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("punch")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFP.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("gunshot")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFG.png"));

        }

        if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("diamond")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sD.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("bug")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sB.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("target")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sT.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("monster")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sM.png"));

        }

        if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("black")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCB.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("white")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCW.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("red")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCR.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("blue")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCBL.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("yellow")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCY.png"));
        }

        this.setLocationRelativeTo(this);
    }

    void getHighscore() {

        File file = new File("F:\\Apps\\YEET\\src\\main\\java\\resources\\settingsFile.txt");

        DefaultListModel<String> model = new DefaultListModel<>();
        try {
            FileReader fr = new FileReader(file);   //reads the file  
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream  
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters  
            String line;
            while ((line = br.readLine()) != null) {
                model.addElement(line);//appends line to string buffer  
            }
            fr.close();    //closes the stream and release the resources  

        } catch (IOException e) {
            e.printStackTrace();
        }
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) jList2.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT);
        jList2.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Your Easy Eye Training");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setRequestFocusEnabled(false);

        jList2.setFocusable(false);
        jList2.setRequestFocusEnabled(false);
        jList2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jList2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 189, -1, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 189, -1, 100));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 189, -1, 100));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 189, -1, 100));

        jComboBox1.setBackground(new java.awt.Color(236, 236, 236));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "60", "90", "120", "150", "180", "210", "240", "270", "300" }));
        jComboBox1.setFocusable(false);
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 346, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "Red", "Blue", "Yellow" }));
        jComboBox2.setFocusable(false);
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 346, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Target", "Bug", "Monster", "Diamond" }));
        jComboBox4.setFocusable(false);
        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 346, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Grey", "Black", "White" }));
        jComboBox5.setFocusable(false);
        jComboBox5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 346, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slap", "COD Hit Marker", "Punch", "Gunshot" }));
        jComboBox6.setFocusable(false);
        jComboBox6.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox6PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox6PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 346, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 4, 490, 320));

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 110, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -21, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String background = null;
        String SFX = null;
        String tName = null;
        String tColour = null;
        if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("grey")) {
            background = "G";
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("default")) {
            background = "";
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("white")) {
            background = "W";
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("black")) {
            background = "B";

        }

        if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("slap")) {
            SFX = "slap";
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("COD hit marker")) {
            SFX = "hit";
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("punch")) {
            SFX = "punch";
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("gunshot")) {
            SFX = "gun";

        }

        if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("diamond")) {
            tName = "tD";
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("bug")) {
            tName = "tB";
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("target")) {
            tName = "tT";
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("monster")) {
            tName = "tM";
        }

        if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("black")) {
            tColour = "B";
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("white")) {
            tColour = "W";
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("red")) {
            tColour = "R";
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("blue")) {
            tColour = "BL";
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("yellow")) {
            tColour = "Y";
        }

        int i = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        this.dispose();
        JFrame frame = new FullScreen(i, background, SFX, tName, tColour);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        lobbyPlayer.audioClip.stop();

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:

        selectPlayer = new AudioPlayerExample1();
        selectPlayer.setLabel(jLabel4);
        selectPlayer.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\start2.png");
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\start.png"));
    }//GEN-LAST:event_jLabel4MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lobbyPlayer = new AudioPlayerExample1();

        lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
        lobbyPlayer.audioClip.loop(10000);
    }//GEN-LAST:event_formWindowOpened
    int input;
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        lobbyPlayer.audioClip.stop();
        errorPlayer = new AudioPlayerExample1();
        System.out.println(input);
        errorPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
        JDialog yn = new YesNo(this, true, "quit");
        yn.setLocationRelativeTo(this);
        this.setVisible(false);
        yn.setVisible(true);

        if (input == 0) {
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.dispose();
        } else {
            lobbyPlayer = new AudioPlayerExample1();

            lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
            lobbyPlayer.audioClip.loop(10000);
            this.setVisible(true);

        }

    }//GEN-LAST:event_formWindowClosing

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

        if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("black")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCB.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("white")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCW.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("red")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCR.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("blue")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCBL.png"));
        } else if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("yellow")) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\tCY.png"));
        }

    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jComboBox4PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeVisible

    private void jComboBox4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("diamond")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sD.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("bug")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sB.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("target")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sT.png"));
        } else if (jComboBox4.getSelectedItem().toString().equalsIgnoreCase("monster")) {
            jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\sM.png"));

        }

        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeInvisible

    private void jComboBox6PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox6PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

        if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("slap")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFS.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("COD hit marker")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFH.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("punch")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFP.png"));
        } else if (jComboBox6.getSelectedItem().toString().equalsIgnoreCase("gunshot")) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\SFG.png"));

        }

    }//GEN-LAST:event_jComboBox6PopupMenuWillBecomeInvisible

    private void jComboBox6PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox6PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox6PopupMenuWillBecomeVisible

    private void jComboBox5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

        if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("grey")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCG.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("default")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCD.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("white")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCW.png"));
        } else if (jComboBox5.getSelectedItem().toString().equalsIgnoreCase("black")) {
            jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\BCB.png"));

        }
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeInvisible

    private void jComboBox5PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");


    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeVisible

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
               this.setVisible(false);
            lobbyPlayer.audioClip.stop();
            errorPlayer = new AudioPlayerExample1();
            System.out.println(input);
            errorPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");
            JDialog yn = new YesNo(this, true, "quit");
            yn.setLocationRelativeTo(this);
         
            yn.setVisible(true);

            if (input == 0) {
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.dispose();
            } else {
                lobbyPlayer = new AudioPlayerExample1();

                lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
                lobbyPlayer.audioClip.loop(10000);
                this.setVisible(true);

            }

        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);

            }
        });
    }

    int v1;
    String v2;
    String v3;
    String v4;
    String v5;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
