package com.digitalWatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;


public class DigitalWatch1 extends JPanel implements ActionListener  {

    
	private static final long serialVersionUID = 1L;
		
	public String stringDate;
    @SuppressWarnings("rawtypes")
	public JComboBox colorList;
    public Color userColor = Color.RED;
    public JPanel panel = new JPanel();
    public JButton button = new JButton("Alarm Clock");
    public static String time = "";
    public static Date date;
    public static DateFormat df;

    public DigitalWatch1 () {
        date();
        setLayout(new BorderLayout());
        Timer timer = new Timer(1000, this); 
        timer.start();


        panel.setBackground(new Color(0,0,0,0));
        panel.setLayout(new BorderLayout());

        add(panel, BorderLayout.PAGE_START);

        String [] colorName = {"Red", "Blue", "Yellow", "Green", "Pink", "Grey"}; 
        colorList = new JComboBox(colorName);
        colorList.setBackground(Color.BLACK);
        panel.add(colorList, BorderLayout.LINE_START);

    }

    public void date() {
        df = new SimpleDateFormat("EEE,MMM d yyyy - h:mm:ss a");
        date = new Date();
        stringDate = df.format(date);

    }


    public void actionPerformed(ActionEvent e) {
        if (colorList.getSelectedItem().equals("Red"))
        userColor = Color.RED;
        else if (colorList.getSelectedItem().equals("Blue"))
        userColor = Color.BLUE;
        else if (colorList.getSelectedItem().equals("Yellow"))
        userColor = Color.YELLOW;
        else if (colorList.getSelectedItem().equals("Green"))
        userColor = new Color(5, 200, 51);
        else if (colorList.getSelectedItem().equals("Pink"))
        userColor = new Color(249, 100, 178);
        else if (colorList.getSelectedItem().equals("Grey"))
        userColor = Color.GRAY;

        colorList.setForeground(userColor);

    }

    public void paintComponent(Graphics g) { 
       date();
       super.paintComponent(g);
       g.setColor(Color.BLACK);
       g.fillRect(0, 0, 685, 100);

        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/DIGITALDREAMFAT.ttf").openStream());
        } catch(FontFormatException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        GraphicsEnvironment gen = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gen.registerFont(font);
        font = font.deriveFont(30f);
        g.setFont(font);

       g.setColor(userColor);
       g.drawString(stringDate, 10, 60);
       repaint();

    }
}