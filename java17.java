import java.io.BufferedReader;
import java.util.Scanner;

// Interface Implementation.
/**
 * A
 */
interface A {
    public void showA();
    default public void setA(){}
    default public void faltu(){};
}
interface B extends A{
    public void showB();
}
class I implements B{
    public void showA(){
        System.out.println("In ShowA");
    }
    public void showB(){
        System.out.println("In ShowB");
    }
}
public class java17 {
    public static void main(String[] args) {
        I obj = new I();
        obj.showA();
        obj.showB();
        String str[] = new String[4];
        str[0] = str[0] + "Jai Hind";
        for(int i = 0; i < str[0].length(); i++)
            System.out.print(str[0].charAt(i));
    }    
}
