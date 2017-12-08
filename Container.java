package Agricultural;

import java.util.ArrayList;

public class Container
{
    private static int nextId = 0;
    private ArrayList<Floor> floors = new ArrayList<Floor>();
    private int containerId;
    private int amountOfFloors = 0;

    public Container()
    {
        nextId++;
        containerId = nextId;
    }

    public int getContainerId()
    {
        return containerId;
    }

    public int getAmountOfFloors()
    {
        return amountOfFloors;
    }

    public ArrayList<Floor> getFloors()
    {
        return floors;
    }

    public void addFloor(Floor floor)
    {
        floors.add(floor);
        amountOfFloors++;
    }
}