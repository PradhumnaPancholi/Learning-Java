import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Again, Java");

        Car myCar = new Car(22.65,"GH6675G", Color.DARK_GRAY, true);
        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.BLACK);
        System.out.println(myCar.paintColor);

        //Scanner//
//        System.out.println("Enter a string");
//        Scanner input = new Scanner(System.in);
//
//        String userInput = input.next();
//
//        System.out.println("You entered:" + userInput);
//
//        String[] emplyees = {"Jim", "Dwight", "Creed", "Michael", "Andy"};
//        System.out.println(emplyees[1]);
//
//        System.out.println(Array.get(emplyees, 1));

        Employee newEmployee = new Employee("Pradhumna Pancholi",21, "Web Developer");
        newEmployee.promoteEmployee("Senior Web Developer");
        System.out.println(newEmployee.role);
    }
}