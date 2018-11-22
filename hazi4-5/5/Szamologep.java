import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Szamologep extends JFrame {
    private JTextField textField;

    private JButton voidButton;
    private JButton backspaceButton;
    private JButton CEButton;
    private JButton CButton;
    private JButton MCButton;
    private JButton MRButton;
    private JButton MSButton;
    private JButton MplusButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton plusminusButton;
    private JButton dotButton;
    private JButton divButton;
    private JButton sqrtButton;
    private JButton multButton;
    private JButton modButton;
    private JButton minusButton;
    private JButton divxButton;
    private JButton plusButton;
    private JButton equalButton;

    String display;
    boolean sum;
    int tmp;
    int tmp2;

    public Szamologep(){
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(3);

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(textField = new JTextField(35));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,4));
        p2.add(voidButton = new JButton());
        p2.add(backspaceButton = new JButton("<html><body><font color=#FF0000>Backspace</font></body></html>"));
        p2.add(CEButton = new JButton(("<html><body><font color=#FF0000>CE</font></body></html>")));
        p2.add(CButton = new JButton("<html><body><font color=#FF0000>C</font></body></html>"));

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,6));
        p3.add(MCButton = new JButton("<html><body><font color=#FF0000>MC</font></body></html>"));
        p3.add(sevenButton = new JButton("7"));
        p3.add(eightButton = new JButton("8"));
        p3.add(nineButton = new JButton("9"));
        p3.add(divButton = new JButton("<html><body><font color=#FF0000>/</font></body></html>"));
        p3.add(sqrtButton = new JButton("sqrt"));

        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(1,6));
        p4.add(MRButton = new JButton("<html><body><font color=#FF0000>MR</font></body></html>"));
        p4.add(fourButton = new JButton("4"));
        p4.add(fiveButton = new JButton("5"));
        p4.add(sixButton = new JButton("6"));
        p4.add(multButton = new JButton("<html><body><font color=#FF0000>*</font></body></html>"));
        p4.add(modButton = new JButton("%"));

        JPanel p5 = new JPanel();
        p5.setLayout(new GridLayout(1,6));
        p5.add(MSButton = new JButton("<html><body><font color=#FF0000>MS</font></body></html>"));
        p5.add(oneButton = new JButton("1"));
        p5.add(twoButton = new JButton("2"));
        p5.add(threeButton = new JButton("3"));
        p5.add(minusButton = new JButton("<html><body><font color=#FF0000>-</font></body></html>"));
        p5.add(divxButton = new JButton("1/x"));

        JPanel p6 = new JPanel();
        p6.setLayout(new GridLayout(1,6));
        p6.add(MplusButton = new JButton("<html><body><font color=#FF0000>M+</font></body></html>"));
        p6.add(zeroButton = new JButton("0"));
        p6.add(plusminusButton = new JButton("+/-"));
        p6.add(dotButton = new JButton("."));
        p6.add(plusButton = new JButton("<html><body><font color=#FF0000>+</font></body></html>"));
        p6.add(equalButton = new JButton("<html><body><font color=#FF0000>=</font></body></html>"));



        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,1));
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);

        add(p);

        oneButton.addActionListener(new ListenToOne());
        twoButton.addActionListener(new ListenToTwo());
        threeButton.addActionListener(new ListenToThree());
        fourButton.addActionListener(new ListenToFour());
        fiveButton.addActionListener(new ListenToFive());
        sixButton.addActionListener(new ListenToSix());
        sevenButton.addActionListener(new ListenToSeven());
        eightButton.addActionListener(new ListenToEight());
        nineButton.addActionListener(new ListenToNine());
        zeroButton.addActionListener(new ListenToZero());
        plusButton.addActionListener(new ListenToPlus());
        equalButton.addActionListener(new ListenToEqual());

        super.pack();
    }


    public static void main(String[] args) {
        Szamologep szamologep = new Szamologep();
    }


    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textField.getText();
            textField.setText(display + "0");
        }
    }

    class ListenToPlus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tmp = Integer.parseInt(textField.getText());
            textField.setText("");
            sum = true;
        }
    }

    class ListenToEqual implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tmp2 = Integer.parseInt(textField.getText());

            if (sum)
                tmp2 += tmp;

            textField.setText(Integer.toString(tmp2));

            sum = false;


        }
    }
}
