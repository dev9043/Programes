package com.digitalClock;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock extends Applet implements Runnable
{

	private static final long serialVersionUID = 1L;
	
	private Thread t,t1;
	
	public Clock()
	{
		 t= new Thread(this);
		t.start();
		
	}

	@Override
	public void run() {
		t1 = Thread.currentThread();
		while(t1==t)
		{
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
		
	}
	
	

	public void paint(Graphics g){
		Calendar cal = new GregorianCalendar();
		String hour = String.valueOf(cal.get(Calendar.HOUR));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour +":" +minute +":"+ second,70, 100);
		//font = new Font("Times New Roman", Font.BOLD, 20);
		//setFont(font);
		//border=BorderFactory.createLineBorder(Color.RED,2);
		//setBorder(border);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		//setSize(100,100);
		
		
		
		setVisible(true);
		//setTitle("Calculator");
		//setResizable(false);
		//getContentPane().setBackground(Color.BLUE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	

	
	}



	
