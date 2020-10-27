// UC 11 -> Ability to Manage Employee Wage of Multiple Companies Using Interface Approach.

public class CompanyEmpWage {
	
	public final string company;
	public final int EMP_RATE_PER_HOUR; 
	public final int NUM_OF_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		this.company = company;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}
	
	public void settotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}	

	public String toString() {
		return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
	}
}

public class EmpWageBuilderArray {
	// Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
		
	private int numOFcompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderarray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		companyEmpWageArray[numOFcompany] = new CompanyEmpWage(company, EMP_RATE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
		numOFcompany++;
	}
	
	private void computeEmpWage[] {
		for (int i=0; i < numOFcompany; i++) {
			companyEmpWageArray[i].settotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
	  return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
	}
	
	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Bestprice",10,4,20);
		empWageBuilder.computeEmpWage();
	}
