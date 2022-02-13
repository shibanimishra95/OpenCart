package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;

	public Registration(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	By RegButtion= By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");
	By RegName=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input");
	By RegLName=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input");
	
	By RegEmail=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input");
	By RegTele=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input");
	
	By RegPwd =By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input");
	
	By ReCpwd= By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input");
	By AgreMent = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
	By Submit =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	public void clickRegister() {
		driver.findElement(RegButtion).click();
		
	}
	public void Rname(String Fname) {
		 driver.findElement(RegName).sendKeys(Fname);;
	}
	public void RLname(String Lname ) {
		 driver.findElement(RegLName).sendKeys(Lname);;
	} 
	
	public void Remail(String Email) {
		driver.findElement(RegEmail).sendKeys(Email);
		
	}
	
	public void RTele(String mobile) {
		driver.findElement(RegTele).sendKeys(mobile);
		
	}
	
	public void RPwd(String Pwd) {
		driver.findElement(RegPwd).sendKeys(Pwd);
		
	}
	
	public void rCpwd(String CPwd) {
		driver.findElement(ReCpwd).sendKeys(CPwd);
	}
	
	
	
	public void Agreement() {
		driver.findElement(AgreMent).click();
		
	}
	public void RegisterButton() {
		driver.findElement(Submit).click(); 
	}
	
	
	
	
	
	
	
	
	


		
	}

	
	
	
	
	
	
	
	
	
	

