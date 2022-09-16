//$Id$
package operator;

public class OperatorLogic 
{
	
	public int add(int firstNo, int secondNo)
	{
		return firstNo+secondNo;
	}
	
	public int sub(int firstNo, int secondNo)
	{
		return firstNo-secondNo;
	}
	
	public int mul(int firstNo, int secondNo)
	{
		return firstNo*secondNo;
	}
	
	public int div(int firstNo, int secondNo)
	{
		return firstNo/secondNo;
	}
	
	public int mod(int firstNo, int secondNo)
	{
		return firstNo%secondNo;
	}
	

	public int getMaximum(int firstNo, int secondNo)
	{	
		return (firstNo>secondNo)?firstNo:secondNo;
	}

}
