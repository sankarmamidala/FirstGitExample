import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropEx {
	
	
	Properties prop =null;
	
	public PropEx() throws IOException
	{
		
		this.prop=new Properties();
		InputStream is = this.getClass().getResourceAsStream("test.xml");
		prop.load(is);
	}
	public String getProperty(String key)
	{
		return this.prop.getProperty(key);
	}
	
	
		public static void main(String[] args) throws IOException {
	
			PropEx pe = new PropEx();
			System.out.println(pe.getProperty("db.host"));
			System.out.println(pe.getProperty("db.user"));
			System.out.println(pe.getProperty("db.password"));
			
	}

}