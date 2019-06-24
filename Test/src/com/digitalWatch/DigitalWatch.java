package com.digitalWatch;


import javax.swing.JFrame;
import java.awt.Color;



public class DigitalWatch extends JFrame {


	private static final long serialVersionUID = 1L;
	

	public DigitalWatch () {
        setContentPane(new DigitalWatch1());
    }

    public static void main(String[] args) {

        DigitalWatch clock = new DigitalWatch();

        clock.setSize(685, 80);
        clock.setUndecorated(true);
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setBackground(Color.BLACK);
        clock.setResizable(false);
        clock.setVisible(true);
        clock.toFront();

    }
}