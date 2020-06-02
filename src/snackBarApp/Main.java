package snackBarApp;

public class Main
{
	
	private static void vendForCustomers()
	{
		//Customer(String name, double cashOnHand)
		//VendingMachine(String name)
		//Snack(String name, int quantity, double cost, int vendingMachineId)
		System.out.println("Greetings hungry office worker!");

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, 1);
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
		Snack soda = new Snack("Soda", 24, 2.50, 2);
		Snack water = new Snack("Water", 20, 2.75, 2);

		jane.setCashOnHand(jane.getCashOnHand() - soda.getCost() * 3);
		soda.setQuantity(soda.getQuantity() - 3);
		System.out.println("/n"+ jane.updateStatus());
		System.out.println(soda.updateStatus());
		jane.setCashOnHand(jane.getCashOnHand() - pretzel.getCost() * 1);
		pretzel.setQuantity(pretzel.getQuantity() - 1);
		System.out.println("/n"+ jane.updateStatus());
		System.out.println(pretzel.updateStatus());
		bob.setCashOnHand(bob.getCashOnHand() - soda.getCost() * 4);
		soda.setQuantity(soda.getQuantity() - 3);
		System.out.println("/n"+ bob.updateStatus());
		System.out.println(soda.updateStatus());

		// jane.updateStatus();
		// soda.updateStatus();
		// purchaseSnacks(jane, soda, jane.getCashOnHand(), soda.getCost(), soda.getQuantity(), 3);

	}
	// public static void purchaseSnacks(Object Customer, Object Snack, double getCOH, double getCost, int getQuantity, int itemsPurchased)
	// {
	// 	System.out.println(getCOH);
	// 	System.out.println(getCost);
	// 	System.out.println(getQuantity);
	// 	// System.out.println(Customer.name);
	// 	// setCashOnHand(getCOH() - getCost() * itemsPurchased);
	// 	// setQuantity(getQuantity() - itemsPurchased);
	// }
	public static void main(String[] args)
	{
		vendForCustomers();
	}
}