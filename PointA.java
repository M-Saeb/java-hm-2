import java.util.ArrayList;

public class PointA {

    public static void main(String args[]){
        // testing the function
        ArrayList<Car> cars = search("make-02");
        for(Car car: cars){
            System.out.println("Car ID: " + car.id);
        }
    }

    public static ArrayList<Car> search(String brandName){
        Car[] allCars = Data.getData();
        ArrayList<Car> filtredCars = new ArrayList<Car>();
        for (Car car: allCars){
            if(car.make == brandName){
                filtredCars.add(car);
            }
        }
        return filtredCars;
    }
}
