package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.RegistrationPage;
import utillities.BaseClass;

public class RegistrationPageSteps {

    RegistrationPage registrationPage=new RegistrationPage(BaseClass.setupBrowser());

    @Then("Click the Registration Module Icon")
    public void click_reg_module_icon() throws InterruptedException {
        registrationPage.clickRegModuleIcon();
    }

    @Then("Verify is there a link called Add a User")
    public void verify_Add_user(){
        registrationPage.verifyAddUser();
    }

    @Then("Verify is there a link called Manage Users")
    public void verify_manage_users(){
        registrationPage.verifyManageUsers();
    }

    @Then("Click manage users link")
    public void click_manage_users_link() throws InterruptedException {
        registrationPage.clickManageUsersLink();
    }

    @Then("Click add user link")
    public void click_add_user_link() throws InterruptedException {
        registrationPage.clickAddUserLink();
    }

    @Then("Click validate user button")
    public void click_validate_user_button() {
        registrationPage.clickValidateBtn();
    }

    @Then("^verify alert message as (.*)$")
    public void verify_alert(String alert){
        registrationPage.verifyAlertMsg(alert);
    }

    @Then("^Enter the username as (.*)$")
    public void Enter_username(String name){
        registrationPage.enteraUsername(name);
    }
    @Then("Move the Scroll bar in table")
    public void move_scorll_bar_in_table() {
        registrationPage.scrollTable();
    }

    @Then("^Enter username as (.*)$")
    public void enter_username(String uname){
        registrationPage.enterUsername(uname);
    }

    @And("^Enter firstname as (.*)$")
    public void enter_firstname(String firstname){
        registrationPage.enterFirstname(firstname);
    }

    @And("^Select status as (.*)$")
    public void select_status(String status){
        registrationPage.selectStatus(status);
    }

    @And("^Select UserGroup as (.*)$")
    public void select_usergroup(String usergroup){
        registrationPage.selectUserGroup(usergroup);
    }

    @Then("Click the disable icon")
    public void click_disable_icon(){
        registrationPage.clickDisableIcon();
    }

    @Then("Click yes in confirmation popup")
    public void click_yes_in_confirm() throws InterruptedException {
        registrationPage.clickOkForConfirm();
    }


    @Then("Click the search button")
    public void click_search_button() throws InterruptedException {
        registrationPage.clickSearchBtn();
    }

    @Then("Click the username")
    public void click_username() throws InterruptedException{
        registrationPage.clickUsername();
    }

    @Then("Click edit button")
    public void click_edit_button(){
        registrationPage.clickEditBtn();
    }

    @Then("^Edit firstname as (.*)$")
    public void edit_fname(String text){
        registrationPage.editFname(text);
    }

    @Then("^Edit lastname as (.*)$")
    public void edit_lname(String text){
        registrationPage.editLname(text);
    }

    @Then("Click save button")
    public void click_save_btn() throws InterruptedException{
        registrationPage.clickSaveBtn();
    }
    @And("Click sign out button")
    public void click_signout(){
        registrationPage.clickSignout();
    }




}
