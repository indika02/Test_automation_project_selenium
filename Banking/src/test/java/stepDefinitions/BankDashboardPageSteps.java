package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BankDashboardPage;
import utillities.BaseClass;

public class BankDashboardPageSteps {

    BankDashboardPage seylandashboardPage = new BankDashboardPage(BaseClass.setupBrowser());

    @Then("^Verify the portal availability as (.*)$")
    public void verify_portal_availability(String portalName) throws InterruptedException {
        seylandashboardPage.verifyPortalAvailability(portalName);
    }
    @Then("Click bulk messaging wizard icon")
    public void click_bulk_messaging_wizard_icon(){
        seylandashboardPage.click_bulk_messaging_wizard_icon();
    }

    @Then("^verify the create application portal as (.*)$")
    public void verify_bulk_create_application_portal(String text){
        seylandashboardPage.verifyCreateMsgPortal(text);
    }

    @Then("^verify the portal management as (.*)$")
    public void verify_the_portal_management(String text){
        seylandashboardPage.verifyPortalManagement(text);
    }

    @Then("^Verify the secure messaging portal availability as (.*)$")
    public void verify_secure_messaging(String text) throws InterruptedException {
        seylandashboardPage.verifySecureMsgPortalAvailability(text);
    }

    @Then("Click home button")
    public void click_home_button(){
        seylandashboardPage.click_home_button();
    }

    @Then("^Check availability of contact list module as (.*)$")
    public void verifyContactListModule(String text){
        seylandashboardPage.verifyContactListModule(text);
    }

    @Then("Hover over the profile dropdown")
    public void hoverOverProfileDropdown() throws InterruptedException {
        seylandashboardPage.hoverOverProfileDropdown();
    }

    @Then("Hover over the Module icon")
    public void hoverOvertheProfileDropdown() throws InterruptedException{
        seylandashboardPage.hoverOverModuleIcon();
    }

    @And("Click the Logout button")
    public void clickLogoutButton() {
        seylandashboardPage.clickLogoutButton();
    }

    @Then("Click the logout link")
    public void clickLogoutLink(){
        seylandashboardPage.clickLogoutLink();
    }

    @Then("Close the browser")
    public void close_broswer(){
        seylandashboardPage.closeBrowser();
    }

    @Then("^Verify the logout alert message as (.*)$")
    public void verify_logout_alert(String text){
        seylandashboardPage.verifyLogoutAlert(text);
    }
}
