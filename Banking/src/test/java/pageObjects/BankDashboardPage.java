package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class BankDashboardPage extends ActionCommands {

    protected By logoutButton = By.xpath("//a[contains(@class, 'main-header__dropdown-menu-link') and contains(text(), 'Log Out')]");
    protected By bulkMessagingIcon=By.xpath("/html/body/div/div/div/div[2]/div/div/div/ul/div[2]/div/a");
    protected By homeButton=By.xpath("/html/body/div[2]/header/nav/div/div[2]/ul/li[1]/a");
    protected By moduleName=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[2]/h5[1]");
    protected By portalName=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/ul/div[2]/div/a/div[2]/h5");
    protected By messagingportal=By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[1]/div/a/div[2]/h5");
    protected By portalManagement=By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/a/div[2]/h5");
    protected By secureMessaging=By.xpath("/html/body/div/div/div/div[2]/div/div/div/ul/div[2]/div/a/div[2]/h5");
    protected By profileDropDown=By.xpath("//header/div[1]/ul[2]/li[3]/a[1]/span[1]");
    protected By moduleIcon=By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/ul[2]/li[2]/a[1]/i[1]");
    protected By logoutLink=By.xpath("/html/body/div[2]/header/nav/div/div[2]/ul/li[3]/ul/div/div/div/a");
    protected By logoutAlertMsg=By.xpath("/html[1]/body[1]/div[3]/span[2]");
    WebDriver driver;

    public BankDashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyPortalAvailability(String text) throws InterruptedException {
        WebElement manageContactListElement = driver.findElement(portalName);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
        Thread.sleep(5000);
    }

    public void verifySecureMsgPortalAvailability(String text) throws InterruptedException {
        WebElement manageContactListElement = driver.findElement(secureMessaging);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
        Thread.sleep(5000);
    }



    public void click_bulk_messaging_wizard_icon(){
        waitTime(driver, bulkMessagingIcon);
        click(driver, bulkMessagingIcon);
    }

    public void verifyCreateMsgPortal(String text){
        WebElement manageContactListElement = driver.findElement(messagingportal);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
    }

    public void verifyPortalManagement(String text){
        WebElement manageContactListElement = driver.findElement(portalManagement);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
    }

    public void verifyContactListModule(String text){

        WebElement manageContactListElement = driver.findElement(moduleName);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text,actualText);
    }

    public void click_home_button(){
        waitTime(driver,homeButton);
        click(driver,homeButton);
    }

    public void hoverOverProfileDropdown() throws InterruptedException {
        WebElement profileDropdown = driver.findElement(profileDropDown);
        Actions actions = new Actions(driver);
        actions.moveToElement(profileDropdown).build().perform();
        Thread.sleep(5000);
    }

    public void hoverOverModuleIcon() throws InterruptedException{
        WebElement moduleIconHover = driver.findElement(moduleIcon);
        Actions actions = new Actions(driver);
        actions.moveToElement(moduleIconHover).build().perform();
        Thread.sleep(5000);
    }

    public void clickLogoutButton() {
        waitTime(driver, logoutButton);
        click(driver, logoutButton);

    }

    public void clickLogoutLink() {
        waitTime(driver, logoutLink);
        click(driver, logoutLink);
    }

    public void closeBrowser() {
            driver.close();
    }

    public void verifyLogoutAlert(String text){
        WebElement logoutAlert = driver.findElement(logoutAlertMsg);
        String actualText = logoutAlert.getText();
        assetString(text, actualText);
    }


}
