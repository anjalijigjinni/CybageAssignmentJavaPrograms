import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("C:\\Users\\User\\OneDrive\\Desktop\\Java Programs\\CybageAssignmentJavaPrograms\\credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties props = new Properties();
		props.load(fis);
		
		System.out.println(props.getProperty("user"));
		System.out.println(props.getProperty("password"));
		
		
		
	}

}
