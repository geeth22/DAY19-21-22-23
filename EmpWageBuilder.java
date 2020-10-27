// UC 9 - Compute Employee Wage and Save Total Wage by Company

public class EmpWageBuilderObject {
	// Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private final string company;
	private final int EMP_RATE_PER_HOUR; 
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	private int totalEmpWage;

	public EmpWageBuilderObject(String Company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
	
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}

	public void computeEmpWage() {
		// VARIABLES
	  	int empHrs=0;
		int totalEmpHrs=0;
	  	int totalWorkingDays=0;
		// COMPUTATION 
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
	  	totalWorkingDays++;
	  	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		    case IS_PART_TIME:
			    empHrs=4;
			    break;
		    case IS_FULL_TIME:
			    empHrs=8:
			    break;
		    default:
			    empHrs=0;
	  	}
		totalEmpHrs+ = empHrs;
		System.out.println("DAY#: " + totalWorkingDays + "Emp Hr: " +empHrs);
	}
		totalEmpWage = totalempHrs * EMP_RATE_PER_HOUR;
}

	public String toString() {
		return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
	}
	
	public static void main(String[] args) {
		EmpWageBuilderObject Dmart = new EmpWageBuilderObject("Dmart",20,2,10);
		EmpWageBuilderObject Bestprice = new EmpWageBuilderObject("Bestprice",10,4,20);
		Dmart.computeEmpWage();
		System.out.println(Dmart);
		Bestprice.computeEmpWage();
		System.out.println(Bestprice);
	}
