package epam.CleanCodeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import constructioncostestimation.CostWindow;
import intrestCalculator.IntrestWindow;

/**
 * Clean Code Task
 *  1. Meaningful variable names.
 *  2. Calculate simple Interest and Compound Interests
 *  3.  Cost of Constructing a  House based on the quality of materials
 *  
 */



public class App 
{
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger("HelloWorld");
    public static void main( String[] args )
    {
    	IntrestWindow intrestwindow = new IntrestWindow();
    	logger.info("Intrest Window Opened");
    	intrestwindow.setVisible(true);
    	intrestwindow.setSize(300, 600);
    	
    	CostWindow costwindow = new CostWindow();
    	logger.info("Cost Window Opened");
    	costwindow.setVisible(true);
    	costwindow.setSize(300,800);
    }
}
