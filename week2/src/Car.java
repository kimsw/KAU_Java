
public class Car implements Valuable{
	String name;
	double price;
	final double de_rate = 0.9;
	
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
	public double EstimateAmount(int month){
		return getPrice()*0.8*Math.pow(de_rate, month);
	}
	
}
