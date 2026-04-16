# ThreadSafe Parallel Cross-Browser Selenium Framework

A high-performance Selenium-Java automation framework built to handle parallel execution across multiple browsers using a thread-safe architecture.

##  Key Features
*   **Thread-Safe Driver Management:** Utilizes `ThreadLocal<WebDriver>` to ensure isolated driver instances for every thread, preventing session interference.
*   **Parallel Execution:** Configured for method-level parallelism via TestNG, significantly reducing test suite execution time.
*   **Cross-Browser Capability:** Dynamic browser invocation (Chrome/Edge) using TestNG parameters.
*   **Clean Page Object Model (POM):** Separated base logic, utilities, and test scripts for high maintainability.

## Tech Stack
*   **Language:** Java 21
*   **Core:** Selenium WebDriver 4.18.1
*   **Test Runner:** TestNG 7.9.0
*   **Build Tool:** Maven
*   **Drivers:** Managed via WebDriverManager

##  Execution
1. Clone the repository.
2. Open the project in Eclipse/IntelliJ as a Maven project.
3. Right-click `src/test/java/suites/SearchAddCartTest.xml` (or your suite file).
4. Select **Run As > TestNG Suite**.
