package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utillities.ActionCommands;

public class SecureMessagingPage extends ActionCommands {

    protected By secureMsgModule=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/a[1]/div[1]/img[1]");
    protected By msisdnSearchBox=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    protected By errorMsgTable=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/p[1]");
    protected By errorMsgnoContent=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/p[1]");
    protected By reqStatus=By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[2]/div/ul/li[3]/a");
    protected By reqIcon=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > a:nth-child(2)");
    protected By reasonforReq=By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/textarea");
    protected By clickSendReq=By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]");
    protected By approveMark=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(9) > a:nth-child(1) > svg:nth-child(1)");
    protected By rejectMark=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(9) > a:nth-child(1) > svg:nth-child(1)");
    protected By remark=By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/textarea");
    protected By approveBtn=By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]");
    protected By rejectBtn=By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]");
    protected By rejectstatus=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(8) > span:nth-child(1)");
    protected By requeststatus=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5)");
    protected By verifyTimer=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(7)");
    protected By viewMsg=By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > a:nth-child(1) > svg:nth-child(1)");
    protected By modalTitle=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
    protected By closePopup=By.cssSelector("body > div.fade.modal.show > div > div > div.modal-footer > button");
    protected By moduleTable=By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/table");
    protected By alert=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]");
    WebDriver driver;

    public SecureMessagingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSecureMsgModule(){
        waitTime(driver,secureMsgModule);
        click(driver,secureMsgModule);
    }

    public void EnterMSISDN(String text) throws InterruptedException {
        type(driver,msisdnSearchBox,text);
        Thread.sleep(5000);
    }

    public void verifyErrorMsgTable() throws InterruptedException{
        WebElement manageContactListElement = driver.findElement(errorMsgTable);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("MSISDN you entered is invalid. please enter a valid MSISDN (format: 94xxxxxxxxx)",actualText);
    }

    public void verifyErrorMsgTablenoContent() throws InterruptedException{
        WebElement manageContactListElement = driver.findElement(errorMsgnoContent);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("No messages dispatched to this MSISDN : 94771230468",actualText);
    }

    public void hoverReqStatus() throws InterruptedException{
        WebElement reqStatusDropdown = driver.findElement(By.xpath("//*[@id=\"dropdownMenu2\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(reqStatusDropdown).build().perform();
        Thread.sleep(3000);
    }

    public void selectReqStatus() throws InterruptedException{
        click(driver,reqStatus);
        Thread.sleep(4000);
    }

    public void clickReqIcon() throws InterruptedException{
        click(driver,reqIcon);
        Thread.sleep(4000);
    }

    public void enterReasonforRequest(String text){
       waitTime(driver,reasonforReq);
       type(driver,reasonforReq,text);
    }

    public void clickSendReq(){
        waitTime(driver,clickSendReq);
        click(driver,clickSendReq);
    }

    public void clickApproveMark(){
        click(driver,approveMark);
    }

    public void enterRemark(String text){
        type(driver,remark,text);
    }

    public void clickApproveBtn(){
        click(driver,approveBtn);
    }

    public void clickRejectMark(){
        click(driver,rejectMark);
    }

    public void clickRejectButton(){
        click(driver,rejectBtn);
    }

    public void clickMsgViewIcon() throws InterruptedException {
        click(driver,viewMsg);
        Thread.sleep(5000);
    }

    public void verifyModalTitle(String text){
        WebElement manageContactListElement = driver.findElement(modalTitle);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void verifyRejectStatus(String text){
        WebElement manageContactListElement = driver.findElement(rejectstatus);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void verifyRequestStatus(String text){
        WebElement manageContactListElement = driver.findElement(requeststatus);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void verifyTimer(){
        WebElement element = driver.findElement(verifyTimer);
        String cellText = element.getText().trim();
        Assert.assertFalse(cellText.isEmpty(), "Cell value is empty or null");
    }

    public void closePopup(){
        click(driver,closePopup);
    }

    public void verifyModuleTable(){
        WebElement element = driver.findElement(moduleTable);
        Assert.assertTrue(element.isDisplayed(), "Table is not visible");
    }

    public void removeAlert(){
        click(driver,alert);
    }

}
