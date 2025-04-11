# My notes for class 04/08/25 - 04/11/25

## What i learnt
 - We learnt about git and how to create projects in java
 - I learnt about the Math function 
 - Post and Pre increment
 - Type casting in Java 

## Questions
 - I'm seeking understanding on -u and why we didn't cover it 
 - What's the diff between git add . and git add -A
 - what's the diff between git push and git push origin main 
 - Why do this files always show up after you create a new project:
   - 	 .DS_Store
   -     MathApplication/.gitignore
   -     MathApplication/pom.xml
   -     MathApplication/src/main/java/org/
 - javadoc and what does API documentation mean 
 - When you create packages, do you use the main java to create your files or the package one 
 - 

## Random thing i learned is that 
 - Learn up to 5 programming languages and start to see the similarities and diff between them 
 - You can set src as source root in the mark directory to access project packages

## Important Facts 
 - Java file must start with an uppercase letter and match the name of the class it contains
 - We don't have to initialize a variable e.g
 - int num1;
 - long num2; 
 - **in python i believe you have to make it equal to something**  
 - Expressions something evaluates to a single value
 - if the result is a float point value, it must be assigned to a
   floating point variable
 - You can place underscore between long digits to make them more readable 
  - Ex: long creditCard = 5200_7500_6500_0001L;
- When you take a variable or expression and assign it to a
  variable of a wider data type, there are no errors and it is
  considered a "safe" process
  - byte -> short -> char -> int -> long -> float -> double
- When you take a variable or expression and assign it to a
  narrower variable, the compiler will generate an error
  - It means there is a "chance" that a value in the source variable
    might now fit in the narrower variable
- Sometimes you know that a narrowing assignment is
  okay and can force the compiler to make the assignment
  using type **casting**
  - This is often needed because you are calling a function
    whose return type you can't control
  - Ex: float num = 2.2;
    // if you don't cast the result, you have to store
    // the value in a double variable
    float result = (float) Math.pow(num, 2);
  - Because the Math class is involked with a double parameter and returns a double most of the time 
  - 


## Java essentials
 - java as a concat method:
   - Ex: public class Main {
     public static void main(String[] args) {
     String firstName = "John ";
     String lastName = "Doe";
     System.out.println(firstName.concat(lastName));
     }
     }
   - Outputs: John Doe
 
- Using printf()
  - Syntax: 
  - % [flags] [width] [.precision] type-character
  - Type characters include:
  - d decimal integer (base 10 number)
  - x or X hexadecimal integer (base 16)
  - f floating point number
  - s string
  - c character

