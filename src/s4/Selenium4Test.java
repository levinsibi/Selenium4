package s4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Selenium4Test {
  @Test
  public void f() throws IOException, InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://www.google.com/");
	  driver.manage().window().maximize();
	  
	  WebElement e=driver.findElement(By.xpath("//img[@alt='Google']"));
	  File s=e.getScreenshotAs(OutputType.FILE);
	  File op=new File("IMG.png");
	  FileUtils.copyFile(s, op);
	  System.out.println("HEIGHT: "+e.getRect().getDimension().getHeight());
	  System.out.println("WIDTH: "+e.getRect().getDimension().getWidth());
  }
 /* @Test
  public void f1() throws IOException {
	  WebDriverManager.iedriver().setup();
	  WebDriver driver=new InternetExplorerDriver();
	 
	  driver.get("http://www.google.com/");
	  String win=driver.getWindowHandle();
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.navigate().to("http://www.google.com/");
	  driver.close();
	  driver.switchTo().window(win);
	  driver.navigate().to("http://www.google.com/");
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.navigate().to("http://www.google.com/");
	  driver.quit(); }*/
 
}
