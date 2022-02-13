package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPRocess {

WebDriver driver;

public LoginPRocess(WebDriver driver) {
	super();
	this.driver = driver;
}

By RegisterButton=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");

By Email =By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input");
By password =By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input");
By LoginButton =By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input");
///html/body/div/div[2]/div/div[1]/form/div[3]/div[1]/button[1]



public void EnterEmail(String email) {
	 driver.findElement(Email).sendKeys(email);
}
//
//
public void EnterPassword(String PWD) {
	 driver.findElement(password).sendKeys(PWD);
}
//
//
public void ClickLogin() {
	 driver.findElement(LoginButton).click();
}


}
