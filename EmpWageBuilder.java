
public class EmpWageBuilderUC3 {
	public static void main(String[] args) {
		// CONSTANTS 
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		// COMPUTATION 
		double EmpCheck = Math.floor(Math.random() * 10) % 3;
	if (EmpCheck==IS_FULL_TIME)
		empHrs=8;
	else if (EmpCheck==PartTime)
		empHrs=4;
	else
		empHrs=0;
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Employee Wage is " + empWage);
	}
}
// UC 4 -> Solving Using Case Statement

public class EmpWageBuilderUC4 { 
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public static void main(String[] args) {
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		// COMPUTATION 
		double EmpCheck = Math.floor(Math.random() * 10) % 3;
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
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Employee Wage is " + empWage);
	}
}
