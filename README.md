
# Selenium Login Automation Framework
====================================

This project is an automation framework for testing web login functionality using 
Selenium WebDriver, TestNG, Maven, Log4j, and WebDriverManager. It follows the 
Page Object Model (POM) for maintainability and reusability.


#Prerequisites:
--------------------------------------
1. Java JDK 11+ installed
2. Maven installed
3. Preferred IDE (Eclipse/IntelliJ)
4. Git installed (optional)

--------------------------------------
#Installation:
--------------------------------------
1. Clone the repository:
   git clone "https://github.com/QASIDDHESH/Assignment1loginFlowUsingSelenium.git"
   cd Assignment1loginFlowUsingSelenium.git

2. Install dependencies:
   mvn clean install

Data-Driven Testing:
--------------------------------------
- Uses `@DataProvider` to test multiple login credentials.
- Test case ensures WebDriver is restarted for each data set.

--------------------------------------
Logging & Reporting:
--------------------------------------
- **Console Logging**: Provides real-time execution logs.
- **File Logging**: Execution logs are stored in `logs/framework.log`.
- **Screenshot Capture**: On test failure, a screenshot is saved.
