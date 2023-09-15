# homework3again
// Chapter 3 and 4 notes//

//Java enforces strong typing, meaning variables must hold values appropriate to their data type.

Attempting "Rabbit hopper = new Giraffe()" won't work because there's no inherent relationship between them. However, if Rabbit and Giraffe are subclasses of Animals, we can use "Animal hopper = new Rabbit()" because Rabbit is a subclass of Animal.

When initializing a float, "f" must follow the decimal value since Java assumes all floating points are doubles. Double is not the same as Float.

Java lacks an object datatype but has an object reference datatype.

We don't store objects directly in variables; instead, variables point to the object's memory location. Reference variables can share the same object, unlike primitive variables.

In contrast to primitive variables, object reference variables store bits that guide us to the object.

Objects reside in the garbage collection heap, becoming eligible for garbage collection when they lack references (they are "collected").

Arrays are objects, regardless of holding primitive values or object references.

State (instance variables) influences behavior (methods), and behavior, in turn, impacts the state.

A class serves as a blueprint for an object, describing how the JVM should create objects of that type.

Constructors are special methods defining rules for object creation. "super()" can call the parent class constructor within a child subclass constructor.

The superclass constructor executes before the subclass constructor.

For methods with parameters, you must supply appropriate arguments during invocation.

Methods can return values as long as the return type is declared in the method signature.

Setters and getters, both contained within classes, manipulate object instance variables.

Encapsulation, one of OOP's four fundamental concepts (alongside Inheritance, Polymorphism, and Abstraction), emphasizes restricting access to object components, often using access modifiers like private and protected.

Primitive and Reference types have distinct comparison methods. Primitive types compare values, while reference types check object memory locations.
