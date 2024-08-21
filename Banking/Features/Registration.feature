Feature: Registration test cases
  This is Registration related test cases

  Background:
    Given Load UI
    Then Login as admin
    Then Click the Registration Module Icon

  @Availablefeatures @Registration
  Scenario: Check whether Admin is able to visit the registration module by clicking on the ‘Registration’ icon.-54959
    Then Verify is there a link called Add a User
    Then Verify is there a link called Manage Users
    And Click sign out button

  @ManageUsers @Registration
  Scenario: Check the functioning of ‘Manage Users’ option-54961,
    Then Click manage users link
    Then Move the Scroll bar in table
    And Click sign out button

  @Registered_users @Registration
  Scenario: Check already registered users are displayed on Manage User page-59670
    Then Click manage users link
    Then Move the Scroll bar in table
    And Click sign out button


  @Filtermanageusers @Registration
  Scenario: Check the functioning of Manage Users search filter-54962
    Then Click manage users link
    Then Enter username as buddhikasdpadmin
    And Enter firstname as buddhika
    And Select status as ACTIVE
    And Select UserGroup as ADMIN
    Then Click the search button
    And Click sign out button

  @userDisable @Registration
  Scenario: Check the functioning of Disable option-54964
    Then Click manage users link
    And Select status as ACTIVE
    And Select UserGroup as ADMIN
    Then Click the search button
    Then Click the disable icon
    Then Click yes in confirmation popup
    And Click sign out button

  @editProfile @Registration
  Scenario: Check whether users are able to change the profile details by clicking on the username displayed on the top navigation pane-54965
    Then Click the username
    Then Click edit button
    Then Edit firstname as sdp
    And  Edit lastname as sdp
    Then Click save button
    And Click sign out button

  @username_validate @Registration
  Scenario: Check validation of username field for LDAP intergration via Messaging gateway-61047
    Then Click add user link
    Then Click validate user button
    Then verify alert message as Username is required.
    Then Click add user link
    Then Enter the username as user1
    Then Click validate user button
    Then verify alert message as User doesn’t exist in the Seylan Active Directory
    And Click sign out button

  @adduser @Registration
  Scenario: Check whether Admin is able to add new user by clicking on ‘Add a User’-54960
    Then Click add user link
    Then Check the availability of this feature
    Then Click sign out button







