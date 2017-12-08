package Agricultural;

import java.util.Arrays;

public class Stock 
{
	private int maximumCapacity;
	private Product[] products;
	private int next;
	
	public Stock(int size)
	{
		this.maximumCapacity = size;
		this.products = new Product[this.maximumCapacity];
		this.next = 0;
	}
	
	public int getMaximumCapacity()
	{
		return maximumCapacity;
	}

	public void addProduct(Product product, int amount)
	{
		Product p = search(product.getType());
		if (p == null && product != null)
		{
			this.products[next] = product;
			this.next += 1;
		}
		
		else if (p != null && p.isInStock() == true)
		{
			p.increaseAmountOf(amount);
		}
	
		if (this.next == products.length)
		{
			expandStock();
		}
	}
	
	public Product search(String type)
	{
		Product result = null;
		int s = searchIndex(type);
		if (s != this.next && s >= 0)
		{
			result = this.products[s];
		}
		return result;
	}
	
	public int searchIndex(String type)
	{
		int p = -1;
		for (int i = 0; i < this.products.length; ++i)
		{
			if (products[i].getType().equals(type))
			{
				p = i;
			}
		}
		return p;
	}
	
	public void removeProduct(Product product)
	{
		int r = searchIndex(product.getType());
		if (r != this.next && r >= 0)
		{
			product.setAmountOf(0);
			product.setInStock(false);
			this.products[r] = products[this.next - 1];
			this.products[this.next - 1] = null;
			this.next -= 1;
		}
	}
	
	private void expandStock()
	{
		if (this.products != null && this.products.length > 0)
		{
			Product[] duplicatedProducts = new Product[this.products.length * 2];
			for (int i = 0; i < this.products.length; ++i)
			{
				duplicatedProducts[i] = this.products[i];
			}
			this.products = duplicatedProducts;
			this.maximumCapacity = this.products.length;
		}
	}

	
	public String toString() {
		return "Stock [maximumCapacity=" + maximumCapacity + ", products=" + Arrays.toString(products) + ", next="
				+ next + "]";
	}
	
	
}