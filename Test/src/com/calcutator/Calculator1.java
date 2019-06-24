package com.calcutator;



import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator1 extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	
	private JButton buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
					buttonSix, buttonSeven, buttonEight, buttonNine, buttonAddition,
					buttonSubtraction, buttonMultiplication, buttonDivide, buttonPoint,
					buttonPercentage, buttonClear, buttonBack,buttonEqulTo;
	private Border border;
	private Font font ;
	
	private JTextField t1;
	
	private double tempVar=0.0; 
	
	
	public void setComponents()
	{
		border=BorderFactory.createLineBorder(Color.BLACK,2);
		font = new Font("Times New Roman", Font.BOLD, 25);
		
				
		t1 = new JTextField();
		t1.setFont(font);
		t1.setBorder(border);
		t1.setBounds(35,30,200,40);
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.BLACK);
		//t1.setPreferredSize(preferredSize);
		
		buttonZero = new JButton("0");
		buttonZero.setFont(font);
		buttonZero.setBorder(border);
		buttonZero.setBounds(20,310,50,50);
		
		buttonOne = new JButton("1");
		buttonOne.setFont(font);
		buttonOne.setBorder(border);
		buttonOne.setBounds(20,100,50,50);
		
		buttonTwo = new JButton("2");
		buttonTwo.setFont(font);
		buttonTwo.setBorder(border);
		buttonTwo.setBounds(80,100,50,50);
		
		
		buttonThree = new JButton("3");
		buttonThree.setFont(font);
		buttonThree.setBorder(border);
		buttonThree.setBounds(140,100,50,50);
		
		buttonFour = new JButton("4");
		buttonFour.setFont(font);
		buttonFour.setBorder(border);
		buttonFour.setBounds(20,170,50,50);
		
		buttonFive = new JButton("5");
		buttonFive.setFont(font);
		buttonFive.setBorder(border);
		buttonFive.setBounds(80,170,50,50);
				
		buttonSix = new JButton("6");
		buttonSix.setFont(font);
		buttonSix.setBorder(border);
		buttonSix.setBounds(140,170,50,50);
		
		buttonSeven = new JButton("7");
		buttonSeven.setFont(font);
		buttonSeven.setBorder(border);
		buttonSeven.setBounds(20,240,50,50);
				
		buttonEight = new JButton("8");
		buttonEight.setFont(font);
		buttonEight.setBorder(border);
		buttonEight.setBounds(80,240,50,50);
		
		buttonNine = new JButton("9");
		buttonNine.setFont(font);
		buttonNine.setBorder(border);
		buttonNine.setBounds(140,240,50,50);
		
		buttonAddition = new JButton("+");
		buttonAddition.setFont(font);
		buttonAddition.setBorder(border);
		buttonAddition.setBounds(200,100,50,50);	
		
		buttonSubtraction = new JButton("-");
		buttonSubtraction.setFont(font);
		buttonSubtraction.setBorder(border);
		buttonSubtraction.setBounds(200,170,50,50);
		
		buttonMultiplication = new JButton("*");
		buttonMultiplication.setFont(font);
		buttonMultiplication.setBorder(border);
		buttonMultiplication.setBounds(200,240,50,50);
		
		buttonDivide = new JButton("/");
		buttonDivide.setFont(font);
		buttonDivide.setBorder(border);
		buttonDivide.setBounds(80,310,50,50);
		
		buttonPercentage = new JButton("%");
		buttonPercentage.setFont(font);
		buttonPercentage.setBorder(border);
		buttonPercentage.setBounds(140,310,50,50);
		
		buttonPoint = new JButton(".");
		buttonPoint.setFont(font);
		buttonPoint.setBorder(border);
		buttonPoint.setBounds(200,310,50,50);
		
		buttonBack = new JButton("Back");
		buttonBack.setFont(font);
		buttonBack.setBorder(border);
		buttonBack.setBounds(20,380,100,50);
		
		buttonClear = new JButton("C");
		buttonClear.setFont(font);
		buttonClear.setBorder(border);
		buttonClear.setBounds(140,380,50,50);
		
		buttonEqulTo = new JButton("=");
		buttonEqulTo.setFont(font);
		buttonEqulTo.setBorder(border);
		buttonEqulTo.setBounds(200,380,50,50);
	
		//buttonNine.setForeground(Color.RED);
		setLayout(null);
	
		add(t1);
		add(buttonOne);
		add(buttonTwo);
		add(buttonThree);
		add(buttonAddition);
		add(buttonFour);
		add(buttonFive);
		add(buttonSix);
		add(buttonSubtraction);
		add(buttonSeven);
		add(buttonEight);
		add(buttonNine);
		add(buttonMultiplication);
		add(buttonZero);
		add(buttonDivide);
		add(buttonPercentage);
		add(buttonPoint);
		add(buttonBack);
		add(buttonClear);
		add(buttonEqulTo);
		
		buttonZero.addActionListener(this);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		buttonFive.addActionListener(this);
		buttonSix.addActionListener(this);
		buttonSeven.addActionListener(this);
		buttonEight.addActionListener(this);
		buttonNine.addActionListener(this);
		buttonAddition.addActionListener(this);
		buttonSubtraction.addActionListener(this);
		buttonMultiplication.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonPercentage.addActionListener(this);
		buttonPoint.addActionListener(this);
		buttonBack.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonEqulTo.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
	Calculator1 jf=new Calculator1();
	jf.setSize(300,500);
	jf.setComponents();
	jf.setVisible(true);
	jf.setTitle("Calculator");
	jf.setResizable(false);
	jf.getContentPane().setBackground(Color.BLUE);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonOne)
		{
			
			String s= t1.getText() + buttonOne.getText();
			t1.setText(s);
			
			
		}
		else if(e.getSource()==buttonTwo)
		{
			
			String s= t1.getText() + buttonTwo.getText();
			t1.setText(s);
		}
		
		else if(e.getSource()==buttonThree)
		{
			String s= t1.getText() + buttonThree.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonFour)
		{
			String s= t1.getText() + buttonFour.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonFive)
		{
			String s= t1.getText() + buttonFive.getText();
			t1.setText(s);
		}

		else if(e.getSource()==buttonSix)
		{
			String s= t1.getText() + buttonSix.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonSeven)
		{
			String s= t1.getText() + buttonSeven.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonEight)
		{
			String s= t1.getText() + buttonEight.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonNine)
		{
			String s= t1.getText() + buttonNine.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonZero)
		{
			String s= t1.getText() + buttonZero.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonAddition)
		{
						
			if(t1.getText().length() > 0)
			{
				if(tempVar > 0.0)
				{
					tempVar= tempVar+ Double.parseDouble(t1.getText());
				}
				else
				{
					tempVar= Double.parseDouble(t1.getText());
				}
				t1.setText("");
			}
		}
		else if(e.getSource()==buttonSubtraction)
		{
			if(t1.getText().length() > 0)
			{
				if(tempVar > 0.0)
				{
					tempVar= tempVar- Double.parseDouble(t1.getText());
				}
				else
				{
					tempVar= Double.parseDouble(t1.getText());
				}
				t1.setText("");
			}
			
		}
		
		else if(e.getSource()==buttonMultiplication)
		{
			if(t1.getText().length() > 0)
			{
				if(tempVar > 0.0)
				{
					tempVar= tempVar* Double.parseDouble(t1.getText());
				}
				else
				{
					tempVar= Double.parseDouble(t1.getText());
				}
				t1.setText("");
			}	
		}
		else if(e.getSource()==buttonDivide)
		{
			if(t1.getText().length() > 0)
			{
				if(tempVar > 0.0)
				{
					tempVar= tempVar/ Double.parseDouble(t1.getText());
				}
				else
				{
					tempVar= Double.parseDouble(t1.getText());
				}
				t1.setText("");
			}			
		}
		else if(e.getSource()==buttonPercentage)
		{
			if(t1.getText().length() > 0)
			{
				if(tempVar > 0.0)
				{
					tempVar= tempVar% Double.parseDouble(t1.getText());
				}
				else
				{
					tempVar= Double.parseDouble(t1.getText());
				}
				t1.setText("");
			}	
		}
		else if(e.getSource()==buttonPoint)
		{
			String s= t1.getText() + buttonPoint.getText();
			t1.setText(s);
		}
		else if(e.getSource()==buttonClear)
		{
			t1.setText("");
		}
		else if(e.getSource()==buttonBack)
		{
			if(t1.getText().length() > 0)
			{
				/*String str = boxTextField.getText();
				
				int length = str.length();
				
				String str2 = str.substring(0, length-2);
				boxTextField.setText(str2);*/
				
				t1.setText(t1.getText().substring(0, t1.getText().length()-1));
			}
		}
		else if(e.getSource()==buttonEqulTo)
		{
			if(t1.getText().length() > 0)
			{
				t1.setText(String.valueOf(tempVar+Double.parseDouble(t1.getText())));
				tempVar =0.0;
			}
			
			if(t1.getText().length() > 0)
			{
				t1.setText(String.valueOf(tempVar-Double.parseDouble(t1.getText())));
				tempVar =0.0;
			}
			if(t1.getText().length() > 0)
			{
				t1.setText(String.valueOf(tempVar*Double.parseDouble(t1.getText())));
				tempVar =0.0;
			}
			if(t1.getText().length() > 0)
			{
				t1.setText(String.valueOf(tempVar/Double.parseDouble(t1.getText())));
				tempVar =0.0;
			}
			if(t1.getText().length() > 0)
			{
				t1.setText(String.valueOf(tempVar%Double.parseDouble(t1.getText())));
				tempVar =0.0;
			}
					
		}
	}
}
			