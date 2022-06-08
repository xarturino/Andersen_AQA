package lesson_12;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSingInTest {

    BBC_Page pageDriver;
    WebDriver webDriver;

    @Before
    public void prepareBeforeTest() {
        System.setProperty("webDriver","C:\\Users\\anduser\\IdeaProjects\\Andersen_AQA\\chromedriver.exe");
        webDriver = new ChromeDriver();
        pageDriver = new BBC_Page(webDriver);
        pageDriver.openPage();
    }

    @Test
    public void signInTestWithCorrectCreds() {
        pageDriver.clickOnSignIn();
        pageDriver.enterEmail();
        pageDriver.enterCorrectPassword();
        pageDriver.clickEnterButton();
        pageDriver.checkingOfChangingSignIn();
    }

    @Test
    public void signInWithShortPassword(){
        pageDriver.clickOnSignIn();
        pageDriver.enterEmail();
        pageDriver.enterShortPassword();
        pageDriver.checkingOfWarningTextAboutPassword();
    }

    @After
    public void endingOfTests(){
        webDriver.quit();
    }
}
