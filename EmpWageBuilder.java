Welcome to Employee Wage Computation Program on Master Branch

// UC 1 -> whether employ present or absent 

public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		// CONSTANTS 
		int IS_FULL_TIME=1;
		// COMPUTATION 
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
	if (EmpCheck==IS_FULL_TIME)
		System.out.println("Employ is Present");
	else
		System.out.println("Employ is Absent");
	}
}

// UC 2 -> Calculate Daily Employee Wage

public class EmpWageBuilderUC2 {
	public static void main(String[] args) {
		// CONSTANTS 
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		// COMPUTATION 
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
	if (EmpCheck==IS_FULL_TIME)
		empHrs=8;
	else
		empHrs=0;
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Employee Wage is " + empWage);
	}
}

// UC 3 -> Adding Part Time Employee and Wage

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

// UC 5 -> Calculating Wages for a Month

public class EmpWageBuilderUC5 { 
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static void main(String[] args) {
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		// COMPUTATION 
	for (int day=0; day < NUM_OF_WORKING_DAYS; day++) {
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
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalEmpWage+ = empWage;
	System.out.println("Employee Wage is " + empWage);
	}
	System.out.println("total Employee Wage is " + totalEmpWage);
	}
}

// UC 6 -> Calculating Wages till Number of Working Days or Total Working Hours per month is Reached

public class EmpWageBuilderUC6 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String[] args) {
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
	System.out.println("total Employee Wage is " + totalEmpWage);
	}
}

// UC 7 -> Compute Employee Wage Using Class Methods

public class EmpWageBuilderClassMethod {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static int computeEmpWage() {
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
	System.out.println("total Employee Wage is " + totalEmpWage);
	return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage();
	}
}

// UC 8 -> Compute Employee Wage of multiple companies

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

// UC 10 -> Ability to manage Employee Wage of multiple companies

public class ComputeEmployeeWageCalculator {
        
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static final int NUM_OF_WORKING_DAYS = 10;
        public static CompanyWageObj[] companyWagesForEachEmp= new CompanyWageObj[4];
        
        static {
            companyWagesForEachEmp[0] = new CompanyWageObj();
            companyWagesForEachEmp[0].EMPOYEE_RATE_PER_HOUR = 20;
            companyWagesForEachEmp[1] = new CompanyWageObj();
            companyWagesForEachEmp[1].EMPOYEE_RATE_PER_HOUR = 30;
            companyWagesForEachEmp[2] = new CompanyWageObj();
            companyWagesForEachEmp[2].EMPOYEE_RATE_PER_HOUR = 40;
            companyWagesForEachEmp[3] = new CompanyWageObj();
            companyWagesForEachEmp[3].EMPOYEE_RATE_PER_HOUR = 50;
        }
        
        public static void main(String[] args) {
            computeEmpWage();
        }
        public static void computeEmpWage(){
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0,employeeWage = 0;
            while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
                totalWorkingDays++;
                for(int i = 0; i< 4 ; i++){
                    int empCheck = (int)(Math.floor(Math.random()*10)%3);
                    switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 2;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                    }
                    employeeWage += empHrs * companyWagesForEachEmp[i].EMPOYEE_RATE_PER_HOUR;
                }
            }
            System.out.println(employeeWage);
            
            return ;
        }
} 

// Uc 12 -> Refactor to have list of multiple companies to manage Employee Wage

import java.util.ArrayList;
import java.util.List;

public class CalculateEmpWageUsingList {
        
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static final int NUM_OF_WORKING_DAYS = 10;
        public static List<CompanyWageObj> companyWageLIst = new ArrayList<CompanyWageObj>();
        
        static {
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(0).EMPOYEE_RATE_PER_HOUR = 20;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(1).EMPOYEE_RATE_PER_HOUR = 30;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(2).EMPOYEE_RATE_PER_HOUR = 40;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(3).EMPOYEE_RATE_PER_HOUR = 50;
        }
        
        public static void main(String[] args) {
            computeEmpWage();
        }
        public static void computeEmpWage(){
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0,employeeWage = 0;
            while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
                totalWorkingDays++;
                for(int i = 0; i< 4 ; i++){
                    int empCheck = (int)(Math.floor(Math.random()*10)%3);
                    switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 2;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                    }
                    employeeWage += empHrs * companyWageLIst.get(i).EMPOYEE_RATE_PER_HOUR;
                }
            }
            System.out.println(employeeWage);
            
            return ;
        }
}

// uc 13 -> Store the Daily Wage along with the Total Wage

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreDailyWage {
        
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static final int NUM_OF_WORKING_DAYS = 10;
        public static List<CompanyWageObj> companyWageLIst = new ArrayList<CompanyWageObj>();
	public static int[] dailyWage = new  int[4];
        
        static {
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(0).EMPOYEE_RATE_PER_HOUR = 20;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(1).EMPOYEE_RATE_PER_HOUR = 30;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(2).EMPOYEE_RATE_PER_HOUR = 40;
            companyWageLIst.add(new CompanyWageObj());
            companyWageLIst.get(3).EMPOYEE_RATE_PER_HOUR = 50;
        }
        
        public static void main(String[] args) {
            storeDailyWageWithTotalWage();
        }
        public static void storeDailyWageWithTotalWage(){
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0,employeeWage = 0;
		int dailywage = 0;
            while(totalWorkingDays < NUM_OF_WORKING_DAYS){
                totalWorkingDays++;
                for(int i = 0; i< 4 ; i++){
                    int empCheck = (int)(Math.floor(Math.random()*10)%3);
                    switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 2;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                    }
                    dailywage = empHrs * companyWageLIst.get(i).EMPOYEE_RATE_PER_HOUR;
                dailyWage[i] = dailywage;
                employeeWage += dailywage;
            }
        }
        System.out.println(employeeWage);
        System.out.println(Arrays.toString(dailyWage));
        
        return ;
    }
}

// UC 14 -> Ability to get the Total Wage when queried by Company

import java.util.ArrayList;
import java.util.List;

public class QueryByCompanyName {
        
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static final int NUM_OF_WORKING_DAYS = 10;
        public static List<CompanyWageObj> companyWageLIst = new ArrayList<CompanyWageObj>();
        
        static {
        	companyWageLIst.add(new CompanyWageObj());
	        companyWageLIst.get(0).EMPOYEE_RATE_PER_HOUR = 20;
        	companyWageLIst.get(0).setCompanyName("Microsoft");
        	companyWageLIst.add(new CompanyWageObj());
        	companyWageLIst.get(1).EMPOYEE_RATE_PER_HOUR = 30;
        	companyWageLIst.get(1).setCompanyName("Amazon");
        	companyWageLIst.add(new CompanyWageObj());
        	companyWageLIst.get(2).EMPOYEE_RATE_PER_HOUR = 40;
        	companyWageLIst.get(2).setCompanyName("Google");
        	companyWageLIst.add(new CompanyWageObj());
        	companyWageLIst.get(3).EMPOYEE_RATE_PER_HOUR = 50;
        	companyWageLIst.get(3).setCompanyName("Apple");
        }
  public static void main(String[] args) {
        computeEmpWage("Apple");
    }
    public static void computeEmpWage(String companyName){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0,employeeWage = 0;
        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            for(int i = 0; i< 4 ; i++){
                if(companyName.equalsIgnoreCase(companyWageLIst.get(i).getCompanyName())){
                    int empCheck = (int)(Math.floor(Math.random()*10)%3);
                    switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 2;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                    }
                    employeeWage += empHrs * companyWageLIst.get(i).EMPOYEE_RATE_PER_HOUR;
                    break;
                }
                
            }
        }
        System.out.println(employeeWage);
        
        return ;
    }
}
