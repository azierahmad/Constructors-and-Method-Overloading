public class CarTest {
    public static void main(String[] args) {
        Car theCar = new Car("white", 4);
        String color = theCar.getColor();
        int numberOfWheels = theCar.getNumberOfWheels();
        System.out.println("The car color is " + color + ", and the number of wheels is " + numberOfWheels);
    }
}
