class Fruit
{
	final void show()	
	{  
		System.out.println("Fruit class created");
	}
}
 
class Apple extends Fruit
{
	void show()
	{
		System.out.println("Apple class created");
	}


public static void main(String args[])
{
	Apple ap = new Apple();
	ap.show();
}
}
