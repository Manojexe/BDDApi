

Feature: Api get req from URl

   @tag1
    Scenario: Get api req
    Given Hit the API from 
    When Getting response code 
    And  print the response
    Then Print the get response
    
    @tag2
    Scenario: Get api req 
    Given I want retrieve details from user
    When  I send a Get req with vaild user id 
    Then i should receiver vaild response with user details
    
    @tag3
    Scenario: Post a new api req 
    Given I want add new user 
    When  I send a post req with vaild user id 
    Then i should receiver vaild response with user details

