package snackBarApp;

public class Main
{
	
	private static void printInfo(Snack snack, VendingMachine vend)
	{
		System.out.println("Snack: "+snack.getName());
		System.out.println("Vending Machine: "+vend.getName());
		System.out.println("Quantity: "+snack.getQuantity());
		System.out.println("Total Cost: $"+snack.getQuantity() * snack.getCost()+ "\r\n");
	}

	private static void purchaseSnacks(Customer customer, Snack snack, int multiplier, boolean more)
	{
		customer.setCashOnHand(customer.getCashOnHand() - snack.getCost() * multiplier);
		snack.setQuantity(snack.getQuantity() - 3);
		if(more)
		{
			System.out.println(customer.updateStatus()+"\n"+snack.updateStatus()
				+ "\r\n");
		}
	}



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

		purchaseSnacks(jane, soda, 3, true);
		purchaseSnacks(jane, pretzel, 1, true);
		purchaseSnacks(bob, soda, 2, true);

		jane.setCashOnHand(jane.getCashOnHand() + 10.00);
		System.out.println(jane.updateStatus()+ "\r\n");

		purchaseSnacks(jane, chocolateBar, 1, true);

		pretzel.setQuantity(pretzel.getQuantity() + 12);
		System.out.println(pretzel.updateStatus()+ "\r\n");
		
		purchaseSnacks(bob, pretzel, 3, true);

		// jane.setCashOnHand(jane.getCashOnHand() - soda.getCost() * 3);
		// soda.setQuantity(soda.getQuantity() - 3);
		// System.out.println(jane.updateStatus());
		// System.out.println(soda.updateStatus()+ "\r\n");

		// jane.setCashOnHand(jane.getCashOnHand() - pretzel.getCost() * 1);
		// pretzel.setQuantity(pretzel.getQuantity() - 1);
		// System.out.println(jane.updateStatus());
		// System.out.println(pretzel.updateStatus()+ "\r\n");

		// bob.setCashOnHand(bob.getCashOnHand() - soda.getCost() * 2);
		// soda.setQuantity(soda.getQuantity() - 2);
		// System.out.println(bob.updateStatus());
		// System.out.println(soda.updateStatus()+ "\r\n");

		// jane.setCashOnHand(jane.getCashOnHand() + 10.00);
		// System.out.println(jane.updateStatus()+ "\r\n");

		// jane.setCashOnHand(jane.getCashOnHand() - chocolateBar.getCost() * 1);
		// chocolateBar.setQuantity(chocolateBar.getQuantity() - 1);
		// System.out.println(jane.updateStatus());
		// System.out.println(chocolateBar.updateStatus()+ "\r\n");

		// pretzel.setQuantity(pretzel.getQuantity() + 12);
		// System.out.println(pretzel.updateStatus()+ "\r\n");

		// bob.setCashOnHand(bob.getCashOnHand() - pretzel.getCost() * 3);
		// pretzel.setQuantity(pretzel.getQuantity() - 3);
		// System.out.println(bob.updateStatus());
		// System.out.println(pretzel.updateStatus());

		printInfo(chips, food);
		printInfo(chocolateBar, food);
		printInfo(pretzel, food);
		printInfo(soda, drink);
		printInfo(water, drink);

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