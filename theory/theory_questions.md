# Theory Questions — Mock Assessment 2
**WeThinkCode_ | Java OOP | 40 Marks**

**Candidate Name:** ___________________________
**Date:** ___________________________

---

## Section A: Multiple Choice (10 marks — 1 mark each)

*Circle the letter of the best answer.*

**1.** In a UML class diagram, how are private fields typically represented?

- A) `+` before the field name
- B) `#` before the field name
- C) `-` before the field name
- D) `~` before the field name

---

**2.** Which Java keyword prevents a method from being overridden in a subclass?

- A) `static`
- B) `private`
- C) `final`
- D) `abstract`

---

**3.** When a subclass constructor calls `super(name, value)`, it is:

- A) Creating a new instance of the superclass
- B) Calling the superclass constructor to initialise inherited fields
- C) Overriding the superclass constructor
- D) Copying all fields from the superclass

---

**4.** Which of the following best describes polymorphism?

- A) A class having multiple constructors
- B) A subclass object being treated as an instance of its superclass
- C) A field being accessible from multiple classes
- D) A method returning different data types

---

**5.** In JUnit 5, `assertThrows(IllegalArgumentException.class, () -> obj.setAge(-1))` will:

- A) Pass only if `setAge(-1)` does NOT throw any exception
- B) Pass only if `setAge(-1)` throws `IllegalArgumentException`
- C) Always pass regardless of what happens
- D) Fail to compile because lambdas are not allowed in tests

---

**6.** What does the open arrowhead (hollow triangle) on an inheritance arrow in UML point toward?

- A) The subclass
- B) The interface
- C) The superclass (parent)
- D) The most recently created class

---

**7.** Which of the following is a correct way to override `toString()` in Java?

- A) `public String toString() { return "..."; }`
- B) `private String toString() { return "..."; }`
- C) `static String toString() { return "..."; }`
- D) `protected void toString() { System.out.println("..."); }`

---

**8.** What is the result of calling `super.describe()` inside an overriding `describe()` method?

- A) An infinite loop
- B) A compile error — you cannot call super methods
- C) The output of the parent class's `describe()` method
- D) The method is ignored

---

**9.** Which JUnit 5 assertion would you use to check that a boolean condition is true?

- A) `assertEquals(true, condition)`
- B) `assertBoolean(condition)`
- C) `assertTrue(condition)`
- D) `assertValid(condition)`

---

**10.** In UML, a dashed line with an open arrowhead typically represents:

- A) Inheritance
- B) Composition
- C) Dependency / interface implementation
- D) Association

---

## Section B: Short Answer (10 marks — 2 marks each)

*Answer in 2–4 sentences.*

**11.** What does it mean to say a subclass "is-a" superclass? Give an example from the library domain.

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

**12.** Explain what happens if you do not call `super(...)` as the first line of a subclass constructor.

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

**13.** Why is it important for a UML diagram to show return types on methods?

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

**14.** What is the difference between `assertEquals` and `assertSame` in JUnit?

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

**15.** A colleague says: *"Validation in setters is unnecessary — we can just trust whoever calls the code."*  
Do you agree? Justify your answer.

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

## Section C: True / False (5 marks — 1 mark each)

*Write TRUE or FALSE next to each statement.*

| # | Statement | Answer |
|---|-----------|--------|
| 16 | A UML diagram shows the runtime behaviour of a program. | |
| 17 | In Java, a class can extend multiple classes at once. | |
| 18 | `@Override` causes a compile error if the method does not actually override anything. | |
| 19 | The `@BeforeEach` method runs once before all tests, not before each individual test. | |
| 20 | A subclass inherits all public and protected methods from its superclass. | |

---

## Section D: UML Reading Questions (15 marks)

*The UML diagram below describes a Library Management System. Study it carefully and answer all questions.*

```
┌─────────────────────────────────────────┐
│              LibraryItem                │
├─────────────────────────────────────────┤
│ - title      : String                   │
│ - isbn       : String                   │
│ - year       : int                      │
│ - isCheckedOut : boolean                │
├─────────────────────────────────────────┤
│ + LibraryItem(title, isbn, year)        │
│ + getTitle()       : String             │
│ + getIsbn()        : String             │
│ + getYear()        : int                │
│ + isCheckedOut()   : boolean            │
│ + checkOut()       : void               │
│ + returnItem()     : void               │
│ + setYear(year)    : void               │
│ + getSummary()     : String             │
└─────────────────────────────────────────┘
           ▲                  ▲
           │                  │
┌──────────────────┐  ┌────────────────────────┐
│      Book        │  │       AudioBook         │
├──────────────────┤  ├────────────────────────┤
│ - author: String │  │ - narrator  : String    │
│ - pages : int    │  │ - durationMins : int    │
├──────────────────┤  ├────────────────────────┤
│ + Book(title,    │  │ + AudioBook(title,      │
│   isbn, year,    │  │   isbn, year,           │
│   author, pages) │  │   narrator,             │
│ + getAuthor()    │  │   durationMins)         │
│   : String       │  │ + getNarrator(): String │
│ + getPages()     │  │ + getDurationMins()     │
│   : int          │  │   : int                 │
│ + getSummary()   │  │ + getSummary(): String  │
│   : String       │  │                        │
└──────────────────┘  └────────────────────────┘

┌───────────────────────────────────────────┐
│                 Librarian                 │
├───────────────────────────────────────────┤
│ - name        : String                    │
│ - staffId     : String                    │
├───────────────────────────────────────────┤
│ + Librarian(name, staffId)                │
│ + getName()   : String                    │
│ + getStaffId(): String                    │
│ + issueItem(item: LibraryItem) : String   │
└───────────────────────────────────────────┘
```

---

**Question 21** *(2 marks)*  
How many classes are shown in the diagram? List them.

> _______________________________________________

---

**Question 22** *(2 marks)*  
Which class does `Book` inherit from? How can you tell from the diagram?

> _______________________________________________
> _______________________________________________

---

**Question 23** *(3 marks)*  
What are the three private fields declared in `LibraryItem` that are also available to `Book` through inheritance? Why can't `Book` access them directly by name?

> _______________________________________________
> _______________________________________________
> _______________________________________________

---

**Question 24** *(3 marks)*  
`getSummary()` appears in `LibraryItem`, `Book`, and `AudioBook`. What OOP concept does this represent, and what Java keyword would you use in `Book` and `AudioBook` to signal this?

> _______________________________________________
> _______________________________________________

---

**Question 25** *(2 marks)*  
`Librarian` has a method `issueItem(item: LibraryItem)`. Based on the UML, write the Java method signature for this method (just the signature, not the body).

> _______________________________________________

---

**Question 26** *(3 marks)*  
Looking at `AudioBook`, which fields does it contribute that `LibraryItem` does NOT have?  
If you were writing the `AudioBook` constructor, which fields would need to be passed to `super(...)`?

> _______________________________________________
> _______________________________________________
