import java.util.*;
public class Calculator {
	
	public static void main(String[] args) {
		 Calculators cal = new Calculators();
		Scanner sc = new Scanner(System.in);
		System.out.println
	    ("Enter: \n1. To Get Factorial Of A Number \n2. To Get Permutation Of A Number \n3. To Get Combination Of A Number \n4. For Calculator Use");
		 int Num = sc.nextInt();
		 if(Num == 1) {
		 System.out.println("Enter Factorial Number:");
		 int factorial = sc.nextInt();
		 long NR = cal.factorialNR(factorial);
		 System.out.println("factorial: "+NR);
		 } else if(Num == 2) {
		 System.out.println("Enter N- Number:");
		 int N = sc.nextInt();
		 System.out.println("Enter R- Number:");
		 int R = sc.nextInt();
		 cal.permutationNR(N,R);
		 }else if(Num == 3) {
		 System.out.println("Enter N- Number:");
		 int N = sc.nextInt();
		 System.out.println("Enter R- Number:");
		 int R = sc.nextInt();
		 cal.CombinationNR(N,R);
		 }else if(Num == 4) {
		  cal.Calculator();
		 }
	}
}
	 