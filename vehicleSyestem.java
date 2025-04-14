interface vehicle{
    default void start(){
       System.out.println("Start method");
    }
}
interface FuelVehile{
     static void refuel(){
        System.out.println("Refueling");
    }
}
class car implements vehicle,FuelVehile {
    public void run() {
        start();
        FuelVehile.refuel();
    }
}
class ElectricCar implements vehicle{
        @Override
        public void start(){
            System.out.println("Now Electric car is starting");
        }
    }
public class vehicleSyestem {
    public static void main(String[] args){
        car obj=new car();
        obj.run();
        ElectricCar obj1=new ElectricCar();
        obj1.start();
    }

}
