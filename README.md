# The-Internet-Herokuapp

## Project Overview
This project automates test cases for various complex web elements on [The Internet Herokuapp](https://the-internet.herokuapp.com/). The tests are built using Selenium WebDriver, following the Page Object Model (POM) design pattern, and generating detailed reports with Allure. Additionally, cross-browser testing is performed using TestNG to ensure compatibility across different web browsers.

## Key Features:
- **Advanced Locators & Complex Web Element Interactions**: Automated test scripts utilize sophisticated locators and interact with dynamic and complex web elements.
- **POM Design Pattern**: Applied to improve code structure, reduce duplication, and enhance readability.
- **Test Reporting**: Generated detailed and insightful test execution reports using Allure.
- **Cross-Browser Testing**: Ensured compatibility across browsers using TestNG XML files and parameterization.

## Execution:
- **Test Execution Link**: [LinkedIn Post](https://www.linkedin.com/posts/abdelrahman-ellithy-3841a7270_xpath-css-pom-activity-7224476384692191234-TtF5?utm_source=share&utm_medium=member_desktop)

## Project Structure

```
The-Internet-Herokuapp
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Pages
│   │   │   │   └── AlertsPage.java
│   │   │   │   └── DragDropPage.java
│   │   │   │   └── DropDownPage.java
│   │   │   │   └── DynamicLoadingPage.java
│   │   │   │   └── HomPage.java
│   │   │   │   └── HorizontalSliderPage.java
│   │   │   │   └── HoverPage.java
│   │   │   │   └── LoadingExample1.java
│   │   │   │   └── LoadingExample2.java
│   │   │   │   └── LoginPage.java
│   │   │   │   └── SecureAreaPage.java
│   │   ├── resources
│   │   │   ├── properties
│   │   │   │   ├── default
│   │   │   │   │   └── allure.properties
│   │   │   │   │   └── config.properties
│   │   │   │   │   └── log4j2.properties
│   ├── test
│   │   ├── java
│   │   │   ├── Tests
│   │   │   │   └── AlertsTests.java
│   │   │   │   └── BaseTests.java
│   │   │   │   └── DragDropTests.java
│   │   │   │   └── DropDownTests.java
│   │   │   │   └── DynamicLoadingPageTests.java
│   │   │   │   └── HorizontalSliderTests.java
│   │   │   │   └── HoverPageTests.java
│   │   │   │   └── loginTests.java
│   │   ├── resources
│   │   │   ├── TestData
├── Test-Output
│   ├── Logs
│   │   └── Test.log
│   ├── Reports
│   │   ├── Allure
│   │   │   ├── allure-report
│   │   │   │   └── Ellithium-Test-Report-2024-09-28-12-54-22PM.html
│   │   │   ├── allure-results
│   ├── ScreenShots
│   │   ├── Failed
├── .idea
│   └── compiler.xml
│   └── encodings.xml
│   └── jarRepositories.xml
│   └── misc.xml
│   └── uiDesigner.xml
│   └── vcs.xml
│   └── workspace.xml
│   └── .name
└── TestNGRunner.xml
└── pom.xml
└── README.md
```

## Maven Dependencies
```xml
<dependencies>
    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>

    <!-- SLF4J API -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>${SLF4JAPIVersion}</version>
    </dependency>

    <!-- SLF4J Simple (for logging in tests) -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>${SLF4JSimpleVersion}</version>
        <scope>test</scope>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.1</version>
        <scope>test</scope>
    </dependency>

    <!-- Allure TestNG for generating reports -->
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.28.0</version>
    </dependency>
</dependencies>
```

## TestNG Configuration (TestNGRunner.xml)
```xml
<suite name="Suite1" verbose="1">
    <test name="Cross Browser Chrome">
        <parameter name="BrowserName" value="Chrome"></parameter>
        <classes>
            <class name="Tests.loginTests"/>
            <class name="Tests.AlertsTests"/>
            <class name="Tests.DragDropTests"/>
            <class name="Tests.HorizontalSliderTests"/>
            <class name="Tests.DropDownTests"/>
            <class name="Tests.HoverPageTests"/>
        </classes>
    </test>
    
    <test name="Cross Browser Edge">
        <parameter name="BrowserName" value="Edge"></parameter>
        <classes>
            <class name="Tests.loginTests"/>
            <class name="Tests.AlertsTests"/>
            <class name="Tests.DragDropTests"/>
            <class name="Tests.HorizontalSliderTests"/>
            <class name="Tests.DropDownTests"/>
            <class name="Tests.HoverPageTests"/>
        </classes>
    </test>
    
    <test name="Cross Browser Firefox">
        <parameter name="BrowserName" value="Firefox"></parameter>
        <classes>
            <class name="Tests.loginTests"/>
            <class name="Tests.AlertsTests"/>
            <class name="Tests.DragDropTests"/>
            <class name="Tests.HorizontalSliderTests"/>
            <class name="Tests.DropDownTests"/>
            <class name="Tests.HoverPageTests"/>
        </classes>
    </test>
</suite>
```

## How to Run the Project

- Run the tests using Maven:
   ```bash
   mvn clean test
## Notes:
- The project includes tests for various web elements like alerts, drag and drop, dropdowns, dynamic loading, sliders, and login functionalities.
- Cross-browser testing is set up for Chrome, Edge, and Firefox, and the browser can be switched by changing the `BrowserName` parameter in the `TestNGRunner.xml`.
- Allure is used for test report generation, offering detailed insights into the test results.
