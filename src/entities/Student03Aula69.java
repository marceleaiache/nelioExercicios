package entities;

public class Student03Aula69 {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }

    }

    public String  checkIfPassed() {
        String result;

        if (finalGrade() < 60.0) {
            result = "FAILED" + "\nMISSING " + String.format("%.2f POINTS", missingPoints());
        } else {
            result = "PASS";
        }
        return result;
    }

    public String toString() {
        return  "FINAL GRADE =  "
                + String.format("%.2f", finalGrade())
                + "\n"
                + checkIfPassed();
    }
}