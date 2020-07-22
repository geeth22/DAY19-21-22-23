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
