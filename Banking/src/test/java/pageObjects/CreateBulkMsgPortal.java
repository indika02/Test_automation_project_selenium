package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utillities.ActionCommands;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CreateBulkMsgPortal extends ActionCommands {

    protected By createMsgPortalLink = By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[1]/div/a");
    protected By portalManagement = By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/div/div/div[2]/div/a");
    protected By searchInput = By.id("searchInput");
    protected By searchButton = By.id("Search");
    protected By createMsgIcon = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/img[1]");
    protected By appName = By.id("appName");
    protected By Allias = By.id("short3_aliases");
    protected By msgType = By.id("selectedMessageType");
    protected By description = By.id("decs");
    protected By nextButton = By.id("next");
    protected By confirmButton = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/form/div[3]/div[3]/input");
    protected By successMsg = By.cssSelector(".col-lg-8 > h4:nth-child(2)");
    protected By msgIcon = By.cssSelector("#message-sent-history > div > div.page-card__body > div:nth-child(1) > div > div > div > div > div > div > div.col-md-4.col-sm-4 > img");
    protected By fileUpload = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
    protected By settingLink = By.id("settingLink");
    protected By errorMsg = By.id("appNameError");
    protected By sendLink = By.cssSelector("#message-sent-history > div > div.page-card__body > div:nth-child(1) > div > div > div > div > div > div > div.col-md-8.col-sm-8.text-left.pl-0_mobile-pl-15 > div.my_app_link > a:nth-child(1)");
    protected By from = By.name("fromList");
    protected By to = By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/div[3]/div[1]");
    protected By smsChannel = By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/ul/li[1]/label/span");
    protected By pushNotifications=By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/ul/li[2]/label/span");
    protected By msg = By.id("bulk_messageBody");
    protected By alternativeMsg=By.id("bulk_messageBody_alter");
    protected By deliveryoption = By.id("blk_option_immediate");
    protected By submitButton=By.id("send_button_id");
    protected By placeHolder=By.id("name_add");
    protected By viewMsgHistory=By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/div/div[2]/div/div[1]/div/ul/li/a");
    protected By uploadImage=By.id("pushNotificationImage");
    protected By scheduleMsg=By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[5]/div[1]/div/div/ul/li[2]/label/span");
    protected By scheduleDateTime=By.id("msgSchedulingDatetimePicker");
    protected By scheduleButton=By.id("schedule_button_id");
    protected By alertMsg=By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/span");
    protected By cancelIcon=By.id("cancel_id");
    protected By resheduleIcon=By.id("reschedule_id");
    protected By fileuploadlink=By.cssSelector("#message-sent-history > div > div.page-card__body > div:nth-child(1) > div > div > div > div > div > div > div.col-md-8.col-sm-8.text-left.pl-0_mobile-pl-15 > div.my_app_link > a:nth-child(3)");
    protected By manageLink=By.cssSelector("#message-sent-history > div > div.page-card__body > div:nth-child(1) > div > div > div > div > div > div > div.col-md-8.col-sm-8.text-left.pl-0_mobile-pl-15 > div.my_app_link > a:nth-child(5)");
    protected By nextLink=By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[1]/div[4]/div/div/div/div/div[3]/div/a[3]");
    protected By fileUploadFrom=By.id("aliasSelect");
    protected By inputFile=By.id("uploadFile");
    protected By immediateDeliveryRadio=By.id("blk_option_immediate");
    protected By fileuploadSubmitBtn=By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/form/div/div/div/div[3]/div[2]/div/div[3]/button[1]");
    protected By fileuploadFromErrorMsg=By.id("selectedAliasError");
    protected By FileuploadErrorMsg=By.id("uploadFileError");

    WebDriver driver;

    public CreateBulkMsgPortal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click_create_messaging_portal() {
        waitTime(driver, createMsgPortalLink);
        click(driver, createMsgPortalLink);
    }

    public void click_portal_management() {
        waitTime(driver, portalManagement);
        click(driver, portalManagement);
    }

    public void clickFileUploadLink(){
        click(driver,fileuploadlink);
    }

    public void clickManageLink() throws InterruptedException {
        click(driver,manageLink);
        Thread.sleep(5000);
    }

    public void selectFileUploadFrom(String text){
        waitTime(driver,fileUploadFrom );
        Select dropdown = new Select(driver.findElement(fileUploadFrom));
        dropdown.selectByVisibleText(text);
    }

    public void selectBulkMsgFile(String file) throws InterruptedException {
        File uploadFile = new File(file);
        WebElement fileInput = driver.findElement(inputFile);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        Thread.sleep(5000);
    }

    public void selectImmediateDelivery(){
        waitTime(driver,immediateDeliveryRadio);
        click(driver,immediateDeliveryRadio);
    }

    public void clickFileUploadSubmit() throws InterruptedException {
        click(driver,fileuploadSubmitBtn);
        Thread.sleep(4000);
    }

    public void verify_error_msg(String text){
        WebElement manageContactListElement = driver.findElement(fileuploadFromErrorMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void verify_file_error_msg(String text){
        WebElement manageContactListElement = driver.findElement(FileuploadErrorMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void searchByAppname(String searchText) {
        waitTime(driver, searchButton);
        type(driver, searchInput, searchText);
    }

    public void clickSearchButton() {
        waitTime(driver, searchButton);
        click(driver, searchButton);
    }

    public void click_message_icon() {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        click(driver, createMsgIcon);

    }

    public void enterAppName(String appname) {
        waitTime(driver, appName);
        type(driver, appName, appname);
    }

    public void selectAllias(String text) {
        waitTime(driver, Allias);
        Select dropdown = new Select(driver.findElement(Allias));
        dropdown.selectByVisibleText(text);
    }

    public void selectMsgType(String type) {
        waitTime(driver, msgType);
        Select dropdown = new Select(driver.findElement(msgType));
        dropdown.selectByVisibleText(type);
    }

    public void enterDescription(String desc) throws InterruptedException {
        type(driver, description, desc);
        Thread.sleep(5000);
    }

    public void clickNextButton() {
        waitTime(driver, nextButton);
        click(driver, nextButton);
    }

    public void clickConfirmButton() throws InterruptedException {
        click(driver, confirmButton);
        Thread.sleep(5000);
    }

    public void verifySuccessMsg(String text) {
        WebElement manageContactListElement = driver.findElement(successMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
    }

    public void clickToViewApp() throws InterruptedException {
        click(driver, msgIcon);
        Thread.sleep(5000);
    }

    public void clickNextLink() throws InterruptedException {
        click(driver,nextLink);
        Thread.sleep(5000);
    }
    public void clickCancelIcon() throws InterruptedException{
        click(driver,cancelIcon);
        Thread.sleep(4000);
    }

    public void clickResheduleIcon() throws InterruptedException{
        click(driver,resheduleIcon);
        Thread.sleep(4000);
    }

    public void clickFileUpload() throws InterruptedException {
        click(driver, fileUpload);
        Thread.sleep(5000);
    }

    public void clickSettingLink() throws InterruptedException {
        click(driver, settingLink);
        Thread.sleep(5000);
    }

    public void verifyPortalName() {
        WebElement manageContactListElement = driver.findElement(errorMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Should be more than 4 and less than 32 characters.", actualText);
    }

    public void clickSendLink() {
        waitTime(driver, sendLink);
        click(driver, sendLink);
    }

    public void selectFrom(String text) {
        waitTime(driver, from);
        Select dropdown = new Select(driver.findElement(from));
        dropdown.selectByVisibleText(text);
    }

    public void selectTo() {
        waitTime(driver, to);
        click(driver, to);
    }

    public void selectChannelSms() {
        waitTime(driver, smsChannel);
        click(driver, smsChannel);
    }

    public void selectChannelSms_or_Push_Notifications() {
        waitTime(driver, pushNotifications);
        click(driver, pushNotifications);
    }

    public void addPlaceholder(){
        waitTime(driver,placeHolder);
        click(driver,placeHolder);
    }

    public void enterMsg(String text) {
        waitTime(driver, msg);
        type(driver, msg, text);
    }

    public void enterAlternativeMsg(String text) {
        waitTime(driver, alternativeMsg);
        type(driver, alternativeMsg, text);
    }

    public void uploadImage(String file) throws InterruptedException {
        File uploadFile = new File(file);
        WebElement fileInput = driver.findElement(uploadImage);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        Thread.sleep(5000);

    }

    public void clickScheduleMsg() {
        waitTime(driver, scheduleMsg);
        click(driver, scheduleMsg);
    }

    public void viewMsgHistory() throws InterruptedException {
        click(driver,viewMsgHistory);
        Thread.sleep(5000);
    }

    public void selectDeliveryOption() {
        waitTime(driver, deliveryoption);
        click(driver, deliveryoption);
    }

    public void enterDateTime(String text){
        waitTime(driver, scheduleDateTime);
        WebElement dateTimePicker = driver.findElement(scheduleDateTime);
        dateTimePicker.clear();
        dateTimePicker.sendKeys(text);

    }

    public void clickSubmitButton() throws InterruptedException {
        click(driver,submitButton);
        Thread.sleep(5000);
    }

    public void clickScheduleButton() throws InterruptedException {
        click(driver,scheduleButton);
        Thread.sleep(10000);
    }

    public void verifyAlertMsg() throws InterruptedException{
        WebElement manageContactListElement = driver.findElement(alertMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Message has been scheduled successfully!", actualText);
    }

}

