# 📚 Library Management System — Mock Assessment

A Java OOP practical assessment focused on:

- Classes & Objects
- Inheritance
- Method Overriding
- Encapsulation
- Exception Handling
- Unit Testing with JUnit 5

This project simulates a simple library management system using a UML diagram specification.

---

# 📦 Project Structure

```text
src/
├── main/java/library/
│   ├── LibraryItem.java
│   ├── Book.java
│   ├── AudioBook.java
│   └── Librarian.java
│
└── test/java/library/
    └── LibraryTest.java
```

---

# 🎯 Learning Outcomes

Students will practice:

- Reading and implementing UML diagrams
- Creating constructors
- Writing getters
- Using inheritance (`extends`)
- Overriding methods with `@Override`
- Throwing exceptions
- Writing unit tests
- Using JUnit assertions

---

# 🧱 System Overview

The system contains 4 main classes:

| Class | Description |
|---|---|
| `LibraryItem` | Base class representing any item in the library |
| `Book` | Represents a physical book |
| `AudioBook` | Represents an audiobook |
| `Librarian` | Represents a librarian who can issue items |

---

# 🧩 UML Overview

```text
LibraryItem
 ├── Book
 └── AudioBook

Librarian
```

---

# 📘 Class Specifications

## 1️⃣ LibraryItem

Represents a generic library item.

### Fields

```java
private String title;
private String isbn;
private int year;
private boolean isCheckedOut;
```

### Constructor

```java
LibraryItem(String title, String isbn, int year)
```

### Methods

| Method | Description |
|---|---|
| `getTitle()` | Returns title |
| `getIsbn()` | Returns ISBN |
| `getYear()` | Returns publication year |
| `isCheckedOut()` | Returns checkout status |
| `checkOut()` | Checks out item |
| `returnItem()` | Returns item |
| `setYear(int year)` | Updates year with validation |
| `getSummary()` | Returns formatted summary |

---

## 2️⃣ Book

Extends `LibraryItem`.

### Additional Fields

```java
private String author;
private int pages;
```

### Additional Methods

| Method | Description |
|---|---|
| `getAuthor()` | Returns author |
| `getPages()` | Returns number of pages |
| `getSummary()` | Overridden formatted summary |

---

## 3️⃣ AudioBook

Extends `LibraryItem`.

### Additional Fields

```java
private String narrator;
private int durationMins;
```

### Additional Methods

| Method | Description |
|---|---|
| `getNarrator()` | Returns narrator |
| `getDurationMins()` | Returns audiobook duration |
| `getSummary()` | Overridden formatted summary |

---

## 4️⃣ Librarian

Represents a librarian.

### Fields

```java
private String name;
private String staffId;
```

### Methods

| Method | Description |
|---|---|
| `getName()` | Returns librarian name |
| `getStaffId()` | Returns staff ID |
| `issueItem()` | Checks out and issues an item |

---

# ⚠️ Exception Rules

## `checkOut()`

Throws:

```java
IllegalStateException
```

Message:

```text
Item is already checked out.
```

---

## `returnItem()`

Throws:

```java
IllegalStateException
```

Message:

```text
Item is not currently checked out.
```

---

## `setYear(int year)`

Throws:

```java
IllegalArgumentException
```

If:

```text
year < 1440
```

OR

```text
year > current year
```

---

# 🧪 Unit Testing

JUnit 5 is used for testing.

Tests include:

- Summary formatting
- Getter validation
- Checkout logic
- Return logic
- Exception testing
- Inheritance testing
- State transitions
- Validation testing

---

# ✅ Example Expected Output

## LibraryItem

```text
Clean Code (2008) — ISBN: 978-0132350884
```

## Book

```text
The Pragmatic Programmer (2019) by Andrew Hunt, 352 pages — ISBN: 978-0135957059
```

## AudioBook

```text
Atomic Habits (2018) narrated by James Clear, 681 mins — ISBN: 978-0735211292
```

## Librarian

```text
Amara Nkosi issued: The Pragmatic Programmer (2019) by Andrew Hunt, 352 pages — ISBN: 978-0135957059
```

---

# ▶️ Running the Project

## Compile

```bash
mvn compile
```

---

## Run Tests

```bash
mvn test
```

---

# 🛠 Recommended IDE

- IntelliJ IDEA
- VS Code
- Eclipse

---

# 📚 Concepts Covered

- Encapsulation
- Constructors
- Inheritance
- Polymorphism
- Method overriding
- Exception handling
- Unit testing
- UML interpretation

---

# 🧠 Challenge Extensions

Additional ideas for advanced students:

- Add a `Magazine` class
- Add due dates
- Add borrowers
- Add late fees
- Save data to files
- Create a menu-driven console app

---

# 📝 Assessment Notes

Students must:

- Follow UML exactly
- Match method signatures exactly
- Use proper exception messages
- Use `@Override` where required
- Keep fields `private`
- Pass all unit tests

---

# ✅ Submission Checklist

- [ ] All classes compile
- [ ] No syntax errors
- [ ] All tests pass
- [ ] Correct inheritance used
- [ ] Correct exception handling
- [ ] Correct summary formatting
- [ ] Clean readable code
- [ ] No debug print statements

---

# 👨‍🏫 Educator Notes

This project is ideal for:

- Introductory OOP assessments
- Java inheritance practice
- UML implementation exercises
- JUnit testing practice
- Mock technical assessments

Difficulty: ⭐⭐⭐☆☆