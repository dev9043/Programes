package com.digitalClock;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
 
class Clock1 extends JFrame {
 
   
	private static final long serialVersionUID = 1L;
	
	JTextField dateField; 
 
      public static void main(String[] args) {
        JFrame jf = new Clock1();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(100,100);
    }
 
    public Clock1() {
 
        dateField= new JTextField(8);
 
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(dateField); 
 
        this.setContentPane(content);
        this.setTitle("Date");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
 
        javax.swing.Timer t = new javax.swing.Timer(1000, new DateListener());
        t.start();
 
    }
 
    class DateListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
 
            Calendar now = Calendar.getInstance();
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            dateField.setText("" + (month + 1) + "/" + day + "/" + year);
 
    	}
    }
 
 
}