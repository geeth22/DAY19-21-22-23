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
