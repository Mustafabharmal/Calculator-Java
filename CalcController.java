
// package calcy;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;

import java.io.*;
import javax.swing.*;
import java.lang.*;

class CalcController implements ActionListener, KeyListener {
	String st = "";
	Double result;
	String no1;
	String no2;
	CalcView cw;

	CalcController(String a, String b) {
		this.no1 = a;
		this.no2 = b;

	}

	CalcController(CalcView c) {
		this.cw = c;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() != (this.cw.bequal)) {
			if (e.getSource().equals(this.cw.b1)) {
				st = st + "1";
				this.cw.t1.setText(st);
				System.out.print("1");
			} else if (e.getSource().equals(this.cw.b2)) {
				st = st + "2";
				this.cw.t1.setText(st);
				System.out.print("2");
			} else if (e.getSource().equals(this.cw.b3)) {
				st = st + "3";
				this.cw.t1.setText(st);
				System.out.print("3");
			} else if (e.getSource().equals(this.cw.b4)) {
				st = st + "4";
				this.cw.t1.setText(st);
				System.out.print("4");
			} else if (e.getSource().equals(this.cw.b5)) {
				st = st + "5";
				this.cw.t1.setText(st);
				System.out.print("5");
			} else if (e.getSource().equals(this.cw.b6)) {
				st = st + "6";
				this.cw.t1.setText(st);
				System.out.print("6");
			} else if (e.getSource().equals(this.cw.b7)) {
				st = st + "7";
				this.cw.t1.setText(st);
				System.out.print("7");
			} else if (e.getSource().equals(this.cw.b8)) {
				st = st + "8";
				this.cw.t1.setText(st);
				System.out.print("8");
			} else if (e.getSource().equals(this.cw.b9)) {
				st = st + "9";
				this.cw.t1.setText(st);
				System.out.print("9");
			} else if (e.getSource().equals(this.cw.b0)) {
				st = st + "0";
				this.cw.t1.setText(st);
				System.out.print("0");
			} else if (e.getSource().equals(this.cw.bsub)) {
				st = st + "-";
				this.cw.t1.setText(st);
				System.out.print("-");
			} else if (e.getSource().equals(this.cw.badd)) {
				st = st + "+";
				this.cw.t1.setText(st);
				System.out.print("+");
			} else if (e.getSource().equals(this.cw.bmulti)) {
				st = st + "x";
				this.cw.t1.setText(st);
				System.out.print("x");
			} else if (e.getSource().equals(this.cw.bdivi)) {
				st = st + "/";
				this.cw.t1.setText(st);
				System.out.print("/");
			} else if (e.getSource().equals(this.cw.bclear)) {
				st = "";
				this.cw.t1.setText(st);
				System.out.println();
			}
		}
		if (e.getSource().equals(this.cw.bequal)) {
			String st = this.cw.t1.getText();
			if (st.contains("x")) {
				try {
					String add = new String(st);
					String attr[] = add.split("x");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 * no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "x" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("/")) {
				try {
					String add = new String(st);
					String attr[] = add.split("/");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					if (no20 == 0) {
						this.cw.t1.setText("infinte");
					}
					Double dresult = no10 / no20;
					String resultf = String.valueOf(dresult);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "/" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("-")) {
				try {
					String add = new String(st);
					String attr[] = add.split("-");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 - no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "-" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("+")) {
				try {
					String add = new String(st);
					String attr[] = add.split("[+]");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 + no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "+" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
		}
	}

	public void keyReleased(KeyEvent arg) {
	}

	public void keyTyped(KeyEvent arg) {
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String st = this.cw.t1.getText();
			if (st.contains("*")) {
				try {
					String add = new String(st);
					String attr[] = add.split("[*]");
					CalcController addr = new CalcController(attr[0], attr[1]);
					this.cw.t1.setText(attr[0]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 * no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "x" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("/")) {
				try {
					String add = new String(st);
					String attr[] = add.split("/");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					if (no20 == 0) {
						this.cw.t1.setText("infinte");
					}
					Double dresult = no10 / no20;
					String resultf = String.valueOf(dresult);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "/" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("-")) {
				try {
					String add = new String(st);
					String attr[] = add.split("-");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 - no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "-" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
			if (st.contains("+")) {
				try {
					String add = new String(st);
					String attr[] = add.split("\\+");
					CalcController addr = new CalcController(attr[0], attr[1]);
					Double no10 = Double.valueOf(attr[0]);
					Double no20 = Double.valueOf(attr[1]);
					result = no10 + no20;
					String resultf = String.valueOf(result);
					this.cw.t1.setText("");
					this.cw.t1.setText(attr[0] + "+" + attr[1] + "=" + resultf);
					System.out.println("=" + resultf);
					st = "";
				} catch (Exception f) {

				}
			}
		}
	}
}
