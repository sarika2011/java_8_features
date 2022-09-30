package Question_1;
/*1).Write the following a functional interface and implement it using lambda:
First number is greater than second number or not Parameter (int ,int ) Return boolean
Increment the number by 1 and return incremented value Parameter (int) Return int
Concatination of 2 string Parameter (String , String ) Return (String)
Convert a string to uppercase and return . Parameter (String) Return (String) */

public class Question1 {

    public static void main(String[] args) {

        concatenation c = (String a, String b) -> a + b;
        System.out.println(c.concat("hello", "world"));
        greater g = (int a, int b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        System.out.println(g.max(5, 6));
        increment i = (int a) -> ++a;
        System.out.println(i.inc(5));
        convertupper u = (String a) -> a.toUpperCase();
        System.out.println(u.convert("hello"));

    }
}
interface concatenation {
    String concat(String a, String b);
}
interface greater {
    boolean max(int a, int b);
}
interface increment {
    int inc(int a);
}
interface convertupper {
    String convert(String a);
}
//Output
// helloworld
//false
//6
//HELLO