package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) { 
		Progression p = new Arithmetic(3, 2); 
		Progression q = new Arithmetic(3, 1); 
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5); 
		printSumOfTerms(q, 5); 
		equals(p,q,5);
		p.add (q, 5);
		p.subtract(q, 5);
		
		

		p = new Geometric(3, 2); 
		q = new Geometric(1, 2); 
		
		printSumOfTerms(p, 5); 
		printSumOfTerms(q, 5); 
		equals(p,q,5);
		p.add( q, 5);
		p.subtract(q, 5);
		
		
	    p = new Fibonacci();
	    q = new Fibonacci();
		printSumOfTerms(p,5);
		printSumOfTerms(q, 5); 
		equals(p,q,5);
		p.add (q, 5);
		p.subtract(q, 5);
	} 

	/** Prints the sum of the first terms in a 
	    	      progression. 
			@param p the progression
			@param n the number of terms to consider
	 **/ 
	private static void printSumOfTerms(
			Progression p, int n) 
	{ 
		double sum;
		sum=p.firstValue();
		for (int i=1;i<n;i++) {
			sum=p.nextValue()+sum;
		}
		    
		System.out.println("Sum of first " + n + " terms in " 
				+ p + " is: " + sum); 
	}

	private static void equals(
			Progression p1, Progression p2, int n) 
	{ 
		double diff;
		diff=p1.firstValue()-p2.firstValue();
		if (diff!=0) {
			System.out.println("not equal");
			return;
		}
		for (int i=1;i<n;i++) {
		
			diff=p1.nextValue()-p2.nextValue();
			if (diff!=0) {
				System.out.println("not equal");
				return;
			}
		}
		    
		System.out.println("equal");
	}
}
