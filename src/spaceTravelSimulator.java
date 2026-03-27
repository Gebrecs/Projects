import java.util.Scanner;
import java.util.Arrays;

public class spaceTravelSimulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String [] astronautNames = new String[10];
        int [] astronautAges = new int[10];
        String [] astronautMissionStatus = new String[10];

        int astronautCount=0;

        // choice menu

        while(true){
            System.out.println("Choose an option:");
            System.out.println("1. Add astronaut to mission");
            System.out.println("2. Update astronaut's mission status");
            System.out.println("3. Display all astronauts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            // accepting user input

            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the name of the astronaut:");
                    String astronautName=scanner.nextLine();
                    System.out.println("Enter the age of the astronaut:");
                    int astronautAge=scanner.nextInt();
                    System.out.println("Enter the mission status of the astronaut:");
                    String astronautMission=scanner.nextLine();

                    astronautNames[astronautCount]=astronautName;
                    astronautAges[astronautCount]=astronautAge;
                    astronautMissionStatus[astronautCount]=astronautMission;
                    astronautCount++;
                    break;
            }
        }


    }
}