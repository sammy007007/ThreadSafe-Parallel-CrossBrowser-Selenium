# ThreadSafe Parallel Cross-Browser Selenium Framework

A high-performance Selenium-Java automation framework built to handle parallel execution across multiple browsers using a thread-safe architecture.

##  Key Features
*   **Thread-Safe Driver Management:** Utilizes `ThreadLocal<WebDriver>` to ensure complete isolation for each test thread, preventing state leakage.
*	**True Parallelism:** Configured via TestNG at the `methods` level to maximize CPU utilization and drastically reduce suite execution time.*   **Cross-Browser Capability:** Dynamic browser invocation (Chrome/Edge) using TestNG parameters.
*   **Clean Page Object Model (POM):** Separated base logic, utilities, and test scripts for high maintainability.

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

## Running Tests
1. Clone the repository.
2. Open the project in Eclipse/IntelliJ as a Maven project.
3. Right-click `/ThreadSafe-Parallel-CrossBrowser-Selenium/testng.xml` .
4. Select **Run As > TestNG Suite**.

