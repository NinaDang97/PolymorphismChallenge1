
public class DeluxeBurger extends Burger {

	public DeluxeBurger() {
		super("Deluxe Burger", "Deluxe huge burger");
		// TODO Auto-generated constructor stub
	}

	public void addAdditions(boolean chips, boolean drinks) {
		// TODO Auto-generated method stub
		System.out.println("Additional additions you added: ");
		if(chips == true){
			additions.add(chips);
			System.out.println("CHIPS");
		}
		if(drinks == true){
			additions.add(drinks);
			System.out.println("DRINKS");
		}
	}

	@Override
	public String calculatePrice() {
		// TODO Auto-generated method stub
		return super.calculatePrice();
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
	
	
}
