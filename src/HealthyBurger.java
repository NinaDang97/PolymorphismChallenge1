
public class HealthyBurger extends Burger{
	
	public HealthyBurger() {
		super("Health Burger", "Brown rye bread roll");
		// TODO Auto-generated constructor stub
	}
	
	public void addAdditions(boolean lettuce, boolean tomato, boolean carrot, boolean ham, boolean mustard, boolean ketchup) {
		// TODO Auto-generated method stub
		super.addAdditions(lettuce, tomato, carrot, ham);
		if(mustard == true){
			additions.add(mustard);
			System.out.println("MUSTARD");
		}
		if(ketchup == true){
			additions.add(ketchup);
			System.out.println("KETCHUP");
		}
		
	}
		
	@Override
	public void additionalPrice() {
		// TODO Auto-generated method stub
		super.additionalPrice();
	}

	@Override
	public double getBase_price() {
		// TODO Auto-generated method stub
		return super.getBase_price();
	}

	@Override
	public String calculatePrice() {
		// TODO Auto-generated method stub
		return super.calculatePrice();
	}
	
	
	
}
