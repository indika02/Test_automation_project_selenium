Feature: Provisioning test cases
  This is Provisioning related test cases


@create_application @Provisioning
Scenario:  check whether SP user is able to create an application by clicking on the ‘Create Application’ menu item.-54973,check available components in the sms 'Resource Configure’ link.-54974,check whether if user once configured the resource parameters, “Configure” link shall become “Reconfigure”-54975, Check whether admin user is able to Approve application in pending approve status and Move the app to Active production at the requested time-54990, check what happen if the user apply the application for approval after configuring all the ncs-54977
  Given Load UI
  Then Login as sp
  Then Click the provisioning icon
  Then Click create applications
  Then Enter application name as ipgh123
  Then Enter Application description as rfkl;f.dlj[dfpooritjokerl;f/gklfkgjdj;skdfljhtruiejfomkv,lbmgkjn
  Then Select the message type as Informational
  Then Enter allowed host address as 127.0.0.1
  Then Enter White listed users as 94644323232
  Then Enter Black listed users as 94444323232
  Then Enter production start time as 25/08/2024 8:58 AM
  Then Mark production expiration time
  Then Enter production end time as 30/11/2024 9:10 AM
  Then Select the application piority as 3
  Then Mark resource configurations as sms
  Then Mark resource as dialog
  Then Click the next button
  Then Click configure link
  Then Mark allow mobile originated traffic
  Then Select short code
  Then Enter a keyword as fdfdg
  Then Enter a message receving url as https://www.abcd.com
  Then Mark allow mobile terminated traffic
  Then Enter a default sender address as fklfd
  Then Enter a alias as Home Loan, Vehicle Loan, Immediate Load
  Then Mark delivery report required
  Then Enter delivery report url as https://www.abcd.com
  Then Click the submit button
  Then Click the confirm button
  Then Verify Reconfigure link is available
  Then Click apply for approval
  Then Verify the Alert Message as Your application successfully saved and once approved you will be notified.
  Then Click view applications
  Then Click home link
  Then Hover over the profile dropdown
  And Click the Logout button

@approve_app @Registration
Scenario: Check whether admin user is able to Approve application in pending approve status-54988, Check whether admin user is able to Approve a application in pending approve status and Move the app immediately to Active Production-54989
  Given Load UI
  Then Login as admin
  Then Click the provisioning icon
  Then Click new application requests
  Then Click app approve link
  Then Click move to active production
  Then Add a note as Approved
  Then Click yes for Confirm the app approval
  Then Click manage applications
  Then Click view applications
  Then Click home link
  Then Hover over the profile dropdown
  And Click the Logout button

  @limited_production @Provisioning
  Scenario: Check whether admin user is able to move application to  Limited Production status-54994
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click app approve link
    Then Click move to Limited production
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @limited_production @Provisioning
  Scenario: Check whether SP is able to request via Provisioning module, to change the application state from Limited Production to Active Production.-54997
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click app approve link
    Then Click move to Limited production
    Then Click move to active production
    Then Add a note as Approved
    Then Click yes for Confirm the app approval
    Then Click manage applications
    Then Click view applications
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @approve_sch_time @Provisioning
  Scenario: Check whether admin user is able to Approve application in pending approve status and Move the app at Schedule a time for app to be moved to Active Production-54991
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click app approve link
    Then Click move to active production
    Then Click as Send active production on scheduled time
    Then Add a note as Approved
    Then Click yes for Confirm the app approval
    Then Click manage applications
    Then Click view applications
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

@reject_app @Provisioning
Scenario: Check whether admin user is able to Reject  application in pending approve status-54992
  Given Load UI
  Then Login as admin
  Then Click the provisioning icon
  Then Click new application requests
  Then Click app reject link
  Then Click reject
  Then Add a reject note as Rejected
  Then Click yes for Confirm the app reject
  Then Click manage applications
  Then Click view applications
  Then Click home link
  Then Hover over the profile dropdown
  And Click the Logout button

  @create_application_draft @Provisioning
  Scenario: check whether sp user shall be able to save a provisioned application as a draft without submitting it for the approval of the admin-54978
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click create applications
    Then Enter application name as id1k23
    Then Enter Application description as rfkl;f.dlj[dfpooritjokerl;f/gklfkgjdj;skdfljhtruiejfomkv,lbmgkjn
    Then Select the message type as Informational
    Then Enter allowed host address as 127.0.0.1
    Then Enter White listed users as 94644323232
    Then Enter Black listed users as 94444323232
    Then Enter production start time as 25/08/2024 8:58 AM
    Then Mark production expiration time
    Then Enter production end time as 30/11/2024 9:10 AM
    Then Select the application piority as 3
    Then Mark resource configurations as sms
    Then Mark resource as dialog
    Then Click save as draft
    Then Click view applications
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @configuresmserrormsg @Provisioning
  Scenario: check whether user is able to submit application for approval  befor cofigure all ncs details-54976
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click create applications
    Then Enter application name as msg343
    Then Enter Application description as rfkl;f.dlj[dfpooritjokerl;f/gklfkgjdj;skdfljhtruiejfomkv,lbmgkjn
    Then Select the message type as Informational
    Then Enter allowed host address as 127.0.0.1
    Then Enter White listed users as 94644323232
    Then Enter Black listed users as 94444323232
    Then Enter production start time as 25/08/2024 8:58 AM
    Then Mark production expiration time
    Then Enter production end time as 30/11/2024 9:10 AM
    Then Select the application piority as 3
    Then Mark resource configurations as sms
    Then Mark resource as dialog
    Then Click the next button
    Then Click apply for approval
    Then Verify approval error message as Please configure all resources before applying for approval.
    Then Click view applications
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @delete_draftapp @Provisioning
  Scenario: check whether sp user is able delete a draft application-54980
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click view applications
    Then Click delete button
    Then Confirm the deletion of application
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @new_app_requests @Provisioning
  Scenario: Check whether admin user is able to view the appliations listed to be approved in ‘New Application Requests’-54984
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @actions_pendingApproveapps @Provisioning
  Scenario: Check what are tha actions an admin can perfome of an application in pending approve status-54985, Check what are the available functions in ‘Manage Applications’ side navigation menu for admin user-54998
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Move the Scroll bar of table to left
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @view_pending_app @Provisioning
  Scenario: Check whether admin user is able to view application in pending approve status-54986
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click app view link
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @edit_pending_app @Provisioning
  Scenario: Check whether admin user is able to Edit application in pending approve status-54987
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click app edit link
    Then Select the message type as Transactional
    Then Click save button of window
    Then Add a note for save as Updated!
    Then Click yes in save popup
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @viewSP_profile @Provisioning
  Scenario: Check whether admin user is able view SP profile information by clicking on SP name-54993
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click the profile username
    Then Click sign out button

  @filterbyname @Provisioning
  Scenario: Check wheteher admin user is able to search application by app name in Manage Applications-55000
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click manage applications
    Then Enter the app name for app search sds22
    Then Click the search button for filter the app
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @searchBtn @Provisioning
  Scenario: Check what would be the result if app name and status are left blank what would be the result in the Manage Applications-55002
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click manage applications
    Then Click the search button for filter the app
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @searchbyStatus @Provisioning
  Scenario: Check wheteher admin user is able to search application by app status-55001
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click manage applications
    Then Click the status dropdown
    Then select the status as reject
    Then Click the search button for filter the app
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @ui_components_sp @Provisioning
  Scenario: Check the available components for SP user in provisioning UI-54969,check whether sp user is able to view the provisioned applications by clicking on ‘View My Applications’ inside navigation menu.-54979,Check Wheterh SP is able to view TPS, TPD validations for NCSs to which he/ she has access to-55003
    Given Load UI
    Then Login as sp
    Then Click the provisioning icon
    Then Click create applications
    Then Click view applications
    Then Click SLA configurations
    Then Click view SLA configurations
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button

  @ui_components_admin @Provisioning
  Scenario: Check  the available components for admin user in provisioning UI-54970
    Given Load UI
    Then Login as admin
    Then Click the provisioning icon
    Then Click new application requests
    Then Click manage applications
    Then Click manage cooparate user arrow
    Then Click manage cooparate user
    Then Click home link
    Then Hover over the profile dropdown
    And Click the Logout button
