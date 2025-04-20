# My notes for class 04/14/25 - 04/18/25

## New thing i learned 
- I learnt about string builders 
- Java Methods 
- Java classes
- Stacks and Heaps 
- String[]
- Date formatter 
- Static vs Non static

## Questions i have 
- Are java fields same as Python class attributes

## More on...
Static vs Non static 
- Non static applies (can only be called) to individual class objects not to the class itself
- You can call static methods on classes 
- You can make Static Field (often private not to be manipulated by other programs) 
if that's something that is going to be shared by the whole class 
- A non static field can't be referenced from like a static context
but you can access static fields or methods from an individual object - it's discouraged
- Access Static through class for clarity 

Stacks and heaps 
- Last in first out - stack memory. In stack you store data in different sequence 
- Evey method will have it's on stack, stacks are split in multiple rows and 2 columns
containing a key and value pair 
- Heaps, expand more like an open space
- Objects are created in the heap memory, having two sections - All instance 
variable and methods declarations
- Heaps have their own address and will be stored in the stack with the variable 
assigned at instance creations. 
- when you call a variable.method() we start execution form main and the value
will be address and it will connect to the heap address 