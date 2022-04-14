package main;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GAME
 */
public class FullScreen extends javax.swing.JFrame {

    static String returnString = "";

    public static String getReturnString() {
        return returnString;
    }

    public void setReturnString(String returnString) {
        this.returnString = returnString;
    }

    /**
     * Creates new form FullscreenGAME
     */
    public void setImage() {

        jLabel1.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\" + tName + tColour + ".png"));
    }

    AudioPlayerExample1 GameTickerPlayer;
    AudioPlayerExample1 lobbyPlayer;
    AudioPlayerExample1 selectPlayer;
    AudioPlayerExample1 hitPlayer;
    AudioPlayerExample1 popPlayer;
    String tSFX;
    String tName;
    String tColour;

    public FullScreen(int time, String background, String SFX, String tName, String tColour) {
        this.gTime = time;
        this.tSFX = SFX;
        this.tName = tName;
        this.tColour = tColour;
        if (tName.equalsIgnoreCase("tD")) {
            gTarget = "Diamond";
        } else if (tName.equalsIgnoreCase("tB")) {
            gTarget = "Bug";
        } else if (tName.equalsIgnoreCase("tT")) {
            gTarget = "Target";
        } else if (tName.equalsIgnoreCase("tM")) {
            gTarget = "Monster";
        }

        GameTickerPlayer = new AudioPlayerExample1();
        lobbyPlayer = new AudioPlayerExample1();
        selectPlayer = new AudioPlayerExample1();
        hitPlayer = new AudioPlayerExample1();
        popPlayer = new AudioPlayerExample1();
        initComponents();
        ImageIcon img = new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\icon.png");
        this.setIconImage(img.getImage());
        jPanel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel2.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jLabel2.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\targets.png"));

        jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\start.png"));
        jLabel3.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\background" + background + ".png"));
        jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\pause.png"));
        jLabel9.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\stopfs.png"));
        jLabel8.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\time.png"));
        jLabel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jLabel4.setLayout(new BoxLayout(jLabel4, BoxLayout.LINE_AXIS));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        this.f1 = this;
        setImage();
        targetHeight = jLabel1.getHeight();
        targetWidth = jLabel1.getWidth();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel9.setEnabled(false);
        jLabel8.setVisible(false);
        jProgressBar1.setVisible(false);

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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setFocusable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(762, 762, 762)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1009, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(674, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 1920, 990));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setFocusable(false);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, 390, 60));

        jProgressBar1.setForeground(new java.awt.Color(153, 51, 255));
        jProgressBar1.setMaximum(getgTime());
        jProgressBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProgressBar1.setBorderPainted(false);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 810, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 110, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, 60));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 120, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean dispose = false;
    boolean pPressed = false;
    boolean sPressed = false;
    boolean countdown = false;
    boolean lostFocus = false;
    boolean gFinished = false;
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        lostFocus = true;

        if (!gameRunning) {
            if (!dispose && !pPressed && !sPressed) {

                jLabel1.setVisible(false);
                JDialog j1 = new Pause(this, true);
                j1.setVisible(true);

                if (!gameRunning) {
                    jLabel6.setEnabled(true);
                } else {
                    jLabel6.setEnabled(false);
                }
            } else {
                if (!dispose && !pPressed && sPressed) {
                    if (!gameRunning && !gFinished) {
                        pPressed = true;
                        jLabel1.setVisible(false);
                        JDialog j1 = new Pause(this, true);
                        j1.setVisible(true);
                        pPressed = false;
                        jLabel6.setEnabled(true);

                    } else {
                        if (gFinished) {

                        } else {
                            if (!countdown) {

                                if (stopped) {

                                } else {

                                    jLabel1.setVisible(false);
                                    jLabel8.setVisible(false);
                                    jLabel2.setVisible(false);
                                    jLabel4.setVisible(false);
                                    jProgressBar1.setVisible(false);
                                    JDialog j1 = new Pause(this, true);
                                    j1.setVisible(true);
                                    jLabel6.setEnabled(false);
                                }
                            }
                        }
                    }

                } else {

                    if (!gameRunning) {
                    } else if (!gFinished) {

                        jLabel1.setVisible(false);
                        jLabel8.setVisible(false);
                        jLabel2.setVisible(false);
                        jLabel4.setVisible(false);
                        jProgressBar1.setVisible(false);
                        JDialog j1 = new Pause(this, true);
                        j1.setVisible(true);
                        jLabel6.setEnabled(false);
                    }
                }

            }

        } else {

            if (gFinished) {

            } else {

                if (gameRunning) {
                    if (!countdown && tStarted && !pPressed && !escPressed) {

                        jProgressBar1.setVisible(false);
                        jLabel2.setVisible(false);
                        jLabel4.setVisible(false);
                        jLabel8.setVisible(false);
                        jLabel1.setVisible(false);

                        JDialog j1 = new Pause(this, true);
                        j1.setVisible(true);
                    }

                }
            }
        }


    }//GEN-LAST:event_formFocusLost
    // JDialog frame1 = new NewJDialog(this, this.f1);

    boolean escPressed = false;

    void putScore(int score) {
        jLabel4.removeAll();
        int number = score; // = and int

        if (number > 0) {
            LinkedList<Integer> stack = new LinkedList<Integer>();
            while (number > 0) {
                stack.push(number % 10);
                number = number / 10;
            }
            while (!stack.isEmpty()) {
                JLabel icon1Label = new JLabel();
                icon1Label.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\" + stack.pop() + ".png"));

                jLabel4.add(icon1Label);
            }
        } else {
            JLabel icon1Label = new JLabel();
            icon1Label.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\0.png"));
            jLabel4.add(icon1Label);
        }
        jLabel4.setHorizontalTextPosition(JLabel.LEFT);
    }


    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            escPressed = true;
            dispose = true;
            jLabel1.setVisible(false);
            jLabel8.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jProgressBar1.setVisible(false);

            JDialog j1 = new Pause(this, true);
            j1.setVisible(true);

            if (!gameRunning) {
                jLabel6.setEnabled(true);
            } else {
                jLabel6.setEnabled(false);
            }

        }

    }//GEN-LAST:event_formKeyPressed
    boolean gameRunning = false;

    public void returnPaused(JDialog j2) {
        j2.dispose();
        if (!gameRunning) {

            if (returnString == "q") {

                //frame1.dispose();
                this.dispose();
                JFrame mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                this.setDispose(false);
            } else if (returnString == "c") {
                if (!gameRunning) {
                    jLabel6.setEnabled(true);
                    jLabel9.setEnabled(false);
                } else {
                    firstPress = false;

                    int posH = jPanel1.getHeight() - targetHeight;
                    int posW = jPanel1.getWidth() - targetWidth;

                    randH = new Random().nextInt((posH - 0) + 1) + 0;

                    randW = new Random().nextInt((posW - 0) + 1) + 0;

                    if (randH <= 0) {

                        int num = (int) (Math.random() * 5);;
                        randH = num;
                    }

                    if (randW <= 0) {

                        int num = (int) (Math.random() * 5);;
                        randW = num;
                    }
                    if (randH >= posH) {

                        int num = (int) (Math.random() * 5);;
                        randH = posH - num;
                    }

                    if (randW >= posW) {

                        int num = (int) (Math.random() * 5);;
                        randW = posW - num;
                    }
                    jPanel1.setLayout(null);
                    jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
                    jLabel1.setLocation(randW, randH);

                    jLabel1.setVisible(true);
                    jLabel6.setEnabled(false);
                    jLabel9.setEnabled(true);
                }
            } else if (returnString == "r") {

            } else if (returnString == "o") {

            } else if (returnString == "f") {

                gFinished = true;
                if (!gameRunning) {

                    jLabel6.setEnabled(true);
                    jLabel9.setEnabled(false);
                } else {

                    firstPress = false;

                    jLabel1.setVisible(false);
                    jLabel6.setEnabled(true);
                    jLabel9.setEnabled(false);
                }
            }
            this.setDispose(false);
        } else {

            if (returnString == "q") {
                //frame1.dispose();
                this.dispose();
                JFrame mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                this.setDispose(false);
            } else if (returnString == "c") {

                int posH = jPanel1.getHeight() - targetHeight;
                int posW = jPanel1.getWidth() - targetWidth;

                randH = new Random().nextInt((posH - 0) + 1) + 0;

                randW = new Random().nextInt((posW - 0) + 1) + 0;

                if (randH <= 0) {

                    int num = (int) (Math.random() * 5);;
                    randH = num;
                }

                if (randW <= 0) {

                    int num = (int) (Math.random() * 5);;
                    randW = num;
                }
                if (randH >= posH) {

                    int num = (int) (Math.random() * 5);;
                    randH = posH - num;
                }

                if (randW >= posW) {

                    int num = (int) (Math.random() * 5);;
                    randW = posW - num;
                }
                jPanel1.setLayout(null);
                jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
                jLabel1.setLocation(randW, randH);
                JDialog j1 = new Countdown(this, true);
                j1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel4.setVisible(true);

                jLabel8.setVisible(true);
                jProgressBar1.setVisible(true);

                jLabel1.setVisible(true);
                jLabel6.setEnabled(false);
                jLabel9.setEnabled(true);

                t.start();
                tStarted = true;
                escPressed = false;
                GameTickerPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\tick.wav");
                GameTickerPlayer.audioClip.loop(1000000);

            } else if (returnString == "r") {

                int posH = jPanel1.getHeight() - targetHeight;
                int posW = jPanel1.getWidth() - targetWidth;

                randH = new Random().nextInt((posH - 0) + 1);
                randW = new Random().nextInt((posW - 0) + 1);

                if (randH <= 0) {

                    int num = new Random().nextInt((10 - 5) + 1) + 5;
                    randH = num;
                }

                if (randW <= 0) {

                    int num = new Random().nextInt((10 - 5) + 1) + 5;
                    randW = num;
                }
                if (randH >= posH) {

                    int num = new Random().nextInt((10 - 5) + 1) + 5;
                    randH = posH - num;
                }

                if (randW >= posW) {

                    int num = new Random().nextInt((10 - 5) + 1) + 5;
                    randW = posW - num;
                }
                jPanel1.setLayout(null);
                jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
                jLabel1.setLocation(randW, randH);

                stopped = true;
                jLabel6.setEnabled(true);
                jLabel9.setEnabled(false);
                sPressed = false;
                countdown = false;
                gameRunning = false;
                jLabel1.setVisible(false);
                putScore(0);
                jLabel2.setVisible(false);
                jLabel4.setVisible(false);
                jProgressBar1.setVisible(false);
                jLabel8.setVisible(false);
                time = 0;
                jProgressBar1.setValue(time);

                i = 1;

                putScore(0);
                i = 1;
                gFinished = false;
                firstPress = false;
                jLabel6.setEnabled(false);
                jLabel9.setEnabled(true);
                sPressed = true;
                countdown = true;

                JDialog j1 = new Countdown(this, true);
                j1.setVisible(true);
                stopped = false;
                jLabel1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel4.setVisible(true);

                jProgressBar1.setVisible(true);
                jLabel8.setVisible(true);
                startGameTimer();

                escPressed = false;
            } else if (returnString == "s") {

                stopped = true;
                jLabel6.setEnabled(true);
                jLabel9.setEnabled(false);
                sPressed = false;
                countdown = false;
                gameRunning = false;
                jLabel1.setVisible(false);
                putScore(0);
                jLabel2.setVisible(false);
                jLabel4.setVisible(false);
                jProgressBar1.setVisible(false);
                jLabel8.setVisible(false);
                time = 0;
                jProgressBar1.setValue(time);

                i = 1;
            } else if (returnString == "f") {

            }

        }
    }

    public boolean isDispose() {
        return dispose;
    }

    public void setDispose(boolean dispose) {
        this.dispose = dispose;
    }

    int i = 1;

    int randH = 0;
    int randW = 0;
    int targetHeight = 0;
    int targetWidth = 0;

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        pPressed = true;
        jProgressBar1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel8.setVisible(false);
        jLabel1.setVisible(false);

        JDialog j1 = new Pause(this, true);
        j1.setVisible(true);

        pPressed = false;
        if (!gameRunning) {
            jLabel6.setEnabled(true);
        } else {
            jLabel6.setEnabled(false);
        }

    }//GEN-LAST:event_formWindowClosing

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        hitPlayer = new AudioPlayerExample1();
        hitPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\" + tSFX + ".wav");

        int posH = jPanel1.getHeight() - targetHeight;
        int posW = jPanel1.getWidth() - targetWidth;

        randH = new Random().nextInt((posH - 0) + 1);
        randW = new Random().nextInt((posW - 0) + 1);

        if (randH <= 0) {

            int num = new Random().nextInt((10 - 5) + 1) + 5;
            randH = num;
        }

        if (randW <= 0) {

            int num = new Random().nextInt((10 - 5) + 1) + 5;
            randW = num;
        }
        if (randH >= posH) {

            int num = new Random().nextInt((10 - 5) + 1) + 5;
            randH = posH - num;
        }

        if (randW >= posW) {

            int num = new Random().nextInt((10 - 5) + 1) + 5;
            randW = posW - num;
        }

        jPanel1.setLayout(null);
        jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
        jLabel1.setLocation(randW, randH);
        putScore(i);
        tCount++;

        i++;

        this.repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:#
        this.repaint();
    }//GEN-LAST:event_jLabel1MouseReleased
    boolean firstPress = true;
    boolean tStarted = false;

    Timer t;
    int gTime;
    String gTarget;
    int tCount = 0;
    int tRemaining = 0;

    public int getgTime() {
        return gTime;
    }

    public void setgTime(int gTime) {
        this.gTime = gTime;
    }
    int time = 0;

    public void startGameTimer() {
        t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                time++;

                if (time == gTime + 1) {

                    gFinished = true;
                    jLabel1.setVisible(false);
                    jLabel6.setEnabled(true);
                    jLabel9.setEnabled(false);
                    putScore(0);
                    jLabel2.setVisible(false);
                    jLabel4.setVisible(false);

                    jLabel8.setVisible(false);
                    jProgressBar1.setVisible(false);
                    i = 1;

                    final Timer timer = (Timer) e.getSource();
                    GameTickerPlayer.audioClip.stop();
                    timer.stop();
                    JDialog j1 = new Finished(f1, true);
                    j1.setVisible(true);

                    sPressed = false;
                    countdown = false;
                    gameRunning = false;
                    time = 0;
                }
                jProgressBar1.setValue(time);
            }
        });
        tCount = 0;

        t.start();
        GameTickerPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\tick.wav");
        GameTickerPlayer.audioClip.loop(1000000);
        tStarted = true;
    }
    int input;

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    public void setjProgressBar1(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }
    boolean stopped = true;

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        selectPlayer = new AudioPlayerExample1();
        selectPlayer.setLabel(jLabel5);
        selectPlayer.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\pause2.png");
        selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");

    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        if (jLabel5.isEnabled()) {
            jLabel5.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\pause.png"));
        }
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        pPressed = true;
        jProgressBar1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel8.setVisible(false);
        jLabel1.setVisible(false);
        JDialog j1 = new Pause(this, true);
        j1.setVisible(true);

        pPressed = false;
        if (!gameRunning) {
            jLabel6.setEnabled(true);
        } else {
            jLabel6.setEnabled(false);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        if (jLabel6.isEnabled()) {
            selectPlayer = new AudioPlayerExample1();
            selectPlayer.setLabel(jLabel6);
            selectPlayer.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\start2.png");
            selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
        }
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        if (jLabel6.isEnabled()) {
            jLabel6.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\start.png"));
        }
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        lobbyPlayer.audioClip.stop();
        if (jLabel6.isEnabled()) {
            int posH = jPanel1.getHeight() - targetHeight;
            int posW = jPanel1.getWidth() - targetWidth;

            randH = new Random().nextInt((posH - 0) + 1);
            randW = new Random().nextInt((posW - 0) + 1);

            if (randH <= 0) {

                int num = new Random().nextInt((10 - 5) + 1) + 5;
                randH = num;
            }

            if (randW <= 0) {

                int num = new Random().nextInt((10 - 5) + 1) + 5;
                randW = num;
            }
            if (randH >= posH) {

                int num = new Random().nextInt((10 - 5) + 1) + 5;
                randH = posH - num;
            }

            if (randW >= posW) {

                int num = new Random().nextInt((10 - 5) + 1) + 5;
                randW = posW - num;
            }
            jPanel1.setLayout(null);
            jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
            jLabel1.setLocation(randW, randH);

            putScore(0);
            i = 1;
            gFinished = false;
            firstPress = false;
            jLabel6.setEnabled(false);
            jLabel9.setEnabled(true);
            sPressed = true;
            countdown = true;
            JDialog j1 = new Countdown(this, true);
            j1.setVisible(true);
            stopped = false;
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel4.setVisible(true);

            jProgressBar1.setVisible(true);
            jLabel8.setVisible(true);
            startGameTimer();
            escPressed = false;
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        popPlayer = new AudioPlayerExample1();
        popPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\popup.wav");

        if (jLabel9.isEnabled()) {
            t.stop();
            GameTickerPlayer.audioClip.stop();
            tStarted = false;
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jProgressBar1.setVisible(false);
            jLabel8.setVisible(false);
            stopped = true;
            JDialog yn = new YesNo(this, true, "stop");
            yn.setVisible(true);
            input = this.input;

            if (input == 0) {

                stopped = true;
                jLabel6.setEnabled(true);
                jLabel9.setEnabled(false);
                sPressed = false;
                countdown = false;
                gameRunning = false;
                jLabel1.setVisible(false);
                putScore(0);
                jLabel2.setVisible(false);
                jLabel4.setVisible(false);
                jProgressBar1.setVisible(false);
                jLabel8.setVisible(false);
                time = 0;
                jProgressBar1.setValue(time);

                i = 1;
            } else {
                stopped = false;
                if (stopped) {

                } else {

                    JDialog j1 = new Countdown(this, true);
                    j1.setVisible(true);

                    int posH = jPanel1.getHeight() - targetHeight;
                    int posW = jPanel1.getWidth() - targetWidth;

                    randH = new Random().nextInt((posH - 0) + 1) + 0;

                    randW = new Random().nextInt((posW - 0) + 1) + 0;

                    if (randH <= 0) {

                        int num = (int) (Math.random() * 5);;
                        randH = num;
                    }

                    if (randW <= 0) {

                        int num = (int) (Math.random() * 5);;
                        randW = num;
                    }
                    if (randH >= posH) {

                        int num = (int) (Math.random() * 5);;
                        randH = posH - num;
                    }

                    if (randW >= posW) {

                        int num = (int) (Math.random() * 5);;
                        randW = posW - num;
                    }

                    jPanel1.setLayout(null);
                    jLabel1.setBounds(new Rectangle(new Point(200, 300), jLabel1.getPreferredSize()));
                    jLabel1.setLocation(randW, randH);
                    jLabel1.setVisible(true);
                    jLabel2.setVisible(true);
                    jLabel4.setVisible(true);

                    jProgressBar1.setVisible(true);
                    jLabel8.setVisible(true);
                    t.start();
                    GameTickerPlayer = new AudioPlayerExample1();
                    GameTickerPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\tick.wav");
                    GameTickerPlayer.audioClip.loop(1000000);
                    tStarted = true;
                    escPressed = false;

                }

            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        if (jLabel9.isEnabled()) {
            selectPlayer = new AudioPlayerExample1();
            selectPlayer.setLabel(jLabel9);
            selectPlayer.setImg("F:\\Apps\\YEET\\src\\main\\java\\resources\\stopfs2.png");
            selectPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\select.wav");
        }
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        if (jLabel9.isEnabled()) {
            jLabel9.setIcon(new ImageIcon("F:\\Apps\\YEET\\src\\main\\java\\resources\\stopfs.png"));
        }
    }//GEN-LAST:event_jLabel9MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        // TODO add your handling code here:
//        lobbyPlayer = new AudioPlayerExample1();
//
//        lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
//        lobbyPlayer.audioClip.loop(10000);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        lobbyPlayer.audioClip.stop();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (!gameRunning) {
            lobbyPlayer.play("F:\\Apps\\YEET\\src\\main\\java\\resources\\lobby.wav");
            lobbyPlayer.audioClip.loop(10000);
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
        lobbyPlayer.audioClip.stop();
    }//GEN-LAST:event_formWindowDeactivated

    JFrame f1;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
