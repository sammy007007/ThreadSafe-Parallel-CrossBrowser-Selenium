# ThreadSafe Parallel Cross-Browser Selenium Boilerplate

A robust, lightweight Selenium-Java template designed to solve the challenges of Thread-Safe Parallel Execution. This project provides the core architecture needed to build a scalable, enterprise-grade automation framework.
##  Key Features
*   **ThreadLocal Driver Factory:** Implements a robust ThreadLocal<WebDriver> pattern to ensure zero state leakage between parallel tests
*	**True Parallelism:** Configured via TestNG at the `methods` and `Test` level parallel execution across different browsers to maximize CPU utilization and drastically reduce suite execution time.
*   **Cross-Browser Capability:** Dynamic browser invocation (Chrome/Edge) using TestNG parameters.
*   **Modular Foundation: Clean separation of BaseTest, DriverFactory, and Test layers, ready to be expanded into a full Page Object Model (POM).

## Tech Stack
*   **Language:** Java 21
*   **Core:** Selenium WebDriver 4.18.1
*   **Test Runner:** TestNG 7.9.0
*   **Build Tool:** Maven
*   **Architecture:** Page Object Model with ThreadLocal


## Project Structure
```
ThreadSafe-Parallel-CrossBrowser-Selenium
├── src/test/java
│   ├── base               # Contains BaseTest for Setup/TearDown
│   ├── tests              # Actual TestNG Test Classes
│   └── utils              # DriverFactory and ThreadLocal management
├── pom.xml                # Maven Dependencies & Plugins
├── testng.xml             # Test Suite Configuration for Parallelism
└── README.md              # Project Documentation
```

## Running Tests
1. Clone the repository.
2. Open the project in Eclipse/IntelliJ as a Maven project.
3. Right-click `/ThreadSafe-Parallel-CrossBrowser-Selenium/testng.xml` .
4. Select **Run As > TestNG Suite**.

