package scjpprograms;

public class Increment {

	public static void main(String[] args) 
	{
		int x=0;
		int y=0;
		for(int z=0;z<5;z++)
		{
			if(++x>3 | ++y>3)
				x++;
		}
		System.out.println(x +" "+ y);
	}

}
