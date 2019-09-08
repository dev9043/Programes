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

public class Calculator3 extends JFrame implements ActionListener  {

	
	private static final long serialVersionUID = 1L;
	
	
	private JButton buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
					buttonSix, buttonSeven, buttonEight, buttonNine, buttonAddition,
					buttonSubtraction, buttonMultiplication, buttonDivide, buttonPoint,
					buttonPercentage, buttonClear, buttonBack,buttonEqulTo,buttonSqrt,buttonPower;
	private Border border;
	private Font font ;
	
	private JTextField t1;
	
	//private double tempVar=0.0; 
	
	//double num1,num2,result;
	//int add=0,sub=0,mul=0,divide=0,pra=0;
	
	private static String action="";
	private static double num1 = 0;
	private static double num2 = 0;
	private static double num3 = 1;
	private static double result=0;
	
	public void setComponents()
	{
		border=BorderFactory.createLineBorder(Color.MAGENTA,5);
		font = new Font("Times New Roman", Font.BOLD, 25);
		
				
		t1 = new JTextField();
		t1.setFont(font);
		t1.setBorder(border);
		t1.setBounds(20,30,230,40);
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
	
		buttonSqrt = new JButton("Sqrt");
		buttonSqrt.setFont(font);
		buttonSqrt.setBorder(border);
		buttonSqrt.setBounds(20,450,100,50);
		
		buttonPower = new JButton("Power");
		buttonPower.setFont(font);
		buttonPower.setBorder(border);
		buttonPower.setBounds(150,450,100,50);
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
		add(buttonSqrt);
		add(buttonPower);
		
		
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
		buttonSqrt.addActionListener(this);
		buttonPower.addActionListener(this);
		

		
		
		
	}
	
	public static void main(String[] args) {
    Calculator3 jf=new Calculator3();
	jf.setSize(300,550);
	jf.setComponents();
	jf.setVisible(true);
	jf.setTitle("Calculator");
	jf.setResizable(false);
	jf.getContentPane().setBackground(Color.MAGENTA);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonOne)
		{
			//.setText("1");
			
			//t1.setText(t1.getText() + buttonOne.getText());
			
			String s= t1.getText() + buttonOne.getText();
			t1.setText(s);
			
			
		}
		else if(e.getSource()==buttonTwo)
		{
			//t1.setText("2");
			
			//t1.setText(t1.getText() + buttonTwo.getText());
			
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
			if(t1.getText().isEmpty())
			{
				return;
			}
			action = "+";
			if(num1 != 0)
			{
				num1 = num1 + Double.valueOf(t1.getText());
				result = num1;
				t1.setText("");
			}
			else
			{
				num1 = Double.valueOf(t1.getText());
				t1.setText("");
			}
			
			
		}
		else if(e.getSource()==buttonSubtraction)
		{
			if(t1.getText().isEmpty())
			{
				return;
			}
			action = "-";
			if(num1 !=0 )
			{
				num1 = num1 - Double.valueOf(t1.getText());
				result = num1;
				t1.setText("");
			}
			else 
			{
				num1 = Double.valueOf(t1.getText());
				t1.setText("");
			}
				
		}
		
		else if(e.getSource()==buttonMultiplication)
		{
			action = "*";
			num3 =  num3 * Double.valueOf(t1.getText());
			t1.setText("");
						
		}
		
		else if(e.getSource()==buttonDivide)
		{
			action = "/";
			if(num1 != 0.0 && Double.valueOf(t1.getText()) != 0.0)
			{
				num1 = num1/ Double.valueOf(t1.getText());
				t1.setText("");
			}
			else if(Double.valueOf(t1.getText()) != 0.0)
			{
				num1 = Double.valueOf(t1.getText());
				t1.setText("");
			}
			
			
		}
		else if(e.getSource()==buttonPercentage)
		{
			action = "%";
			num1 = Double.valueOf(t1.getText());
			t1.setText("");
				
		}
		else if(e.getSource()==buttonPoint)
		{
			String s= t1.getText() + buttonPoint.getText();
			t1.setText(s);
		}
		
		else if(e.getSource()==buttonClear)
		{
	 		t1.setText("");
	 		num1 = 0.0;
	 		action="";
	 		num1 = 0;
	 		num2 = 0;
	 		num3 = 0;
	 		result=0;
		}
		
		else if(e.getSource()==buttonBack)
		{
			if(t1.getText().length() > 0)
			{
				t1.setText(t1.getText().substring(0, t1.getText().length()-1));
			}
		}
		
		else if(e.getSource()==buttonSqrt)
		{
			if(!t1.getText().isEmpty())
			{
				num1 = Double.valueOf(t1.getText());
				Double sqr = Math.sqrt(num1);
				t1.setText(String.valueOf(sqr));				
			}
		}
		
		else if(e.getSource()==buttonPower)
		{
			if(!t1.getText().isEmpty())
			{
			num1 = Double.valueOf(t1.getText());
			double p = Math.pow(num1, 2);
			t1.setText(String.valueOf(p));
			}
		}
		
		else if(e.getSource()==buttonEqulTo)
		{
			/*if(t1.getText().isEmpty())
			{
				return;
			}*/
			if(!t1.getText().isEmpty())
			{
			num2=Double.valueOf(t1.getText());
				
			if("+".equals(action))
			{
			result = (Double)(num1+num2);
			}
			else if("-".equals(action))
			{
			result = (Double)(num1-num2);
			}
			else if("*".equals(action))
			{
			result = (Double)(num3*num2);
			}
			else if("/".equals(action))
			{
				if(num2 != 0.0)
				{
					result = (Double)(num1/num2);
				}
				}
			else if("%".equals(action))
			{
			result = (Double)(num1*num2)/100;
			}
			t1.setText(String.valueOf(result));
			}
		}
	}
	
	
	
}
