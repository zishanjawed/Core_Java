import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties1 {

	public static void main(String ...strings) throws IOException
	{
		//writing into the properties file called dataConfig.properties
		Properties p = new Properties();
		File f = new File("dataConfig.properties");
		OutputStream os =  new FileOutputStream(f);
		p.setProperty("url", "localhost:8080");
		p.setProperty("name", "zishanJawed");
		p.setProperty("pass", "password");
		p.store(os, "Hello, This has been submitted by zishanJawed");
		//closing  the connection 
		os.close();
		
		// Reading from the properties file i.e dataConfig.properties
		File f1 = new File("dataConfig.properties");
		Properties p1 = new Properties();
		InputStream is = new FileInputStream(f1);
		p1.load(is);
		System.out.println("The url is: "+p1.getProperty("url"));
		System.out.println("The name  is: "+p1.getProperty("name"));
		System.out.println("The password  is: "+p1.getProperty("pass"));
		
		
		
	}
}
