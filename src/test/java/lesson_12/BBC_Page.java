package lesson_12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class BBC_Page {

    WebDriver webDriver;

    private final String url = "https://www.bbc.com/";
    private final String correctEmail = "roman.turik48@gmail.com";
    private final String correctPassword = "BRn-ueQ-444-JDz";
    private final String shortPassword = "123";

    BBC_Page(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
    }

    void openPage(){
        this.webDriver.get(url);
        this.webDriver.manage().window().maximize();

    }

    void clickOnSignIn(){
        WebElement signIn = webDriver.findElement(By.id("idcta-username"));
        Assert.assertTrue(signIn.isDisplayed());
        signIn.click();
    }

    void enterEmail(){
        WebElement email = webDriver.findElement(By.id("user-identifier-input"));
        email.sendKeys(correctEmail);
    }

    void enterCorrectPassword(){
        WebElement password = webDriver.findElement(By.id("password-input"));
        password.sendKeys(correctPassword);
    }

    void clickEnterButton(){
        WebElement enterButton = webDriver.findElement(By.id("submit-button"));
        enterButton.click();
    }

    void checkingOfChangingSignIn(){
        WebElement yourAccount = webDriver.findElement(By.id("idcta-username"));
        Assert.assertEquals("Your account", yourAccount.getText());
    }

    void enterShortPassword(){
        WebElement password = webDriver.findElement(By.id("password-input"));
        password.sendKeys(shortPassword);
    }

    void checkingOfWarningTextAboutPassword(){
        clickEnterButton();
        WebElement warningText = webDriver.findElement(By.id("form-message-password"));
        Assert.assertTrue(warningText.isDisplayed());
        Assert.assertEquals("Извините, этот пароль слишком короткий. В нём должно быть не менее 8 символов.", warningText.getText());
    }
}
