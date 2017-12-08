package Agricultural;

public class ContainerRepository 
{
	private Container[] containers;
	private int next;
	
	public ContainerRepository(int size) 
	{
		this.containers = new Container[size];
		this.next = 0;
	}
	
	public void register(Container c)
	{
		this.containers[this.next] = c;
		this.next += 1;
		if (this.next == this.containers.length)
		{
			this.duplicateContainerArray();
		}
	}
	
	public void register()
	{
		Container c = new Container();
		this.register(c);
	}
	
	public Container  search(Container c)
	{
		int s = searchIndex(c);
		Container result = null;
		if(s != this.next) 
		{
			result = this.containers[s];
		}
		return result;
	}
	
	
	public int searchIndex(Container c)
	{
		int i = 0;
		boolean found = false;
		while ((!found) && i < this.next)
		{
			if (c.equals(containers[i]))
			{
				found = true;
			}
			else
			{
				++i;
			}
		}
		return i;
	}
	
	private void duplicateContainerArray()
	{
		int i;
		if (this.containers != null && this.containers.length > 0) 
		{
			Container[] duplicatedArray = new Container[this.containers.length * 2];
            for (i = 0; i < this.containers.length; ++i) 
            {
            	duplicatedArray[i] = this.containers[i];
            }
            this.containers = duplicatedArray;
        }
	}
	
	public void remove(Container c)
	{
		int i = this.searchIndex(c);
        if (i != this.next) 
        {
            this.containers[i] = this.containers[this.next - 1];
            this.containers[this.next - 1] = null;
            this.next -= 1;
        }
	}
	
	public boolean exist(Container e)
	{
		boolean exist = false;
		if (searchIndex(e) != this.next)
		{
			exist = true;
		}
		return exist;
	}
}