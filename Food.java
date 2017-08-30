//This is the superclass for all classes in this program


public class Food {
	
//Fields that all classes of food have
	
	private boolean isEdible; 
	private String taste;
	protected int prepTime = 10; // Like private but subclasses can use this field. Protected variables are risky
	
	
	Food() // Default Constructor
	{
		this.taste = "Good";
		this.isEdible = true;
	}
	
	Food(String taste) // Constructor if you pass in 1 parameter
	{
		this.taste = taste;
		this.isEdible = true;
	}
	
	Food(String taste, boolean isEdible) // Constructor if you pass in 2 parameters
	{
		this.taste = taste;
		this.isEdible = isEdible;
	}
	
//Mutator and Accessor methods for the private fields
	
	public void setEdible(boolean isEdible)
	{
		this.isEdible = isEdible;
	}
	
	public boolean getEdible()
	{
		return this.isEdible;
	}
	
	public void setTaste(String taste)
	{
		this.taste = taste;
	}
	
	public String getTaste()
	{
		return this.taste;
	}
	
	public void getPrepTime()
	{
		System.out.println("Prep time is " + prepTime);
	}
	
}
