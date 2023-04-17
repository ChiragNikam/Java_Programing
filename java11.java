import java.util.Scanner;

/*
    Strings - Memory maping of strings.
    == : is used to compare refrences of the string not values.
    equal() : is used to compare values of the string.
 */
public class java11 {

    public static void main(String[] args) {
        String s1 = "abcd"; // this will make place for s1 in String Constant Pool, where duplicates are not
                            // allowed.
        String s2 = "abcd";
        String s3 = new String("abcd"); // this will make place for s3 in Heap area, where duplicates are allowed.
        String s4 = new String("Geeks");
        System.out.println(s1 == s2);
        // == and equal()
        System.out.println(s2 == s4);
        System.out.println("" + s2.equals(s4));
        System.out.println(s4.length());
        Reverse r = new Reverse();
        System.out.println(r.reverseWord(s4));
        Scanner read = new Scanner(System.in);
        String name[] = new String[3];
        for (int i = 0; i < 3; i++)
            name[i] = read.next();
        for (int i = 0; i < 3; i++)
            System.out.println(name[i]);
    }
}

class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        String temp = new String();
        // Reverse the string str
        // str = new String();
        int end = str.length() - 1;
        int start = 0;
        while (start <= end) {
            temp += str.charAt(end);
            end--;
        }
        return temp;
    }
}