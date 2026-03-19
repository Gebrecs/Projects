package courses;
public class Student {

    // the first four are instance variable
    String sName;
    final String S_ID;
    int yearOfStudy;
    double GPA;
    // the first three are static variable that means they are shareable
    static String universityName;
    static double passingGPA;
    static int sCounter;
    final static  int maxGPA=4;
    final static int minGPA=0;



    // main method

    public static void main(String[] args) {
        String  universityName="AAU";
        double passingGPA=1.5;
        Student s1 =new Student("Gebremariam","UGR/2596/17",4,3.14);
        Student s2 =new Student("Jonas","133/17",6,4.0);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

       boolean result= hasPassed(3.14);
       if(result==true){
           System.out.println("Student has passed");
       }else {
           System.out.println("Student has not passed");
       }

       // printing the total number of students

        System.out.println("The total number of students is " + getStudentCount());

    }

    // creating a parameterized constructor that initialize appropriate attributes when student object is created

    Student(String name,String ID,int year,double GPA){
        sName=name;
        S_ID=ID;
        yearOfStudy=year;
        this.GPA=GPA;
        sCounter++;


    }

    public static boolean hasPassed(double GPA){
        if(GPA>=passingGPA){
            return true;
        }else{
            return false;
        }
    }

    public  static int  getStudentCount(){
        return  sCounter;
    }

    // creating a method that shows the following things

    // student name
    // student id
    // years of study
    // GPA
    // university name

    public void displayStudentInfo(){
        System.out.println("Student "+sName+ " with ID "
                +S_ID+"  year of study "
                +yearOfStudy+"  and Grade Point Average "
                +GPA);

    }
}