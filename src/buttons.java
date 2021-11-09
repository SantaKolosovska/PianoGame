import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.swing.JButton;

public class buttons extends JFrame implements ActionListener {

//    ImageIcon icon;
//    ImageIcon iconPressed;
//    ImageIcon playSound;

    JLayeredPane layeredPane;
    JFrame frame;

    JButton buttonPlay;
    JButton buttonC;
    JButton buttonCD;
    JButton buttonDE;
    JButton buttonD;
    JButton buttonE;
    JButton buttonF;
    JButton buttonFG;
    JButton buttonG;
    JButton buttonGA;
    JButton buttonA;
    JButton buttonAB;
    JButton buttonB;

    JCheckBox checkC = CheckBoxes.createCheckboxC();
    JCheckBox checkCD;
    JCheckBox checkD = CheckBoxes.createWhiteKeyCheckbox();
    JCheckBox checkDE;
    JCheckBox checkE = CheckBoxes.createWhiteKeyCheckbox();
    JCheckBox checkF;
    JCheckBox checkFG;
    JCheckBox checkG;
    JCheckBox checkGA;
    JCheckBox checkA;
    JCheckBox checkAB;
    JCheckBox checkB;

    buttons() {


        // icon for white keys
        ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\key3-transp_violet.png");
        //setIconImage(icon.getImage());
        // icon for play button
        ImageIcon playSound = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\playbutton_2.png");
        //setIconImage(playSound.getImage());


        // buttons, layered pane, JFrame

        // play button
        buttonPlay = new JButton();
        buttonPlay.setBounds(535, 20, 120, 120);
        buttonPlay.setOpaque(false);
        buttonPlay.setFocusPainted(false);
        buttonPlay.setBorderPainted(false);
        buttonPlay.setContentAreaFilled(false);
        buttonPlay.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        // buttonPlay.addActionListener(e -> System.out.println("Play"));
        buttonPlay.addActionListener(this);
        buttonPlay.setIcon(playSound);


        // C
        buttonC = new JButton();
        buttonC.setBounds(100, 170, 70, 230);
        buttonC.addActionListener(e -> System.out.println("Do"));
        buttonC.addActionListener(this);
        //buttonC.setBackground(Color.CYAN);
        buttonC.setIcon(icon);
        //buttonC.setBorder(BorderFactory.createCompoundBorder());

        // C sharp - D flat
        buttonCD = new JButton();
        buttonCD.setBounds(145, 170, 50, 150);
        buttonCD.addActionListener(e -> System.out.println("Do diesis / Re bemolle"));
        buttonCD.addActionListener(this);
        buttonCD.setBackground(Color.black);
        //buttonCD.setBorder(BorderFactory.createCompoundBorder());

        // D
        buttonD = new JButton();
        buttonD.setBounds(170, 170, 70, 230);
        buttonD.addActionListener(e -> System.out.println("Re"));
        buttonD.addActionListener(this);
        //buttonD.setBackground(Color.CYAN);
        buttonD.setIcon(icon);
        //buttonD.setBorder(BorderFactory.createCompoundBorder());

        // D sharp - E flat
        buttonDE = new JButton();
        buttonDE.setBounds(215, 170, 50, 150);
        buttonDE.addActionListener(e -> System.out.println("Re diesis / Mi bemolle"));
        buttonDE.addActionListener(this);
        buttonDE.setBackground(Color.black);
        //buttonDE.setBorder(BorderFactory.createCompoundBorder());

        // E
        buttonE = new JButton();
        buttonE.setBounds(240, 170, 70, 230);
        buttonE.addActionListener(e -> System.out.println("Mi"));
        buttonE.addActionListener(this);
        //buttonE.setBackground(Color.CYAN);
        buttonE.setIcon(icon);
        //buttonE.setBorder(BorderFactory.createCompoundBorder());

        // F
        buttonF = new JButton();
        buttonF.setBounds(310, 170, 70, 230);
        buttonF.addActionListener(e -> System.out.println("Fa"));
        buttonF.addActionListener(this);
        //buttonF.setBackground(Color.CYAN);
        buttonF.setIcon(icon);
        //buttonF.setBorder(BorderFactory.createEtchedBorder());

        // F sharp - G flat
        buttonFG = new JButton();
        buttonFG.setBounds(355, 170, 50, 150);
        buttonFG.addActionListener(e -> System.out.println("Fa diesis / Sol bemolle"));
        buttonFG.addActionListener(this);
        buttonFG.setBackground(Color.black);
        //buttonFG.setBorder(BorderFactory.createEtchedBorder());

        // G
        buttonG = new JButton();
        buttonG.setBounds(380, 170, 70, 230);
        buttonG.addActionListener(e -> System.out.println("Sol"));
        buttonG.addActionListener(this);
        //buttonG.setBackground(Color.CYAN);
        buttonG.setIcon(icon);
        // buttonG.setBorder(BorderFactory.createEtchedBorder());

        // G sharp - A flat
        buttonGA = new JButton();
        buttonGA.setBounds(425, 170, 50, 150);
        buttonGA.addActionListener(e -> System.out.println("Sol diesis / La bemolle"));
        buttonGA.addActionListener(this);
        buttonGA.setBackground(Color.black);
        //buttonGA.setBorder(BorderFactory.createCompoundBorder());

        // A
        buttonA = new JButton();
        buttonA.setBounds(450, 170, 70, 230);
        buttonA.addActionListener(e -> System.out.println("La"));
        buttonA.addActionListener(this);
        //buttonA.setBackground(Color.MAGENTA);
        buttonA.setIcon(icon);
        //buttonA.setBorder(BorderFactory.createCompoundBorder());

        // A sharp - B flat
        buttonAB = new JButton();
        buttonAB.setBounds(495, 170, 50, 150);
        buttonAB.addActionListener(e -> System.out.println("La diesis / Si bemolle"));
        buttonAB.addActionListener(this);
        buttonAB.setBackground(Color.black);
        //buttonAB.setBorder(BorderFactory.createCompoundBorder());

        // B
        buttonB = new JButton();
        buttonB.setBounds(520, 170, 70, 230);
        buttonB.addActionListener(e -> System.out.println("Si"));
        buttonB.addActionListener(this);
        buttonB.setIcon(icon);
        //buttonB.setBorder(BorderFactory.createCompoundBorder());


        // checkboxes
//        checkC = new JCheckBox();
//        checkC.setBounds(125, 420, 20,20);
//        checkC.setContentAreaFilled(false);     //removes background rectangle
//
//        checkCD = new JCheckBox();
//        checkCD.setBounds(175, 405, 20, 20);
//        checkCD.setContentAreaFilled(false);




        // layered pane
        layeredPane = new JLayeredPane();   // layered pane for black keys
        layeredPane.setBounds(0, 0, 700, 500);   // x, y - starts from the top left corner
        // adding buttons to layered pane
        layeredPane.add(buttonCD, JLayeredPane.DRAG_LAYER);
        layeredPane.add(buttonC, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonD, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonDE, JLayeredPane.DRAG_LAYER);
        layeredPane.add(buttonE, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonF, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonFG, JLayeredPane.DRAG_LAYER);
        layeredPane.add(buttonG, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonGA, JLayeredPane.DRAG_LAYER);
        layeredPane.add(buttonA, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonAB, JLayeredPane.DRAG_LAYER);
        layeredPane.add(buttonB, JLayeredPane.POPUP_LAYER);
        layeredPane.add(buttonPlay, JLayeredPane.DRAG_LAYER);

        layeredPane.add(checkC, JLayeredPane.POPUP_LAYER);
        //layeredPane.add(checkCD, JLayeredPane.POPUP_LAYER);
        layeredPane.add(checkD, JLayeredPane.POPUP_LAYER);
        //layeredPane.add(checkDE, JLayeredPane.POPUP_LAYER);
        layeredPane.add(checkE, JLayeredPane.POPUP_LAYER);


        // JFrame
        frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);


    }

    // methods to play sound
    public void playC() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\C.wav").getAbsoluteFile());
            Clip noteC = AudioSystem.getClip();
            noteC.open(audio);
            noteC.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playCD() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\Csharp.wav").getAbsoluteFile());
            Clip noteCD = AudioSystem.getClip();
            noteCD.open(audio);
            noteCD.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playD() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\D.wav").getAbsoluteFile());
            Clip noteD = AudioSystem.getClip();
            noteD.open(audio);
            noteD.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playDE() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\DE.wav").getAbsoluteFile());
            Clip noteDE = AudioSystem.getClip();
            noteDE.open(audio);
            noteDE.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playE() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\E.wav").getAbsoluteFile());
            Clip noteE = AudioSystem.getClip();
            noteE.open(audio);
            noteE.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playF() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\F.wav").getAbsoluteFile());
            Clip noteF = AudioSystem.getClip();
            noteF.open(audio);
            noteF.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playFG() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\FG.wav").getAbsoluteFile());
            Clip noteFG = AudioSystem.getClip();
            noteFG.open(audio);
            noteFG.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playG() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\G.wav").getAbsoluteFile());
            Clip noteG = AudioSystem.getClip();
            noteG.open(audio);
            noteG.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playGA() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\GA.wav").getAbsoluteFile());
            Clip noteGA = AudioSystem.getClip();
            noteGA.open(audio);
            noteGA.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playA() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\A.wav").getAbsoluteFile());
            Clip noteA = AudioSystem.getClip();
            noteA.open(audio);
            noteA.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playAB() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\AB.wav").getAbsoluteFile());
            Clip noteAB = AudioSystem.getClip();
            noteAB.open(audio);
            noteAB.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }

    public void playB() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\B.wav").getAbsoluteFile());
            Clip noteB = AudioSystem.getClip();
            noteB.open(audio);
            noteB.start();
        } catch (Exception exception) {
            System.out.println("Sound error");
            exception.printStackTrace();
        }
    }


    // adding sound to button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonC) {
            playC();
            //iconPressed = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\key2.png");
            //setIconImage(iconPressed.getImage());
            //buttonC.setIcon(iconPressed);
        }
        if (e.getSource() == buttonCD) {
            playCD();
        }
        if (e.getSource() == buttonD) {
            playD();
        }
        if (e.getSource() == buttonDE) {
            playDE();
        }
        if (e.getSource() == buttonE) {
            playE();
        }
        if (e.getSource() == buttonF) {
            playF();
        }
        if (e.getSource() == buttonFG) {
            playFG();
        }
        if (e.getSource() == buttonG) {
            playG();
        }
        if (e.getSource() == buttonGA) {
            playGA();
        }
        if (e.getSource() == buttonA) {
            playA();
        }
        if (e.getSource() == buttonAB) {
            playAB();
        }
        if (e.getSource() == buttonB) {
            playB();
        }

        // play button
        if (e.getSource() == buttonPlay) {
            // string array of all note sounds
            String soundArray[] = {"C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\C.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\Csharp.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\D.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\DE.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\E.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\F.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\FG.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\G.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\GA.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\A.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\AB.wav",
                    "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\B.wav"
            };

            // getting a random note of the array and playing it
            int random = new Random().nextInt(soundArray.length);
            String randomSound = soundArray[random];
            try {
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(randomSound).getAbsoluteFile());
                Clip randomClip = AudioSystem.getClip();
                randomClip.open(audio);
                randomClip.start();
            } catch (Exception exception) {
                System.out.println("Sound error");
                exception.printStackTrace();
            }

            // printing out the random note
            if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\C.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Do");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\Csharp.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Do diesis / Re bemolle");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\D.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Re");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\DE.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Re diesis / Mi bemolle");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\E.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Mi");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\F.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Fa");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\FG.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Fa diesis / Sol bemolle");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\G.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Sol");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\GA.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Sol diesis / A bemolle");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\A.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is La");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\AB.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is La diesis / Si bemolle");
            } else if (randomSound == "C:\\Users\\Admin\\IdeaProjects\\buttons_notes\\src\\B.wav") {
                System.out.println("------------------------------------------------------------------");
                System.out.println("The correct answer is Si");
            } else {
                System.out.println("Error");
            }
        }
    }
}






