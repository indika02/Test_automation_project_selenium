package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utillities.ActionCommands;

import java.io.File;

public class DepAdminPage extends ActionCommands {

    protected By bulkMsg=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
    protected By contactListIcon=By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[3]/div/a/div[1]/img");
    protected By deleteicon=By.id("contact_delete");
    protected By confirm=By.id("popup_ok");
    protected By addContact=By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li/a");
    protected By contactListName=By.id("listName");
    protected By portal=By.id("appId");
    protected By inputFile=By.id("userListFile");
    protected By resetButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/a[1]");
    protected By backButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/a[1]");
    protected By approveBulk=By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[1]/div/a/div[1]/img");
    protected By firstRow=By.cssSelector("tbody tr td:nth-child(3) div:nth-child(1)");
    protected By approveMsg=By.cssSelector("tr span[title='Approve'] img");
    protected By rejectMsg=By.cssSelector("tr span[title='Reject'] img");
    protected By confirmPopupMsg =By.id("popup_ok");
    protected By contactViewIcon=By.id("contact_view");
    protected By searchMsisdn=By.id("searchText");
    protected By searchContactButton=By.id("searchContact");
    protected By downloadButton=By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/ul/li/a");
    protected By uploadButton=By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/form/div[2]/div/div[3]/button");
    protected By listNameErrorMsg=By.id("listNameError");
    protected By fileErrorMsg=By.id("userListFileError");
    protected By contactMsg=By.xpath("/html/body/div[2]/div/div[1]/div[2]/h6");
    protected By backbutton=By.name("backButton");
    protected By closePopup=By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]");
    protected By approveFileUploads=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]");
    protected By csvDownload=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/table/tbody/tr[1]/td[2]/a");
    protected By approveActionMark=By.id("approve_id");
    protected By rejectActionMark=By.id("stop_id");

    WebDriver driver;

    public DepAdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBulkMsgIcon() throws InterruptedException {
        click(driver, bulkMsg);
        Thread.sleep(5000);
    }

    public void clickApproveFileUploads() throws InterruptedException {
        click(driver,approveFileUploads );
        Thread.sleep(5000);
    }

    public void clickCsvDownloadLink(){
        waitTime(driver,csvDownload);
        click(driver,csvDownload);
    }

    public void clickContactListIcon(){
        waitTime(driver,contactListIcon);
        click(driver,contactListIcon);
    }

    public void clickDeleteIcon(){
        waitTime(driver,contactListIcon);
        click(driver,deleteicon);
    }

    public void clickConfirm(){
        waitTime(driver,confirm);
        click(driver,confirm);
    }

    public void clickAddContactButton(){
        waitTime(driver,addContact);
        click(driver,addContact);
    }

    public void enterContactListName(String name){
        waitTime(driver,contactListName);
        type(driver,contactListName,name);
    }

    public void selectPortal(){
        waitTime(driver, portal);
        Select dropdown = new Select(driver.findElement(portal));
        for (int i = 0; i <= 7; i++) {
            dropdown.selectByIndex(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dropdown.selectByIndex(7);
    }


    public void uploadFile(String file) throws InterruptedException {
        File uploadFile = new File(file);
        WebElement fileInput = driver.findElement(inputFile);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        Thread.sleep(5000);

    }

    public void clickUploadButton() throws InterruptedException {
        click(driver,uploadButton);
        Thread.sleep(5000);
    }

    public void clickResetButton(){
        waitTime(driver,resetButton);
        click(driver,resetButton);
    }

    public void clickbackbutton(){
        waitTime(driver,backButton);
        click(driver,backButton);
    }

    public void clickApproveAction() throws InterruptedException{
        click(driver,approveActionMark);
        Thread.sleep(5000);
    }

    public void clickRejectAction() throws InterruptedException{
        click(driver,rejectActionMark);
        Thread.sleep(5000);
    }

    public void approveBulkMsg() throws InterruptedException {
        click(driver,approveBulk);
        Thread.sleep(5000);
    }

    public void viewMsgDetails() throws InterruptedException {
        click(driver,firstRow);
        Thread.sleep(5000);
    }

    public void approveMsg() throws InterruptedException {
        click(driver,approveMsg);
        Thread.sleep(5000);
    }

    public void confirmPopup() throws InterruptedException {
        click(driver, confirmPopupMsg);
        Thread.sleep(5000);
    }

    public void closePopup(){
        click(driver,closePopup);
    }

    public void rejectMsg() throws InterruptedException {
        click(driver,rejectMsg);
        Thread.sleep(5000);
    }

    public void clickContactView() throws InterruptedException{
        click(driver,contactViewIcon);
        Thread.sleep(5000);
    }

    public void enterSearchMsisdn(String msisdn){
        waitTime(driver,searchMsisdn);
        type(driver,searchMsisdn,msisdn);
    }

    public void clickSearchContact() throws InterruptedException {
        click(driver,searchContactButton);
        Thread.sleep(5000);
    }
    public void clearSearchBox(){
        waitTime(driver,searchMsisdn);
        clearText(driver,searchMsisdn);
    }

    public void downloadCsvFile(){
        waitTime(driver,downloadButton);
        click(driver,downloadButton);
    }

    public void verifyListName(){
        WebElement manageContactListElement = driver.findElement(listNameErrorMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Should be more than 3 and less than 30 characters.",actualText);
    }

    public void verifyfileerror(){
        WebElement manageContactListElement = driver.findElement(fileErrorMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Incorrect file format; CSV format is required!",actualText);
    }

    public void verifyContactMsg(){
        WebElement manageContactListElement = driver.findElement(contactMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("This contact list can not be edited right now as it is being used in another Campaign. You may edit it once this campaign is completed.",actualText);
    }

    public void clickBackbutton(){
        waitTime(driver,backbutton);
        click(driver,backbutton);
    }
}
