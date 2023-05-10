// Run time Polymerphysm.
class Parients{
    void family(){
        System.out.println("Parients love their childrens.");
    } 
}
class Son extends Parients{
    void family(){
        System.out.println("Son is darling of his mother.");
    } 
}
class Daughter extends Parients{
    void family(){
        System.out.println("Daughter is darling of her mother and father(specially)");
    }
}
class Family{
    void familyMembers(Parients p){
        p.family();
        System.out.println("--------------------------------");
    }
}
public class java14 {
    public static void main(String[] args) {
        Parients p = new Parients();
        Son s = new Son();
        Daughter d = new Daughter();
        Family f = new Family();
        f.familyMembers(p);
        f.familyMembers(s);
        f.familyMembers(d);
        
        // f.familyMembers(p);
    }
}
