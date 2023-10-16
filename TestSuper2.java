class Animal{
    void eat(){
        System.out.print("Eating..");
    }
}
class Dogg extends Animal{
    void eat(){
        System.out.print("Eating Bone..");
    }
    void bark(){
        System.out.println("Barking");
    }
    void work(){
        super.eat();
        bark();
    }
}
public class TestSuper2 {
    public static void main(String[] args){
        Dogg d=new Dogg();
        d.work();
    }
}
