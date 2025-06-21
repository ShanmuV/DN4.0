# Stored Procedures

## Scenario 1

The bank needs to process monthly interest for all savings accounts.

> **Question:** Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

**Procedure:**

```
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Customers SET balance = balance + (balance * 0.01);
END;
```

---

## Scenario 2

The bank wants to implement a bonus scheme for employees based on their performance.

> **Question:** Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

**Procedure:**

```
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept IN VARCHAR2, bonus IN NUMBER) IS
BEGIN
    UPDATE Employees SET salary = salary + (salary * (bonus/100)) WHERE department = dept;
END;
```

---

## Scenario 3

Customers should be able to transfer funds between their accounts.

> **Question:** Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

**Procedure:**

```
CREATE OR REPLACE PROCEDURE TransferFunds(sender_acc IN NUMBER, receiver_acc IN NUMBER, amount IN NUMBER) IS
DECLARE
    balance NUMBER;
BEGIN
    SELECT balance INTO balance FROM Customers WHERE acc_id = sender_acc;
    IF balance < amount THEN
        DBMS_OUTPUT.PUT_LINE('You dont have enough balance.');
    ELSE
        UPDATE Customers SET balance = balance + amount WHERE acc_id = receiver_acc;
        UPDATE Customers SET balance = balance - amount WHERE acc_id = sender_acc;
    END IF;
END;

```
