package snackBarApp;

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// getters
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCashOnHand()
	{
		return cashOnHand;
	}
	
	// setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCashOnHand(double cashOnHand)
	{
		this.cashOnHand = cashOnHand;
	}

	// other methods
	public String updateStatus()
	{
		return "Customer "+this.getId()+" cash on hand = $"+this.getCashOnHand();
	}
	// public boolean spendMoney()
	// {
	// 	return 
	// }
}
