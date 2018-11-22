package hazifeladat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Application extends JFrame implements ActionListener {
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;

    private JTextField jTextField11;
    private JTextField jTextField13;
    private JTextField jTextField15;
    private JTextField jTextField17;
    private JTextField jTextField21;
    private JTextField jTextField23;
    private JTextField jTextField25;
    private JTextField jTextField27;
    private JTextField jTextField41;
    private JTextField jTextField43;
    private JTextField jTextField45;
    private JTextField jTextField47;


    private JLabel nap1;
    private JLabel nap2;
    private JLabel nap3;

    private JLabel ora1;
    private JLabel ora2;
    private JLabel ora3;

    private JLabel perc1;
    private JLabel perc2;
    private JLabel perc3;

    private JLabel masodperc1;
    private JLabel masodperc2;
    private JLabel masodperc3;

    private JButton button;


    public Application() throws HeadlessException{
        super("IdoAtalakito");

        setVisible(true); // lathatova teszi az ablakot

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X-el befejezi a futast

        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jPanel4 = new JPanel();

        this.jTextField11 = new JTextField(3);
        this.jTextField13 = new JTextField(3);
        this.jTextField15 = new JTextField(3);
        this.jTextField17 = new JTextField(3);
        this.jTextField21 = new JTextField(3);
        this.jTextField23 = new JTextField(3);
        this.jTextField25 = new JTextField(3);
        this.jTextField27 = new JTextField(3);
        this.jTextField41 = new JTextField(3);
        this.jTextField43 = new JTextField(3);
        this.jTextField45 = new JTextField(3);
        this.jTextField47 = new JTextField(3);

        this.nap1 = new JLabel("nap");
        this.nap2 = new JLabel("nap");
        this.nap3 = new JLabel("nap");

        this.ora1 = new JLabel("ora");
        this.ora2 = new JLabel("ora");
        this.ora3 = new JLabel("ora");

        this.perc1 = new JLabel("perc");
        this.perc2 = new JLabel("perc");
        this.perc3 = new JLabel("perc");

        this.masodperc1 = new JLabel("masodperc");
        this.masodperc2 = new JLabel("masodperc");
        this.masodperc3 = new JLabel("masodperc");


        this.button = new JButton("Számol");


        GridLayout gr = new GridLayout(4, 8,1,1);
        setLayout(gr);

        jPanel1.add(jTextField11);
        jPanel1.add(nap1);
        jPanel1.add(jTextField13);
        jPanel1.add(ora1);
        jPanel1.add(jTextField15);
        jPanel1.add(perc1);
        jPanel1.add(jTextField17);
        jPanel1.add(masodperc1);

        jPanel2.add(jTextField21);
        jPanel2.add(nap2);
        jPanel2.add(jTextField23);
        jPanel2.add(ora2);
        jPanel2.add(jTextField25);
        jPanel2.add(perc2);
        jPanel2.add(jTextField27);
        jPanel2.add(masodperc2);

        jPanel3.add(button);

        jPanel4.add(jTextField41);
        jPanel4.add(nap3);
        jPanel4.add(jTextField43);
        jPanel4.add(ora3);
        jPanel4.add(jTextField45);
        jPanel4.add(perc3);
        jPanel4.add(jTextField47);
        jPanel4.add(masodperc3);

        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);
        this.add(jPanel4);

        button.addActionListener(this);

        super.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
           szamol();
        }
    }

    public void szamol(){
       long masodpercek = 0;

       masodpercek += Integer.parseInt(jTextField11.getText()) * 86400;
       masodpercek += Integer.parseInt(jTextField13.getText()) * 3600;
       masodpercek += Integer.parseInt(jTextField15.getText()) * 60;
       masodpercek += Integer.parseInt(jTextField17.getText());

       masodpercek += Integer.parseInt(jTextField21.getText()) * 86400;
       masodpercek += Integer.parseInt(jTextField23.getText()) * 3600;
       masodpercek += Integer.parseInt(jTextField25.getText()) * 60;
       masodpercek += Integer.parseInt(jTextField27.getText());


       // System.out.println(masodpercek);

        int day = (int)TimeUnit.SECONDS.toDays(masodpercek);
        long hours = TimeUnit.SECONDS.toHours(masodpercek) - (day * 24);
        long minute = TimeUnit.SECONDS.toMinutes(masodpercek) - (TimeUnit.SECONDS.toHours(masodpercek) * 60);
        long second = TimeUnit.SECONDS.toSeconds(masodpercek) - (TimeUnit.SECONDS.toMinutes(masodpercek) * 60);

        jTextField41.setText(String.valueOf(day));
        jTextField43.setText(String.valueOf(hours));
        jTextField45.setText(String.valueOf(minute));
        jTextField47.setText(String.valueOf(second));
    }

}
