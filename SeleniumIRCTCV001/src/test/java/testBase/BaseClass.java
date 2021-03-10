package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.NewIRCTCPage;

public class BaseClass {
	
	public WebDriver driver;
	public NewIRCTCPage IP;
	public Properties configProp;
	public Logger logger=LogManager.getLogger(this.getClass());
	
	@BeforeClass
	@Parameters("browser")
	public void setupMethod(String br) throws IOException {
		configProp= new Properties();
		FileInputStream config= new FileInputStream(".//resources//config.properties");
		configProp.load(config);
	//System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	logger.info("****Opening chrome browser*******");
	if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(br.equals("edge")) {
		System.setProperty("webdriver.edge.driver", ".//Drivers//msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();	
	}
	logger.info("****Opening IRCTC website*******");
	driver.get(configProp.getProperty("BaseURL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
