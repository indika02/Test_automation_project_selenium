package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utillities.ActionCommands;

import java.net.ProtocolException;
import java.util.List;

public class ProvisioningPage extends ActionCommands{

    protected By provisioningIcon=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
    protected By createApplicationLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By viewApplicationLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By slaConfigurationsLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    protected By viewSlaConfigurationsLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By manageApplicationsLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By newApplicatonRequests=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By ManageCooparateUserArrow=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    protected By ManageCooparateUser=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");

    protected By appName=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]");
    protected By appDesc=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/textarea[1]");
    protected By msgType=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/select[1]");
    protected By hostAddress=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/textarea[1]");
    protected By whiteListNumbers=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/textarea[1]");
    protected By blackListNumbers=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/textarea[1]");
    protected By productionStartTime=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[3]/div[1]/input[1]");
    protected By productionExpTimeMark=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[3]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    protected By productionEndTime=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[3]/div[1]/input[1]");
    protected By appPiority=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/table[1]/tbody[1]/tr[11]/td[3]/div[1]/select[1]");
    protected By SMSConfigurationMark=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    protected By resourceDialog=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    protected By nextBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]");
    protected By saveAsDraftBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By configreLink=By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/fieldset/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]/table/tbody/tr/td[3]/div/div/span/span");
    protected By allowMOTrafficMark=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    protected By shortCodedropdown=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]");
    protected By shortCode=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]");
    protected By keyWordTxtBox=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]");
    protected By msgUrl=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/input[1]");
    protected By allowMTTrafficMark=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/input[1]");
    protected By defaultSenderAddress=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]");
    protected By aliasTxt=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]");
    protected By provisioningHomeLink=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/a[1]");
    protected By deliveryReportMark=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/span[1]/input[1]");
    protected By deliveryReportUrl=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/input[1]");
    protected By submitBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By confirmBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]");
    protected By approvalBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]");
    protected By deleteBtn=By.cssSelector("#v-Provision_WAR_prov_LAYOUT_10160 > div > div.v-verticallayout.v-verticallayout-container-panel.container-panel > div > div:nth-child(1) > div > div > div.v-panel-content > div > div > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(1) > div > div > div.v-table-body > div.v-table-body-noselection > table > tbody > tr:nth-child(1) > td:nth-child(7) > div > div > div > div:nth-child(3) > div > div > span > span");
    protected By confirmDeletion=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By appApproveLink=By.cssSelector("#v-Provision_WAR_prov_LAYOUT_10160 > div > div.v-verticallayout.v-verticallayout-container-panel.container-panel > div > div:nth-child(1) > div > div > div.v-panel-content > div > div > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(1) > div > div > div.v-table-body > div.v-table-body-noselection > table > tbody > tr:nth-child(1) > td:nth-child(7) > div > div > div > div:nth-child(3) > div > div > span > span");
    protected By appRejectLink=By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[7]/div/div/div/div[4]/div/div/span/span");
    protected By activeProductionLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By limitedProductionLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]");
    protected By productionOnScheduledTime=By.id("gwt-uid-6");

    protected By rejectLink=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]");
    protected By alertMsg=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    protected By approvalError=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]");
    protected By approvalNote=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/textarea[1]");
    protected By rejectNote=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]");
    protected By confirmAppApproval=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By confirmAppReject=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By appRequestsTable=By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div[1]/div/table");
    protected By appViewLink=By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[7]/div/div/div/div[1]/div/div/span/span");
    protected By appEditLink=By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[7]/div/div/div/div[2]/div/div/span/span");
    protected By appSaveBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]");
    protected By saveNote=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]");
    protected By saveConfirm=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
    protected By profileUsername=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/strong[1]/a[1]");
    protected By appNameFilterBox=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]");
    protected By appStatusFilterBox=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]");
    protected By appFilerSearchBtn=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]/span[1]");
    protected By dropDownItems=By.xpath("/html/body/div[4]/div/div[2]/table");
    WebDriver driver;

    public ProvisioningPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProvisioningIcon() throws InterruptedException {
        click(driver,provisioningIcon);
        Thread.sleep(5000);
    }

    public void clickProfileUsername() throws InterruptedException {
        click(driver,profileUsername);
        Thread.sleep(8000);
    }

    public void clickViewApplications() throws InterruptedException {
        click(driver,viewApplicationLink);
        Thread.sleep(9000);
    }

    public void clickDeleteButton() throws InterruptedException {
        click(driver,deleteBtn);
        Thread.sleep(5000);
    }

    public void clickAppApproveLink() throws InterruptedException {
        click(driver,appApproveLink);
        Thread.sleep(5000);
    }

    public void clickMovetoActiveProduction() throws InterruptedException {
        click(driver,activeProductionLink);
        Thread.sleep(5000);
    }

    public void clickMovetoLimitedProduction() throws InterruptedException {
        click(driver,limitedProductionLink);
        Thread.sleep(5000);
    }

    public void clickProductionOnScheduledTime() throws InterruptedException {
        click(driver,productionOnScheduledTime);
        Thread.sleep(5000);
    }


    public void addNoteForApproval(String text){
        waitTime(driver,approvalNote);
        type(driver,approvalNote,text);
    }

    public void addSaveNote(String text){
        waitTime(driver,saveNote);
        type(driver,saveNote,text);
    }

    public void addNoteForReject(String text){
        waitTime(driver,rejectNote);
        type(driver,rejectNote,text);
    }

    public void confirmAppApproval() throws InterruptedException {
        click(driver,confirmAppApproval);
        Thread.sleep(6000);
    }

    public void confirmAppReject() throws InterruptedException {
        click(driver,confirmAppReject);
        Thread.sleep(6000);
    }

    public void confirmAppSave() throws InterruptedException {
        click(driver,saveConfirm);
        Thread.sleep(6000);
    }
    public void confirmDeletion() throws InterruptedException{
        click(driver,confirmDeletion);
        Thread.sleep(8000);
    }
    public void clickCreateApplications() throws InterruptedException {
        click(driver,createApplicationLink);
        Thread.sleep(5000);
    }

    public void enterApplicationName(String text){
        waitTime(driver,appName);
        type(driver,appName,text);
    }

    public void enterAppDesc(String text){
        waitTime(driver,appDesc);
        type(driver,appDesc,text);
    }

    public void selectMsgType(String type){
        waitTime(driver,msgType );
        Select dropdown = new Select(driver.findElement(msgType));
        dropdown.selectByVisibleText(type);
    }

    public void enterHostAddress(String text){
        waitTime(driver,hostAddress);
        type(driver,hostAddress,text);
    }

    public void enterWhiteListNumbers(String text){
        waitTime(driver,whiteListNumbers);
        type(driver,whiteListNumbers,text);
    }
    public void enterBlackListNumbers(String text){
        waitTime(driver,blackListNumbers);
        type(driver,blackListNumbers,text);
    }

    public void enterProductionStartTime(String time){
        waitTime(driver,productionStartTime);
        WebElement dateTimePicker = driver.findElement(productionStartTime);
        dateTimePicker.clear();
        dateTimePicker.sendKeys(time);
    }

    public void markProductionExpTime(){
        click(driver, productionExpTimeMark);
    }

    public void enterProductionEndTime(String time){
        waitTime(driver,productionEndTime);
        WebElement dateTimePicker = driver.findElement(productionEndTime);
        dateTimePicker.clear();
        dateTimePicker.sendKeys(time);
    }

    public void selectAppPiority(String type){
        waitTime(driver,appPiority);
        Select dropdown = new Select(driver.findElement(appPiority));
        dropdown.selectByVisibleText(type);
    }

    public void markAsSMS(){
        click(driver,SMSConfigurationMark);
    }

    public void markResourceDialog(){
        click(driver,resourceDialog);
    }


    public void clickSaveAsDraft() throws InterruptedException {
        click(driver,saveAsDraftBtn);
        Thread.sleep(10000);
    }
    public void clickNextBtn() throws InterruptedException {
        click(driver,nextBtn);
        Thread.sleep(5000);
    }

    public void clickSaveBtn() throws InterruptedException {
        click(driver,appSaveBtn);
        Thread.sleep(5000);
    }

    public void clickConfigureLink() throws InterruptedException {
        click(driver,configreLink);
        Thread.sleep(5000);
    }

    public void clickAllowMOTraffic(){
        click(driver,allowMOTrafficMark);
    }

    public void selectShortCode(){
        click(driver,shortCodedropdown);
        click(driver,shortCode);
    }

    public void enterKeyword(String text){
        waitTime(driver,keyWordTxtBox);
        type(driver,keyWordTxtBox,text);
    }

    public void enterMsgUrl(String url){
        waitTime(driver,msgUrl);
        type(driver,msgUrl,url);
    }

    public void clickAllowMTTraffic(){
        click(driver,allowMTTrafficMark);
    }

    public void enterDefaultSenderAddress(String address){
        waitTime(driver,defaultSenderAddress);
        type(driver,defaultSenderAddress,address);
    }

    public void enterAlias(String alias){
        waitTime(driver,aliasTxt);
        type(driver,aliasTxt,alias);
    }

    public void clickDeliveryReportRequired(){
        click(driver,deliveryReportMark);
    }
    public void clickSlaConfigurations() {
        click(driver,slaConfigurationsLink);
    }

    public void enterDeliveryReporTurl(String url){
        waitTime(driver,deliveryReportUrl);
        type(driver,deliveryReportUrl,url);
    }

    public void clickStatusDropdown(){
        waitTime(driver,appStatusFilterBox);
        click(driver,appStatusFilterBox);
    }

    public void selectStatusDropdown(String text){
        waitTime(driver,appStatusFilterBox);
        WebElement table=driver.findElement(dropDownItems);
        List<WebElement> options = table.findElements(By.tagName("tr"));
        for (WebElement option : options) {
            if (option.getText().equals(text)) {
                option.click();
                break;
            }
        }
    }


    public void clickSubmit(){
        click(driver,submitBtn);
    }

    public void clickConfirm() throws InterruptedException {
        click(driver,confirmBtn);
        Thread.sleep(5000);
    }

    public void verifyReconfigureLink(){
        WebElement manageContactListElement = driver.findElement(configreLink);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString("Reconfigure", actualText);
    }

    public void clickApplyForApproval() throws InterruptedException {
        click(driver,approvalBtn);
        Thread.sleep(8000);
    }

    public void verifyApprovalError(String text) throws InterruptedException {
        WebElement manageContactListElement = driver.findElement(approvalError);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
        Thread.sleep(5000);
    }
    public void verify_alertmsg(String text) throws InterruptedException {
        WebElement manageContactListElement = driver.findElement(alertMsg);
        String actualText = manageContactListElement.getText();
        System.out.println(actualText);
        assetString(text, actualText);
        Thread.sleep(5000);
    }
    public void clickViewSlaConfigurations() throws InterruptedException {
        click(driver,viewSlaConfigurationsLink);
        Thread.sleep(5000);
    }

    public void clickManageApplications() throws InterruptedException{
        click(driver,manageApplicationsLink);
        Thread.sleep(5000);
    }

    public void enterAppnameByFilter(String text){
        waitTime(driver,appNameFilterBox);
        type(driver,appNameFilterBox,text);
    }

    public void clickSearchBtn() throws InterruptedException {
        click(driver,appFilerSearchBtn);
        Thread.sleep(7000);
    }
    public void clickNewApplicationRequests() throws InterruptedException{
        click(driver,newApplicatonRequests);
        Thread.sleep(10000);
    }

    public void scrollReqTable() {
        WebElement table = driver.findElement(appRequestsTable);
        Actions actions = new Actions(driver);
        for (int i = 0; i < 100; i++) {
            actions.moveToElement(table).click().sendKeys(Keys.ARROW_RIGHT).perform();
        }
    }

    public void clickRejectLink() throws InterruptedException{
        click(driver,appRejectLink);
        Thread.sleep(8000);
    }

    public void clickViewLink() throws InterruptedException{
        click(driver,appViewLink);
        Thread.sleep(8000);
    }

    public void clickEditLink() throws InterruptedException{
        click(driver,appEditLink);
        Thread.sleep(8000);
    }

    public void clickReject() throws InterruptedException {
        click(driver,rejectLink);
        Thread.sleep(6000);
    }

    public void clickCooparateuserArrow(){
        click(driver,ManageCooparateUserArrow);
    }

    public void clickManageCooparateUser() throws InterruptedException {
        click(driver,ManageCooparateUser);
        Thread.sleep(5000);
    }

    public void clickHomeLink(){
        click(driver,provisioningHomeLink);
    }
}
