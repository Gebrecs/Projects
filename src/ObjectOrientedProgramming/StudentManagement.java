package ObjectOrientedProgramming;
import java.util.Scanner;

public  class StudentManagement {
    String name;
    int rollNumber;
    int age;
    double height;
    String universityName="AAU";
    String department;


    // parameterized constructor that initializes the attributes of the object
    StudentManagement(String name, int rollNumber, int age, double height,String universityName, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.height = height;
        this.universityName = universityName;
        this.department = department;
    }
}
// let's create a class
class StudentsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to add?");
        int numberOfStudents = scanner.nextInt();
        StudentManagement[] students = new StudentManagement[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter the details of student " + (i + 1) + ": ");

            // Clear the buffer ONLY if this isn't the very first input of the loop
            // because nextInt() from "How many students" leaves a newline.
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Fix: Clear the newline after the number

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Fix: Clear the newline after the number

            System.out.print("Height in cm: ");
            double height = scanner.nextDouble();
            scanner.nextLine(); // Fix: Clear the newline after the number

            System.out.print("University Name: ");
            String universityName = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            students[i] = new StudentManagement(name, age, rollNumber, height, universityName, department);
        }


        //
        calculateAndDisplay(students);

    }

    // methods to calculate total age total height the oldest one and the youngest one

    public static void calculateAndDisplay(StudentManagement[] students) {


        System.out.println("--- Student List ---");
        for (StudentManagement student : students) {
            System.out.println("Name: " + student.name +
                    " | Roll: " + student.rollNumber +
                    " | Age:  "+ student.age+
                    " | Height: "+ student.height+
                    " | Dept: " + student.department +
                    " | University: " + student.universityName);
        }
        System.out.println("--------------------\n");
        double totalHeight = 0.0;
        int totalAge = 0;
        double longestStudentHeight = students[0].height;
        double shortestStudentHeight = students[0].height;
        int oldestStudentAge = students[0].age;
        int youngestStudentAge = students[0].age;
        for (StudentManagement student : students) {
            totalHeight += student.height;
            totalAge += student.age;

            if(student.height > longestStudentHeight){
                longestStudentHeight = student.height;
            }
            if(student.height < shortestStudentHeight){
                shortestStudentHeight = student.height;
            }
            if(student.age > oldestStudentAge){
                oldestStudentAge = student.age;
            }
            if(student.age < youngestStudentAge){
                youngestStudentAge = student.age;
            }
        }


        // calculate average height and average age of the whole student

        double averageHeight = totalHeight / students.length;
        int averageAge = totalAge / students.length;

        System.out.println("Total height of all students: " + totalHeight);
        System.out.println("Total age of all students: " + totalAge);
        System.out.println("Longest student's height: " + longestStudentHeight);
        System.out.println("Shortest student's height: " + shortestStudentHeight);
        System.out.println("Oldest student's age: " + oldestStudentAge);
        System.out.println("Youngest student's age: " + youngestStudentAge);
        System.out.println("Average height of all students: " + averageHeight);
        System.out.println("Average age of all students: " + averageAge);
    }
}
