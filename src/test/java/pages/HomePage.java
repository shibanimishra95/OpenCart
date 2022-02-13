package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;

/// Cunstructor  that   wll be called as soon as the object of the Class is created
public HomePage(WebDriver driver) {
	super();
	this.driver = driver;
}

By MyProfile =By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");

By signIn =By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a");

public void GOTOMyProfile() {
	// TODO Auto-generated constructor stub
	driver.findElement(MyProfile).click();
	
}
public void SignInButton() {
	driver.findElement(signIn).click();
}
public void MaxmizeWindows() throws InterruptedException {
	driver.manage().window().maximize();
	Thread.sleep(3000);
}


}
