# WUZZUF-job-automation
# Wuzzuf Job Automation

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
   git clone <repository-url>
