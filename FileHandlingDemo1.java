import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo1 {
	public static void main(String ... str) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("demo1.txt");
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeUTF("Hello, This is Zishan");
		dos.close();
		fos.close();
	}
	

}
