package com.digitalClock;

import java.util.Date;

public class WatchThread extends Thread {

	Watch watch;
	
	
	String time;
	
	public WatchThread(Watch watch)
	{
		this.watch = watch;
		start();
	}
	
	public void run ()
	{
		while(true)
		{
			time = ""+new Date();
			watch.jlabClock.setText(time);
		}
	}
}
