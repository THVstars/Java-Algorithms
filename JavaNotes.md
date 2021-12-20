Topics: Arrays, Objects, OOP

Questions:

-What is/are _?
-What is/are _ useful for?
-How is/are _ used/implemented in JS vs Java?

Notes:

1. Primitive vs Reference Values:

-Variables store values.
-Values can be primitive or reference types.
-JS primitive types: undefined, null, boolean, number, string, symbol.
-JS reference types: object.
-Primitive types have a fixed size.
-Reference types have a dynamic size.
-Variables containing primitive values are accessed by their actual value.
-Variables containing reference types are accessed by their reference.
-The typeof operator determines what type a primitive value is.
-The instanceof operator determines what type a reference value is.
-Arrays are reference types because they're a type of object.
-With primitive types, when you assign one variable the value of another variable, the value of the two variables is stored in two separate locations. They are independent of one another.
-With reference types, when you assign one variable the value of another variable, the value of the two variables is stored in the same location: both variables refer to the same reference. They are not independent of each other. Any changes made to either variable will also be reflected in the other variable.

2. Working with Objects:

-Objects are collections of properties.
-Properties are associations between names (keys) and values (key:value pairs).
-If the value of a property is a function, the function becomes known as a method.
-JS object properties are just like variables, except they're attached to objects.
-Object properties define the characteristics of objects.
-Use dot-notation (object.propertyname) to access object properties.
-Object and property names are case-sensitive, the same as variables.
-Object properties can be defined in two ways:
    Example 1: let myCar = new Object();
               myCar.make = 'Ford';
    Example 2: let myCar = {
               make: 'Ford',
               };
-Unassigned properties of an object are undefined, not null.
-Object properties can also be accessed using bracket notation (object['propertyname']).
-Bracket notation is useful because it can access properties that have unconventional names, such as names with spaces in them.

3. Java - What is OOP?

-OOP stands for Object-Oriented Programming.
-Procedural Programming: Writes procedures or methods that perform operations directly on data.
-Object-Oriented Programming: Creates objects that contain both data and methods.
-Advantages of OOP: 
    1. Faster.
    2. Easier to execute.
    3. Provides clear structure for programs.
    4. Keeps Java code DRY (Don't Repeat Yourself).
    5. Makes code easier to maintain, modify and debug.
    6. Makes it possible to create full, reusable applications with less code and shorter development times.
-DRY (Don't Repeat Yourself Principle): Avoid repetition in your code by extracting out the blocks of code that are common in your application, placing them in a single location, and reusing them.
-The two main aspects of object-oriented programming are classes and objects.
    Example: Class: Fruit
             Objects: Orange, Strawberry, Banana
-A class is a template for objects.
-An object is an instance of a class.
-When individual objects are created, they inherit all the variables and methods contained in their class.