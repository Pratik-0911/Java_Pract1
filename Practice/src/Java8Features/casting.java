package Java8Features;

public class casting {
    public static void main(String args[]) {
//        double d = 6.9;
//        int i = (int) d;
//        System.out.println(i);
         A obj1= new A();
         obj1.show1();
         B obj2=new B();
         obj2.show1();
         obj2.show2();
         A obj3 = new B();
         B ref =(B) obj3;

//

    }
}
class A{
    public void show1(){
        System.out.println("Belong to A");
    }
}
class B extends A {
    public void show2(){
        System.out.println("belong to B");
    }
}
