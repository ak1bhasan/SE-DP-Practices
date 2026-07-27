import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];

    Student(String name) {
        this.name = name;
    }

    void inputMarks() {
        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < 5; i++ ) marks[i] = sc.nextInt();
    }

    double calculateAverage() {
        double sum = 0;
        for( int i = 0; i < 5; i++ ) {
            sum += marks[i];
        }
        return sum / 5;
    }

    void displayResult() {
        System.out.println("Student : " + name);
        System.out.println("Average : " + calculateAverage());
    }

}

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Student s = new Student(name);
        s.inputMarks();
        s.displayResult();

    }
}
