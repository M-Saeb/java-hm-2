public class Data{
    public static Car[] getData(){
        Car cars[] = {
            new Car("aaa", "make-01", "model-a", 2015, "black", 2000.99, "reg-0001"),
            new Car("bbb", "make-02", "model-b", 2014, "white", 1050.99, "reg-0002"),
            new Car("ccc", "make-02", "model-b", 2000, "black", 15000.00, "reg-0003"),
            new Car("ddd", "make-03", "model-c", 2000, "blue", 30000.00, "reg-0004"),
        };
        return cars;
    }
}