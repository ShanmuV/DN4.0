# Control Structures in PL/SQL

## Scenario 1

The bank wants to apply a discount to loan interest rates for customers above 60 years old.

> **Question:** Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.

**PL/SQL:**

```
BEGIN
    FOR record IN (SELECT * FROM CUSTOMERS) LOOP
        IF record.age > 60 THEN
            UPDATE CUSTOMERS
            SET loan_interest_rate = loan_interest_rate - 1
            WHERE customer_id = record.customer_id;
        END IF;
    END LOOP;
END;
```

---

## Scenario 2

Scenario 2: A customer can be promoted to VIP status based on their balance.

> **Question:** Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.

**PL/SQL:**

```
BEGIN
    FOR record IN (SELECT * FROM CUSTOMERS) LOOP
        IF record.balance > 10000 THEN
            UPDATE CUSTOMERS
            SET isVip = true
            WHERE customer_id = record.customer_id;
        END IF;
    END LOOP;
END;
```

---

## Scenario 3

The bank wants to send reminders to customers whose loans are due within the next 30 days.

> **Question:** Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

**PL/SQL:**

```
BEGIN
    FOR record IN (SELECT * FROM Customers) LOOP
        IF record.due_date BETWEEN SYSDATE AND SYSDATE + 30 THEN
            DBMS_OUTPUT.PUT_LINE('Mr. / Ms. '||record.cus_name||' , You have less than 30 days of due remaining. Pay Up bruh');
        END IF;
    END LOOP;
END;
```
