// Polimorphism
class Airplane{
    public void takeoff(){
        System.out.println("Airplain taking off.");
    }
    public void fly(){
        System.out.println("Airplanes Flying.");
    }
}
class CargoPlane extends Airplane{
    public void takeoff(){
        System.out.println("Cargo Plane taking off.");
    }
    public void fly(){
        System.out.println("Cargo Plane flying at very high hight.");
    }
}
class PasengerPlane extends Airplane{
    public void takeoff(){
        System.out.println("Pasenger Plane taking off.");
    }
    public void fly(){
        System.out.println("Pasenger Plane flying at medium hight.");
    }
}
public class java13 {
    public static void main(String[] args) {
        PasengerPlane p = new PasengerPlane();
        
        CargoPlane c = new CargoPlane();

        Airplane a;
        // 'a' refring to object of PasengerPlane.
        a = p;
        a.takeoff();
        a.fly();

        // 'a' refring to object of CargoPlane.
        a = c;
        a.takeoff();
        a.fly();

        // now 'a' is changed to local variable of Airplane.
        a = new Airplane();
        a.takeoff();
        a.fly();
    }    
}
