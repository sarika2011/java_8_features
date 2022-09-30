package question_3;
/*3)Create a thread using lambda function*/
public class Lanbdafunction {

    public static void main(String args[]) {
        // Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 Created...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        // Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 Created...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
//Output
//Thread1 Created...
//Thread2 Created...