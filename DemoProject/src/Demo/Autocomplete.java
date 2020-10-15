package Demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
    	//System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe"); 
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
    	// WebDriver driver=new InternetExplorerDriver(); 
    	 WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("D:\\Master_Collection.html");

        driver.findElement(By.xpath("//*[@id=\'pills-requests-tab\']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(100);
        //driver.findElement(By.xpath("//*[@id='requests-bc9bc85d-f716-48dd-8b49-9e478586e5cc']")).click();
       driver.findElement(By.xpath("//a[contains(text(), 'submitApplication')]")).click();
        //driver.findElement(By.partialLinkText("submitApplication")).click();
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(100);
        String Loannumber_1=driver.findElement(By.xpath("//*[@id='copyReqText-16']/span[11]")).getText();
        System.out.println("Loannumber_1 "+Loannumber_1);
        driver.findElement(By.xpath("//*[@id='iteration-1']")).click();
       
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(100);
       // driver.findElement(By.partialLinkText("submitApplication")).click();
       java.util.List<WebElement>  links =driver.findElements(By.xpath("//a[contains(text(), 'submitApplication')]"));
    // int c=links.size();
      //System.out.println(c);
      for (int i = 1; i<links.size(); i=i+1)
    	  
      {
      
      if(links.get(i).getText().contains("submitApplication"))
      {
    	  System.out.println(i);
    	  links.get(i).click();
    	  break;
      }
      
      
      
      }
      //  driver.findElement(By.xpath("//a[contains(text(), 'submitApplication')]")).click();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(100);
        String Loannumber_2=driver.findElement(By.xpath("//*[@id='copyReqText-33']/span[11]")).getText();

        System.out.println("Loannumber_2 "+Loannumber_2);
        driver.findElement(By.xpath("//*[@id='iteration-2']")).click();
        
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(100);
       // driver.findElement(By.partialLinkText("submitApplication")).click();
         links =driver.findElements(By.xpath("//a[contains(text(), 'submitApplication')]"));
    // int c=links.size();
      //System.out.println(c);
      for (int i = 1; i<links.size(); i=i+1)
    	  
      {
      
      if(links.get(i).getText().contains("submitApplication"))
      {
    	  System.out.println(i);
    	  links.get(i).click();
    	  break;
      }
      
      
      
      }
      //  driver.findElement(By.xpath("//a[contains(text(), 'submitApplication')]")).click();
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(100);
        String Loannumber_3=driver.findElement(By.xpath("//*[@id='copyReqText-50']/span[11]")).getText();
      //*[@id="copyReqText-50"]/span[11]
        System.out.println("Loannumber_3 "+Loannumber_3);


      //*[@id="requests-bc9bc85d-f716-48dd-8b49-9e478586e5cc"]
      //*[@id='requests-bc9bc85d-f716-48dd-8b49-9e478586e5cc']
		/*
		 * driver.findElement(By.name("q")).sendKeys("mahatama gandhi");
		 * List<WebElement> autoSuggest = driver.findElements(By
		 * .xpath("//div[@class='sbqs_c']")); Thread.sleep(1000); // verify the size of
		 * the list System.out .println("Size of the AutoSuggets is = " +
		 * autoSuggest.size()); // print the auto suggest for (WebElement a :
		 * autoSuggest) System.out.println("Values are = " + a.getText()); // suppose
		 * now you want to click on 3rd auto suggest then simply do like // this
		 * autoSuggest.get(2).click();
		 */   }
}