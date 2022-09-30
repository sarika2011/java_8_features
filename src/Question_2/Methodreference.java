package Question_2;
/* 2)Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created*/

public class Methodreference {

    static void display() {
        int a = 5;
        int b = 10;
        int mul = a * b;
        System.out.println("Static method returns multiplication:" + mul);
    }

    void display2() {
        int a = 30;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        System.out.println("Instance add method returns sum:" + sum + "and returns substraction:" + sub);

    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MethodReferenceInterface methodreferenceinterface = Methodreference ::display;
        methodreferenceinterface.print();

        Methodreference  methodreference = new Methodreference() ;
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print();
    }
}

interface MethodReferenceInterface {
    void print();
}
//output
//Static method returns multiplication:50
//Instance add method returns sum:50and returns substraction:10
