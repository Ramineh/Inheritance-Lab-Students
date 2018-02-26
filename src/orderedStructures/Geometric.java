package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}
	
	public String toString() {
		
		return "Geom ("+(int)this.firstValue()+","+(int)this.commonFactor+")";
		
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("Invalid argument value"); 
		 

		return this.firstValue() +(this.commonFactor)*(n-1); 
	}

}
