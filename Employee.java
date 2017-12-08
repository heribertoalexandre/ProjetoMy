package Agricultural;

public class Employee {

    private static int id;
    private String name;
    private String gender;
    private String login;
    private String password;
    private int permission;
    private String businessPosition;
    private boolean activated;
    private float salary;
    private int lodgeId;

    public Employee (String name, String gender, String login, String password,int permission,String businessPosition, boolean activated, float salary) {
    	this.name = name;
    	this.gender = gender;
    	this.login = login;
    	this.password = password;
    	this.permission = permission;
    	this.businessPosition = businessPosition;
    	this.activated = activated;
    	this.salary = salary;
    	
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPermission() {
        return permission;
    }

    private void setPermission() {
        if (this.businessPosition.equals("Supervisor")){
            this.permission = 1;
        }
        else if(this.businessPosition.equals("Trabalhador Regular")){
            this.permission = 2;
        }
    }

    public String getBusinessPosition() {
        return businessPosition;
    }

    public void setBusinessPosition(String businessPosition) {
        this.businessPosition = businessPosition;
        setPermission();
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public int getLodgeId()
    {
        return lodgeId;
    }

    public void setLodgeId(int lodgeId)
    {
        this.lodgeId = lodgeId;
    }
	
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", login=" + login + ", password=" + password
				+ ", permission=" + permission + ", businessPosition=" + businessPosition + ", activated=" + activated
				+ ", salary=" + salary + "]";
	}
    
   

}