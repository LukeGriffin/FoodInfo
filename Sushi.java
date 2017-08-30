
public class Sushi extends Food { //Inherits all fields and methods from Food
	
	Sushi()
	{
		super();
	}
	
	public void getPrepTime() // Using Polymorphism and overwriting methods inherited from super
	{
		System.out.println("Since this is Sushi, we'll add 30 mins to prep time and its now " + (prepTime + 30) + " mins");
	}

}
