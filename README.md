# Currency Converter

The **Currency Converter** is a Command Line Interface (CLI) application developed in **Java**. It was created to provide a simple and efficient tool for converting monetary values between different currencies, using **up-to-date exchange rates** obtained from an external API.

### Key Features

* **Currency Conversion:** Converts a specified value from a source currency to a target currency.
* **Real-Time Rates:** Integration with an external API to ensure exchange rates are always accurate.
* **Simple Interface:** Operates via the terminal, focusing on functionality and ease of use for quick conversions.

---

## Technologies Used

* **Language:** Java
* **External Communication:** HTTP Client library (for API consumption)
* **Data Processing:** **Google Gson**
    * Used for the serialization and deserialization of Java objects to and from JSON, facilitating the reading of exchange rates from the API.

---

## How to Run the Project

To run the **Currency Converter** on your local machine, follow the steps below:

### Prerequisites

1.  **Java Development Kit (JDK):** Version 17 or higher.
2.  **API Key:** A valid key for the exchange rate API used by the project (ensure this key is configured in the code, where it says API_KEY).
3.  **Google Gson Library:** Required for processing JSON responses from the API.

### Execution Steps

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/YuriOC/currency_converter.git](https://github.com/YuriOC/currency_converter.git)
    cd currency_converter
    ```

2.  **Compile the Project:**
    ```bash
    javac -d out $(find src -name "*.java")
    ```

3.  **Run the Application:**
    ```bash
    java -cp out com.currency_converter.classes.Main.main
    ```

### Usage

The application will prompt you for conversion information in the terminal:

1.  Enter the **Source** currency code (e.g., `USD`).
2.  Enter the **Target** currency code (e.g., `BRL`).
3.  Enter the **Value** to be converted (e.g., `100.00`).
4.  The conversion result will be displayed on the screen.

---

## Applied Concepts

* **Object-Oriented Programming (OOP):** Use of classes, encapsulation, and methods to structure the currency converter in a modular way.
* **External API Connection and Communication:** Establishing an **HTTP connection** (using `java.net.http` or similar) to fetch real-time exchange rates from a third-party service.
* **JSON Handling:** Utilization of the **Google Gson** library to deserialize (read) complex JSON data from the API, converting it into Java objects for manipulation.
* **Exception Handling:** Implementation of `try-catch` blocks to handle network/connection failures, invalid data, or JSON parsing errors, ensuring application robustness.
* **Control Structures:** Use of conditional statements (`if/else`) and loops (`while` or *for loops*) for program flow and CLI user interaction.
* **Input and Output (I/O):** Reading data entered by the user in the console (CLI) and displaying the conversion results.

---

## Contributions

Contributions are welcome! If you have suggestions for improvement (such as adding new features, refactoring the code, or enhancing the CLI interface), feel free to:

1.  **Fork** the project.
2.  Create a new branch (`git checkout -b feature/your-improvement`).
3.  Commit your changes (`git commit -m 'feat: Adds improvement X'`).
4.  Open a **Pull Request**.

---

## Author

**YuriOC**

* [GitHub Profile](https://github.com/YuriOC)
