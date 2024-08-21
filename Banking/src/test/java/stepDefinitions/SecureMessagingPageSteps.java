package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.SecureMessagingPage;
import utillities.BaseClass;

public class SecureMessagingPageSteps {

     SecureMessagingPage secureMessagingPage=new SecureMessagingPage(BaseClass.setupBrowser());

    @Then("Click the secure messaging")
    public void click_the_secure_messaging(){
        secureMessagingPage.clickSecureMsgModule();
    }

    @Then("Verify the module table availability")
    public void verify_module_table(){
        secureMessagingPage.verifyModuleTable();
    }

    @Then("^Enter the MSISDN number as (.*)$")
    public void enter_MSISDN(String text) throws InterruptedException {
        secureMessagingPage.EnterMSISDN(text);
    }

    @Then("Verify the message in table")
    public void verify_the_message_in_table() throws InterruptedException {
        secureMessagingPage.verifyErrorMsgTable();
    }

    @Then("Verify the that error message")
    public void verify_the_that_error_msg() throws InterruptedException {
        secureMessagingPage.verifyErrorMsgTablenoContent();
    }

    @Then("Hover over the request status")
    public void hover_the_request_status() throws InterruptedException{
        secureMessagingPage.hoverReqStatus();
    }

    @Then("Select the request status")
    public void select_the_request_status() throws InterruptedException{
        secureMessagingPage.selectReqStatus();
    }

    @Then("Click the request icon")
    public void click_the_request_icon() throws InterruptedException{
        secureMessagingPage.clickReqIcon();
    }

    @Then("^Enter the reason for request as (.*)$")
    public void enter_the_reason_for_request(String text){
        secureMessagingPage.enterReasonforRequest(text);
    }

    @Then("Click the send request button")
    public void click_the_send_request_button(){
        secureMessagingPage.clickSendReq();
    }

    @Then("Click the approve mark")
    public void click_the_approve_mark(){
        secureMessagingPage.clickApproveMark();
    }

    @Then("^Enter the Remark as (.*)$")
    public void enter_remark(String text){
        secureMessagingPage.enterRemark(text);
    }

    @Then("Click approve button")
    public void click_approve_button(){
        secureMessagingPage.clickApproveBtn();
    }

    @Then("Click the reject mark")
    public void click_reject_mark(){
        secureMessagingPage.clickRejectMark();
    }

    @Then("Click reject button")
    public void click_reject_button(){
        secureMessagingPage.clickRejectButton();
    }

    @Then("^Verify reject status as (.*)$")
    public void verify_reject_status(String text){
        secureMessagingPage.verifyRejectStatus(text);
    }

    @Then("^Verify request status as (.*)$")
    public void verify_request_status(String text){
        secureMessagingPage.verifyRequestStatus(text);
    }

    @Then("Click view icon to view the message")
    public void click_view_icon_to_view_message() throws InterruptedException {
        secureMessagingPage.clickMsgViewIcon();
    }

    @Then("^Verify the modal title as (.*)$")
    public void verify_the_modal_title(String text){
        secureMessagingPage.verifyModalTitle(text);
    }

    @Then("Verify the timer is visible")
    public void verify_timer(){
        secureMessagingPage.verifyTimer();
    }

    @Then("Click close Button")
    public void closePopup(){
        secureMessagingPage.closePopup();
    }

    @Then("Remove the alert msg")
    public void remove_the_alert_msg(){
        secureMessagingPage.removeAlert();
    }


}
