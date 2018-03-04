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

	@Override
	public void add(Progression q, int l) {
		double add;
		add=this.firstValue()+q.firstValue();
		System.out.println("Added geometric Progression");
			System.out.println(add+ ", ");
		
		for (int i=1;i<l;i++) {
		
			add=this.nextValue()+q.nextValue();
			
			System.out.println(add+ ", ");

			}
	}
	public void subtract (Progression q, int l) {
		double subtract;
		subtract=this.firstValue()-q.firstValue();
		System.out.println("Subtracted Geometric Progression");
		System.out.println(subtract+ ", ");

		for (int i=1;i<l;i++) {

		subtract=this.nextValue()-q.nextValue();

		System.out.println(subtract+ ", ");

		}
		}







	

}
