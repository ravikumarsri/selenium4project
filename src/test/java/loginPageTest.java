import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class loginPageTest {
    HomePage homePage;
    public loginPageTest(){
         homePage = new HomePage();
    }
    @BeforeTest
    public void setup(){
        homePage.initializeBrowser();

    }
    @Test
    public void userLogin(){
        homePage.enterUserName();
        homePage.enterPassword();
        homePage.clickOnSubmitButton();


    }
}
