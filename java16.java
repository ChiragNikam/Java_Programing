// Interface
/**
 * Innerjava16 - it is an interface. Variables decleared in it are public static final by default.
 */
interface Innerjava16 {
    int a = 3;
    void seta();
}
public class java16 {
    public static void main(String[] args) {
        // objects of an interface cannot be made.
        // Innerjava16 a= new Innerjava16();  This will give error.
        System.out.println(Innerjava16.a);        
    }
}
