Feature: This feature file contains the following modules like
 Registering as job seeker
 Registering as employer
 


@test
Scenario: As an job seeker i must be able to register myself in the system
   # Given Launch the application
    When application is launched hover on the resgister link
    Then verify jobseeker hyperlink is displayed,click on it
    Then verify the user is navigated to jobseeker page
    And enter all the fields data
    |Prathap|Malepati|abc.xyz@tcs.com|9626272284|Pass1234|Pass1234|09/08/1990|male|3 Months|Telugu|
    |PraSAD|Mahesh|abc.xyz@tcs.com|9626272284|Pass1234|Pass1234|09/08/1990|male|3 Months|Telugu|
    

@SigninUser@Prasad   
Scenario: As an job seeker i must be able to signin into the system
 Given click on the sigin link
