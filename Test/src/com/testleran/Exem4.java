package com.testleran;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Exem4 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
		private JMenuBar JMB; 
     	private JMenu JM1,JM2,JM3,text;
     	private JMenuItem item1,item2,item3,item4,work,java,project;
     	private JDesktopPane dt;


	
	public void setcomponents()
	{
	      dt = new JDesktopPane();
	        setContentPane(dt);
		
		JMB =new JMenuBar();
		
		JM1=new JMenu("File");
		JM2=new JMenu("Edit");
		JM3=new JMenu("Source");
		text=new JMenu("Text");
		
		item1=new JMenuItem("New");
		item2=new JMenuItem("OPen File");
		item2.setEnabled(false);
		item3=new JMenuItem("Save");
		item4=new JMenuItem("Exit");
		work=new JMenuItem("Workspase   Ctrl+Alt+G ");
		java=new JMenuItem("Java");
		project=new JMenuItem("Project");
		
		item4.addActionListener(this);
		
		JM1.add(item1);
		JM1.addSeparator();
		JM1.add(item2);
		JM1.add(item3);
		JM1.addSeparator();
		JM1.add(item4);
		JM1.add(text);
		
		text.add(work);
		text.add(java);
		text.add(project);
		JMB.add(JM1);
		JMB.add(JM2);
		JMB.add(JM3);
		
		setJMenuBar(JMB);
		
		
	}
	public static void main(String [] args)
	{
		Exem4 jf=new Exem4();
		jf.setcomponents();
		jf.setTitle("Window");
		jf.setVisible(true);
		jf.setSize(400, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.exit(0);
	
		
	}
}
