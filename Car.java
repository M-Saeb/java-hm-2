public class Car{

    public String id;
    public String make;
    public String model;
    public int manufactureYear;
    public String color;
    public Double price;
    public String registrationNumber;


    public Car(
        String id,
        String make,
        String model,
        int manufactureYear,
        String color,
        Double price,
        String registrationNumber
    ){
        this.id = id;
        this.make = make;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }
}