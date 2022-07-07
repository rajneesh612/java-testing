package Facebook_login;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseClass {
	public static WebDriver webdriver;
	protected Properties config;
	protected String configFilename = "config";
	
	public String  browser_name;
	public String url;
	public String client_name;
	public String login_username;
	public String next_btn1;
	public String login_passwd;
	public String next_btn2;
	public String mail_icon;
	public String userid;
	public String passwd;
	public String subjectString;
	
	
	public String heading_page1;
	public static Properties prop = new Properties();
	public static Properties prop_loc = new Properties();
	
	@BeforeTest
	protected WebDriver initializebrowser() throws IOException{
		try {
			FileInputStream fis= new FileInputStream( System.getProperty("user.dir")+"\\src\\test\\java\\fb_properties\\base.properties");
			//Properties prop = new Properties();
			prop.load(fis);
			//url = prop.getProperty("url");     // reading data from property file "base.properties"
			browser_name = prop.getProperty("name");
			
			
			//heading_page1 = prop.getProperty("heading_page1");
			
			
			 
		
			 

		
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}   
		
		if(browser_name.equalsIgnoreCase("Mozilla")) {
			//if(browser_name.equals("Mozilla")) {	
			System.setProperty("webdriver.gecko.driver","D:\\java\\selenium-web-driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			webdriver = new FirefoxDriver();
			webdriver.manage().window().maximize();
		}
		else if(browser_name.equalsIgnoreCase("chrome")) {
			//else if(browser_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\java\\selenium-web-driver\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--start-maximized");
			webdriver = new ChromeDriver(options);
		}
		else if(browser_name.equalsIgnoreCase("edge")) {
			//else if(browser_name.equals("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\java\\selenium-web-driver\\edge-driver\\edgedriver_win64\\msedgedriver.exe");
			webdriver=new EdgeDriver();
			webdriver.manage().window().maximize();
		}
		return webdriver;
		
}
	}