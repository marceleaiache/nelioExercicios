package application;

import entities.Student03Aula69;

import java.util.Scanner;

public class Program03Aula69 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Student03Aula69 student = new Student03Aula69();

        System.out.println("Enter student: ");
        System.out.println("Name: ");
        student.name = leia.nextLine();

        System.out.println("Grade 1: ");
        student.grade1 = leia.nextDouble();

        System.out.println("Grade 2: ");
        student.grade2 = leia.nextDouble();

        System.out.println("Grade 3: ");
        student.grade3 = leia.nextDouble();

        System.out.println(student);
        leia.close();

    }
}
