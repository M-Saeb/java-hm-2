import java.util.ArrayList;

public class PointB {

    public static void main(String args[]){
        // testing the function
        ArrayList<Car> cars = search("model-b", 2014);
        for(Car car: cars){
            System.out.println("Car ID: " + car.id);
        }
    }

    public static ArrayList<Car> search(String modelName, int year){
        Car[] allCars = Data.getData();
        ArrayList<Car> filtredCars = new ArrayList<Car>();
        for (Car car: allCars){
            if(car.model == modelName && car.manufactureYear < year){
                filtredCars.add(car);
            }
        }
        return filtredCars;
    }
}
