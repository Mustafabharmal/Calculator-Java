
// package calcy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class CalcView extends Frame {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bequal, bsub, badd, bdivi, bmulti, bclear;
    TextField t1;
    CalcController ml = new CalcController(this);

    // CalcController m2 = new CalcController(this);
    CalcView() {
        super("My Personal Calculator");
        setLayout(null);
        setBounds(0, 0, 500, 600);

        t1 = new TextField();

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bequal = new Button("=");
        bsub = new Button("-");
        badd = new Button("+");
        bdivi = new Button("/");
        bmulti = new Button("x");
        bclear = new Button("CLS");

        add(t1);
        // String strt = t1.getText();
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bequal);
        add(bsub);
        add(badd);
        add(bdivi);
        add(bmulti);
        add(bclear);

        t1.setBounds(50, 50, 400, 70);

        b0.setBounds(150, 450, 100, 100);
        b1.setBounds(50, 350, 100, 100);
        b2.setBounds(150, 350, 100, 100);
        b3.setBounds(250, 350, 100, 100);
        b4.setBounds(50, 250, 100, 100);
        b5.setBounds(150, 250, 100, 100);
        b6.setBounds(250, 250, 100, 100);
        b7.setBounds(50, 150, 100, 100);
        b8.setBounds(150, 150, 100, 100);
        b9.setBounds(250, 150, 100, 100);

        bequal.setBounds(250, 450, 100, 100);

        badd.setBounds(350, 150, 100, 100);
        bsub.setBounds(350, 250, 100, 100);
        bdivi.setBounds(350, 450, 100, 100);
        bmulti.setBounds(350, 350, 100, 100);
        bclear.setBounds(50, 450, 100, 100);

        b1.addActionListener(ml);
        b2.addActionListener(ml);
        b3.addActionListener(ml);
        b4.addActionListener(ml);
        b5.addActionListener(ml);
        b6.addActionListener(ml);
        b7.addActionListener(ml);
        b8.addActionListener(ml);
        b9.addActionListener(ml);
        b0.addActionListener(ml);
        bequal.addActionListener(ml);
        bsub.addActionListener(ml);
        badd.addActionListener(ml);
        bdivi.addActionListener(ml);
        bmulti.addActionListener(ml);
        bclear.addActionListener(ml);
        t1.addKeyListener(ml);

        Font f1 = new Font("Arial", Font.BOLD, 40);

        t1.setFont(f1);
        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b0.setFont(f1);
        bequal.setFont(f1);
        bsub.setFont(f1);
        badd.setFont(f1);
        bdivi.setFont(f1);
        bmulti.setFont(f1);
        bclear.setFont(f1);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        CalcView mf = new CalcView();
        mf.setVisible(true);

    }
}