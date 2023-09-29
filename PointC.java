import java.util.ArrayList;

public class PointC {

    public static void main(String args[]){
        // testing the function
        ArrayList<Car> cars = search(2000, 20000.00);
        for(Car car: cars){
            System.out.println("Car ID: " + car.id);
        }
    }

    public static ArrayList<Car> search(int year, Double price){
        Car[] allCars = Data.getData();
        ArrayList<Car> filtredCars = new ArrayList<Car>();
        for (Car car: allCars){
            if(car.manufactureYear == year && car.price > price){
                filtredCars.add(car);
            }
        }
        return filtredCars;
    }
}
