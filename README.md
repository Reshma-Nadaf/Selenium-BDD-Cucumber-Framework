# Selenium BDD Cucumber Framework

A robust automation testing framework using **Selenium WebDriver**, **BDD Cucumber**, **TestNG**, and **Java**.

## 🔧 Tech Stack
- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **BDD Framework:** Cucumber
- **Test Runner:** TestNG
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)
- **Logging & Config:** Property files


## 🧩 Project Structure

Selenium_BDD_Cucumber_Framework
├── src
│ ├── main
│ │ └── java
│ │ └── utils # Base classes and config readers
│ ├── test
│ │ └── java
│ │ ├── StepDefinations # Step definition classes
│ │ ├── Hooks # Cucumber hooks (setup/teardown)
│ │ └── WebPages # Page Object Model classes
│ └── resources
│ ├── Features # .feature files for BDD
│ └── config.properties # Config file for environment setup
├── testng.xml # TestNG test suite
├── pom.xml # Maven dependencies

## ✅ Features
- Page Object Model for maintainable and scalable tests
- Data-driven testing using Cucumber Scenario Outlines
- Pre/Post test setup using Hooks
- Screenshot capture on test failure
- Easily extendable for new features/pages
