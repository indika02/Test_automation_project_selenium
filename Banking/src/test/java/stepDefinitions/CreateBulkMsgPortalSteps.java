package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateBulkMsgPortal;
import utillities.BaseClass;

public class CreateBulkMsgPortalSteps {

    CreateBulkMsgPortal createbulkmsgPage=new CreateBulkMsgPortal(BaseClass.setupBrowser());

//    @Then("Click create messaging portal")
//    public void click_create_messaging_portal(){
//        createbulkmsgPage.click_create_messaging_portal();
//    }

    @Then("Click create messaging portal")
    public void click_create_messaging_portal() {
        createbulkmsgPage.click_create_messaging_portal();
    }

    @Then("Click portal management")
    public void click_portal_management(){
        createbulkmsgPage.click_portal_management();
    }

    @Then("Click file upload")
    public void click_file_upload(){
        createbulkmsgPage.clickFileUploadLink();
    }

    @Then("Click manage link in selected active app")
    public void click_manage_link() throws InterruptedException{
        createbulkmsgPage.clickManageLink();
    }

    @Then("^Select fileupload from as (.*)$")
    public void select_fileupload_from(String text){
        createbulkmsgPage.selectFileUploadFrom(text);
    }

    @Then("^Select the bulk message file as (.*)$")
    public void select_the_bulk_msg_file(String file) throws InterruptedException {
        createbulkmsgPage.selectBulkMsgFile(file);
    }

    @Then("Select delivery option as Immediate delivery")
    public void select_Immediate_delivery(){
        createbulkmsgPage.selectImmediateDelivery();
    }

    @Then("Click file upload submit button")
    public void Click_file_upload_submit() throws InterruptedException {
        createbulkmsgPage.clickFileUploadSubmit();
    }

    @Then("^Verify the error message as (.*)$")
    public void verify_error_message(String text){
        createbulkmsgPage.verify_error_msg(text);
    }

    @Then("^Verify the file error message as (.*)$")
    public void verify_file_error_message(String text){
        createbulkmsgPage.verify_file_error_msg(text);
    }

    @Then("^Enter the app name as (.*)$")
    public void enter_the_app_name(String appname){
        createbulkmsgPage.searchByAppname(appname);
    }

    @Then("Click search button")
    public void click_search_button(){
        createbulkmsgPage.clickSearchButton();
    }

    @Then("Click message icon")
    public void click_message_icon(){
        createbulkmsgPage.click_message_icon();
    }

    @Then("^Enter Portal Name as (.*)$")
    public void enter_portal_name(String searchText){
        createbulkmsgPage.enterAppName(searchText);
    }

    @Then("Verify error message")
    public void verify_error_message(){
        createbulkmsgPage.verifyPortalName();
    }

    @And("^select Allowed Allias as (.*)$")
    public void select_allowed_allias(String text){
        createbulkmsgPage.selectAllias(text);
    }

    @And("^select Message type as (.*)$")
    public void select_message_type(String type){
        createbulkmsgPage.selectMsgType(type);
    }

    @And("^Enter Description as (.*)$")
    public void enter_description(String desc) throws InterruptedException{
        createbulkmsgPage.enterDescription(desc);
    }

    @Then("Click next button")
    public void click_next_button(){
        createbulkmsgPage.clickNextButton();
    }

    @Then("Click Confirm button")
    public void click_confirm_button() throws InterruptedException{
        createbulkmsgPage.clickConfirmButton();
    }

    @Then("^Confirm the success message as (.*)$")
    public void confirm_the_success_message(String text){
        createbulkmsgPage.verifySuccessMsg(text);
    }

    @Then("Click a created application")
    public void click_a_created_application() throws InterruptedException {
        createbulkmsgPage.clickToViewApp();
    }

    @Then("Click next link")
    public void click_next_link() throws InterruptedException{
        createbulkmsgPage.clickNextLink();
    }

    @Then("Click the cancel icon")
    public void click_the_cancel_icon() throws InterruptedException{
        createbulkmsgPage.clickCancelIcon();
    }

    @Then("Click reshedule icon")
    public void click_reshedule_icon() throws InterruptedException{
        createbulkmsgPage.clickResheduleIcon();
    }

    @Then("Click a upload file link")
    public void click_a_upload_file_link() throws InterruptedException{
        createbulkmsgPage.clickFileUpload();
    }

    @Then("Click a setting link")
    public void click_a_setting_link() throws InterruptedException{
        createbulkmsgPage.clickSettingLink();
    }

    @Then("Click send link")
    public void click_send_link(){
        createbulkmsgPage.clickSendLink();
    }

    @Then("^Select from as (.*)$")
    public void select_from(String text){
        createbulkmsgPage.selectFrom(text);
    }

    @Then("Select to")
    public void select_to(){
        createbulkmsgPage.selectTo();
    }

    @Then("Select the channel SMS")
    public void select_the_channel_sms(){
        createbulkmsgPage.selectChannelSms();
    }

    @Then("Select the channel Push notification or SMS")
    public void select_the_channel_sms_push_notifi(){
        createbulkmsgPage.selectChannelSms_or_Push_Notifications();
    }

    @Then("Add a placeholder")
    public void add_a_placeholder(){
        createbulkmsgPage.addPlaceholder();
    }

    @Then("^Enter the message as (.*)$")
    public void enter_the_message(String text){
        createbulkmsgPage.enterMsg(text);
    }

    @Then("^Upload a image as (.*)$")
    public void upload_image(String file) throws InterruptedException{
        createbulkmsgPage.uploadImage(file);
    }

    @Then("^Add a alternative message as (.*)$")
    public void enter_the_alternative_message(String text){
        createbulkmsgPage.enterAlternativeMsg(text);
    }

    @Then("Select delivery option as schedule message")
    public void select_schedule_msg(){
        createbulkmsgPage.clickScheduleMsg();
    }
    @Then("Click view sent messages")
    public void view_sent_messages() throws InterruptedException {
        createbulkmsgPage.viewMsgHistory();
    }

    @When("^Enter date & time to (.*)$")
    public void enter_date_and_time(String text){
        createbulkmsgPage.enterDateTime(text);
    }

    @Then("Select the delivery option")
    public void select_the_delivery_option(){
        createbulkmsgPage.selectDeliveryOption();
    }

    @Then("Click submit button")
    public void click_submit_button() throws InterruptedException {
        createbulkmsgPage.clickSubmitButton();
    }

    @Then("Click schedule button")
    public void click_schedule_button() throws InterruptedException{
        createbulkmsgPage.clickScheduleButton();
    }

    @Then("Verify the alert message")
    public void verify_alert_msg() throws InterruptedException{
        createbulkmsgPage.verifyAlertMsg();
    }

}
