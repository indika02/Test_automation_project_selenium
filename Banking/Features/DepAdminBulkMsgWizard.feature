Feature: Depadmin test cases
  This is Depadmin related test cases

  Background:
    Given Load UI
    Then Login as depadmin
    Then Click bulk messaging

  @searchContact @depAdmin
  Scenario: Verify department admin can search contact lists-59719
    Then Click manage contactlist
    Then Enter the app name as 10000contact
    Then Click search button
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @reset_button @depAdmin
    Scenario: Verify "Reset" button functionality in "Add contact list" UI-59591
      Then Click manage contactlist
      Then Click add contact list button
      Then Enter contact list name as ittst323
      Then Select the portal
      Then Select the csv file as /home/indika/Desktop/automated-testing/bankingautmation/Banking/files/credentials123.csv
      Then Click reset button
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @backbutton @depAdmin
    Scenario: Verify "Back" button functionality in "Add contact list" UI-59590
      Then Click manage contactlist
      Then Click add contact list button
      Then Click back button
      Then Click home button
      Then Hover over the profile dropdown
      Then Click the Logout button

    @Listname_validation @Verify_dropdown @depAdmin
    Scenario: Check Application Drop Down Functionality-59552,Check validations in the "List Name" field in Add Contact Lists UI-59550
      Then Click manage contactlist
      Then Click add contact list button
      Then Click upload button
      Then Enter contact list name as hdffffdfdjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfdf
      Then Select the portal
      Then Select the csv file as /home/indika/Desktop/automated-testing/bankingautmation/Banking/files/untitled_0.odt
      Then Click upload button
      Then Validate the contactListName
      Then Verify the file error message
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @Approve,view_bulk @depAdmin
    Scenario: Department admin should be able to view and approve bulk messages from the assigned applications-55742
      Then Click approve bulk messages
      Then Click the first row of the table
      Then Click the approve button
      Then Confirm the popup
      Then Click the reject button
      Then Confirm the popup
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @viewContactListDetail @depAdmin
    Scenario: Verify admin user can view Contact List Content-59715
      Then Click manage contactlist
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @newcontactlist @depAdmin
    Scenario: Verify Department Admin user can Add a new Contact List in to "Contact management"-59548
      Then Click manage contactlist
      Then Click add contact list button
      Then Enter contact list name as itswe123332
      Then Select the portal
      Then Select the csv file as /home/indika/Desktop/automated-testing/bankingautmation/Banking/files/credentials123.csv
      Then Click upload button
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @Contact_Management @depAdmin
    Scenario:  Check "Contact Management" UI when previously added contact lists are not available-59537
      Then Click manage contactlist
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button

    @Edit_contact @depAdmin
    Scenario: Check whether is it possible to Edit a contact list being used-59778
      Then Click manage contactlist
      Then Click the contact view icon
      Then Check the error message
      Then Click the back button
      Then Click home button
      Then Hover over the profile dropdown
      And Click the Logout button


  @searchMSISDN @viewContacts @depAdmin
  Scenario: check 'view contact list' flows-55259, Verify Department admin user can search an MSISDN in availble Contact Lists-59716
    Then Click manage contactlist
    Then Click the contact view icon
    Then Enter the MSISDN as  94769877371
    Then Click search contact button
    Then Clear the searchbox
    Then Enter the MSISDN as 9476987737145
    Then Click search contact button
    And Click download icon

  @Approvefileupload @depAdmin
  Scenario: Check File Upload Approval option available on department admin bulk messaging portal-59467
    Then Click the approve file uploads
    Then Click the action approve mark
    Then Confirm the popup
    Then Click the action reject mark
    Then Confirm the popup
    Then Click download csv file link
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button
    And Close the browser
