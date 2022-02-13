package defination;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class OpenCartTest {
 public static WebDriver driver;
  public Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  @Given("user is on home page")
  @Test
  public void openCart() {
    driver.get("https://demo.opencart.com");
    driver.manage().window().setSize(new Dimension(1296, 696));
  }
  @When("add the products")
    public void fetch() {
    driver.findElement(By.linkText("Show All Desktops")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".product-layout:nth-child(2) button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,647.3333129882812)");
    driver.findElement(By.linkText("iPhone")).click();
    driver.findElement(By.id("button-cart")).click();
    js.executeScript("window.scrollTo(0,103.33333587646484)");
    {
      WebElement element = driver.findElement(By.linkText("Laptops & Notebooks"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Show All Laptops & Notebooks")).click();
    driver.findElement(By.linkText("MacBook")).click();
    driver.findElement(By.id("button-cart")).click();
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-default:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn-default:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".btn > .fa-heart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("product comparison")).click();
  }
  @After
 @ Then("product is available or not")
  
  public void tearDown() {
    driver.quit();
  }
	
}



