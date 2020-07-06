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

	private static void purchaseSnacks(Customer customer, Snack snack, int multiplier)
	{
		customer.setCashOnHand(customer.getCashOnHand() - snack.getCost() * multiplier);
		snack.setQuantity(snack.getQuantity() - 3);
		System.out.println(customer.updateStatus()+"\n"+snack.updateStatus()+ "\r\n");
	}

	private static void vendForCustomers()
	{
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

		purchaseSnacks(jane, soda, 3);
		purchaseSnacks(jane, pretzel, 1);
		purchaseSnacks(bob, soda, 2);

		jane.setCashOnHand(jane.getCashOnHand() + 10.00);
		System.out.println(jane.updateStatus()+ "\r\n");

		purchaseSnacks(jane, chocolateBar, 1);

		pretzel.setQuantity(pretzel.getQuantity() + 12);
		System.out.println(pretzel.updateStatus()+ "\r\n");
		
		purchaseSnacks(bob, pretzel, 3);
		
		printInfo(chips, food);
		printInfo(chocolateBar, food);
		printInfo(pretzel, food);
		printInfo(soda, drink);
		printInfo(water, drink);
	}
	public static void main(String[] args)
	{
		vendForCustomers();
	}
}