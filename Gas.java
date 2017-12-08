package Agricultural;

public class Gas {
	
	  // As taxas de gases são definidas em porcentagem
    private float oxygenRate;
    private float nitrogenRate;
    private float humidity;
    private float carbonDioxideRate;

    public Gas(float oxygenRate, float nitrogenRate, float humidity, float carbonDioxideRate)
    {
        this.oxygenRate = oxygenRate;
        this.nitrogenRate = nitrogenRate;
        this.humidity = humidity;
        this.carbonDioxideRate = carbonDioxideRate;
    }

    public float getOxygenRate()
    {
        return oxygenRate;
    }

    public void setOxygenRate(float oxygenRate)
    {
        this.oxygenRate = oxygenRate;
    }

    public float getNitrogenRate()
    {
        return nitrogenRate;
    }

    public void setNitrogenRate(float nitrogenRate)
    {
        this.nitrogenRate = nitrogenRate;
    }

    public float getHumidity() {

        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getCarbonDioxideRate()
    {
        return carbonDioxideRate;
    }

    public void setCarbonDioxideRate(float carbonDioxideRate)
    {
        this.carbonDioxideRate = carbonDioxideRate;
    }


	public String toString() {
		return "Gas [oxygenRate=" + oxygenRate + ", nitrogenRate=" + nitrogenRate + ", humidity=" + humidity
				+ ", carbonDioxideRate=" + carbonDioxideRate + "]";
	}
    
    
}
