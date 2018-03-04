package orderedStructures;

public  class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		double temp=current;
      
		current=current+prev;
		prev=temp;
        	
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

public String toString() {
		
		return "Fibo";
		
	}
@Override
public void add(Progression q, int l) {
	double add;
	add=this.firstValue()+q.firstValue();
		System.out.println("Added Fibonacci Progression");
		System.out.println(add+ ", ");
	
	for (int i=1;i<l;i++) {
	
		add=this.nextValue()+q.nextValue();
		
		System.out.println(add+ ", ");

		}
	}

public void subtract(Progression q, int l) {
	double subtract;
	subtract=this.firstValue()-q.firstValue();
	System.out.println("Subtracted Fibonacci Progression");
	System.out.println(subtract+ ", ");

	for (int i=1;i<l;i++) {

	subtract=this.nextValue()-q.nextValue();

	System.out.println(subtract+ ", ");

	}
}
	// TODO Auto-generated method stub
	




}
