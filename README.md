# tailspin
pilot implementation of GUI automation using webdriver

# Running Tests
## Prerequisites
- maven (ver 2.2.1)
- jdk (ver 1.7)
- Set following 2 proeprties
  - M2_HOME - path to maven installation
  - JAVA_HOME - path to java installation
- Please have chrome installed in the default location. See: https://code.google.com/p/selenium/wiki/ChromeDriver
- Please have firefox installed in the default location.
- After pulling the source from the repository, please check if the chromedriver binaries in the root directory are executable

## How to run tests on chrome
- git clone https://github.com/ysreeram/tailspin.git
- cd tailspin
- mvn clean test -s settings.xml

## How to run tests on firefox with IPAD useragent set
- git clone https://github.com/ysreeram/tailspin.git
- cd tailspin
- mvn clean test -s settings.xml -Dtalespin.browser.type=mobile

# Techinical Choices
## Testing tool
- Webdriver is opensource and have a very active community.
- Webdriver gives the flexibility to run tests on desktop browsers and mobile browsers (iphone, andriod). Also using firefox driver can easily simulate mobile devices by overriding useragent string

## Design
- Framework uses page object design pattern to model user's journey through the application.
- Abstract factory pattern for gui elements to make tests portable.

## Shortcoming
- Tests cannot be run in parallel because of the way the browser is instantiated. 
