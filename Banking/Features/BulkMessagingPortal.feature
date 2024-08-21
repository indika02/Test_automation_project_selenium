Feature: Bulk Messaging test cases
  This is Bulk messaging related test cases

  Background:
    Given Load UI
    Then Login as sp
    Then Click bulk messaging wizard icon

  @new_app @Bulk_message
  Scenario: check bulk messaging portal create application success flow-55253, check bulk messaging portal create applicatin fill application details validations-55254, check bulk messaging portal create application flows and messages after filling details successfully-55255
    Then Click create messaging portal
    Then Click message icon
    Then Enter Portal Name as api03
    And select Allowed Allias as seylan
    And select Message type as Promotional
    And Enter Description as Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut convallis, leo quis condimentum sollicitudin, velit magna varius risus, quis blandit velit lorem ac felis. Duis mollis, justo eget dapibus commodo, tortor erat convallis purus, vel dictum lacus justo id quam. Nullam non odio eget ipsum faucibus ultrices.
    Then Click next button
    Then Click Confirm button
    Then Confirm the success message as Bulk Messaging Portal Successfully Created!
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @view_app @Bulk_message
  Scenario: view bulk messaging portal created applications on dash board-55256
    Then Click portal management
    Then Enter the app name as msg12
    Then Click search button
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @view_option @Bulk_message
  Scenario: check view option on created applications-55262
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click a created application
    Then Click a setting link
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button



  @validation @Bulk_message
  Scenario: check bulk messaging portal create application fill application details validations
    Then Click create messaging portal
    Then Click message icon
    Then Enter Portal Name as QuivernAxylorMaldorZaphonVyrionXandor
    And select Allowed Allias as seylan
    And select Message type as Promotional
    And Enter Description as Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut convallis, leo quis condimentum sollicitudin, velit magna varius risus, quis blandit velit lorem ac felis. Duis mollis, justo eget dapibus commodo, tortor erat convallis purus, vel dictum lacus justo id quam. Nullam non odio eget ipsum faucibus ultrices.
    Then Click next button
    Then Verify error message
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @Verify_the_contact_lists @reschedule_msg @Bulk_message
  Scenario: Verify the contact lists added by admin user can be used for SP User to create bulk messages-59714, Check coorparate users allowed to reschedule the scheduled message-59427
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click send link
    Then Select from as Seylan
    Then Select to
    Then Select the channel SMS
    Then Enter the message as Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut convallis, leo quis condimentum sollicitudin, velit magna varius risus, quis blandit velit lorem ac felis. Duis mollis, justo eget dapibus commodo, tortor erat convallis purus, vel dictum lacus justo id quam. Nullam non odio eget ipsum faucibus ultrices.
    Then Click submit button
    Then Click home button
#  Scenario: Check coorparate users allowed to reschedule the scheduled message
    Then Click bulk messaging wizard icon
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click a created application
    Then Click next link
    Then Click reshedule icon
    Then Confirm the popup
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @Unicode_support @Bulk_message
  Scenario: Check Send Bulk Messages UI Unicode support-59469, Check Sinhala and Tamil language message containing bulk message campaigns process successfully-59476
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click send link
    Then Select from as Seylan
    Then Select to
    Then Select the channel SMS
    Then Enter the message as නවයහමහෙයමවාවනිිකෙනටෙවමபிடிப்ட்டப்பிடடப்பிடிப்பிடிப்பிபிடிப்பிடபிடிடிபிසඅමාැරකටඑහවසටම‌ොවනඩවෙඉනවටඅකුිාකටටවයසරුආවසදනකඩලඉටවයනදකත‌ොකපජ
    Then Click submit button
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @deliveryOptions @Bulk_message
  Scenario: Delivery options field should view under Send Bulk Message UI for a cooperate user-59320, Scheduled Messages selection should view input field with a date time picker-59321
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click send link
    Then Select from as Seylan
    Then Select to
    Then Select the channel Push notification or SMS
    Then Enter the message as Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut convallis, leo quis condimentum sollicitudin, velit magna varius risus, quis blandit velit lorem ac felis. Duis mollis, justo eget dapibus commodo, tortor erat convallis purus, vel dictum lacus justo id quam. Nullam non odio eget ipsum faucibus ultrices.
    Then Upload a image as /home/indika/Desktop/automated-testing/bankingautmation/Banking/files/person-icon-1901x2048-a9h70k71_11zon.png
    Then Add a alternative message as  sit amet, consectetur adipiscing elit. Ut convalli
    Then Select delivery option as schedule message
    When Enter date & time to 2025-07-25 10:14
    Then Click schedule button
    Then Click home button
    And Click the Logout button


  @sentmsg @Bulk_message
  Scenario: check sent messages UI-55261,59384
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click send link
    Then Click view sent messages
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

#  @file_upload @Bulk_message
#  Scenario: Check file upload option available on under approved soltura applications-59461, Check file upload bulk messages send successfully-59466
#    Then Click portal management
#    Then Click file upload
##    Check file upload bulk messages send successfully
#    Then Select fileupload from as Seylan
#    Then Select the bulk message file as /home/indika/Desktop/automated-testing/bankingautmation/Registration-V3/files/credentials123.csv
#    Then Click file upload submit button
#    Then Click home button
#    Then Hover over the profile dropdown
#    And Click the Logout button

  @fileUpload_validation @Bulk_message
  Scenario: Check validation for file upload file upload bulk message campaign creation-59463, Check wheather file upload bulk message campaigns can create successfully-59462
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click file upload
    Then Select fileupload from as - Choose Preferred Alias -
    Then Select the bulk message file as /home/indika/Desktop/automated-testing/bankingautmation/Banking/files/credentials123.csv
    Then Click file upload submit button
    Then Verify the error message as You must select a from address
    Then Verify the file error message as Bulk messages file with same name already exists!
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button

  @view_uploadedfiles @Bulk_message
  Scenario: Check new tab introduced to View Bulk Messaging Application UI-59465
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click manage link in selected active app
    Then Click a upload file link
    Then Click home button
    Then Hover over the profile dropdown
    And Click the Logout button


  @cancel_scheduled_msg @Bulk_message
  Scenario: Check coorparate users allowed to cancel the scheduled message-59386
    Then Click portal management
    Then Enter the app name as BTestApp
    Then Click search button
    Then Click a created application
    Then Click next link
    Then Click the cancel icon
    Then Confirm the popup






