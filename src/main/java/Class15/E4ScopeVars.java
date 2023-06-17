package Class15;
/*
there are 3 variables in respect to scope. Local, instance and static variables

Local variables:
a variable that is local to a block of code and cannot be accessed outside of it
for example methods, if statements, switch case statements, loops etc.
benefits:
 -created outside of block of code like method, loop, if stat, but they are
inside of a class
-we can reuse the same the same name for the other variables in other blocks of code.
Downside:
-Limited visibility, cant be used outside of block of code in which its created
-Initialization is mandatory for local variables, and failure to do so results in compilation error

Instance variable:
created outside of any block of code like method, loop etc.
upside:
-can be used without initializing
-shared betweed all instance methods of a class
downside:




Static Variables:
all the instance variables with static keyword are called static variable.
Local vars cannot be static
 */
public class E4ScopeVars {
    int age;//instance

    public static void main(String[] args) {
        double weight=30;//local

    }
}
