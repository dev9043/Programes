package com.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Vikash extends JFrame implements Runnable {

	private JPick obj;

	private JLabel l1;

	public Vikash() {
		Container c = this.getContentPane();
		setVisible(true);
		setTitle("LOGIN WINDOW");
		setBounds(110, 70, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		obj = new JPick();

		l1 = new JLabel("LOGIN WINDOW");
		l1.setBounds(205, 150, 450, 40);
		l1.setForeground(Color.yellow);
		l1.setFont(new Font("Showcard Gothic", Font.BOLD, 40));

		setResizable(false);

		c.add(l1);

		c.add(obj);

		Thread t1 = new Thread(this);
		t1.start();
	}

	public void run() {
		for (int i = 1; i <= 200; i++) {
			try {
				Thread.sleep(500);
				if (i % 2 == 0)
					l1.setVisible(false);
				else
					l1.setVisible(true);
			} catch (InterruptedException ie) {
				JOptionPane.showMessageDialog(null, "interrupted");
			}
		}
	}

	class JPick extends JPanel {
		public void paint(Graphics g) {
			super.paint(g);
			MediaTracker track = new MediaTracker(this);
			Image img = Toolkit.getDefaultToolkit().getImage("./resources/images/IMG_20161016_144421.jpg");
			track.addImage(img, 0);
			try {
				track.waitForID(0);
			} catch (InterruptedException e) {
			}
			g.drawImage(img, 0, 0, 795, 490, this);

		}
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Vikash obj = new Vikash();
	}
}
