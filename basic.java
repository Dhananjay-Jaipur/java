import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

//        constants
        final int n =10;
        //n=9;


//        take input in java
        Scanner s = new Scanner(System.in);

        // Get the user's name
        System.out.println("What is your name?");
        String name = s.nextLine();

        // Get the user's age
        System.out.println("What is your age?");
        int age = s.nextInt();


//      loops

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        //for-each
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

//      function
        even();

    }

    public static void even() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + " is odd.");
        }
    }

}