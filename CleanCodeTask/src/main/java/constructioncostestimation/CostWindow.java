package constructioncostestimation;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import org.apache.logging.log4j.LogManager;

public class CostWindow extends JFrame {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("HelloWorld");
	public  CostWindow(){
		logger.info("Cost window constructor called");
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
		JLabel title = new JLabel("Welcome to House Construction");
		add(title);
		title.setBounds(10, 10, 200, 40);
		final JRadioButton option1 = new JRadioButton("Standard Materials");
		final JRadioButton option2 = new JRadioButton("Above Statndard Materials");
		final JRadioButton option3 = new JRadioButton("High Standard Material");
		final JRadioButton option4 = new JRadioButton("High Standard + Fully Automated House");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
 
        //setLayout(new FlowLayout());
 
        option1.setBounds(10, 60, 200, 30);
        option2.setBounds(10, 90, 200, 30);
        option3.setBounds(10,120,200,30);
        option4.setBounds(10, 160, 300, 30);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        
        final TextField areainSqm = new TextField("Enter Area");
        add(areainSqm);
        areainSqm.setBounds(10,220,100,30);
        
        Button click = new Button("Calculate Cost");
        add(click);
        click.setBounds(10,260,100,30);
        
        logger.info("Listening for the choice and area");
        
        final TextField result = new TextField("Cost ");
        add(result);
        result.setBounds(10,300,100,30);
        
        click.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				logger.info("Waiting for Input");
				// TODO Auto-generated method stub
				if(option1.isSelected())
				{
					logger.info("Option 1 is selelcted");
					result.setText(""+Double.parseDouble(areainSqm.getText())*1200+" INR");
				}
				if(option2.isSelected())
				{
					logger.info("Option 2 is selelcted");
					result.setText(""+Double.parseDouble(areainSqm.getText())*1500+" INR");
				}
				if(option3.isSelected())
				{
					logger.info("Option 3 is selelcted");
					result.setText(""+Double.parseDouble(areainSqm.getText())*1800+" INR");
				}
				if(option4.isSelected())
				{
					logger.info("Option 4 is selelcted");
					result.setText(""+Double.parseDouble(areainSqm.getText())*2500+" INR");
				}
				logger.info("resultand value is displayed");
			}
		});
	}
	
}
