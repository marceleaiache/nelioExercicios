package application;

import entities.Employee02Aula69;
import java.util.Locale;
import java.util.Scanner;

public class Program02Aula69 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Employee02Aula69 employee = new Employee02Aula69();

        System.out.println("Enter new employee: ");

        System.out.println("Name: ");
        employee.name = leia.nextLine();

        System.out.println("Gross salary: ");
        employee.grossSalary = leia.nextDouble();

        System.out.println("Tax: ");
        employee.tax = leia.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary? ");
        double percentage = leia.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        leia.close();



    }

}
