package L01_Java;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //to find sum and multiply
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter integer num: ");
//        int num1 = scan.nextInt();
//        System.out.println("Enter double num: ");
//        double num2 = scan.nextDouble();
//        System.out.println("Sum:" + (num1 + num2));
//        System.out.println("Multiply:" + (num1 * num2));


        //TO GET USER INFO

        Scanner scan  = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.next();
        System.out.println("Surname: ");
        String surname = scan.next();
        System.out.println("Age: ");
        int age = scan.nextInt();
        System.out.println(
                "Name: " + name +
                "\nSurname: " + surname +
                "\nAge: " + age
        );
    }
}
