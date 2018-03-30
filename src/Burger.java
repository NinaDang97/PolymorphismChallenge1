import java.util.ArrayList;
import java.util.List;

public class Burger {
	private String name;
	private String breadRollType;
	private boolean meat;
	private double base_price;
	
	private double final_price;
	
	public Burger(String name, String breadRollType) {
		this.name = name;
		this.breadRollType = breadRollType;
		this.meat = true;
		this.base_price = 2;
	}
	
	public List<Boolean> additions = new ArrayList<Boolean>();
	public double addedPrice = 0.5;
	
	public void addAdditions(boolean lettuce, boolean tomato, boolean carrot, boolean ham){
		System.out.println("Additional additions you added: ");
		if(lettuce == true){
			additions.add(lettuce);	
			System.out.println("LETTUCE");
		}		
		if(tomato == true){
			additions.add(tomato);
			System.out.println("TOMATO");
		}
		if(carrot == true){
			additions.add(carrot);
			System.out.println("CARROT");
		}
		if(ham == true){
			additions.add(ham);
			System.out.println("HAM");
		}
	}
	
	public String calculatePrice(){
		this.final_price = this.base_price + addedPrice * this.additions.size();
		return "(" + this.name + ", " +  this.breadRollType + "): " + this.final_price;		
	}
	
	public void additionalPrice(){
		double additionalPrice = this.addedPrice * this.additions.size();
		System.out.println("Additional Price: " + additionalPrice);
	}
	
	public double getBase_price() {
		return base_price;
	}

	public void setBase_price(double base_price) {
		this.base_price = base_price;
	}

	public double getFinal_price() {
		return final_price;
	}
	
	
}
