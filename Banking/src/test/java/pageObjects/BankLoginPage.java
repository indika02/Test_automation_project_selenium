package pageObjects;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utillities.ActionCommands;

import static utillities.BaseClass.driver;

public class BankLoginPage extends ActionCommands {

    WebDriver driver;
    private By usernameTextBox=By.id("username");
    private By passwordTextBox=By.id("password");
    private By loginButton=By.xpath("//*[@id=\"fm1\"]/button");
    private By loginError=By.xpath("/html/body/div[3]/span[2]");
    private By forgotPwdLink=By.xpath("/html[1]/body[1]/div[4]/div[1]/form[1]/a[1]");
    private By forgotPwdAlert=By.xpath("/html/body/div[2]/span[2]");
    private By moduleName=By.tagName("h5");
    private By username=By.xpath("/html/body/div/div/header/div/ul[2]/li[3]/a/span");

    public BankLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) throws InterruptedException {
        Thread.sleep(5000);
        openurl(driver, URL);
    }

    public void typeUsername(String username) throws InterruptedException {
        Thread.sleep(4000);

        type(driver, usernameTextBox, username);
    }

    public void typePassword(String password) throws InterruptedException {
        Thread.sleep(4000);
        type(driver, passwordTextBox, password);
    }

    public void enterInvalidCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(usernameTextBox);
        WebElement passwordField = driver.findElement(passwordTextBox);

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() throws InterruptedException {
        click(driver, loginButton);
        Thread.sleep(5000);

    }

    public void verifyErrorMsg(String text){
        WebElement manageContactListElement = driver.findElement(loginError);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
    }

    public void clickForgotPwdLink(){
        waitTime(driver,forgotPwdLink);
        click(driver,forgotPwdLink);
    }

    public void verifyForgotPwdAlert(){
        WebElement manageContactListElement = driver.findElement(forgotPwdAlert);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Contact administrator to reset your password.",actualText);
    }

    public void verifyElementInLogin(String text){
        boolean isTextPresent = isTextPresentOnPage(driver, moduleName, text);
        Assert.assertTrue(isTextPresent, "The text '" + text + "' was not found on the page.");
    }

    public void verifyUsername(String uname){
        WebElement manageContactListElement = driver.findElement(username);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(uname,actualText);
    }

    public void featureAvailability(){
        Assert.fail("This feature is impossible to test using selenium");
    }

}
