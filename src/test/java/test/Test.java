package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BrowserAndCart;
import pages.HomePage;
import pages.LoginPRocess;
import pages.Registration;
import pages.SearchAndCheckout;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.opencart.com/");

	
HomePage home= new HomePage(driver);
LoginPRocess Login =new LoginPRocess(driver);
Registration Reg =new Registration(driver);
BrowserAndCart browser=new  BrowserAndCart(driver);
SearchAndCheckout search=new SearchAndCheckout(driver);

home.MaxmizeWindows();
home.GOTOMyProfile();
home.SignInButton();
Login.EnterEmail("Shibani");
Login.EnterPassword("Mishra@9702");
Login.ClickLogin();
home.GOTOMyProfile();
Reg.clickRegister();
Reg.Rname("shibani");
Reg.RLname("Mishra");
Reg.Remail("Shivim44@gmail.com");
Reg.RTele("78888988");
Reg.RPwd("6666666Re");
Reg.rCpwd("6666666Re");
Reg.Agreement();
Reg.RegisterButton();

browser.actionBtn();
search.searchCart();




//Registration RegrtationButtionClick =new  Registration(driver);
//RegrtationButtionClick.GoToRegistrationPage();

 

Thread.sleep(5000);
driver.quit();







}
}