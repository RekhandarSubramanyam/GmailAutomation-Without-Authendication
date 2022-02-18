package selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MailAutomation {
	

   String expectedtitle="Gmail";
   public WebDriver driver;
   public MailAutomation()
   {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\subbu\\Downloads\\chrome\\chromedriver.exe");
  driver = new ChromeDriver();
   }
   @Test
   public void lunchApplication()
   {
  System.out.println("Test Case: Lunch Application");
  driver.get("https://gmail.com");
       String actualtitle=driver.getTitle();
       System.out.println("Title:"+ actualtitle);
       System.out.println("Get Url:"+ driver.getCurrentUrl());
       System.out.println("My Session ID:"+ driver.getWindowHandle());
       if(expectedtitle.equals(actualtitle))
       {
      System.out.println("Title Validation Successfull");
       }
       else
       {
      System.out.println("Title Validation Failed");
       }
       
     
   }
   @Test
   public void enterUsername() throws InterruptedException
   {
  lunchApplication();
  System.out.println("Test Case: Enter Mobile Number or UserName");
  driver.findElement(By.id("identifierId")).sendKeys("6302440159",Keys.ENTER);
  //driver.findElement(By.className("whsOnd zHQkBf")).click();  
   }
   @Test
   public void next() throws InterruptedException
   {
  lunchApplication();
  //driver.findElement(By.jsname("V67aGc"));
  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
   }
   @Test
   public void forgetEmail() throws InterruptedException
   {
  lunchApplication();
  driver.findElement(By.tagName("button")).click();
  //driver.findElement(By.tagName("button")).click();
   }
   @Test
   public void recoveryEmail() throws InterruptedException
   {
  lunchApplication();
  System.out.println("Test Case: Recovery Of Email");
  WebElement emailobj=driver.findElement(By.id("recoveryIdentifierId"));
  driver.findElement(By.className("Xb9hP"));
  //driver.findElement(By.className("whsOnd zHQkBf"));
       if (emailobj.isDisplayed() && emailobj.isEnabled())
       {
      emailobj.click();
      emailobj.sendKeys("subburs987@gmail.com");
      Thread.sleep(2000);
     
       }
       else
       {
         System.out.println("Email or phone number object is not displayed / not enabled");
     
       }
       driver.findElement(By.name("recoveryIdentifierId")).sendKeys("100");
   }
}
