# String

**Definition:**
A **String** is a sequence of characters enclosed within double quotes. It is an built-in class present in the `java.lang` package. Because `String` is a class, it is used as a **non-primitive data type** in Java.

**Examples:**
```java
String s = " "; 
String s1 = "1234"; 
String s2 = "ABCD1234F";
```

---

## Types of Strings

There are two types of strings in Java:

1. **Immutable Strings**
2. **Mutable Strings**

### 1. Immutable Strings

**Definition:**
Once an immutable string is created, the content of the string **cannot be modified**. We create immutable strings using the `String` class.

### 2. Mutable Strings

**Definition:**
Once a mutable string is created, the content of the string **can be modified**. We create mutable strings with the help of the `StringBuffer` and `StringBuilder` classes.

### Need for Mutable and Immutable Strings

While designing an application (like a bank application), different fields require different string types based on whether the data should change:

* **Immutable Fields (Cannot change):** Name, IFSC code, Branch, Date of Birth.
* **Mutable Fields (Can change):** Phone number, Address, Pin code.

---

## Creating Immutable Strings

There are two primary ways to create an immutable string using the `String` class:

**Type 1: Using String Literals**
```java
String name = "Raju";
```

**Type 2: Using the `new` Keyword**
```java
String s1 = new String("Virat");
```

---

## String Memory Allocation (String Pool)

Memory for strings is allocated in the **Heap memory**, which is divided into two sections for string storage:

1. **Constant Pool (String Constant Pool):** 
   * It **does not allow** duplicate objects. 
   * If a string already exists, a new object is not created; instead, multiple reference variables will point to the same existing copy.
2. **Non-Constant Pool (Standard Heap):** 
   * It **allows** duplicate objects. Every time the `new` keyword is used, a new object is created here.

### Memory Breakdown Example

```java
class Demo { 
    public static void main(String[] args) { 
        String s1 = "Pentagon"; 
        String s2 = " "; 
        String s3 = "Pentagon"; 
        String s4 = " "; 
        
        if (s1 == s3) {
            // This is TRUE. s1 and s3 share the same address.
        }
    } 
}
```

**Initially:**
```text
s1 → "Pentagon" (Object 1 in Constant Pool)
s2 → " " (Object 2 in Constant Pool)
```

**After creating `s3` and `s4`:**
```text
s1 → "Pentagon" (Object 1)
s3 → "Pentagon" (Object 1)

s2 → " " (Object 2)
s4 → " " (Object 2)
```

*Note: Because no duplicates are allowed in the Constant Pool, `s1` and `s3` share the exact same memory address. The same applies to `s2` and `s4`.*

---

## Why are Strings Immutable?

**Key Point:**
Strings are immutable primarily because of the **String Constant Pool** memory arrangement. 

1. **Shared References:** In the Constant Pool, multiple reference variables often point to the exact same string object to save memory. 
2. **Preventing Side Effects:** If strings were mutable, changing the content using one reference variable would unintentionally change the value for all other reference variables pointing to that same object. 
3. **Garbage Collection:** Objects in the string pool are generally not eligible for standard garbage collection because the JVM keeps them in memory for future reuse in case the same string literal is needed again.

To prevent one reference from altering the data of another, Java made `String` objects immutable.

---

## Mutable String Classes

If we need a string where we can alter the content after creation, we use **mutable strings**. Both of these classes have an `append()` method to modify the string.

### 1. StringBuffer

* It is a built-in class present in the `java.lang` package.
* **Thread-Safe:** All the methods present in `StringBuffer` are **synchronized**. This means multiple threads cannot access it simultaneously, making it safe but slightly slower.

### 2. StringBuilder

* It is a built-in class present in the `java.lang` package.
* **Not Thread-Safe:** The methods in `StringBuilder` are **not synchronized**. This means it is faster than `StringBuffer` but not safe for multi-threaded operations.

# Static Members

## Static Block

**Definition:**  
A block of code marked with the **`static`** keyword is known as a **static block**. 

**Key Features:**
* **Memory Allocation:** A static block gets memory at the time of **class loading**.
* **Usage:** It is primarily used to initialize static variables. 
* **Access:** Static variables can be directly accessed inside a static block without any object reference.
* **Behavior:** It has class-specific behavior, meaning it runs once when the class is loaded into memory.

**Note:** Static members do not belong to the object; they belong to the **class**.

## Static Methods

**Definition:**  
A method declared with the **`static`** keyword is called a **static method**.

**Key Features:**
* **Memory Allocation:** Like static blocks, static methods get memory at the time of class loading.
* **Invocation:** We can invoke a static method using the **Class name with the dot operator** (e.g., `ClassName.methodName()`). You can also use an object reference, but using the class name is the best practice.

**Note:** All static members get memory allocated inside a specific static context area.

### Why is the `main` method static?

If the `main` method were non-static, its execution would depend on an object. The **JVM (Java Virtual Machine)** would have to wait for an object to be created before it could run the program. To avoid this object creation dependency, the `main` method is made `static`. This allows the JVM to easily recognize it and start execution immediately using the class name.

---

# Types of Methods

There are two main types of methods in Java:

1. **Concrete Method**
2. **Abstract Method**

## 1. Concrete Method

**Definition:**  
A method that provides an **implementation** (a body) along with its declaration is called a **concrete method**.

**Example:**
```java
class Math {
    // Concrete methods with implementation
    int m3() {
        return 0;
    }
    
    void m1() {
        System.out.println("hi");
    }
    
    void m2() {
        // Empty body, but still a concrete method
    }
}
```

## 2. Abstract Method

**Definition:**  
A method that has **only a declaration** and no implementation (no body) is known as an **abstract method**. 

**Key Point:**
Abstract methods can be declared with various return types and parameters.

**Example:**
```java
abstract void m1();
abstract int m2();
abstract double m3(int a);
abstract void m4(double b);
```

---

## Abstract Class

**Definition:**  
A class declared with the **`abstract`** keyword is called an **abstract class**. 

**Why are we using Abstract Classes?**  
We use them to perform **abstraction** in Java (hiding the implementation details and showing only functionality to the user).

## Specifications of Abstract Classes

1. **Object Creation:** We are **unable to create an object** (instantiate) for an abstract class.
2. **Contents:** An abstract class can contain:
   * Constructors
   * Variables (including static variables)
   * Concrete methods
   * Abstract methods
3. **Mandatory Declaration:** If a class contains even one abstract method, it is **mandatory** to declare the entire class as abstract.

**Note:** If an abstract class does *not* have any abstract methods, it is perfectly fine. We won't get any error from the compiler.

**Example:**
```java
public abstract class Demo {
    // Variables
    private int a;
    static int b;
    
    // Constructor
    public Demo() {
        // Constructor logic
    }
    
    // Abstract method
    abstract void m1();
}
```
