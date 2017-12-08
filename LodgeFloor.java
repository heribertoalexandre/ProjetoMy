package Agricultural;

public class LodgeFloor extends Floor
{
    private int maxCapacity;
    private int currentPeopleAmount;
    private Employee[] lodgers = new Employee[maxCapacity];
    private int lodgersIndex;

    public LodgeFloor (int maxCapacity, double pressure, double temperature, Gas gases)
    {
        super(pressure, temperature, gases);
        this.currentPeopleAmount = 0;
        this.maxCapacity = maxCapacity;
        lodgersIndex = 0;
    }

    public boolean settleEmployee(Employee employee)
    {
        if(employee == null)
            return false;
        for(int i = 0 ; i < lodgers.length ; i++)
            if(lodgers[i].getId() == employee.getId())
                return false;

        if (lodgersIndex == lodgers.length)
            this.duplicateArray();
        employee.setLodgeId(this.getId());
        lodgers[lodgersIndex] = employee;
        lodgersIndex++;
        currentPeopleAmount++;
        return true;
    }

    private void duplicateArray()
    {
        Employee[] duplicatedArray = new Employee[lodgers.length*2];
        for (int i = 0; i < lodgers.length; i++) {
            duplicatedArray[i] = lodgers[i];
        }
        lodgers = duplicatedArray;
    }

    public boolean removeEmployee(int id)
    {
        for(int i = 0 ; i < lodgers.length ; i++) {
            if(lodgers[i].getId() == id)
            {
                lodgers[i].setLodgeId(0);
                return true;
            }
        }
        currentPeopleAmount--;
        return false;
        
    }

    public int getCurrentPeopleAmount()
    {
        return currentPeopleAmount;
    }
}