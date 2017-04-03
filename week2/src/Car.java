
public class Car implements Valuable{
	String name;
	double price;
	final double de_rate = 0.99;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public double EstimateValue(int month){
		return getPrice()*0.8*Math.pow(de_rate, month);
	}
	
	@Override
	   public String toString(){
	      return String.format("car name: %s\ninitial price: %.2f", getName(),getPrice());
	   }
}
