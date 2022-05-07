#Author: edisson.castronunez@tcs.com
#Language: EN


Feature: As a user I want to enter information in way2automation form

  @Sc1
  Scenario: enter associate information and validate submit message
    Given the user is on the main page
    When the user fill the form with random associate info
    Then the user will see the message This is just a dummy form,

  @Sc2
  Scenario: enter associate information and validate submit message, this scenario must fail
    Given the user is on the main page
    When the user fill the form with random associate info
    Then the user will see the message Mensaje usado para fallar el test
