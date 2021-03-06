package intrestCalculator;

public class SimpleIntrestCalculator {
	private double principleAmount = 0.0;
	private double termOfYear = 0;
	private double rateOfIntrest = 0;
	
	public SimpleIntrestCalculator(double principleAmount, double termOfYear, double rateOfIntrest) {
		super();
		this.principleAmount = principleAmount;
		this.termOfYear = termOfYear;
		this.rateOfIntrest = rateOfIntrest;
	}
	/**
	 * @return the principleAmount
	 */
	public double getPrincipleAmount() {
		return principleAmount;
	}
	/**
	 * @param principleAmount the principleAmount to set
	 */
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	/**
	 * @return the termOfYear
	 */
	public double getTermOfYear() {
		return termOfYear;
	}
	/**
	 * @param termOfYear the termOfYear to set
	 */
	public void setTermOfYear(double termOfYear) {
		this.termOfYear = termOfYear;
	}
	/**
	 * @return the rateOfIntrest
	 */
	public double getRateOfIntrest() {
		return rateOfIntrest;
	}
	/**
	 * @param rateOfIntrest the rateOfIntrest to set
	 */
	public void setRateOfIntrest(double rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	public double calculateIntrest() {
		double simpleIntrest = (principleAmount * rateOfIntrest * termOfYear)/100;
		return simpleIntrest;
		
	}
}
