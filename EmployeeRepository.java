package Agricultural;


public class EmployeeRepository 
{
	private Employee[] employees;
	private int next;
	
	public EmployeeRepository(int size) 
	{
		this.employees = new Employee[size];
		this.next = 0;
	}
	
	public void register(Employee e)
	{
		this.employees[this.next] = e;
		this.next += 1;
		if (this.next == this.employees.length)
		{
			this.duplicateEmployeeArray();
		}
	}
	
	public void register(String name, String gender, String login, String password, int permission, String businessPosition, 
			boolean activated, float salary)
	{
		Employee e = new Employee(name, gender, login, password, permission, businessPosition, activated, salary);
		this.register(e);
	}
	
	public Employee search(Employee e)
	{
		int s = searchIndex(e);
		Employee result = null;
		if(s != this.next) 
		{
			result = this.employees[s];
		}
		return result;
	}
	
	
	public int searchIndex(Employee e)
	{
		int i = 0;
		boolean found = false;
		while ((!found) && i < this.next)
		{
			if (e.equals(employees[i]))
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
	
	private void duplicateEmployeeArray()
	{
		int i;
		if (this.employees != null && this.employees.length > 0) 
		{
            Employee[] duplicatedArray = new Employee[this.employees.length * 2];
            for (i = 0; i < this.employees.length; ++i) 
            {
            	duplicatedArray[i] = this.employees[i];
            }
            this.employees = duplicatedArray;
        }
	}
	
	public void remove(Employee e)
	{
		int i = this.searchIndex(e);
        if (i != this.next) 
        {
            this.employees[i] = this.employees[this.next - 1];
            this.employees[this.next - 1] = null;
            this.next -= 1;
        }
	}
	
	public boolean exist(Employee e)
	{
		boolean exist = false;
		if (searchIndex(e) != this.next)
		{
			exist = true;
		}
		return exist;
	}
}