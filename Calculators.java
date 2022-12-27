import java.util.*;
public class Calculators implements CalculatorBuilder {

	@Override	
public long factorialNR(long n) {
		if(n != 0) {
		return n*factorialNR(n-1);
	}
	 else {
		 }
		return 1;
	 }	
	@Override
public void CombinationNR(int N,int R) {		
	long j = N-R;
	long a = factorialNR(N);
	long b = factorialNR(j);
	long c = factorialNR(R);
	long d = b*c;

	long Overall = a/d;
    System.out.println("Combination:"+Overall+" ways");
}
	@Override
public void permutationNR(int N,int R) {
  long j = N-R;
	long a = factorialNR(N);
	long b = factorialNR(j);
	
	long Overall = a/b;
    System.out.println("Permutation:"+Overall+" ways");
}
	@Override
public void Calculator() {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Operations '*','-','/','+'");
	String operation = sc.next();
	if(operation.equals("*")) {
	  System.out.println("Enter FirstValue:");
	  int fnum =  sc.nextInt();
	  System.out.println("Enter SecondValue:");
	  int snum = sc.nextInt();
	  
	  int total = fnum*snum;
		double change = (double) fnum*snum;
		if(total != change) {
			System.out.println("Value:"+change);
		}
		else {
			System.out.println("Value:"+total);
		}
	  }
	else if(operation.equals("+")) {
		System.out.println("Enter FirstValue:");
		int fnum = sc.nextInt();
		System.out.println("Enter SecondValue:");
		int snum = sc.nextInt();

		int total = fnum+snum;
		double change = (double) fnum+snum;
		if(total != change) {
			System.out.println("Value:"+change);
		}
		else {
			System.out.println("Value:"+total);
		}
	}
	else if(operation.equals("-")) {
		System.out.println("Enter FirstValue:");
		int fnum = sc.nextInt();
		System.out.println("Enter SecondValue:");
		int snum = sc.nextInt();

		int total = fnum-snum;
		double change = (double) fnum-snum;
		if(total != change) {
			System.out.println("Value:"+change);
		}
		else {
		System.out.println("Value:"+total);
		}
	}
	else if(operation.equals("/")) {
		System.out.println("Enter FirstValue:");
		int fnum = sc.nextInt();
		System.out.println("Enter SecondValue:");
		int snum = sc.nextInt();

		int total = fnum/snum;
		double change = (double) fnum/snum;
		if(total != change) {
		System.out.println("Value:"+change);
		}
		else {
		System.out.println("Value:"+total);
		}
}
}
}