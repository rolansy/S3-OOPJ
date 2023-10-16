
class Vehicle{
    String brand;

    public void drive(){
        System.out.println("Driving the vehicle");
    }

}

class Car extends Vehicle{
    int wheel;
    public void honk(){
        System.out.println("Car is Honking");
    }
}

class Bicycle extends Vehicle{
    int pedal;
    public void ring(){
        System.out.println("Bicycle is ringin bell");
    }
}


public class Inheritence {
    public static void main(String[] args){


    }
}
