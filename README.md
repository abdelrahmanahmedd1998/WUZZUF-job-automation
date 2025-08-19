# WUZZUF-job-automation

![Java](https://img.shields.io/badge/Java-11%2B-blue)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-red)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-Framework-orange)
![ExtentReports](https://img.shields.io/badge/Reporting-Extent%20Reports-lightgrey)
![POM](https://img.shields.io/badge/Design-POM-yellow)
![CI/CD](https://img.shields.io/badge/CI%2FCD-Jenkins%20%2F%20GitHub%20Actions-blueviolet)
## Description
Wuzzuf Job Automation is an end-to-end automation testing project for the Wuzzuf job platform. It simulates real user interactions, including account registration with random data, profile setup, job search, saving jobs, and account deletion. Built with Java, Selenium, TestNG, and Maven, this project demonstrates full workflow testing across multiple browsers using XML configurations and generates detailed reports for analysis.

## Project Flow
1. **Account Registration**  
   - Automatically generates a new account using random data via Faker.
2. **Profile Setup**  
   - Fills in user experience, work period, location (remote/hybrid/on-site).
3. **Job Search & Save**  
   - Searches for a "Software Engineer" position, selects the first result, and saves it for later.
4. **Account Deletion**  
   - Deletes the test account after the workflow is completed.
5. **Reporting**  
   - Generates detailed reports using ExtentReports for multi-browser testing (Chrome, Edge, Firefox).

## Technologies & Tools
- **Java 8+**
- **Maven**
- **Selenium WebDriver**
- **TestNG**
- **ExtentReports**
- **Faker**
- **XML for cross-browser configuration**

## Installation
1. Ensure you have **Java 8 or higher** installed.
2. Install **Maven**.
3. Clone the repository:
```bash
git clone <git@github.com:abdelrahmanahmedd1998/WUZZUF-job-automation.git>
cd wuzzuf-job-automation
mvn clean install
```
---

## 🚀 How to Run

1. Open **Git Bash** (or terminal) in the project directory.
2. Execute the following command to run the TestNG suite:
 ```bash
mvn test
3. After the test execution, view the generated reports in the `/test-output` or `/reports` (ExtentReports) directory.
```

## 📁 Repository Contents

The project contains the following files and directories:

- **`src/`** – All Java source files and test scripts.
- **`pom.xml`** – Maven dependencies and configuration.
- **`testng.xml`** – Cross-browser test configuration for running tests across different browsers.
- **`reports/`** – ExtentReports output with generated HTML test reports.
- **`README.md`** – Project documentation for setup, usage, and details.

---

## 📸 Screenshots & Demo

- **Screenshot**: [images/screenshot.png](images/screenshot.png)
- **Demo Video**: [videos/demo.mp4](videos/demo.mp4)

This project showcases automation testing skills and is intended for portfolio and learning purposes.
