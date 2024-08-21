package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

      features = "Features/BankLogin.feature",
//      features = "Features/BulkMessagingPortal.feature",
//      features = "Features/DepAdminBulkMsgWizard.feature",
//      features = "Features/BankDashboard.feature",
//      features = "Features/SecureMessaging.feature",
//        features = "Features/Registration.feature",
//        features = "Features/Provisioning.feature",

        glue = {"stepDefinitions"},
        plugin = {"json:target/cucumber.json"},
        tags = {"@login"},
        monochrome = true

)
public class testRunner {

}
