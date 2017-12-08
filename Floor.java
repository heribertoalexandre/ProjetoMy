package Agricultural;


public class Floor {

	private static int nextId = 1;
	private int id;
	private double pressure;
	private double temperature;
	private Gas gases;

	public Floor(){} // No-argument Constructor

	public Floor(double pressure, double temperature, Gas gases)
	{
		this.pressure = pressure;
		this.temperature = temperature;
		this.gases = gases;
		id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}	
}