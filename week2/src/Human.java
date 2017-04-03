
public class Human implements Valuable {
	String name;
	int age;
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public double EstimateAmount(int month){
		return Double.POSITIVE_INFINITY;
	}

}
