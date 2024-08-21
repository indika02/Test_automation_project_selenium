package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.BankLoginPage;
import utillities.BaseClass;
import utillities.OperatorConfigDataProvider;

import static utillities.BaseClass.driver;

public class BankLoginPageSteps {
    BankLoginPage seylanLoginPage=new BankLoginPage(BaseClass.setupBrowser());

    OperatorConfigDataProvider operatorConfigDataProvider = new OperatorConfigDataProvider();

    @Given("^Load UI$")
    public void loadUI() throws InterruptedException {
        seylanLoginPage.openPage(operatorConfigDataProvider.getURL());
    }

    @When("^type username as (.*)$")
    public void typeUsername(String username) throws InterruptedException {
        seylanLoginPage.typeUsername(username);
    }

    @When("^type password as (.*)$")
    public void typePassword(String password) throws InterruptedException {
        seylanLoginPage.typePassword(password);
    }

    //invalid login
    @When("^Enter (.*) and (.*)")
    public void enter_invalid_credentials(String username, String password) {
       seylanLoginPage.enterInvalidCredentials(username, password);
    }


    @And("^Click on Login Button$")
    public void clickonLogin() throws InterruptedException {
        seylanLoginPage.clickOnLoginButton();
    }

    @Then("^Login as (.*)$")
    public void Login(String userType) throws InterruptedException {
        String username = "";
        String password = "";
        if (userType.toLowerCase().equals("sp")) {
            username = operatorConfigDataProvider.getSPUsername();
            password = operatorConfigDataProvider.getSPassword();

        } else if (userType.toLowerCase().equals("admin")) {
            username = operatorConfigDataProvider.getSDPAdminUsername();
            password = operatorConfigDataProvider.getSDPAdminPassword();

        }else if (userType.toLowerCase().equals("depadmin")){
            username = operatorConfigDataProvider.getdepAdminUsername();
            password = operatorConfigDataProvider.getdepAdminPassword();

        }else if (userType.toLowerCase().equals("rpt")){
            username=operatorConfigDataProvider.getrptUsername();
            password=operatorConfigDataProvider.getrptPassword();

        }else if (userType.toLowerCase().equals("rptadmin")){
            username=operatorConfigDataProvider.getRptAdminUsername();
            password=operatorConfigDataProvider.getRptAdminPassword();
        }
        typeUsername(username);
        typePassword(password);
        clickonLogin();
//        DashboardPageSteps dashboardPageStep = new DashboardPageSteps();
//        dashboardPageStep.verifyUseranme(username);
    }

    @Then("^Verify the login error message as (.*)$")
    public void verify_login_message(String text){
        seylanLoginPage.verifyErrorMsg(text);
    }

    @Then("Click forgot password link")
    public void click_forgot_password_link(){
        seylanLoginPage.clickForgotPwdLink();
    }

    @Then("Verify the forgot password alert message")
    public void verify_the_forgot_password_alert(){
        seylanLoginPage.verifyForgotPwdAlert();
    }

    @Then("Verify is there a module called (.*)$")
    public void verifyElementName(String text)  {
        seylanLoginPage.verifyElementInLogin(text);
    }

    @Then("^verify is available the username as (.*)$")
    public void verify_is_available_username(String uname){
        seylanLoginPage.verifyUsername(uname);
}

    @Then("Check the availability of this feature")
    public void availability_of_feature(){
        seylanLoginPage.featureAvailability();
}


}
