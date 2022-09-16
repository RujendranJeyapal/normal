//$Id$
package hashmap;

import java.util.HashMap;


public class HashMapLogic 
{
	
	private HashMap<Object,Object> actualMap=new HashMap<>();
        
	public int sizeOfMap(  ) 
	{
		
		return actualMap.size();
		
	}
	
	public void addToHashMap( Object key,Object value ) 			
	{

		actualMap.put( key , value );
		
	}
	
	public void addToAbsentKey( Object key,Object value )
	{
		
		actualMap.putIfAbsent( key , value );
		
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
		
		return actualMap.get( key );
		
	}
	   
	
	public Object getValueIfKeyIsAbsent( Object key , Object defaultValue )
	{
		
		return actualMap.getOrDefault( key , defaultValue );
		
	}
	
	
	
	public void removeKey( Object key )
	{
		
		 actualMap.remove( key );
		
	}
	
	
	public void removeKeyIfValueMatch( Object key , Object value )  
	{
		
		actualMap.remove( key , value );
		
	}
	
	public void replaceValue( Object key , Object newValue )
	{
		
		actualMap.replace( key , newValue );
		
	}
	
	public void replaceThisValue( Object key , Object oldValue , Object newValue )
	{
		
		actualMap.replace( key , oldValue , newValue ); 
		
	}
	
	public void addAnotherMap( HashMap< Object , Object > anotherMap )
	{
		
		actualMap.putAll( anotherMap );
		
	}
	
	public void clearMap()
	{
		
		actualMap.clear();
		
	}
	
	public HashMap< Object , Object > getActualMap()
	{
		return actualMap;
	}
	
}
