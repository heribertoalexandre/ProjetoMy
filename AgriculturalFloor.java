package Agricultural;
import java.util.ArrayList;

public class  AgriculturalFloor extends Floor {

    private int maxCapacity;
	private int currentAmountOfPlants;
	public ArrayList<Plant> plantation = new ArrayList<Plant>();

    public AgriculturalFloor(double pressure, double temperature, Gas gases, int maxCapacity)
    {
        super(pressure, temperature, gases);
        this.maxCapacity = maxCapacity;
        this.currentAmountOfPlants = 0;
    }


	public int getCurrentAmountOfPlants()
    {
		return currentAmountOfPlants;
	}
	public void setCurrentAmountOfPlants()
    {
		this.currentAmountOfPlants += 1;
	}
	public ArrayList<Plant> getPlantation() {
		return this.plantation;
	}
	
	//Methods
	
	public void toIrrigated() {
		for(int count = 0; count < plantation.size(); count++)
			plantation.get(count).setIsIrrigated();
	}
	
	public void toFertilize () {
		for(int count = 0; count < plantation.size(); count++)
			plantation.get(count).setFertilized();
	}
	
	public void toPlant(Plant plant, int x ) {
		
		int count = 0;
		boolean exhausted = false;
		while(count <= x  &&  exhausted == false);
		{
			if(this.currentAmountOfPlants + 1 <= this.maxCapacity){
				plantation.add(plant);
				this.setCurrentAmountOfPlants();
				++count;
			}else
				exhausted = true;
		}
	}
	
	public int spoon() {
		int sumOfTheCrop = 0;
		for(int count = 0; count < plantation.size(); count++)
		{
			sumOfTheCrop += plantation.get(count).toBearFruit();
		}
		return sumOfTheCrop;
		
	}
	
	


	public String toString() {
		return "AgriculturalFloor [Quantidades de plantas = " + currentAmountOfPlants + ", id = " + this.getId() + ", capacidade = " + maxCapacity + ", pressao = "
				+ this.getPressure() + ", temperatura = " + this.getPressure() + "]";
	}
	
	
}
