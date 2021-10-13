package Day3;

class parent {
void view() {
  System.out.println("This is a parent class method");
 }
}
class Child extends Inheritance1 {
  void view() {
   System.out.println("This is a child class method");
  }
}
class Inheritance1{
 public static void main(String args[]) {
  parent obj = new parent(); //Parent class
  obj.view();
  Child obj2 = new Child(); //Child class
  obj2.view();
 }
}


