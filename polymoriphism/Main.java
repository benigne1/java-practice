package polymoriphism;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat=new Boat();
        Vehicle [] racers={car,bicycle,boat};
        for( Vehicle x:racers){
            x.go();
             

        }
        // car.go();
        // bicycle.go();
        // boat.go();
    }
}