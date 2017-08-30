/*This is a OOP example that uses a lot of common OOP 
 * practices(Polymorphism, Encapsulation, Inheritance, Interfaces)
 */



public class FoodSearch {
	
	public static void main(String[] args)
	{
		Food foodObj = new Food("Okay"); //Calls the Constructor that only receives 1 parameter
		System.out.println("This food is " + foodObj.getEdible());
		System.out.println("This food tastes " + foodObj.getTaste()); //The Constructor set this value
		
		Food sushiObj = new Sushi();
		sushiObj.getPrepTime(); // This calls the SUSHI method getPrepTime rather than the Food method
		
		Cake cakeObj = new Cake(); 
		cakeObj.setEdible(false); //Calls the Super's method.
		cakeObj.setTaste("Bad"); //Just for an example. Cake is ALWAYS good
		cakeObj.setTimeToCook(25); // This is a Cake class method that accepts an int
		cakeObj.prepFood();
		cakeObj.putInOven(); // This method puts the cake in the oven and then calls takeOutFood

	}

}
