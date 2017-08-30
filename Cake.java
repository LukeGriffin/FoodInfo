
public class Cake extends Food implements Cookable { // Uses Interface Cookable

	private int timeToCook; // Cake has this field and fields inherited from Food
	
	
	Cake()
	{
		super(); // Calls the default constructor from the parent class Food
	}
	
	public void prepFood() {
		System.out.println("Stir eggs, milk, etc.. ");
		
	}
	

//This method puts the food in the oven and uses a For loop to count down from passed in timeToCook
	public void putInOven() {
		System.out.println("Put food in the oven");
		for(int x = this.timeToCook; x > 0; x--)
		{
			System.out.println(x + " minutes left!");
		}
		
		System.out.println("Cake is done");
		takeOutFood();
		
	}
//This method is automatically called after food is putInOven and done cooking
	public void takeOutFood() {
		System.out.println("Take food out of the oven");
		
	}
	
	public void setTimeToCook(int timeToCook)
	{
		this.timeToCook = timeToCook;
	}
	
}