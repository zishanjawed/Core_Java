import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo1 {

	public static void main(String [] a) throws IOException, ClassNotFoundException
	{
		Save obj = new Save();
		obj.i = 4;
		
		File f = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save)ois.readObject();
		System.out.println("The value of i is : "+ obj1.i);
		
		
		
	}
}

class Save implements Serializable
{
	int i;

}