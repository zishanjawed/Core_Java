import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Properties1 {

	public static void main(String ...strings) throws IOException
	{
		Properties p = new Properties();
		File f = new File("dataConfig.properties");
		OutputStream os =  new FileOutputStream(f);
		p.setProperty("url", "localhost:8080");
		p.setProperty("name", "zishanJawed");
		p.setProperty("pass", "password");
		
		p.store(os, "Hello, This has been submitted by zishanJawed");
		
		
	}
}
