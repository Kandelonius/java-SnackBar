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

		Snack chips = new Snack("Chips", 36, 1.75, 0);
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 0);
		Snack pretzel = new Snack("Pretzel", 30, 2.00, 0);
		Snack soda = new Snack("Soda", 24, 2.50, 1);
		Snack water = new Snack("Water", 20, 2.75, 1);


		// System.out.println(chips.name);
	}
	public static void main(String[] args)
	{
		vendForCustomers();
	}
}