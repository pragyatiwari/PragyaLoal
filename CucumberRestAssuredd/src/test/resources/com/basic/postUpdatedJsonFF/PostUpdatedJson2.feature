Feature: First Rest Assured test POST

  Scenario Outline: Test my Get Method102
    Given user hit the post request with "<username>" having "<job>" value
    Then user validate the id is not null

    Examples: 
      | username | job     |
      | Anil     | QA Lead |
      | Pragya   | QA      |
      | Pratha   | QA      |
