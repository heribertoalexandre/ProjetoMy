package Agricultural;

public class Port
{
	private String name;
	private int capacity;
	private Stock stock;
	
	public Port(String name, int capacity, Stock stock)
	{
		this.name = name;
		this.stock = stock;
		this.capacity = capacity;
	}
	
	public String getName() 
	{
		return name;
	}

	public int getCapacity() 
	{
		return capacity;
	}

	public void importProduct(Product product, int amount)
	{
		this.stock.addProduct(product, amount);
		this.capacity += amount;
	}
	
	public void export(Product product, int amount)
	{
		Product p = stock.search(product.getType());
		
		if (p != null && product != null && p.isInStock() == true && p.getAmountOf() >= amount 
				&& amount <= this.capacity)
		{
			p.decreaseAmountOf(amount);
			this.capacity -= amount;
		}
	}

	@Override
	public String toString() {
		return "Port [name=" + name + ", capacity=" + capacity + ", stock=" + stock + "]";
	}
	
	
}
