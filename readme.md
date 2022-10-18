# Orthodoxy.lt Automation Test


#### Reference: https://www.orthodoxy.lt/
## Description:
#### Automated tests for three chosen pages of site
[Orthodoxy_lt](https://www.orthodoxy.lt/):
* Home page Main Menue Test

[Orthodoxy_lt News](https://www.orthodoxy.lt/novosti):
* News Filter Input Test
* News Filter Clear Function Test

[Orthodoxy_lt Monastyri](https://https://www.orthodoxy.lt/monastyri):

* Search Input Test
* Navigate Home Buttom Test

## Technologies:
* JAVA/Maven
#### Dependencies:
* testNg
* Selenium
* Webdriver manager


# Test Scenarios:

### 1.Home Page Main Menue Test

* Open Home page
* Navigate to Main Menue
* Click Menue Item 
* Check the Title of the Page Opened
#### Expected result
Title of the page opened equals to the expected. 


### 2. News Filter Tests
#### 2.1. Input date to Textbox fields 

* Input date from
* Input date untill
* Submit form by clicking Filter button

#### Expected result
Filter message contains the dates from input


#### 2.2. News Filter Clear Function Test
* Enter Data
* Submit Form
* Read and compare Filter message
* Click Clear Button
* Check visibility of the Element holding Filter message. 
#### Expected result
Element holding Filter message is not visible.

### 3. Page Monastyri Search Test

* Input the word to be found
* Click Search icon
* Read the Title of search results

#### Expected result
Element's holding search results title appears 
and corresponds to expected

### 4. Navigate Home link check
* Click NavigateHome link
* Check the url of the Page Opened
* Compare current url to the expected

#### Expected result
Current url equals to the expected

