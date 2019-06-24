package com.digitalClock;

import java.sql.Date;

public class WatchThread extends Thread {

	DigitalClock dc;
	
	
	String time;
	
	public WatchThread(DigitalClock dc)
	{
		this.dc = dc;
		start();
	}
	
	public void run ()
	{
		while(true)
		{
			time = ""+new Date();
			dc.jlabClock.setText(time);
		}
	}
}
