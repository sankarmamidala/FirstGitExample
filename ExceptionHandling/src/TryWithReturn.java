
public class TryWithReturn
{
	int calm()
	{
		try
		{
			int i=10/0;
			return 12;
			//System.out.println("");
		}
		catch(Exception e)
		{
			return 1;
			
		}
		finally
		{
		   return 100;
		}
		
	}
	    
	    
	

	public static void main(String[] args) {
	        
	        TryWithReturn obj = new TryWithReturn();
	        System.out.println(obj.calm());
	       
	 
	}

	}