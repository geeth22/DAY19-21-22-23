// UC 10 -> Compute Employee Wage of multiple companies

public class EmpWageBuilderMultipleCompany {
  // Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static int computeEmpWage(String Company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
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
	  int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	  System.out.println("total Employee Wage for company " +company+" + totalEmpWage);
	  return totalEmpWage;
	}
	
	  public static void main(String[] args) {
		  computeEmpWage("Dmart",20,2,10);
      computeEmpWage("Bestprice",10,4,20);
	}
}
