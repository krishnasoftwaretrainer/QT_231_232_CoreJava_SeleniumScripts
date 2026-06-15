package dataDriven_FrameWork;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilty_SwagLocaters_DataDriven_Read 
{
	Properties prop;
	public void ConfigReader() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace_232Batch\\SeleniumScripts_231_232_Batches\\src\\dataDriven_FrameWork\\Swag_URL_Locaters_DataDriven.properties");
		
		prop=new Properties();
		prop.load(file);
	
	}
	
	public String getProperty(String key)
	{
		return prop.getProperty(key);
	}

}
