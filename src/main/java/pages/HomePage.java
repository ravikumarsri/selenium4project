package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

     WebDriver driver;
    By userName = By.name("username");
    By password = By.xpath("//input[@name ='username']//following::input");
    By loginButton = By.xpath("//button[@type = 'submit']");

    public HomePage(WebDriver driver){
       this.driver = driver;
    }
  public void enterUserName(){
        driver.findElement(userName).sendKeys("Admin");

  }
  public void enterPassword(){

        driver.findElement(password).sendKeys("admin123");
  }
  public void clickOnSubmitButton (){
        driver.findElement(loginButton).click();
  }
}
