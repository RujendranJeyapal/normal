//$Id$
package hashmap;

import java.util.HashMap;

import utility.CustomException;
import utility.Utility;

public class HashMapLogic 
{
	
	HashMap<Object,Object> actualMap=new HashMap<>();
        
	public int sizeOfMap(  ) 
	{
		
		return actualMap.size();
		
	}
	
	public void addToHashMap( Object key,Object value ) 			
	{

		actualMap.put( key , value );
		
	}
	
	public boolean isKeyExistInHashMap( Object key ) 
	{
		
		return actualMap.containsKey( key );
		
	}
	
	
	public boolean isValueExistInHashMap( Object value ) 
	{

		return actualMap.containsKey( value );
		
	}
	
	public Object getValueFromKey( Object key ) 
	{
		return actualMap.get(key);
	}
	   
	
	
	
}
