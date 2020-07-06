package snackBarApp;

public class Snack
{
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;// creating a new snack will incriment this number
		id = maxId;// will assign current max id to snack's id
		this.name = name;// will assign a name to the snack
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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
	public double getCost()
	{
		return cost;
	}
	public int getVendingMachineId()
	{
		return vendingMachineId;
	}
	public int getQuantity()
	{
		return quantity;
	}

	// setters
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public void setVendingMachineId(int vendingMachineId)
	{
		this.id = vendingMachineId;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	// other methods
	public String updateStatus()
	{
		return "Quantity of snack "+this.getId()+" is "+this.getQuantity();
	}
}