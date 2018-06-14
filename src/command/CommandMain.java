package command;

public class CommandMain {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		waiter.orderDishs("Mutton");
		waiter.orderDishs("Meet");
		waiter.orderDishs("Chicken");
		
		waiter.placeOrder();
	}
	
}
