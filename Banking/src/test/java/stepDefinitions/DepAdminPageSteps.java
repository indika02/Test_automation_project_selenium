package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.DepAdminPage;
import utillities.BaseClass;

public class DepAdminPageSteps {

    DepAdminPage depAdminPage=new DepAdminPage(BaseClass.setupBrowser());

    @Then("Click bulk messaging")
    public void click_bulk_messaging() throws InterruptedException{
        depAdminPage.clickBulkMsgIcon();
    }

    @Then("Click the approve file uploads")
    public void click_the_approve_file_uploads() throws InterruptedException{
        depAdminPage.clickApproveFileUploads();
    }

    @Then("Click the action approve mark")
    public void click_action_approve() throws InterruptedException{
        depAdminPage.clickApproveAction();
    }

    @Then("Click the action reject mark")
    public void click_action_reject() throws InterruptedException{
        depAdminPage.clickRejectAction();
    }
    @Then("Click download csv file link")
    public void click_download_csv_file_link(){
        depAdminPage.clickCsvDownloadLink();
    }

    @Then("Click manage contactlist")
    public void click_manage_contactlist(){
        depAdminPage.clickContactListIcon();
    }

    @Then("Click Delete icon")
    public void click_delete_icon(){
        depAdminPage.clickDeleteIcon();
    }

    @Then("Confirm the Delete")
    public void deleteConfirm(){
        depAdminPage.clickConfirm();
    }

    @Then("Click add contact list button")
    public void addContactList(){
        depAdminPage.clickAddContactButton();
    }

    @Then("^Enter contact list name as (.*)$")
    public void enter_contact_list_name(String name){
        depAdminPage.enterContactListName(name);
    }

    @Then("Select the portal")
    public void select_the_portal(){
        depAdminPage.selectPortal();
    }

    @Then("Validate the contactListName")
    public void validate_the_contactListName(){
        depAdminPage.verifyListName();
    }

    @Then("Verify the file error message")
    public void verify_the_file_error_message(){
        depAdminPage.verifyfileerror();
    }

    @Then("^Select the csv file as (.*)$")
    public void select_the_file(String file) throws InterruptedException {
        depAdminPage.uploadFile(file);
    }
    @Then("Click upload button")
    public void click_upload_button()throws InterruptedException{
        depAdminPage.clickUploadButton();
    }
    @Then("Click reset button")
    public void click_reset_button(){
        depAdminPage.clickResetButton();
    }

    @Then("Click back button")
    public void click_back_button(){
        depAdminPage.clickbackbutton();
    }

    @Then("Click approve bulk messages")
    public void click_approve_bulk_messages() throws InterruptedException {
        depAdminPage.approveBulkMsg();
    }

    @Then("Click the first row of the table")
    public void click_the_first_row() throws InterruptedException {
        depAdminPage.viewMsgDetails();
    }

    @Then("Click the approve button")
    public void click_the_approve_button() throws InterruptedException {
        depAdminPage.approveMsg();
    }

    @Then("Click the reject button")
    public void click_the_reject_button() throws InterruptedException {
        depAdminPage.rejectMsg();
    }

    @Then("Confirm the popup")
    public void confirm_the_popup() throws InterruptedException {
        depAdminPage.confirmPopup();
    }

    @Then("Close the popup")
    public void closePopup(){
        depAdminPage.closePopup();
    }

    @Then("Click the contact view icon")
    public void click_the_contact_view() throws InterruptedException{
        depAdminPage.clickContactView();
    }

    @Then("Check the error message")
    public void check_the_error_message(){
        depAdminPage.verifyContactMsg();
    }

    @Then("Click the back button")
    public void click_the_back_button(){
        depAdminPage.clickBackbutton();
    }
    @Then("^Enter the MSISDN as (.*)$")
    public void enter_the_msisdn(String msisdn){
        depAdminPage.enterSearchMsisdn(msisdn);
    }

    @Then("Click search contact button")
    public void click_search_contact_button() throws InterruptedException {
        depAdminPage.clickSearchContact();
    }

    @Then("Clear the searchbox")
    public void clear_the_searchbox(){
        depAdminPage.clearSearchBox();
    }

    @Then("Click download icon")
    public void click_download_icon(){
        depAdminPage.downloadCsvFile();
    }

}
