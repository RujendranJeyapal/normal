//$Id$
package inheritance;



public class TestRunner 
{

	public static void main(String[] args) 
	{
		
		Bird oneBird=new Bird();
		
		         oneBird.fly();
		
		         oneBird.colour();
		
		Parrot oneParrot=new Parrot();
		
		         oneParrot.fly();
		
		         oneParrot.speak();
		    
		         oneParrot.colour();
		
		
		
		Bird anotherBird=new Parrot();
		
		
		
		        anotherBird.fly();
		
		//anotherBird.speak();
		
		       anotherBird.colour();
		

	}

}
