package utillities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionCommands {

    protected void openurl(WebDriver driver, String URL){
        driver.get(URL);
    }
    protected void click (WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
    protected void type (WebDriver driver, By locator, String input){
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        }catch (NoSuchElementException e){
            System.out.println("No such a element "+ e.getMessage());
            throw e;
        }
    }
    protected void verifyText(WebDriver driver, By locator, String expectedResults){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText(),expectedResults);
    }

    protected void assertElementExists(WebDriver driver, By locator, String elementName) {
        verifyElementExists(driver, locator, elementName);
    }

    protected void verifyElementExists(WebDriver driver, By locator, String elementName) {
        try {
            waitTime(driver, locator);
            WebElement element = driver.findElement(locator);
            Assert.assertTrue(element.isDisplayed(), elementName + " is displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail(elementName + " is not found.");
        }
    }

    protected void clearText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.clear();
    }
    protected String getText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
    protected String getAttribute(WebDriver driver,By locator,String attribute){
        WebElement element = driver.findElement(locator);
        String attributeValue = element.getAttribute(attribute);
        return attributeValue;
    }
    protected void hitEnter(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }
    protected void assetString(String expected,String actual){
        Assert.assertEquals(actual,expected);
    }
    protected void waitTime(WebDriver driver,By locator){
        WebDriverWait wait = new WebDriverWait(driver,100000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void checkVisibility(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
    }
    protected void checkboxValidity(WebDriver driver,By locator,boolean expect){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(expect,element.isSelected());

    }

    public static boolean isTextPresentOnPage(WebDriver driver, By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        List<String> texts = new ArrayList<>();

        for (WebElement element : elements) {
            String elementText = element.getText();
            texts.add(elementText);
            System.out.println(elementText);
        }

        return texts.contains(text);
    }

    public void setImplicitWait(WebDriver driver, long durationInSeconds) {
        try {
            driver.manage().timeouts().implicitlyWait(durationInSeconds, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Exception while setting implicit wait: " + e.getMessage());
        }
    }

}
