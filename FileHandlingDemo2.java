package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileHandlingDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dataConfig.properties");
		
		p.setProperty("url", "localhost:3304/myDb");
		p.setProperty("uname", "zishan");
		p.setProperty("pass", "0000");
		
		try {
			p.store(os, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
