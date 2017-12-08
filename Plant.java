package Agricultural;
import java.util.Random;


public class Plant {
	
	//Attributes
	private String productName = new String();
	private String lifeStage = new String();
	private int lifeTime; // 1 until 10
	private boolean  isIrrigated;
	private boolean  isRipe; // not necessary
	private boolean fertilized;
	private boolean isAlive;
	private String simbolo = new String();
	
	//Construct
	public Plant(String productName) {
		this.productName = productName;
		this.lifeStage = "broto";
		this.lifeTime = 1;
		this.isIrrigated = false;
		this.isRipe = false;
		this.fertilized = false;
		this.isAlive = true;
	}
	
	//Getters and Setters
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getLifeStage() {	
		return this.lifeStage;
	}
	private void setLifeStage() {
		String stages[] = {"Germinação","Broto","Planta","Maturação","Morta"};
		int actualStage = this.lifeTime / 2;
		this.lifeStage = stages[actualStage];	
	}
	public int getLifeTime() {
		return lifeTime;
	}
	public void setLifeTime() {
		++this.lifeTime;
		if(this.lifeTime == 10)
			this.setAlive();
		this.setLifeStage();
	}
	public boolean isIrrigated() {
		return isIrrigated;
	}
	public void setIsIrrigated() {
		this.isIrrigated = true;
	}
	public boolean isRipe() {
		return isRipe;
	}
	public void setRipe() {
		this.isRipe = true;
	}
	public boolean isFertilized() {
		return fertilized;
	}
	public void setFertilized() {
		this.fertilized = true;
	}
	public boolean isAlive() {
		return isAlive;
	}
	private void setAlive() {
		this.isAlive = true;
	}
	
	
	//Methods
	public int toBearFruit () {
		if(isAlive) {
			Random random = new Random();
			int x = random.nextInt(5) + 1;
			int fruitGeneration = (this.lifeTime / 4) * x;
			if(this.fertilized == true)
				fruitGeneration *= 2;
			if(this.isIrrigated == true)
				fruitGeneration += 3;
			return fruitGeneration;
		}
		return 0;
	}
	
	public String map() {
		simbolo = "";
		
		if(this.fertilized == true) 
			simbolo += " *";
		else
			simbolo += " x";
			
		if(this.isIrrigated  == true)
			simbolo +=" *";
		else
			simbolo += " x";
		
		if(this.isRipe  == true)
			simbolo +=" *";
		else
			simbolo += " x";
		
		simbolo += " ";
		
		return simbolo;
	}
	
	
	//toString
	public String toString() {
		return "Plant [Nome = " + productName + ", Estágio de Vida = " + lifeStage + ", Irrigada = " + isIrrigated + ", Madura = "
				+ isRipe + ", Adubada = " + fertilized + ", Tempo de Vida = " + "(" + lifeTime +  "/10)" + "]";
	}
	
	
	
}
