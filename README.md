# UI test for https://www.imdb.com/

The project contains UI test example on https://www.imdb.com/

#Setup
1. Open the project in IDE
2. Install Gradle https://gradle.org/install/
3. Open build.gradle and reload all Gradle project
4. Download chromedriver.exe https://chromedriver.chromium.org/downloads and put it into the project directory or add its path to Path variable
5. Download gecjodriver.exe https://github.com/mozilla/geckodriver/releases and put it into the project directory or add its path to Path variable
6. Download Allure framework https://github.com/allure-framework/allure2/releases and put it into the project directory or add its path to Path variable

#Test run
1. Be sure that folders /allure-results, /allure-report and /screenshots are empty for each build
2. Run tests by running console command 'gradlew clean runTests -Pbrowser=%browser%' where %browser% has options "chrome"/"firefox".
After tests are completed folder /allure-results is generated with run results.
If a test fails a page screenshot is done and saved in /screenshot folder
3. Generate Allure report by running console command 'allure generate allure-results --clean -o allure-report'.
A generated report is saved in /allure-report folder.
4. To open Allure report run console command 'allure serve allure-results'

You can also run tests in IDE by clicking on green run button near each test method or test class.

#Structure description
Tests are based on Java + Gradle + TestNG + Selenium WebDriver + Allure reports.
Tests can be run in Google Chrome or FireFox browsers. To set the browser add -Pbrowser parameter to command to run.
Page object pattern is used for the project.
All test classes can be found in /src/test/java/tests.
All page classes can be found in /src/test/java/pages.
testng.xml is used to set parameters for tests.
local.properties is used to set common for all tests parameters such as page URL.