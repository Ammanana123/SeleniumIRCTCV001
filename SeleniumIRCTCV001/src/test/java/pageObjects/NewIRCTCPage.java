package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewIRCTCPage  {
	public WebDriver rdriver;
	
  public NewIRCTCPage(WebDriver ldriver) {
	 this.rdriver=ldriver;
	PageFactory.initElements(ldriver,this);
  }
  
  @FindBy(xpath="//div[@class='Nav-icons DeluxeTrain']")
  @CacheLookup
  WebElement clkNavicons;
  
  @FindBy(xpath="//a[text()='Login']")
  @CacheLookup
  WebElement clkLogin;
  @FindBy(xpath="//a[text()='Sign Up']")
  @CacheLookup
  WebElement clkSign;
  
  @FindBy(xpath="//button[text()='OK']")
  @CacheLookup
  WebElement clkOK;
  
  @FindBy(xpath="(//input[@role='searchbox'])[1]")
  @CacheLookup
  WebElement txtBZA;
  
  @FindBy(xpath="//span[text()='VIJAYAWADA JN - BZA']")
  @CacheLookup
  WebElement SlcBZA;
  
  @FindBy(xpath="(//input[@role='searchbox'])[2]")
  @CacheLookup
  WebElement txtKSR;
  
  
  @FindBy(xpath="//span[text()='KSR BENGALURU - SBC']")
  @CacheLookup
  WebElement SlcKSR;
  
  @FindBy(xpath="(//div[@role='button'])[2]")
  @CacheLookup
  WebElement clkrole;
  
  @FindBy(xpath="//span[text()='DIVYAANG']")
  @CacheLookup
  WebElement clkDIVYAANG;
  
  @FindBy(xpath="//span[text()='OK']")
  @CacheLookup
  WebElement clkOK2;
  
  @FindBy(xpath="(//input[@autocomplete='off'])[3]")
  @CacheLookup
  WebElement clkDate;
  
  @FindBy(xpath="//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-11 pi pi-chevron-down']")
  @CacheLookup
  WebElement clkclasses;
  
  @FindBy(xpath="//span[text()='Sleeper (SL)']")
  @CacheLookup
  WebElement SlcSleeper;
  
  @FindBy(xpath="//label[text()='Flexible With Date']")
  @CacheLookup
  WebElement clkFlexiblewithDate;
  
  @FindBy(xpath="//button[text()='Search']")
  @CacheLookup
  WebElement clkSearch;
  
  
  //Action methods to perform
  
  public void clickOnDeluxeTrain() {
	  clkNavicons.click();
  }
  
  public void clickOnLogin() {
	  clkLogin.click();
	  
  }
  
  public void clickOnSignUp() {
	  clkSign.click();
  }
  
  
  public void clickOnOk() {
	  clkOK.click();
  }
  
  public void searchVijayawada(String city) {
	  txtBZA.sendKeys(city);
  }
  public void selectVijayawada() {
	  SlcBZA.click();
	  
  }
  
  public void searchBenagaluru(String city2) {
	  txtKSR.sendKeys(city2);
	  
  }
  
  public void selectBengaluru() {
	  SlcKSR.click();
  }
  
  public void clickOntype() {
	  clkrole.click();
  }
  
  public void clickOnDayang() {
	  clkDIVYAANG.click();
  }
  
  public void clickOnOkafterDivyang() {
	  clkOK2.click();
	  
  }
  
  public void clickOnDate(String Date) {
	  clkDate.clear();
	  clkDate.sendKeys(Date);
  }
  
  public void clickOnOkafterDate() {
	  clkOK2.click();
	  
  }
  
  public void selectClasses() {
	  clkclasses.click();
  }
  
  public void selectSleeperClass() {
	  SlcSleeper.click();
  }
  
  public void checkFlexibleDate() {
	  clkFlexiblewithDate.click();
  }
  
  public void checkFlexibleDate2() {
	  clkFlexiblewithDate.click();
  }
  
  public void clickOnSearch() {
	  clkSearch.click();
  }
}
