API Testing Framework in Java with RestAssured, TestNG and Allure Reporting

GitHub Pages Report: https://victoria198611.github.io/api-testing-framework/
Description
This project represents a modern API testing framework built in Java, designed to be easy to extend, maintain, and use in real world projects. It includes full Allure integration, report generation, a modular structure, and example API tests.

Technologies Used
•	Java 17
•	RestAssured 5
•	TestNG 7
•	Allure TestNG + Allure RestAssured
•	Maven
•	Jackson for serialization/deserialization
•	SLF4J for logging
•	
Project Structure
Cod
src
 └── test
      ├── java
      │    ├── tests/        → API tests
      │    ├── models/       → Request/response models
      │    ├── utils/        → Utilities (config, helpers)
      │    └── listeners/    → Allure integration
      └── resources
           └── environment.properties

How to Run the Tests
1. Run the tests
bash
mvn clean test
2. Generate the Allure report
bash
allure generate target/allure-results --clean
allure open allure-report

Allure Reports
The framework automatically generates:
•	test results
•	request/response logs for each test
•	environment information
•	categories
•	timeline

 Online Allure Report: https://victoria198611.github.io/api-testing-framework

The environment.properties File
This file is automatically copied into target/allure-results and displayed in the Allure report.
Example:
Cod
base.url=https://reqres.in
environment=local
api.version=v1
tester=Victoria

Useful Commands
List results:
bash
ls target/allure-results
Delete results:
bash
rm -r target/allure-results

Features
•	API testing for GET/POST/PUT/DELETE
•	Status code validation
•	JSON body validation
•	Request/response logging
•	Allure attachments integration
•	Scalable structure for large projects

What I Learned from This Project
•	How to build a modular API testing framework using Java + RestAssured + TestNG
•	How to structure tests into models, utilities, and dedicated classes
•	How to configure and integrate Allure Reporting, including environment, attachments, and report structure
•	How to work with Maven, plugins, and custom configurations
•	How JSON serialization/deserialization works with Jackson
•	How to use Git and GitHub for versioning and publishing
•	How GitHub detects languages and how .gitattributes affects this
•	How to read and analyze API responses (status code, body, headers)
•	The importance of a professional README for a portfolio

Author
Victoria — QA Automation Tester This project was created as part of my professional portfolio and as a way to continuously improve my API automation skills.
