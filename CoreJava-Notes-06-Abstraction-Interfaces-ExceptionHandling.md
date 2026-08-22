# Abstraction

**Definition:**
**Abstraction** is the process of hiding the implementation details and providing only the functionality to the user.

## Drawback of Abstract Classes

By using an abstract class, we are **unable to achieve 100% abstraction**. 
* **Why?** Because an abstract class can contain both abstract methods (hidden implementation) and concrete methods (visible implementation). If a user tries to access a concrete method, they can see its implementation. 

To overcome this drawback and achieve 100% abstraction, we use an **Interface**.

---

# Interface

**Definition:**
An **Interface** is a blueprint of a class declared using the `interface` keyword. It acts as an intermediary between two things. 

## Specifications and Rules

1. **No Concrete Methods:** It is not possible to create concrete methods (methods with a body) inside an interface. It only allows abstract methods.
2. **No Constructors:** Interfaces do not have constructors. Therefore, there is no ambiguity regarding constructor chaining (the `super()` call).
3. **Achieving 100% Abstraction:** Because all methods in an interface are abstract (by default), we can achieve **100% abstraction**.

## Multiple Inheritance with Interfaces

Unlike classes, Java supports **Multiple Inheritance** through interfaces. 

* **No Method Ambiguity:** If two parent interfaces have the exact same method name and signature, the sub-interface or implementing class only inherits one method signature. Since there are no method bodies to conflict, there is no ambiguity.
* **No Constructor Ambiguity:** Since interfaces lack constructors, the "diamond problem" of deciding which parent constructor to call does not exist.

---

# Advantages of Abstraction

* **Implementation Security:** Internal workings are hidden from the outside world.
* **Loose Coupling:** The ultimate output of proper abstraction is loose coupling.

---

# Object Relationships

* **IS-A Relationship (Inheritance):** A child is a type of its parent. 
  * *Example:* An Employee **IS-A** Person. A Carrot **IS-A** Vegetable.
* **HAS-A Relationship (Composition/Aggregation):** An object contains another object. 
  * *Example:* A Human **HAS-A** Heart. A Person **HAS-A** Car.

---

# Coupling

Coupling refers to the dependency between different classes.

## 1. Tight Coupling

**Definition:**
In **Tight Coupling**, changing the implementation of one class directly affects the user or dependent classes. 

**Example:**
```java
public class Facebook {
    // Constructor requires exact parameters
    public Facebook(int a, int c) {
        System.out.println(a);
    }
}

public class Oracle {
    // Tightly coupled: Oracle is forced to know exactly how to build a Facebook object
    Facebook f = new Facebook(4, 5); 
}
```

## 2. Loose Coupling

**Definition:**
In **Loose Coupling**, implementation changes do not affect the user or dependent classes. This is achieved using interfaces (Abstraction).

**Example:**

```java
// 1. Create an Interface (Abstraction)
public interface Server {
    void connect();
}

// 2. Implementation A
public class Oracle implements Server {
    @Override
    public void connect() {
        System.out.println("Server connected to Oracle.");
    }
}

// 3. Implementation B
public class Meta implements Server {
    @Override
    public void connect() {
        System.out.println("Server connected to Meta.");
    }
}

// 4. Dependent Class depends on Interface, not concrete classes
public class Facebook {
    Server s; // Reference to the interface

    // Constructor Injection (Loose Coupling)
    public Facebook(Server s) {
        this.s = s;
    }

    void display() {
        s.connect();
    }
}

// 5. Main Execution
public class User {
    public static void main(String[] args) {
        Meta m = new Meta();
        Oracle o = new Oracle();

        // We can pass ANY Server implementation easily without breaking the Facebook class
        Facebook f = new Facebook(o); // Injecting Oracle
        f.display();
    }
}
```

# Exception Handling

**Definition:**
An **Exception** is an unwanted event that occurs at runtime and stops or terminates the normal flow of execution.

**Note:** When code is syntactically correct but logically wrong, we often end up with an exception. All exceptions are classes in Java.

## Errors vs. Exceptions

* **Errors (Compile-Time):** Usually syntactical mistakes that prevent compilation.
* **Exceptions (Runtime):** Errors that occur while the program is running (e.g., `int a = 10 / 0;` causes an `ArithmeticException`).

---

## Exception Hierarchy (Flowchart)

In Java, all exceptions and errors inherit from the `Throwable` class, which inherits from `Object`.

```text
Object
 └── Throwable
      ├── Exception
      │    ├── RuntimeException (Unchecked)
      │    │    ├── ArithmeticException
      │    │    ├── NullPointerException
      │    │    ├── ClassCastException
      │    │    └── IndexOutOfBoundsException
      │    │         ├── ArrayIndexOutOfBoundsException
      │    │         └── StringIndexOutOfBoundsException
      │    ├── IOException (Checked)
      │    │    ├── EOFException
      │    │    ├── FileNotFoundException
      │    │    └── InterruptedIOException
      │    ├── SQLException (Checked)
      │    ├── AWTException (Checked)
      │    └── InterruptedException (Checked)
      │
      └── Error (Unchecked)
           ├── VirtualMachineError
           │    ├── StackOverflowError
           │    └── OutOfMemoryError
           ├── AssertionError
           ├── ExceptionInInitializerError
           ├── IOError
           └── AWTError
```

**Key Point:** `RuntimeException` and its subclasses, along with `Error` and its subclasses, are **Unchecked Exceptions**. All other exceptions are **Checked Exceptions**.

---

## Handling Exceptions

**Definition:**
**Exception Handling** is the mechanism to handle runtime errors so that the normal flow of the application can be maintained, avoiding abnormal termination.

We handle exceptions using `try`, `catch`, `finally` blocks, and the `throws` keyword.

### 1. `try` and `catch` Blocks

Code that might throw an exception is enclosed within the `try` block. The handling code is written inside the `catch` block. For each `try` block, there must be a respected `catch` block (or a `finally` block).

**Example:**

```java
try {
    int a = 10 / 0;
    System.out.println(a);
} catch (ArithmeticException e) {
    System.out.println("Hey user, denominator cannot be zero");
}
```

### Multiple `catch` Blocks

For a single `try` block, we can have multiple `catch` blocks. 

**Key Point:** If you use multiple catch blocks, you must order them from **subclass to superclass** (most specific exception to most general).

**Example:**

```java
try {
    int a = 10 / 0;
    System.out.println(a);
} catch (ArithmeticException e) {
    System.out.println("This is an Arithmetic exception");
} catch (Exception e) {
    System.out.println("This is the general Exception class itself");
}
```

---

## The `finally` Block

The `finally` block executes **whether an exception occurs or not**. To use a `finally` block, you must pair it with a `try` block (and optionally `catch` blocks). 

**Note:** The `finally` block is generally used to close costly resources (like database connections or file streams).

**Example:**

```java
try {
    int a = 10 / 0;
    System.out.println(a);
} catch (ArithmeticException e) {
    e.printStackTrace();
} finally {
    System.out.println("This executes no matter what.");
}
```

### `printStackTrace()` Method

This method gives detailed information about the exception. It tells you:
1. What the **reason** for the exception is.
2. Which **type** of exception it is.
3. Exactly **where** in the code you are getting the exception.

---

## Types of Exceptions

### 1. Checked Exceptions

Exceptions that are checked at compile-time. The compiler **forces** the developer to handle these exceptions (e.g., using a `try-catch` block).
* *Example:* `ClassNotFoundException`

### 2. Unchecked Exceptions

Exceptions that occur at runtime. The compiler does not have this information, so it is **not forced** by the compiler while developing the code.
* *Example:* `ArithmeticException` (like `int a = 10 / 0;`)

---

## Ducking Exceptions (`throws`)

**Definition:**
**Ducking** is the process of rethrowing an exception from the called method back to the caller method using the `throws` keyword. 

If multiple methods call each other, at least one of the methods has to handle the exception. If no method handles it, it leads to the abnormal termination of the program.

---

## The `throw` Keyword & Custom Exceptions

**Definition:**
The `throw` keyword is used to explicitly throw an exception object back to the caller method.

**Note:** By using the `throw` keyword, we can only throw exception objects. It is not possible to throw normal Java objects.

### Custom Exceptions

We can create our own exception classes by extending existing Java exception classes.
* **Unchecked Custom Exception:** If a custom class extends `RuntimeException`, it becomes an unchecked custom exception.
