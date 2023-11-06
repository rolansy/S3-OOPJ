import java.util.Scanner;


public class ZeroDivException {
    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);  
        try{
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            int c=a/b;
            System.out.println("The result is: "+c);
        }
        catch(AirthmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program ends");
        }
    }
}