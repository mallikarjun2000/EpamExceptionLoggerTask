package intrestCalculator;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.apache.logging.log4j.LogManager;

public class IntrestWindow extends JFrame {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("HelloWorld");
	public IntrestWindow(){
		logger.info("Intrest Window constructer is called");
		this.setLayout(new LayoutManager() {
			
			public void removeLayoutComponent(Component comp) {
				// TODO Auto-generated method stub
				
			}
			
			public Dimension preferredLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Dimension minimumLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void layoutContainer(Container parent) {
				// TODO Auto-generated method stub
				
			}
			
			public void addLayoutComponent(String name, Component comp) {
				// TODO Auto-generated method stub
				
			}
		});
		JLabel title  = new JLabel("Intrest Calculator");
		title.setBounds(0,0,200,20);
		final TextField principleF = new TextField("Principle amount");
		principleF.setBounds(0, 30, 200, 20);
		final TextField termF = new TextField("Term years");
		termF.setBounds(0, 60, 200, 20);
		final TextField rateF  = new TextField("Rate of Intrest");
		rateF.setBounds(0, 90, 200, 20);
		final TextField rateN = new TextField("compound unit");
		rateN.setBounds(300, 90, 200, 20);
		add(title);
		add(principleF);
		add(termF);add(rateF);
		add(rateN);
		JButton b = new JButton("Calculate Simple Intrest");
		b.setBounds(0, 120, 150, 30);
		add(b);
		JButton b1 = new JButton("Calculate Compund Intrest");
		b1.setBounds(160, 120, 150, 30);
		add(b1);
		final TextField resultSI = new TextField("Simple Intrest");
		add(resultSI);
		resultSI.setBounds(0, 180, 100, 30);
		final TextField resultPI = new TextField("Compund Intrest");
		add(resultPI);
		resultPI.setBounds(160, 180, 100, 30);
		
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				logger.info("Waiting for simple intrest input");
				logger.info("Simple intrest button clicked");
				SimpleIntrestCalculator simpleintrestcalculator = new SimpleIntrestCalculator
						(Double.parseDouble(principleF.getText()),
								Double.parseDouble(termF.getText()),
								Double.parseDouble(rateF.getText()));
				resultSI.setText(""+simpleintrestcalculator.calculateIntrest());
				logger.info("Calculating simple intrest");
				logger.info("Simple intrest displayed ");
			}
		});
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				logger.info("Waiting for compound intrest input");
				logger.info("Compund intrest button clicked");
				CompoundIntrestCalculator compoundintrestcalculator = new CompoundIntrestCalculator
						(Double.parseDouble(principleF.getText()),
								Double.parseDouble(termF.getText()),
								Double.parseDouble(rateF.getText()),
								Double.parseDouble(rateN.getText()));
				resultPI.setText(""+compoundintrestcalculator.calculateIntrest());
				logger.info("Caluting compound intrest");
				logger.info("Compound intrest displayed");
			}
		});
		
	}
	
}
