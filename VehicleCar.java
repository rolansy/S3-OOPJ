class VehicleCar {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Honk!!!");
    }
}

class Car extends VehicleCar{
    private String modelName="Mustang";
    public static void main(String[] args){

        Car myCar=new Car();
        myCar.honk();
        System.out.println("Model : "+myCar.modelName);
    }
}
