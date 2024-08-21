package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.BankLoginPage;
import pageObjects.ProvisioningPage;
import utillities.BaseClass;

public class ProvisioningPageSteps {

    ProvisioningPage provisioningPage=new ProvisioningPage(BaseClass.setupBrowser());

    @Then("Click the provisioning icon")
    public void click_the_provisioning() throws InterruptedException {
        provisioningPage.clickProvisioningIcon();
    }

    @Then("Click the profile username")
    public void click_profile_username() throws InterruptedException{
        provisioningPage.clickProfileUsername();
    }

    @Then("Click create applications")
    public void click_create_application() throws InterruptedException{
        provisioningPage.clickCreateApplications();
    }

    @Then("^Enter application name as (.*)$")
    public void enter_application_name(String text){
        provisioningPage.enterApplicationName(text);
    }

    @Then("^Enter Application description as (.*)$")
    public void enter_app_desc(String text){
        provisioningPage.enterAppDesc(text);
    }

    @Then("^Select the message type as (.*)$")
    public void select_msg_type(String type){
        provisioningPage.selectMsgType(type);
    }

    @Then("^Enter allowed host address as (.*)$")
    public void enter_allowed_host_address(String text){
        provisioningPage.enterHostAddress(text);
    }

    @Then("^Enter White listed users as (.*)$")
    public void enter_white_list_users(String text){
        provisioningPage.enterWhiteListNumbers(text);
    }

    @Then("^Enter Black listed users as (.*)$")
    public void enter_black_list_users(String text){
        provisioningPage.enterBlackListNumbers(text);
    }

    @Then("^Enter production start time as (.*)$")
    public void enter_production_start_time(String time){
        provisioningPage.enterProductionStartTime(time);
    }

    @Then("Mark production expiration time")
    public void mark_production_exptime(){
        provisioningPage.markProductionExpTime();
    }

    @Then("^Enter production end time as (.*)$")
    public void enter_production_end_time(String time){
        provisioningPage.enterProductionEndTime(time);
    }

    @Then("^Select the application piority as (.*)$")
    public void select_app_piority(String type){
        provisioningPage.selectAppPiority(type);
    }

    @Then("Mark resource configurations as sms")
    public void mark_resource_configurations_as_sms(){
        provisioningPage.markAsSMS();
    }

    @Then("Mark resource as dialog")
    public void mark_resource_as_dialog(){
        provisioningPage.markResourceDialog();
    }

    @Then("Click save as draft")
    public void click_save_as_draft() throws InterruptedException {
        provisioningPage.clickSaveAsDraft();
    }

    @Then("Click the next button")
    public void click_next_btn() throws InterruptedException {
        provisioningPage.clickNextBtn();
    }

    @Then("Click save button of window")
    public void click_save_button_of_window() throws InterruptedException{
        provisioningPage.clickSaveBtn();
    }

    @Then("Click configure link")
    public void click_configure_link() throws InterruptedException{
        provisioningPage.clickConfigureLink();
    }

    @Then("Mark allow mobile originated traffic")
    public void mark_allow_mobile_originated_traffic(){
        provisioningPage.clickAllowMOTraffic();
    }

    @Then("^Select short code")
    public void select_short_code(){
        provisioningPage.selectShortCode();
    }

    @Then("^Enter a keyword as (.*)$")
    public void enter_keyword(String text){
        provisioningPage.enterKeyword(text);
    }

    @Then("^Enter a message receving url as (.*)$")
    public void enter_msg_url(String url){
        provisioningPage.enterMsgUrl(url);
    }

    @Then("Mark allow mobile terminated traffic")
    public void mark_allow_mobile_terminated_traffic(){
        provisioningPage.clickAllowMTTraffic();
    }

    @Then("^Enter a default sender address as (.*)$")
    public void enter_default_sender_address(String address){
        provisioningPage.enterDefaultSenderAddress(address);
    }

    @Then("^Enter a alias as (.*)$")
    public void enter_alias(String alias){
        provisioningPage.enterAlias(alias);
    }

    @Then("Mark delivery report required")
    public void mark_delivery_reprot_requird(){
        provisioningPage.clickDeliveryReportRequired();
    }

    @Then("^Enter delivery report url as (.*)$")
    public void enter_delivery_report_url(String url){
        provisioningPage.enterDeliveryReporTurl(url);
    }

    @Then("Click the submit button")
    public void click_submit_button(){
        provisioningPage.clickSubmit();
    }

    @Then("Click the confirm button")
    public void click_confirm_button() throws InterruptedException {
        provisioningPage.clickConfirm();
    }

    @Then("Verify Reconfigure link is available")
    public void verify_reconfigure_link(){
        provisioningPage.verifyReconfigureLink();
    }

    @Then("Click apply for approval")
    public void click_apply_approval() throws InterruptedException {
        provisioningPage.clickApplyForApproval();
    }

    @Then("^Verify approval error message as (.*)$")
    public void verify_approval_error(String text) throws InterruptedException {
        provisioningPage.verifyApprovalError(text);
    }

    @Then("^Verify the Alert Message as (.*)$")
    public void verify_alert_msg(String text) throws InterruptedException {
        provisioningPage.verify_alertmsg(text);
    }

    @Then("Click view applications")
    public void click_view_application() throws InterruptedException{
        provisioningPage.clickViewApplications();
    }

    @Then("Click delete button")
    public void click_delete_button() throws InterruptedException {
        provisioningPage.clickDeleteButton();
    }

    @Then("Click app approve link")
    public void click_approve_link() throws InterruptedException {
        provisioningPage.clickAppApproveLink();
    }

    @Then("Click move to active production")
    public void click_move_to_active_production() throws InterruptedException {
        provisioningPage.clickMovetoActiveProduction();
    }

    @Then("Click move to Limited production")
    public void click_move_to_limited_production() throws InterruptedException{
        provisioningPage.clickMovetoLimitedProduction();
    }

    @Then("Click as Send active production on scheduled time")
    public void click_as_send_active_production_on_scheduled_time() throws InterruptedException{
        provisioningPage.clickProductionOnScheduledTime();
    }

    @Then("^Add a note as (.*)$")
    public void add_a_note(String note){
        provisioningPage.addNoteForApproval(note);
    }

    @Then("^Add a note for save as (.*)$")
    public void add_a_note_for_save(String note){
        provisioningPage.addSaveNote(note);
    }

    @Then("^Add a reject note as (.*)$")
    public void add_reject_note(String text){
        provisioningPage.addNoteForReject(text);
    }

    @Then("Click yes for Confirm the app approval")
    public void confirm_app_approval() throws InterruptedException {
        provisioningPage.confirmAppApproval();
    }

    @Then("Click yes for Confirm the app reject")
    public void confirm_app_reject() throws InterruptedException {
        provisioningPage.confirmAppReject();
    }

    @Then("Click yes in save popup")
    public void confirm_app_save() throws InterruptedException {
        provisioningPage.confirmAppSave();
    }

    @Then("Confirm the deletion of application")
    public void confirm_deletion_draft() throws InterruptedException {
        provisioningPage.confirmDeletion();
    }
    @Then("Click SLA configurations")
    public void click_sla_configurations (){
        provisioningPage.clickSlaConfigurations();
    }

    @Then("Click view SLA configurations")
    public void click_view_sla_configurations() throws InterruptedException{
        provisioningPage.clickViewSlaConfigurations();
    }

    @Then("Click new application requests")
    public void click_new_application_requests() throws InterruptedException{
        provisioningPage.clickNewApplicationRequests();
    }

    @Then("Move the Scroll bar of table to left")
    public void move_the_scroll_bar_of_table_to_left(){
        provisioningPage.scrollReqTable();
    }
    @Then("Click app reject link")
    public void click_app_reject_link() throws InterruptedException {
        provisioningPage.clickRejectLink();
    }

    @Then("Click app view link")
    public void click_app_view_link() throws InterruptedException {
        provisioningPage.clickViewLink();
    }

    @Then("Click app edit link")
    public void click_app_edit_link() throws InterruptedException{
        provisioningPage.clickEditLink();
    }

    @Then("Click reject")
    public void click_reject() throws InterruptedException {
        provisioningPage.clickReject();
    }

    @Then("Click manage applications")
    public void click_manage_applications() throws InterruptedException{
        provisioningPage.clickManageApplications();
    }

    @Then("Click the status dropdown")
    public void click_status_dropdown(){
        provisioningPage.clickStatusDropdown();
    }

    @Then("^select the status as (.*)$")
    public void select_status(String text){
        provisioningPage.selectStatusDropdown(text);
    }

    @Then("^Enter the app name for app search (.*)$")
    public void enter_the_app_name_for_filter(String text){
        provisioningPage.enterAppnameByFilter(text);
    }

    @Then("Click the search button for filter the app")
    public void click_search_button_app() throws InterruptedException {
        provisioningPage.clickSearchBtn();
    }

    @Then("Click manage cooparate user arrow")
    public void click_manage_cooparate_user_arrow(){
        provisioningPage.clickCooparateuserArrow();
    }

    @Then("Click manage cooparate user")
    public void click_manage_cooparate_user() throws InterruptedException{
        provisioningPage.clickManageCooparateUser();
    }

    @Then("Click home link")
    public void click_home_link(){
        provisioningPage.clickHomeLink();
    }
}
