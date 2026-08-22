# Core Java Practice & Notes

This repository contains my **Core Java learning notes, concepts, and practice programs**. 
The purpose of this repository is to act as a **main reference guide** for building a strong foundation in Java programming and understanding the concepts required for developing Java-based applications.

*(Note: Detailed code examples and practical implementations for each topic are available in their respective sub-directories within this repository.)*

---

## 📚 Topics Covered

### 1. Introduction to Programming and Java
* Software, Program, Programming Language, and Platform
* History of Programming Languages (C, C++, Java)
* **Java Features:** Platform Independence, WORA (Write Once, Run Anywhere)
* **Core Elements:** Class, Object, Keywords, Identifiers
* **Java Ecosystem:** Bytecode, JVM, JDK, JRE, JIT Compiler

### 2. Java Variables and Data Types
* **Variables:** Constants, Instance Variables, Local Variables, Static Variables
* **Data Types:** Primitive and Non-Primitive Data Types
* **String Basics**
* Parameters and Arguments

### 3. Methods
* Method Declaration & Invocation
* Return Types (Void vs. Value-returning)
* Parameters and Arguments
* **User Input:** `Scanner` Class

### 4. Access Modifiers
* `public`, `protected`, `default`, `private`
* Understanding visibility and accessibility.

---

## 🧠 Java Memory Management

* **JVM Memory Areas:** Heap Memory, Stack Memory, Method Area, PC Register, Native Method Stack
* Execution / Call Stack
* Class Loading & JVM Architecture
* Execution Engine, Interpreter, JIT Compiler, Garbage Collector, JNI

### Program Execution Flow
```text
Java Source Code → Compilation → Bytecode → Class Loading → JVM Memory Areas → Execution Engine → Interpreter / JIT → Program Output
```

---

## 🔑 Object-Oriented Programming (OOP)

* **Class:** A blueprint or logical entity used to create objects (contains data members, methods, constructors, blocks).
* **Object:** An instance of a class containing state (variables) and behavior (methods).

### 🔗 Inheritance
* Acquiring properties and behaviors of another class using the `extends` keyword.
* **Advantages:** Code Reusability, Reduced Redundancy, Establishes **IS-A** relationship.
* **Types:** Single Level, Multilevel, Hierarchical, Multiple, Hybrid (Multiple/Hybrid achieved via interfaces).

### 🌳 Object Class
* The root class of the Java class hierarchy.
* Provides common methods: `toString()`, `equals()`, `hashCode()`, `getClass()`, `clone()`, `wait()`, `notify()`.

### 🔄 Polymorphism
* **Compile-Time Polymorphism:** Achieved using **Method Overloading** (Early Binding).
* **Runtime Polymorphism:** Achieved using **Method Overriding** (Late Binding).

### 🏗️ Constructors
* Special members used to initialize objects.
* **Types:** Default, Zero-Parameter, Parameterized.
* **Constructor Overloading & Chaining:** Using `this()` or `super()`.

### 🧩 Encapsulation
* Binding data and methods into a single unit (Private variables + Public getters/setters).
* **Advantages:** Data Hiding, Data Validation, Controlled Access.

### 🎯 `this` Keyword
* Refers to the current object; used to resolve variable shadowing.

### 📦 Static Members
* Belong to the class rather than individual objects. Includes **Static Variables**, **Static Methods**, and **Static Blocks**.

### 🔒 Abstraction
* Hiding implementation details and exposing only the required functionality.
* Achieved via **Abstract Classes** (partial abstraction) and **Interfaces** (100% abstraction).

---

## 🔗 Relationships & Coupling

* **IS-A Relationship:** Inheritance (using `extends` or `implements`).
* **HAS-A Relationship:** Composition/Aggregation (an object contains another object).
* **Tight Coupling:** Strong dependency on concrete classes.
* **Loose Coupling:** Dependency on abstractions/interfaces (improves flexibility and testability).

---

## 🔄 Type Casting & `instanceof`

* **Primitive Type Casting:** Widening (Implicit) and Narrowing (Explicit).
* **Non-Primitive Type Casting:** Upcasting (Implicit to Superclass) and Downcasting (Explicit to Subclass).
* **`instanceof` Operator:** Used to check object compatibility before downcasting to avoid `ClassCastException`.

---

## 🗑️ Garbage Collection

* The JVM's automatic process of reclaiming memory occupied by unreachable objects.
* Objects become eligible when re-assigned, nullified, or created anonymously.

---

## 📝 Strings & String Pool

* **Immutable Strings:** Created via the `String` class. Content cannot be changed.
* **String Pool:** A memory area in the Heap that reuses identical string literals to save memory.
* **Mutable Strings:** Created via `StringBuffer` (Thread-safe/Synchronized) and `StringBuilder` (Not thread-safe/Faster).

| Feature | StringBuffer | StringBuilder |
| :--- | :--- | :--- |
| **Mutable** | Yes | Yes |
| **Thread Safe** | Yes | No |
| **Performance** | Slower | Faster |

---

## ⚠️ Exception Handling

* **Definition:** An event that disrupts the normal flow of program execution.
* **Hierarchy:** `Object` → `Throwable` → `Exception` & `Error`.
* **Checked Exceptions:** Checked by the compiler (e.g., `IOException`).
* **Unchecked Exceptions:** Occur at runtime (e.g., `ArithmeticException`).
* **Keywords:** `try`, `catch`, `finally`, `throw`, `throws`.
* **Custom Exceptions:** Created by extending `RuntimeException` or `Exception`.

---

## 📦 Packages & Tools

* **Packages:** Group related Java classes (e.g., `java.lang`, `java.util`). Improves modularity and avoids naming conflicts.
* **Tools Used:** Java, JDK, JVM, JRE, Git, GitHub, VS Code / Eclipse / STS.

---

## 📁 Repository Structure

```text
practiceee/
│
├── README.md (Main Index)
│
├── CoreJava/
│   ├── Part-1/ (Intro, Classes, Objects, JVM, Variables, Methods)
│   ├── Part-2/ (Memory, this, Static, Inheritance)
│   ├── Part-3/ (Overloading, Overriding, Constructors, Blocks)
│   ├── Part-4/ (Encapsulation, Casting, Polymorphism, Packages)
│   ├── Part-5/ (Strings, StringBuffer, StringBuilder, Abstraction)
│   └── Part-6/ (Interfaces, Coupling, Exception Handling)
│
└── Practice/ (Programs and Examples)
```

---

## 🎯 Learning Objectives & Future Topics

**Current Objectives:**
* Build strong OOP fundamentals and understand Java memory management.
* Master abstraction, polymorphism, encapsulation, and exception handling.

**Future Topics:**
* Arrays, Wrapper Classes, `final`/`super` Keywords.
* Collections Framework (Map, Set, List), Generics.
* Multithreading, File Handling.
* Java 8 Features (Lambdas, Stream API), JDBC.

---

## 📌 Repository Purpose

This repository is maintained as a personal Core Java learning and practice tracker. It contains notes, concept examples, and practice problems to develop a strong foundation for Java Full Stack Development.

**👩‍💻 Author**  
Hari Priya Kanuganti  
*Java Full Stack Developer | Java | Spring Boot | React | MySQL*
