# Java Programming Internship - 4-Week Roadmap & Submissions

Welcome to my Java Programming Internship repository. This repository contains the weekly assignments and mini projects completed throughout the 4-week internship program.

---

## 📁 Repository Structure

```text
Java/
├── .gitignore                         # Excludes compiled files and local practice folders
├── README.md                          # Repository overview and execution guide
│
├── Week 1/                            # Java Fundamentals & Logic Building
│   ├── Assignment/
│   │   ├── BasicCalculator.java       # Assignment 1: Arithmetic operations with input validation
│   │   └── GradeEvaluator.java        # Assignment 2: Marks calculation and grade assignment (A/B/C/Fail)
│   ├── Project/
│   │   └── BankManagementSystem.java  # Mini Project: Menu-driven Bank Management Console App
│   └── Practice/                      # [Local Only - Ignored by Git] 5 Practice Problem Solutions
│
├── Week 2/                            # OOP Concepts & Data Structures
│   ├── Assignment/
│   └── Project/
│
├── Week 3/                            # Advanced Java, Collections & Exception Handling
│   ├── Assignment/
│   └── Project/
│
└── Week 4/                            # Capstone Project & Final Review
    ├── Assignment/
    └── Project/
```

> **Note:** Practice question folders (`Practice/`) are maintained locally for hands-on problem solving and are excluded from GitHub commits via `.gitignore`.

---

## 🚀 Week 1: Java Fundamentals & Deliverables

### 📌 Assignments

#### 1. Basic Calculator (`BasicCalculator.java`)
- **Objective:** Perform arithmetic operations (`+`, `-`, `*`, `/`) based on user input.
- **Key Features:**
  - Dynamic user input using `java.util.Scanner`.
  - Switch-case logic for operator selection.
  - Robust exception handling for division by zero (`num2 == 0`).
  - Option to loop and perform multiple calculations in one session.

#### 2. Grade Evaluation Program (`GradeEvaluator.java`)
- **Objective:** Evaluate student performance across multiple subjects and determine letter grades.
- **Key Features:**
  - Input validation (marks must be between 0 and 100).
  - Calculates total marks and percentage.
  - Multi-tier conditional logic:
    - **Grade A:** $\ge 85\%$ (Excellent)
    - **Grade B:** $70\% - 84\%$ (Good)
    - **Grade C:** $50\% - 69\%$ (Satisfactory)
    - **Fail:** $< 50\%$
  - Clean formatted report card summary output.

---

### 💼 Week 1 Mini Project: Bank Management Console Application

**File:** `BankManagementSystem.java`

A menu-driven console banking application utilizing loops, conditional control statements, and standard I/O.

#### Features:
1. **Account Initialization:** Sets up Account Holder Name, Account Number, and Opening Balance.
2. **Check Balance:** Displays real-time available funds.
3. **Deposit Funds:** Validates positive deposit amounts and updates the balance.
4. **Withdraw Funds:** Verifies sufficient balance before debiting to prevent overdrafts.
5. **Account Summary:** Displays account holder credentials and balance.
6. **Graceful Exit:** Clean session termination.

---

## 🛠️ How to Compile & Run

Ensure you have Java JDK (version 8 or higher, tested on JDK 21/23) installed.

### 1. Basic Calculator
```bash
# Navigate to Week 1 Assignment folder
cd "Week 1/Assignment"

# Compile and Run
javac BasicCalculator.java
java BasicCalculator
```

### 2. Grade Evaluator
```bash
# Navigate to Week 1 Assignment folder
cd "Week 1/Assignment"

# Compile and Run
javac GradeEvaluator.java
java GradeEvaluator
```

### 3. Bank Management System (Mini Project)
```bash
# Navigate to Week 1 Project folder
cd "Week 1/Project"

# Compile and Run
javac BankManagementSystem.java
java BankManagementSystem
```

---

## 💻 Tech Stack
- **Language:** Java (Java SE)
- **Concepts:** Variables, Data Types, Operators, `Scanner`, `if-else` / `switch-case`, `for`/`while` loops, Functions, Error handling.
- **Version Control:** Git & GitHub
