package Question_4;
import java.util.Arrays;
import java.util.List;
/* 4).WAP using java 8:
Collect all  even numbers from a list using stream*/
public class Streamclass {
public static void main(String[] args) { 
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
numbers.stream().filter(value -> value % 2 == 0).forEach(System.out::println); 
} 
} 

//out put
/* 2
4
6
8
10*/