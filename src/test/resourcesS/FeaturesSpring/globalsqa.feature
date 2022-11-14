Feature: This is to validate all functionality


Scenario: Verify the tab funtionality
Given Launch spring "<URL>" application 
Then click on tabs button 
Then click section one
Then click on Re-Size Accordion


Scenario: Verify the dragndrop funtionality
Given Launch spring "<URL>" application 
Then click on drag and drop
Then perform dragndrop
Then click trash


Scenario: Verify the dragndrop funtionality
Given Launch spring "<URL>" application 
Then find broken lines

@globaltab
Scenario: Verify the multiple window funtionality
Given Launch spring "<URL>" application 
Then click on windows
Then Click on click here option
Then Click on open new window
Then click on click here

