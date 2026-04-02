# 🚀 Playwright Java Automation Demo

This project demonstrates a simple yet professional QA automation setup using **Java + Playwright** with a **Page Object Model (POM)** design.

---
👤 Author

Robert Martin
Senior QA Engineer (Automation | Playwright | Python)



## 📌 Overview

This project automates a login scenario on SauceDemo and verifies successful authentication using browser automation.

It showcases:
- Clean test architecture (POM)
- Reusable components
- Real browser interaction

---

## 🧰 Tech Stack

- Java
- Playwright
- Maven

---

## 🏗️ Project Structure

src/main/java/
├── pages/
│ BasePage.java
│ LoginPage.java
│
└── tests/
LoginTest.java


---

## ✅ Test Scenario

- Navigate to SauceDemo login page
- Enter valid credentials
- Click login
- Verify successful navigation to inventory page

---

## ▶️ How to Run

```bash
mvn exec:java -Dexec.mainClass=tests.LoginTest

🧠 Design Pattern

This project uses the Page Object Model (POM):

BasePage → reusable actions
LoginPage → page-specific logic
LoginTest → test flow

