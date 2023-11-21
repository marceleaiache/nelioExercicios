package application;

import entities.RectangleEx01Aula69;
import java.util.Scanner;

public class Program01Aula69 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        RectangleEx01Aula69 rectangle = new RectangleEx01Aula69();

        System.out.println("Enter the width and height of rectangle: ");
        rectangle.width = leia.nextDouble();
        rectangle.height = leia.nextDouble();

        System.out.println(rectangle);

        leia.close();

    }
}
