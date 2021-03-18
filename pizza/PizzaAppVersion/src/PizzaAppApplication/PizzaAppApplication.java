package PizzaAppApplication;


public class PizzaAppApplication {

	

	public static void main(String[] args) {
		
		String pizzaName =PizzaConstants.VEG_EXTRAVAGANZA_PIZZA;
		String size =PizzaConstants.SIZE_MEDIUM;
		String crust =PizzaConstants.CRUST_NEW_HAND_TOSTED;
	    int price=PizzaConstants.PRICE_VEG_EXTRAVAGANZA;
		String toppings =PizzaConstants.TOPPING_VEG_EXTRA_VAGANZA;
		
		System.out.println("------------your pizza detail------");
		
		System.out.println("pizza Name :"+pizzaName);
		System.out.println("size:"+size);
		System.out.println("crust :"+crust);
		System.out.println("price :"+price);
		System.out.println("toppings :"+toppings);

	}

}
