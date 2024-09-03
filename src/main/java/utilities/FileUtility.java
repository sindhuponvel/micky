package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	
   public String readDataFromPropertyFile(String key) throws IOException {
	   
	   FileInputStream fis= new FileInputStream("./testData/Trello.properties");
	   Properties pObj =new Properties();
	   pObj.load(fis);
	   String data=pObj.getProperty(key);
	   return data;
	   
	   
	   
   }

}
