Feature: This is to validate herokuapp functionalty 


Scenario: Verify the ContextMenu functionality 
Given Launch spring "<URL>" application
Then click on context Menu
Then right click on the given box and accept OK popup alert


Scenario: verify digest/basic functionality
Given Launch spring "<URL>" application
Then click on Basic Auth
Then enter username pass in pop up


Scenario: verify file upload functionality
Given Launch spring "<URL>" application
Then click on file upload
Then click on choose file
Then click upload


Scenario: verify file dropdown functionality
Given Launch spring "<URL>" application
Then click on dropdown 
Then click on dropdown menu


Scenario: verify frame functionality
Given Launch spring "<URL>" application
Then click on frames
Then click on nested frames
Then work on frame 


Scenario: verify checkbox functionality
Given Launch spring "<URL>" application
Then click on checkbox
Then select on checkboxes option
Then verify checkbox displayed selected enabled


Scenario: Verify the checkboxes functionality
Given Launch spring "<URL>" application
Then get current link and all links including the total
Then get page resources and page title

Scenario: Verify the checkboxes functionality
Given Launch spring "<URL>" application
Then Click form authentication
Then enter username and password
Then click login

Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then click on hovers
Then mouseover on images

@kuapp
Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then click on draganddrop
Then perform drag