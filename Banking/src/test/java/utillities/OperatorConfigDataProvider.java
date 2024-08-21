package utillities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OperatorConfigDataProvider {

    private Properties properties;

    public OperatorConfigDataProvider() {
        ConfigDataProvider configDataProvider = new ConfigDataProvider();
        String operator = configDataProvider.getOperator();
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/" + operator + "/" + operator + "-config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println();
        }
    }

    public String getURL() {
        String URL = properties.getProperty("URL");
      //  System.out.println(URL);
        return URL;
    }

    public String getSDPAdminUsername() {
        return properties.getProperty("SDPAdminUsername");
    }
    public String getSDPAdminPassword() {
        return properties.getProperty("SDPAdminPassword");
    }
    public String getSPUsername() {
        return properties.getProperty("SPUsername");
    }
    public String getSPassword() {
        return properties.getProperty("SPPassword");
    }
    public String getrptUsername() {
        return properties.getProperty("RPTUsername");
    }
    public String getrptPassword() {
        return properties.getProperty("RPTPassword");
    }

    public String getRptAdminUsername() {
        return properties.getProperty("RPTAdminUsername");
    }
    public String getRptAdminPassword() {
        return properties.getProperty("RPTAdminPassword");
    }

    public String getdepAdminUsername() {
        return properties.getProperty("depAdminUsername");
    }
    public String getdepAdminPassword() {
        return properties.getProperty("depAdminPassword");
    }
    public String getmsisdnPlaceholder(){return properties.getProperty("mobilePlaceholder");}
    public String getVerificationMethodMessage(){return properties.getProperty("verificationMethodMessage");}
    public String getTermsMessage(){return properties.getProperty("termsMessage");}



}
