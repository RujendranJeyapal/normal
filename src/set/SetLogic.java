//$Id$
package set;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class SetLogic 
{

	
	            private Set<Object> actualSet=new HashSet<>();
	
	              
	            
	            
	            
	            public int sizeOfSet()
	            {
	            	
	            	  return actualSet.size();
	            	  
	            }
	            
	            public boolean addElementsToSet( Object object  )
	            {
	            	
	            	  return actualSet.add( object );
	            	  
	            }
	            
	            public boolean addCollectionsToSet( Collection<Object> collection )
	            {
	            	
	            	  return actualSet.addAll( collection );
	            	  
	            }
	            
	            public boolean remove( Object object )
	            {
	            	
	            	  return actualSet.remove( object );
	            	  
	            }
	            
	            public boolean removeAll( Collection<Object> collection )
	            {
	            	
	            	  return actualSet.removeAll( collection );
	            	
	            }
	            
	            public boolean retainAll( Collection<Object> collection )
	            {
	            	
	            	  return actualSet.retainAll( collection );
	            	
	            }
	            
	            public Object[] toArray()
	            {
	            	  return actualSet.toArray();
	            }
	            
	            
	            public Set<Object> getSetWithElements()
	            {
	            	
	            	   Set<Object> oneSet =new HashSet<>();
	            	   
	            	   oneSet.add( 1 );
	            	   
	            	   oneSet.add( "Ram" );
	            	   
	            	   oneSet.add( "Lakshmanan" );
	            	   
	            	   oneSet.add( "Barathan" );
	            	   
	            	   oneSet.add( "Arjunan" );
	            	   
	            	   return oneSet;
	            	
	            }
	            
	            public List<Object> getListWithElements()
	            {
	            	
	            	  List<Object> oneList=new ArrayList<>();
	            	  
	            	  oneList.add( 1 );
	            	  
	            	  oneList.add( 1 );
	            	  
	            	  oneList.add( 1 );
	            	  
	            	  oneList.add( 1 );
	            	  
	            	  oneList.add( 1 );
	            	  
	            	  oneList.add( "Ravanan" );
	            	  
	            	  return oneList;
	            	  
	            }
	
	
	
	             
}
