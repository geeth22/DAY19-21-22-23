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
