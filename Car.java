class Car{
    private int numberOfWheels;
    private String color;
    public Car(String color, int numberOfWheels){
        //here i setting the color attribute to the value from the color parameter....
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor() {
        //and the we must generate getter....
        return color;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}