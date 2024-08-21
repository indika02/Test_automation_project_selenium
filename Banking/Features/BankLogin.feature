Feature: Login Page Test Cases
  This is Login related test cases

  @login_rptuser @login
  Scenario: Login as rpt user
    Given Load UI
    Then Login as rpt
    Then Verify is there a module called Secure Messaging
    Then Hover over the profile dropdown
    And Click the Logout button

  @login_sdpadmin @login
  Scenario: Login as SDP Admin
    Given Load UI
    Then Login as admin
    Then Verify is there a module called Registration
    Then Hover over the profile dropdown
    And Click the Logout button

  @login_depadmin @login
  Scenario: Login as DEP Admin, check bulk messaging portal access permissions for diffrent user levels-55251, Check whether department admin users are able to login to the system via the common login UI-55223
    Given Load UI
    Then Login as depadmin
    Then Verify is there a module called Bulk Messaging Wizard
    Then Hover over the profile dropdown
    And Click the Logout button


  @login_spuser @login
  Scenario: Login as sp user, Check whether SP users are able to login to the system via the common login UI-54947 check bulk messaging portal access permissions for diffrent user levels-55251
    Given Load UI
    Then Login as sp
    Then Verify is there a module called Message Template Manager
    Then Hover over the profile dropdown
    And Click the Logout button

  @login_rptuser @login
  Scenario: Login as RPT admin
    Given Load UI
    Then Login as rptadmin
    Then Verify is there a module called Reporting
    Then Hover over the profile dropdown
    And Click the Logout button


  @invalid_login_rptadmin @login
  Scenario Outline: Check whether admin users are able to login to the system via the common login UI with wrong password-54944
    Given Load UI
    When Enter <username> and <password>
    Then Click on Login Button
    And Verify the login error message as Invalid credentials

    Examples:
      | username  | password |
      | rptadmin1 | 1234     |

  @invalid_login_spuser @login
  Scenario Outline: Check whether sp users are able to login to the system via the common login UI with wrong password-54945,54946
    Given Load UI
    When Enter <username> and <password>
    Then Click on Login Button
    And Verify the login error message as Invalid credentials

    Examples:
      | username| password       |
      | amuthan | AmutN#*29sdsds |

  @invalid_login_depadmin @login
  Scenario Outline: Check whether department admin users are able to login to the system via the common login UI with wrong password-55224,Check valid user in Active Directory can log into the system with invalid password-59644
    Given Load UI
    When Enter <username> and <password>
    Then Click on Login Button
    And Verify the login error message as Invalid credentials

    Examples:
      | username| password       |
      | depadmin | AmutN#dsd*29sdsds |

  @invalid_credentials @login
  Scenario Outline: Check invalid user in Active Directory can log into the system-59643
    Given Load UI
    When Enter <username> and <password>
    Then Click on Login Button
    And Verify the login error message as You do not have privileges to access this system. Please contact system administrator.

    Examples:
      | username| password       |
      | depaddsdmin | AmutN#dsd*29sdsds |

  @verify_username @login
  Scenario: Check valid user in Active Directory can log into the system-59642
    Given Load UI
    Then Login as depadmin
    Then verify is available the username as depadmin
    Then Hover over the profile dropdown
    And Click the Logout button

  @forgot_password_link_rptuser @login
  Scenario: Check whether ‘Forgot Your Password?’ link can be used by SP to request a new password-54948
    Given Load UI
    Then Click forgot password link
    Then Verify the forgot password alert message

  @recoverpwdvaliduname @login
  Scenario: Check SP is able to recover the password using Forgot Password link by providing a correct user name-54949
    Given Load UI
    Then Check the availability of this feature
    And Close the browser

  @recoverpwdinvaliduname @login
  Scenario: Check SP is able to recover the password using Forgot Password link by providing a invalid user name-54950
    Given Load UI
    Then Check the availability of this feature
    And Close the browser

  @recoverpwdinvalidemail @login
  Scenario: Check SP is able to recover the password using Forgot Password link by providing a invalid email address-54951
    Given Load UI
    Then Check the availability of this feature
    And Close the browser

  @recoverpwdvalidemail @login
  Scenario: Check SP is able to recover the password using Forgot Password link by providing a valid email address-54952
    Given Load UI
    Then Check the availability of this feature
    And Close the browser

  @navmenu @login
  Scenario: Check functionality of navigation menu-54956
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @securitytab @login
  Scenario: Check whether users is able to change the account password by clicking on the ‘Security’ tab in Settings UI-54966
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @tpdCollection @login
  Scenario: Check whether the tpd collection is updating properly-55023
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @smsmo @login
  Scenario: Send sms-mo to active production number mask enabled application from normal msisdn-55024
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @tdpussd @login
  Scenario: Check whether the tpd collection is updating correclty for the USSD-55025
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @whitelistmsisdn @login
  Scenario: Send sms-mo to limited production number mask enabled application from white-listed msisdn-55026
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @blacklistmsisdn @login
  Scenario: Send sms-mo to limited production number mask enabled application from black-listed msisdn-55027
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @normalmsisdn @login
  Scenario: Send sms-mo to limited production number mask enabled application from normal msisdn-55028
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @smsmoblacklistedmsisdn @login
  Scenario: Send sms-mo to active production number mask enabled application from black-listed msisdn
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @ipaddress @login
  Scenario: Remove the ip address of the internal application from sytem_configuration collection in mongo kite database. And run the above mentioned scripts again.-55030
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible01 @login
  Scenario: Send sms-mo to active production number mask enabled application from white-listed msisdn-55031
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible02 @login
  Scenario: verify if an MO request can be sent with a MSISDN with the incorrect number of digits-55033
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible03 @login
  Scenario: verify if a MO request can be sent to an application when the application is in a draft state-55034
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible04 @login
  Scenario: verify if the system rejects MO request sent to an applications in limited production status-55036
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible05 @login
  Scenario:  verify if a MO request can be sent to an application with an incorrect keyword-55038
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible06 @login
  Scenario: Send sms-mo request to active-production application when NBL app not exising-55039
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible07 @login
  Scenario: Send MO request to limited-production state application from white-listed msisdn-55040
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible08 @login
  Scenario: Check whether number will be masked differently when sending sms mo to two different applications with the same mobile number-55041
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible09 @login
  Scenario: verify if the system will reject a MO request sent from an MSISDN not from available telcos within the system-55042
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible10 @login
  Scenario: Send sms-mo to application from black-listed msisdn-55043
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible11 @login
  Scenario: Check whether the password is correctly validated-55123
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible12 @login
  Scenario: Check whether password and re-type password are validated when adding new users-55124
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible13 @login
  Scenario: Check whether are there any unwanted references available in the system-55126
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible14 @login
  Scenario: Check whether in 'Application Reports’ drilled down options are available to year and application name-55127
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible15 @login
  Scenario: Check whether when 'Application Reports’ year/month drill down was selected user is directed to App based Traffic Report correctly-55128
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible16 @login
  Scenario: Check whether in Application Reports’ application name drill down was selected use is directed to App based Traffic Report correctly-55129
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible17 @login
  Scenario: Check whether favicon is available for any report-55130
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible18 @login
  Scenario: Check what are the sort options available in "Application Reports"-55131
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible19 @login
  Scenario: Check whether 100 characters can be inserted in to address field-55132
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible20 @login
  Scenario: Check whether Seylan branding has been applied correctly to in the Loging page-55135
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible21 @login
  Scenario: Check whether initial data provides expected user groups-55230
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible22 @login
  Scenario: Check disabled user can log into the system-59645
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible23 @login
  Scenario: Check user can log into the system without user group-59646
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible24 @login
  Scenario: Check administrator user registration form-59647
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible25 @login
  Scenario: Check administrator can create new user-59648
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible26 @login
  Scenario: Check validations for user creation by admin-59657
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible27 @login
  Scenario: Check available items in User Group columns-59658
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible28 @login
  Scenario: Check available input fields for Add a User and Edit forms-59659
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible29 @login
  Scenario: Check change password functionality available for the users of Messaging Gateway-59660
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible30 @login
  Scenario: Check forgot password functionality-59661
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible31 @login
  Scenario: Check AD timeout for user login-59671
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible32 @login
  Scenario: Check existing users not in Active Directory can login to system-59672
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible33 @login
  Scenario: Check UI changes for LDAP intergration via Messaging gateway-61046
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible36 @login
  Scenario: Check fetched data coorect for username in LDAP intergration via Messaging gateway-61048
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible37  @login
  Scenario: Check validation of add user form in LDAP intergration via Messaging gateway-61049
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible38 @login
  Scenario: Check success flow of add user in LDAP intergration via Messaging gateway-61050
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible39 @login
  Scenario: Check validation of changed fileds are not changed exept CR changes in LDAP intergration via Messaging gateway-61051
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible40 @login
  Scenario: Check no changes for other fileds add user in LDAP intergration via Messaging gateway-61052
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible41 @login
  Scenario: Check no changes for existing validation of fileds in edit user form except CR changes-61053
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible42 @login
  Scenario: Check UI of edit user form-61054
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible43 @login
  Scenario: Check max length of first name and last name-61055
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button

  @impossible44 @login
  Scenario: Verify edit flow working correctly-61056
    Given Load UI
    Then Login as sp
    Then Check the availability of this feature
    Then Hover over the profile dropdown
    And Click the Logout button








