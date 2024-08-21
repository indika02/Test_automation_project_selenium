Feature: Secure messaging test cases
  This is Secure messaging related test cases

Background:
  Given Load UI

  @Verifysecuremsg @secureMsg
  Scenario: Verify whether the secure message viewer is available in the customer care agent login-71436
    Then Login as rpt
    Then Verify the secure messaging portal availability as Secure Messaging
    Then Hover over the profile dropdown
    And Click the Logout button

  @moduletableview @secureMsg
  Scenario: Verify whether SDP admin secure message viewer module table view.-71447,71970
    Then Login as rpt
    Then Click the secure messaging
    Then Verify the module table availability
    Then Hover over the profile dropdown
    And Click the Logout button

  @MSISDNsearch @secureMsg
  Scenario: Verify whether the search bar namely "Search by MSISDN" must be present to search messages by the MSISDN.-71437,Verify whether there are 20 characters if a correct MSISDN is applied in the search bar.-71441
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230463
    Then Hover over the profile dropdown
    And Click the Logout button

  @invalidMSISDNsearch @secureMsg
  Scenario: Verify If there is incorrect MSISDN applied into the search bar, below message must be shown on the dashboard.-71438
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230467454
    Then Verify the message in table
    Then Hover over the profile dropdown
    And Click the Logout button
    
  @correctMSISDNsearchnomessages @secureMsg
  Scenario: Verify, If a correct MSISDN is applied in the search bar but no messages were dispatched, below error message must be shown.-71439
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94771230468
    Then Verify the that error message
    Then Hover over the profile dropdown
    And Click the Logout button

  @filterdropdown @secureMsg
  Scenario: Verify ,Whether a filter option is filtering according to the records.-71440,71448
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230463
    Then Hover over the request status
    Then Select the request status
    Then Hover over the profile dropdown
    And Click the Logout button

  @approveMsgpopup @secureMsg
  Scenario: Verify whether the customer care agent requesting to view the secure message , shown a popup requesting to enter the reason to view.-71442,71446
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230463
    Then Click the request icon
    Then Enter the reason for request as Exploreimaginationwithcaptivatingstoriesendlesspossibilitiesinthisvibrantcollectionoftalesdfgfsdsdsdsd
    Then Click the send request button
    Then Hover over the profile dropdown
    And Click the Logout button

  @ViewReqMsgadmin @secureMsg
  Scenario: Verify the request message have sent to the SDP admin fo approval-71445,The customer care agent should be able to view the secure message, and the status of the request in the dashboard is updated to 'Approved'.-71449,71450,71976
    Then Login as rptadmin
    Then Click the secure messaging
    Then Click the approve mark
    Then Enter the Remark as Approved
    Then Click approve button
    Then Hover over the profile dropdown
    And Click the Logout button


  @verfiyTimer,modalTitle,Status @secureMsg
  Scenario: Verify whether the customer care agent can see the timer in the dashboard after getting approval from the admin.-71479,Verify whether the approved secure message, must be shown in the relevant customer care agent's dashboard in a decrypted format.-71477
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230467
    Then Verify request status as Approved
    Then Click view icon to view the message
    Then Verify the modal title as Message
    Then Verify the timer is visible
    Then Click close Button
    Then Hover over the profile dropdown
    And Click the Logout button

  @rejectMsgReq @secureMsg
  Scenario: After rejecting the customer care agent request of viewing the secure message, the status must appear as ‘Rejected’ in the dashboard of the customer care agent-71480,Verify whether the the Reporting user should be able to view the reason the admin rejected the request.-71975
    Then Login as rptadmin
    Then Click the secure messaging
    Then Click the reject mark
    Then Enter the Remark as Rejected
    Then Click reject button
    Then Verify reject status as Rejected
    Then Hover over the profile dropdown
    And Click the Logout button
    #Verify whether the the Reporting user should be able to view the reason the admin rejected the request.
    Then Login as rpt
    Then Click the secure messaging
    Then Enter the MSISDN number as 94770230463
    Then Click view icon to view the message
    Then Click close Button
    Then Hover over the profile dropdown
    And Click the Logout button

