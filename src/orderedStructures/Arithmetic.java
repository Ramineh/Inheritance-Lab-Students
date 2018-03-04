package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(firstValuerun==false) throw new  IllegalStateException("Operation firstValue needs to run first");
		current = current + commonDifference; 
		return current;
	}
	
public String toString() {
		
		return "arith ("+(int)this.firstValue()+","+(int)this.commonDifference+")";
		
	}



@Override
public double getTerm(int n) throws IndexOutOfBoundsException { 
	if (n <= 0) 
		throw new IndexOutOfBoundsException("Invalid argument value = " + n); 
	 

	return this.firstValue() +(this.commonDifference)*(n-1); 
}



@Override
public  void add( Progression q, int l) {
	
	double add;
	add=this.firstValue()+q.firstValue();
		System.out.println("Added Arithmetic Progression");
		System.out.println(add+ ", ");
	
	for (int i=1;i<l;i++) {
	
		add=this.nextValue()+q.nextValue();
		
		System.out.println(add+ ", ");

		}
	}
public void subtract (Progression q, int l) {
double subtract;
subtract=this.firstValue()-q.firstValue();
System.out.println("Subtracted Arithmetic Progression");
System.out.println(subtract+ ", ");

for (int i=1;i<l;i++) {

subtract=this.nextValue()-q.nextValue();

System.out.println(subtract+ ", ");

}
}












}
