# Encapsulation

**Definition:**
**Encapsulation** is a technique where we are binding the data into a single unit using public class handler methods (getter + setter).

## Specifications to Achieve Encapsulation

1. The class must be **public and non-abstract**.
2. The data members must be **private**.
   *Note: Data members need to be private to restrict direct access, rather than strictly primitive types.*
3. The data handler methods should be **public**.

**Note:** To perform encapsulation, at least two classes are required. **Constructor overriding** is not possible.

## Advantages of Encapsulation

* **Data validation**
* **Data hiding**
* Making data **read-only** and **write-only**

---

# Type Casting

**Definition:**
Conversion of the data type of a variable from one type to another type is called **Type Casting**.

## Types of Type Casting

1. **Primitive Type Casting**
2. **Non-Primitive Type Casting**

## 1. Primitive Type Casting

Performing type casting within primitive data types is called **Primitive Type Casting**.

It is of two types:
1. **Implicit Type Casting**
2. **Explicit Type Casting**

### Implicit Type Casting

Conversion of a smaller data type into a larger data type is called **Implicit Type Casting** or **Widening**.

**Key Point:**
Smaller data type → Larger data type = **Implicit Type Casting / Widening**

**Example:**

```java
int a = 10;
int b = a;

byte bt = 120;
int c = bt;

int i = 500;
long d = i;
```

### Explicit Type Casting

Conversion of a larger data type into a smaller data type is called **Explicit Type Casting** or **Narrowing**.

**Key Point:**
Larger data type → Smaller data type = **Explicit Type Casting / Narrowing**

**Example:**

```java
short s = 5;
// byte b = s; -> Error

byte b = (byte) s;

long l = 50;
// int i = l; -> Error

int i = (int) l;
```

## 2. Non-Primitive Type Casting

Performing type casting between non-primitive/reference data types is called **Non-Primitive Type Casting**.

**Example:**

```java
Pen p1 = new Pen();
Pen p2 = p1;
Pen p3 = p2;
```

Here, multiple reference variables can point to the same object. 
A single reference variable cannot refer to two different objects at the same time.

**Example:**

```java
Car c1 = new Car();
Car c2 = new Car();

c1 = c2;
```

### Memory Breakdown

Initially:
```text
c1 → Car Object 1
c2 → Car Object 2
```

After assignment (`c1 = c2`):
```text
c1 → Car Object 2
c2 → Car Object 2
```

The **Car Object 1** does not have any reference variable pointing to it. Therefore, objects which do not have any reference variable pointing to them are eligible for **garbage collection**.

---

# Garbage Collection

**Definition:**
**Garbage collection** is the process of reclaiming unused runtime memory. In Java, it is not possible to explicitly delete data, but we can make an object eligible for garbage collection. The **JVM (Java Virtual Machine)** is responsible for conducting the garbage collection process.

## Steps to Make an Object Eligible for Garbage Collection

There are three ways to make an object eligible for garbage collection:

### 1. De-referencing the object of a reference variable
- Reassigning a reference variable to point to another object leaves the original object without a reference.

**Example:**

```java
Bus b = new Bus();
Bus b1 = new Bus();
b = b1; // The first Bus object is now eligible for GC
```

### 2. Assigning a null value to the reference variable

Removing the reference entirely by pointing it to `null`.

**Example:**

```java
Camera c1 = new Camera();
c1 = null; // The Camera object is now eligible for GC
```

### 3. Creating an anonymous object

Creating an object without assigning it to any reference variable.

**Example:**

```java
new Bus(); // Eligible for GC immediately after use
```

## Invoking Garbage Collection

In Java, we can externally suggest or invoke the garbage collector by using the following methods:

* `System.gc()`: The standard method to request garbage collection.
* `finalize()`: This method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object.

## Advantages of Garbage Collection

* **Memory Efficiency:** Unused memory is automatically reclaimed, making memory highly efficient.
* **Increased Performance:** Proper memory management increases the overall performance of the application.

---

## Specialized Classes

### Read-Only Class
- A class which contains only **getter methods** is called a **read-only class**. You can retrieve the data, but you cannot modify it after initialization.

### Write-Only Class
- A class which contains only **setter methods** is called a **write-only class**. You can modify or set the data, but you cannot retrieve it directly.

## Types of Non-Primitive Type Casting

In non-primitive type casting, there are two main types:
1. **Upcasting**
2. **Downcasting**

---

### 1. Upcasting

**Definition:**
**Upcasting** is the process of giving a subclass object to a superclass reference variable. 

**Example:**
```java
Vehicle v = new Car();
Food f = new Idli();
Animal a = new Lion();
Cloth c = new Shirt();
Sports s = new Football();
```

**Step-by-step Example:**
```java
Car c = new Car();

// Upcasting (assigning subclass reference to superclass reference)
Vehicle v1 = c; 
Object o = v1; 
```

---

### 2. Downcasting

**Definition:**
**Downcasting** is the process of giving a subclass object to a subclass reference variable from a superclass reference.

**Key Point:**
Direct assignment from a superclass reference to a subclass reference will cause a compile-time error. You must explicitly cast it.

**Example:**
```java
Vehicle v1 = new Car(); // Upcasting happens first

// Car c2 = v1;         -> Compile-time Error
Car c3 = (Car) v1;      // Valid Downcasting
```

#### ClassCastException

**Definition:**
A **ClassCastException** occurs at runtime when the code is syntactically correct but logically wrong. It happens when you try to downcast an object into a class type that it does not belong to.

**Example:**
```java
Vehicle v = new Bike(); // Upcasting: v points to a Bike object

// Car c4 = v;          -> Compile-time Error
Car c4 = (Car) v;       // Runtime Error: ClassCastException
```
*Memory/Reference Explanation:* Even though `v` is a `Vehicle` reference, the actual object in memory is a `Bike`. Therefore, it cannot be cast into a `Car` object at runtime.

---

### The `instanceof` Keyword

**Definition:**
The `instanceof` keyword is used to check the exact type of an object at runtime. It is widely used before downcasting to prevent `ClassCastException`.

**Example:**
```java
Food f1 = new Dosa(); // Upcasting

// Checking object type before downcasting
if (f1 instanceof Biryani) {
    Biryani b1 = (Biryani) f1;
} 
else if (f1 instanceof Dosa) {
    Dosa d = (Dosa) f1;
} 
else if (f1 instanceof MasalaDosa) {
    MasalaDosa m = (MasalaDosa) f1;
}
```

---

### Characteristics of Non-Primitive Casting

* **Inheritance is Mandatory:** To perform upcasting or downcasting, the classes must have an inheritance (IS-A) relationship.
* **Access Limitations:** By using a superclass reference variable, you can **only access inherited variables and methods** (members defined in the superclass).
* **No Subclass-Specific Access:** We **cannot** access subclass-specific variables and methods using a superclass reference, even if it points to a subclass object.
* **Method Overriding Behavior:** For overridden methods, when using a superclass reference, the **implementation from the subclass** is executed (runtime polymorphism), not the implementation from the superclass.

---
# Polymorphism

**Definition:**
**Polymorphism** is a process where a method of an object behaves differently according to the scenario. The word comes from **Poly** (meaning many) and **Morphism** (meaning forms or ways). 

### Binding

**Binding** is the process of combining a method call with its corresponding method logic.

#### Early Binding
- When the method call and the logic it will bind to are determined at the time of compilation, this process is called **Early Binding**.

#### Late Binding
- In **Late Binding**, the method call gets bound to its method logic at execution time, which is during runtime.

---

## Types of Polymorphism

1. **Compile-Time Polymorphism**
2. **Runtime Polymorphism**

### 1. Compile-Time Polymorphism

In **Compile-Time Polymorphism**, the compiler decides which method needs to be executed when a method is invoked. 

**Key Point:**
Compile-time polymorphism is achieved by using **Method Overloading**. This is an application of **Early Binding**.

**Example:**
```java
class Pooja {
    // Overloaded method 1
    public void talk() {
        System.out.println("Talking generally...");
    }

    // Overloaded method 2
    public void talk(String topic) {
        System.out.println("Talking about " + topic);
    }
}
```

*Explanation:* 
In the example above, when the `talk()` method is invoked in the main method, the compiler checks the arguments passed. Based on these arguments, the compiler decides which overloaded method to bind and execute (Early Binding).

### 2. Runtime Polymorphism

**Runtime Polymorphism** is a process where a method invocation gets bound to its method logic at the time of execution (runtime). This process is taken care of by the **JVM (Java Virtual Machine)**.

**Key Point:**
Runtime polymorphism is achieved by using **Method Overriding**. This is an application of **Late Binding**.

---

# Packages

**Definition:**
A **package** in Java is a mechanism to group related classes, interfaces, and methods together.

**Examples of Built-in Packages:**
* The `Scanner` class is from the `java.util` package.
* The `String` class is from the `java.lang` package.

### Advantages of Packages

* **Maintain Modularity:** Packages help organize code into logical, manageable components.
* **Maintain Reusability:** Classes and interfaces inside a package can be easily imported and reused across different parts of an application.
