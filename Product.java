package Agricultural;

public class Product
{
    private String Type; // Apple, banana, strawberry, gold, iron...
    private boolean inStock;
    private int amountOf;

    public Product(String type)
    {
        Type = type;
        inStock = true;
        this.amountOf = 0;
    }

    public String getType()
    {
        return Type;
    }

    public boolean isInStock()
    {
        return inStock;
    }

    public void setInStock(boolean is)
    {
        this.inStock = is;
    }

    public void withDrawFromStock()
    {
        inStock = false;
    }

    public int getAmountOf()
    {
        return amountOf;
    }

    public void increaseAmountOf(int amountOf)
    {
        this.amountOf += amountOf;
    }

    public void setAmountOf(int amount)
    {
        this.amountOf = amount;
    }

    public boolean decreaseAmountOf(int amount)
    {
        if (amount > this.amountOf)
        {
            return false;
        }
        else
        {
            this.amountOf -= amount;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Product [Type=" + Type + ", inStock=" + inStock + ", amountOf=" + amountOf + "]";
	}
    
    
}
