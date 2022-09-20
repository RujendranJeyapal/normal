//$Id$
package inheritance;

public class Parrot extends Bird
{
        
	      
	      
	    public void speak()
	    {
	    	
	    	
	    	  System.out.println("Am speaking");
	    }

		@Override
		protected void colour() 
		{
			System.out.println("Green");
			
		}
	      
	 
	 
	
	
}
