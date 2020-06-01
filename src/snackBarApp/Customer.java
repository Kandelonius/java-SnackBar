package snackBarApp;

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
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
	
	// setters
		public void setName(String name)
	{
		this.name = name;
	}
}
