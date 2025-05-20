# 🏭 Java Factory Pattern – Internship Guide

## 🎯 What is the Factory Pattern?

The **Factory Pattern** is a design pattern used to create objects **without exposing the exact class** that is being instantiated.

> You ask the factory for a product (e.g., a shape, a vehicle), and it returns the correct object **based on your request**.

---

## 🧩 When to Use It

Use the Factory Pattern when:
- You need to create objects based on **dynamic input**
- You want to **decouple** your code from specific class names
- You expect to **add new object types** in the future

---

## 🧠 Core Benefits

| Problem                     | Factory Solution              |
|-----------------------------|-------------------------------|
| Too much `new ClassName()` everywhere | Centralize object creation |
| Adding new types breaks code | Add once in factory only     |
| Logic tightly coupled to class types | Use interfaces and abstractions |

---

## 🔧 Structure

### 1. **Interface (or abstract class)**

Defines the common behavior.

```java
public interface Drawable {
    void draw();
}
2. Concrete Classes
Each class implements the interface.

java
Always show details

Copy
public class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
3. Factory Class
Creates and returns the correct object based on input.

java
Always show details

Copy
public class ShapeFactory {
    public static Drawable getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
4. Client Code (Main or App)
Calls the factory and works with the returned object.

java
Always show details

Copy
public class Main {
    public static void main(String[] args) {
        Drawable shape = ShapeFactory.getShape("circle");
        shape.draw();  // "Drawing a circle"
    }
}
✅ Why This Matters for Internships
You’ll often be working with services, tools, or components chosen at runtime.

Factory helps you keep code clean, maintainable, and extensible.

Common in frameworks like Spring, Android, or enterprise apps.

🧠 Tips to Remember
Return interfaces or abstract types — not concrete classes

Don’t put too much logic in the factory

Pair well with other patterns like Strategy, Builder, and Dependency Injection

💡 Real-World Use Cases
NotificationFactory.getNotifier("email") → sends Email or SMS

DatabaseFactory.getConnection("postgres") → returns PostgreSQL or MySQL connector

FileParserFactory.getParser("json") → returns XML or JSON parser

Spring or Android use factories behind the scenes constantly

🔁 Challenge Practice
Implement a VehicleFactory that returns Car, Truck, or Motorcycle

Implement a PaymentFactory that returns CreditCardPayment, CryptoPayment

Build a MediaFactory that creates Audio, Video, or Image objects
"""