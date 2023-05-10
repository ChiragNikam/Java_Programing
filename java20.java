// Multi Threading by implementing Runnable intergace.
import java.util.Scanner;

class Calculator implements Runnable{
    public void run(){
        System.out.println("Enter numbers to get sum : ");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("Additition = " + (num1+num2));
    }
}

class Message implements Runnable{
    public void run(){
        System.out.println("Focus is very important.");
        System.out.println("Focus is very important.");
        System.out.println("Focus is very important.");
        System.out.println("Focus is very important.");
        System.out.println("Focus is very important.");
        System.out.println("Enter numbers to get sum (in Message): ");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("Additition = " + (num1+num2));
    }
}

public class java20 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Message m = new Message();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
