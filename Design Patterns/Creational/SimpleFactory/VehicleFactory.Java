public class VehicleFactory{

    public static vehicle getVehicleType(string vehicleType){
        if vehicleType.equals("Car"){
            return new Car();
        }
        if (VehicleType.equals("Bike")){
            return new Bike();
        }
    }
}