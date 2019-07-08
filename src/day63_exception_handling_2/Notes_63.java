package day63_exception_handling_2;

public class Notes_63 {
	/*
	 * Java day 63:
Exceptions in Java.
Exception Handling in Java.

Java + Selenium webdriver + Maven + TestNG
===============================================

Recap:

How do you exception handling?
try{

}catch(Throwable t){

}

try{

}catch(RuntimeException t){

}


try{

}catch(ArrayIndexOutBoundsException t){

}
============================

finally : code runs all the time.
-> it runs even if exception happens or not
-> it runs even if exception happened and was not catch successfully

try{
protected code
}catch(NullPointerException e) {
//code
}finally{
//code that runs always
}

1) System.exit(0)
2) JVM crash
====================

2 Types of Exceptions:

1) Checked Exceptions:
-> they need to be HANDLED or DECLARED for the code to compile.
-> Code will not compile unless HANDLED /DECLARED.
-> All subclass of Exception, except RuntimeException(and its subclasses)


2) Unchecked Exceptions:
-> Code will compile even if we handle or not
-> RunTimeException and all its Subclasses 
-> Happens due to programming mistakes
-> it is optional to handle them
-> Declaring Unchecked exceptions is also optional and will only serve as a documentation 
==============================

COMBINATIONS:
1) try{

}catch(Exception e) {

}
2) try{

}catch(Exception e) {

}finally{

}
3) try{

}catch(IndexOutOfBoundsException e) {

}catch(NullPointerException e) {

}catch(RuntimeException e) {

}catch(Exception e) {

}
4) try{

}catch(IndexOutOfBoundsException e) {

}catch(RuntimeException e) {

}catch(Exception e) {

}finally{

}

5) try{

}finally{

}

6) try{} by itself does not work, compile error!
=======================================

SEPTEMBER 17 | LAST CLASS

Review Session - 7 - 10.
End of September
----------------

==========================================

EXCEPTIONS:

Multiple Catch Blocks:

When doing exception handling, we can use multiple catch blocks. 
We can use this structure when we need to catch specific types of exceptions and do specific actions for those.

try{
A,B,C
}catch(ArrayIndexOutBoundsException e) {
//code to handle it
}catch(NoSuchElementException e) {
//code to handle it
}catch(Exception e) {

}

try{

}catch(Exception e) {

}
------>
1. RULE when using multi-catch block:
parent exception type needs to be after it's subclass exception types.

Exception > RuntimeException > Arithmetic
> Nullpointer
> ClassCast 
etc

1) Will not compile: Unreachable code/catch block
try{

}catch(ArithmethicException e){

}catch(ArithmethicException e){

}

2) Good
try{

}catch(ArithmethicException e){

}catch(NullpointerException e){

}


2) Will not compile: Unreachable code/catch block
try{

}catch(Throwable e){

}catch(NullpointerException e){

}

3)GOOD
try{

}catch(NullpointerException e){

}catch(RuntimeException e){

}catch(Throwable t) {

}

---------
We can also add finally block to multi-catch block.

try{

}catch(NullpointerException e){

}catch(RuntimeException e){

}catch(Throwable t) {

}finally{

}
==============================

OR ( | ) logic in catch block. We can group exceptions into single catch block, separated by pipe | .
We can use this structure when we need to do same actions to certain types of exceptions.

try{
A
B
}catch(ClassCastException | NullPointerException e){

}

Exception types cannot be sub-parent types

==============================

TRY WITH FINALLY. No Catch block.

try{
A
B
C
}finally{
J
}
Q
----------

1) All good.
A, B, C, J, Q
2) Exception at B:
A, J and code stops

3) Exception at J.
A,B,C and code stops

4) Exception at Q.
A,B,C,J and code stops
=================================

THROW AND THROWS

throw keyword: to create exception programmatically

throws keyword: to declare that method throws some exception

======================

 

Exception in thread "main"
java.lang.RuntimeException: UserName cannot be empty
at day63_exceptions02.ThrowAndThrows.main(ThrowAndThrows.java:9)


thread "main" > main thread, from main method
java.lang.RuntimeException: -> exception type/class
UserName cannot be empty --> message for the exception

at day63_exceptions02.ThrowAndThrows.main(ThrowAndThrows.java:9)
package.class.method.(Filename: line number)

 

using throw keyword, we can create exceptions programmatically/manually. 
When java runs that line, it throws an exception and stops the code. 
throw new RuntimeException();

We can also add a message:

throw new IllegalArgumentException("Invalid Firstname");

Exceptions are objects in Java, they come from specific classes.

thats why we need to use new keyword to create an exception during runtime.

throw new NullPointerException("Cannot be null");
=======

When you throw new CHECKED EXCEPTION, code will not compile.
-> we need to use try catch to handle or declare using throws keyword.

========================

THROWS keyword is used to declare an exception and it is placed in the method definition line.

public void turnOnPower() throws IOException {

}

public void sleep(int seconds) throws InterruptedException {
Thread.sleep(seconds * 1000);
}

When a line of code throws a CHECKED exception, we need to do following for it to compile:


public static void sleep(int seconds){
Thread.sleep(seconds * 1000);
}

1) HANDLE using try catch block

public static void sleep(int seconds){
try{
Thread.sleep(seconds * 1000);
} catch(InterruptedException e) {
e.printStackTrace();
}
}

2) DECLARE using throws keyword

public static void sleep(int seconds) throws InterruptedException{
Thread.sleep(seconds * 1000);
}

When you declare a CHECKED exception like above, 
Whoever CALLS this method is responsible to HANDLE it or DECLARE AGAIN.

 

public static void sleep(int seconds) throws InterruptedException{
Thread.sleep(seconds * 1000);
}


public static void sleep2(int seconds) throws InterruptedException{
sleep(seconds);//UNHANDLED CHECKED EXCEPTION
}


public static void sleep3(int seconds){
try{
sleep2(seconds);//UNHANDLED CHECKED EXCEPTION
}catch(InterruptedException e){
//code
}
}

In this case main method can just call the sleep3 method.
since sleep3 is handling the CHECKED EXCEPTION already.

public static void main(String... args) {
sleep3(4);
}

THROWS keyword goes to method definition line and whoever calls this method MUST handle or declare the exception.
=========================================

We can declare both checked and unchecked exceptions:

-> when we declare checked exceptions, the method will pass the responsibility to caller of the method.

-> when we declare unchecked exceptions, it is only used for documentation purposes and does not put any responsibility to the caller.

================

THROW VS THROWS :

throw keyword: is used to create exception programmatically.

throw new NumberFormatException("Format does not meet requirements");

We can throw both checked and unchecked exceptions:

checked:
throw new SQLException();
HANDLE:
try{
throw new SQLException();
}catch(SLQException e) {
//code
}

DECLARE:
public void connectToDB() throws SQLException{
throw new SQLException();
}

unchecked:
if(amount > limit) {
throw new RuntimeException("Amount is too large");
}
=================================

THROWS keyword, it can only be used in METHOD declaration part.

if a method throws a checked checked exception:

public static void playWithMatches() throws Exception{
System.out.println("Playing with matches can cause fire");
}
Caller is responsible to HANDLE OR DECLARE.


if a method throws a unchecked checked exception:
public static void playSoccer() throws RuntimeException {
System.out.println("Playing soccer with friends");
}

Caller is not responsible for anything, code will compile.
It is optional to use try catch to handle.

==================================

IQ: HOW TO CREATE CUSTOM EXCEPTIONS?

We can create a class that extends RuntimeException or Exception to create our custom exceptions.

HOW TO CREATE AN UNCHECKED EXCEPTION:
Create a class that extends RuntimeException.

public class HungryException extends RuntimeException{

}

public class UnsuffientFundsException extends RuntimeException{

}


HOW TO CREATE A CHECKED EXCEPTION
create a class that exception EXCEPTION / THROWABLE

public class NeedSomeCoffeeException extends Exception {
public NeedSomeCoffeeException() {}

public NeedSomeCoffeeException(String message) {
super(message);
}
}
================================

Summary:

Exception handling in java:

How to do:
try catch
try catch catch catch
try catch finally
try finally

Types of exceptions:
ERROR -- CHECKED EXCEPTIONS -- UNCHECKED EXCEPTIONS

THROW keyword to create exception programmatically

THROWS keywords to DECLARE that method throws an exception

CUSTOM Exceptions:
Custom checked exception: if you extend Throwable/Exception
Custom unchecked exception: if you extend RuntimeException

========
How to know if some method call, is checked or unchecked.

When you call a method, if it compiles, it does not throw a checked exception.

-----------
IQ: How do you know if a certain exception type is CHECKED or UNCHECKED?

1) Look at hierarchy, if that exception extends RuntimeException then it is an UNCHECKED exception
if that exception extends Exception, Throwable or any other Checked Exception, then it is CHECKED exception.

2) Throw it, if it compiles, it is a UNCHECKED exception, if not it is a CHECKED exception.

throw new SomeException();
=================================


Monday: Master Muhtar session
Mentoring session

Tues/Wend - Office hours, Selenium class.

Thursday - July 4th - Independence Day - No School
Campus is open - Self study - Mock interviews
================================

Next Sunday : Collections Framework
================================
	 */

}
