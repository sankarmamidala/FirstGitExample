package practice;

public class RemoveDuplicatesArray 
{
	public static void main(String[] args) {

		int[] arr={10,20,30,40,10,70,30,40,10,20};
		int size=arr.length;
		
		System.out.println("length of the array:"+arr.length);
	
		for( int i=0;i<size;i++)
		{
			for( int j=i+1;j<size;j++)
			{
				 if (arr[i] == arr[j]) // checking one element with all the
					// element
					                    {
					                        while (j < (size) - 1) 
					                        {
					                            arr[j] = arr[j + 1];// shifting the values
					                            j++;
					                        }   
					                        size--;
					                    }
					                }
					            }
					            System.out.println("Size After deletion: " + size);
					 
					            for (int k = 0; k < size; k++) 
					            {
					                System.out.print(arr[k]); // printing the values
					            }
					    }
					}
				