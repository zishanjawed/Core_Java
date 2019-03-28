import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String ... str) throws IOException
	{
		Properties pr = new Properties();
		OutputStream os = new FileOutputStream("dataConfig.properties");
		pr.setProperty("url", "localhost:3306/myDb");
		pr.setProperty("uname", "Zishan");
		pr.setProperty("pass", "capricorn");
		pr.store(os, null);
	}
}
