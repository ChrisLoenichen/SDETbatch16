package Class16;
/*
Static Keyword:
static is a keyword that can be used with variables, methods, classes, etc.
when we use this keyword with a variable that variable becomes static variables.
when we use them with methods those methods become static methods
Static variables:
    static variable can be accessed in all types of methods (instance, static).
    They can also be accesed in multiple objects of a class.
    Only one memory location for static variables.
Static methods:
**instance methods can have diff behaviours depending on the method calling them**
 no instance variables allowed.
 static methods will have same behavior across all intances of a class
 note:
 1) We can call the methods by just writing their name if we are in the class.
 however if were in a different class we need to write class before the method name
 if we want to call it.

 Access Modifiers:
    Controls the access of entities like variable methods. There are 4 access levels
    in java. 1) private 2)default 3)protected 4)public. To apply these access levels
    Private: If we write private keyword with any variable method constructor and only accessable in class
    Default: can be accessed inside same class and package and does nto require keyword
    Protected: **will be discussed after inheritance
    Public: it will be public to all of the PROJECT

Best ways to know when to use which access level:
1.    fields/properties/instance variables=>private 99.99999 of the time
2.    methods 70-80% of time will be declared as public
3.    98 to 99 of time classes are declared as public

 */

public class E1Static {
}
