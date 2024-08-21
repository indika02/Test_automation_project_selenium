Feature: Dashboard test cases
  This is Dashboard related test cases

  @portal_availablity @mainDashboard
  Scenario: check bulk messaging portal access permissions for sp user
    Given Load UI
    Then Login as sp
    Then Verify the portal availability as Bulk Messaging Wizard
    Then Hover over the profile dropdown
    And Click the Logout button


  @verify_Contact_list @mainDashboard
  Scenario: Verify a new module named "Contact List management" is available to Department Admin user-59533
    Given Load UI
    Then Login as depadmin
    Then Click bulk messaging
    And Check availability of contact list module as Manage Contact List
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @options @mainDashboard
  Scenario: check bulk messaging portal available options-55252
    Given Load UI
    Then Login as sp
    Then Click bulk messaging wizard icon
    Then verify the create application portal as Create Messaging Portal
    Then verify the portal management as Portal Management
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @sdpadmin_availableOptions @mainDashboard
  Scenario: Check the available components in the admin home page-54953
    Given Load UI
    Then Login as admin
    Then Verify is there a module called Provisioning
    Then Verify is there a module called Registration
    Then Verify is there a module called Reporting
    Then Hover over the profile dropdown
    And Click the Logout button

  @spuser_availableOptions @mainDashboard
  Scenario: Check the available components in the SP home page-54954
    Given Load UI
    Then Login as sp
    Then Verify is there a module called Provisioning
    Then Verify is there a module called Bulk Messaging Wizard
    Then Verify is there a module called Message Template Manager
    Then Hover over the profile dropdown
    And Click the Logout button

  @navigationmenu @mainDashboard
  Scenario: Check the available components in navigation manu-54955
    Given Load UI
    Then Login as sp
    Then Hover over the Module icon
    Then Hover over the profile dropdown
    Then Click the Logout button

  @navigationHomeIcon @mainDashboard
  Scenario: Check functionality of navigation menu home icon-54957
    Given Load UI
    Then Login as sp
    Then Click bulk messaging wizard icon
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @navigationLogout @mainDashboard
  Scenario: Check functionality of navigation menu logout link-54958
    Given Load UI
    Then Login as sp
    Then Hover over the profile dropdown
    And Click the Logout button
    Then Verify the logout alert message as You have successfully logout from the system






