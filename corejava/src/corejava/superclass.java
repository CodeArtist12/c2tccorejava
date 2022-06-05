
public class superclass {

}
class SuperClass {
void methodsuper() {
System.out.println(&quot;I am a super class method&quot;);
}
}
// Inheriting SuperClass to SubClass
class SubClass extends SuperClass {
void methodSubclass() {
System.out.println(&quot;I am a sub class method&quot;);
}
}
class Main {
public static void main(String args[]) {
SubClass obj = new SubClass();
obj.methodSubClass();
obj.methodSuper();
}
}

class Bird {
void fly() {
System.out.println(&quot;I am a Bird&quot;);
}
}
class Parrot extends Bird {
void whatColourAmI() {
System.out.println(&quot;I am green!&quot;);
}
}
class SingingParrot extends Parrot {
void whatCanISing() {
System.out.println(&quot;I can sing Opera!&quot;);
}
}
class Main {
public static void main(String args[]) {
SingingParrot obj = new SingingParrot();
obj.whatCanISing();
obj.whatColourAmI();

obj.fly();
}

class Bird {
void fly() {
System.out.println(&quot;I am a Bird&quot;);
}
}
class Parrot extends Bird {
void whatColourAmI() {
System.out.println(&quot;I am green!&quot;);
}
}
class Crow extends Bird {
void whatColourAmI() {
System.out.println(&quot;I am black!&quot;);
}
}
class Main {
public static void main(String args[]) {
Parrot par = new Parrot();
Crow cro = new Crow();
//Call methods of Parrot Class
par.whatColourAmI();
par.fly();
//Call methods of Crow Class
cro.whatColourAmI();
cro.fly();
}
}

class A {
void testMethod() {
System.out.println(&quot;I am from class A&quot;);
}
}

class B {
void testMethod() {
System.out.println(&quot;I am from class B&quot;);
}
}
// Not possible to inherit classes this way But for
understanding let us suppose
class C extends A, B {
void newMethod() {
System.out.println(&quot;I am from subclass&quot;);
}
}
class Main {
public static void main(String args[]) {
C obj = new C();
obj.testMethod();
// Ambiguity here as its present in both A and B class
}
}
