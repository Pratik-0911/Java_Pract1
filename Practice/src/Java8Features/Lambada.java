package Java8Features;

public class Lambada {
    public static void main(String args[]){
//        Animal obj = new Animal() {
//            @Override
//            public void sound() {
//                System.out.println("done");
//            }
//        };
        Animal obj=(int o)-> System.out.println(o);
        obj.sound(9);
    }
}

interface Animal {
    void sound(int o);
}



