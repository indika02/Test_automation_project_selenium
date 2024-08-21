package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utillities.ActionCommands;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends ActionCommands {

    protected By regModuleIcon=By.xpath("/html/body/div/div/div/div[2]/div/div/div/ul/div[2]/div/a/div[1]/img");
    protected By addUserLink=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/span/span");
    protected By manageUsersLink=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/span/span");
    protected By signoutLink=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[12]/div/div/a/span");
    protected By userTable=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/table");
    protected By usernameTextBox=By.id("UsernameTextField");
    protected By firstnameTextBox=By.id("FirstNameTextField");
    protected By status=By.xpath("//*[@id=\"StatusCombo\"]/input");
    protected By usrGroup=By.xpath("//*[@id=\"UserType\"]/input");
    protected By searchBtn=By.xpath("//*[@id=\"registration-1350309703\"]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/span/span");
    protected By disableIcon=By.cssSelector("#registration-1350309703 > div > div.v-verticallayout > div > div:nth-child(2) > div > div > div > div:nth-child(1) > div > div > div > div:nth-child(1) > div > div > div > div:nth-child(3) > div > div > div > div:nth-child(2) > div > div > div.v-panel-content > div > div > div:nth-child(1) > div > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div > div.v-table-body > div:nth-child(1) > table > tbody > tr:nth-child(10) > td:nth-child(9) > div > div > div > div:nth-child(3) > div > div > span > img");
    protected By okBtn=By.xpath("/html/body/div[3]/div/div/div/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/span");
    protected By usernameLink=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[3]/div/div/span/span");
    protected By profileEditBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By profileFnameTxtBox=By.cssSelector(".v-tabsheet-tabsheetpanel > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(3) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > input:nth-child(1)");
    protected By profileLnameTxtBox=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div[5]/div/div/div/div[1]/div/div/fieldset/div[2]/div/table/tbody/tr[2]/td[3]/input");
    protected By profileSaveBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By validateBtn=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/fieldset/div[2]/div/table/tbody/tr[2]/td[3]/div/span/span");

    protected By username=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/fieldset/div[2]/div/table/tbody/tr[1]/td[3]/input");
    protected By alertMsg=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/fieldset/div[3]/div");
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegModuleIcon() throws InterruptedException {
        click(driver,regModuleIcon);
        Thread.sleep(5000);
    }

    public void verifyAddUser(){
        boolean isTextPresent = isTextPresentOnPage(driver,addUserLink, "Add a User");
        Assert.assertTrue(isTextPresent, "The text was not found on the page.");
    }

    public void verifyManageUsers(){
        boolean isTextPresent = isTextPresentOnPage(driver,manageUsersLink,"Manage Users");
        Assert.assertTrue(isTextPresent,"The text was not found on the page.");
    }

    public void clickManageUsersLink() throws InterruptedException {
        click(driver,manageUsersLink);
        Thread.sleep(5000);
    }

    public void clickAddUserLink() throws InterruptedException {
        click(driver,addUserLink);
        Thread.sleep(5000);
    }

    public void clickValidateBtn(){
        click(driver,validateBtn);
    }

    public void verifyAlertMsg(String alert){
        WebElement manageContactListElement = driver.findElement(alertMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(alert,actualText);
    }

    public void enteraUsername(String name){
        waitTime(driver,username);
        type(driver,username,name);
    }
    public void scrollTable() {
        WebElement table = driver.findElement(userTable);
        Actions actions = new Actions(driver);
        for (int i = 0; i < 100; i++) {
            actions.moveToElement(table).click().sendKeys(Keys.ARROW_RIGHT).perform();
        }
    }

    public void enterUsername(String uname){
        type(driver,usernameTextBox,uname);
    }

    public void enterFirstname(String fname){
        type(driver,firstnameTextBox,fname);
    }

    public void selectStatus(String selectstatus){
        waitTime(driver, status);
        type(driver,status,selectstatus);
    }

    public void selectUserGroup(String group){
        waitTime(driver, status);
        type(driver,usrGroup,group);
    }

    public void clickDisableIcon(){
        click(driver,disableIcon);
    }

    public void clickOkForConfirm() throws InterruptedException {
        click(driver,okBtn);
        Thread.sleep(5000);

    }

    public void clickSearchBtn() throws InterruptedException {
        click(driver,searchBtn);
        Thread.sleep(5000);
    }

    public void clickUsername() throws InterruptedException{
        click(driver,usernameLink);
        Thread.sleep(5000);
    }

    public void clickEditBtn(){
        waitTime(driver,profileEditBtn);
        click(driver,profileEditBtn);
    }

    public void editFname(String text){
        waitTime(driver,profileFnameTxtBox);

        type(driver,profileFnameTxtBox,text);
    }

    public void editLname(String text){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(profileLnameTxtBox));
        String existingText = textBox.getAttribute("value");
        for (int i = 0; i < existingText.length(); i++) {
            textBox.sendKeys(Keys.BACK_SPACE);
        }
        textBox.sendKeys(text);
    }

    public void clickSaveBtn() throws InterruptedException{
        click(driver,profileSaveBtn);
        Thread.sleep(40000);
    }

    public void clickSignout(){
        waitTime(driver,signoutLink);
        click(driver,signoutLink);
    }
}

