package Facebook_login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fb_test extends BaseClass{
  @Test(priority = 1)
  public void login_test() {
	  webdriver.get(prop.getProperty("url"));
	  
	  WebElement email_login_text = webdriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  email_login_text.sendKeys(prop.getProperty("product"));
	 // WebElement passwd_login_text = webdriver.findElement(By.xpath("//input[@id='pass']"));
	  //passwd_login_text.sendKeys(prop.getProperty("product"));
	  WebElement search_btnElement = webdriver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	  search_btnElement.click();
	  
  }
  @Test(priority = 2)
  public void friends_test() {
	//*[name()='path' and contains(@d,'M10.5 4.5c')]
	// WebDriverWait wait2=new WebDriverWait(webdriver,Duration.ofSeconds(10));
		  //wait2.until(ExpectedConditions.elementToBeClickable(e)).clear();
	  /*List<WebElement> allOptions=
			  webdriver.findElements(By.xpath("(//a[normalize-space()='4'])[1]"));
			  for(WebElement selectLi: allOptions) { if(selectLi.getText().equals("4")) {
			  selectLi.click(); } */
			 
	  //WebElement name_btnElement = webdriver.findElement(By.xpath("(//span[contains(text(),'Ram Sharma')])[1]"));
	 
	 // name_btnElement.click();
	  //WebElement frnds_btnElement = webdriver.findElement(By.xpath("//span[text()='Friends']"));
	  //frnds_btnElement.click();
	 // new WebDriverWait(webdriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Friends']"))).click();
  }
  
}
