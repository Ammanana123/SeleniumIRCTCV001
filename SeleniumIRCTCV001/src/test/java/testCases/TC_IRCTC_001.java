package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.NewIRCTCPage;
import testBase.BaseClass;

public class TC_IRCTC_001 extends BaseClass{
		@Test
		public void testMethod_001() throws InterruptedException, IOException {
			IP= new NewIRCTCPage(driver);
			logger.info("***** Clicking on Deluxe train*****");
			IP.clickOnDeluxeTrain();
			logger.info("***** Clicking on Login*****");
			IP.clickOnLogin();
			//IP.clickOnSignUp();
			/*Set<String>allhandles=driver.getWindowHandles();
			 Iterator<String>all=allhandles.iterator();
			 String login=all.next();
			 String signup=all.next();
			 driver.switchTo().window(signup);
			Thread.sleep(4000);
			IP.clickOnOk();
			IP.searchVijayawada("Vijaya");
			IP.selectVijayawada();
			IP.searchBenagaluru("Bengaluru");
			IP.selectBengaluru();
			IP.clickOntype();
			IP.clickOnDayang();
			IP.clickOnOkafterDivyang();
			IP.clickOnDate("11/03/2021");
			IP.clickOnOkafterDate();
			IP.selectClasses();
			IP.selectSleeperClass();
			IP.checkFlexibleDate();
			IP.checkFlexibleDate2();
			IP.clickOnSearch();*/
			
			logger.warn("***** SeleniumIRCTC Method failed and Screenshot captured******");
			captureScreen(driver, "testmethod_001");
		}
		
	
	}



