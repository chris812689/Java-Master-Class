import java.util.Scanner;

public class ParsingAndReadingInput {

    public static void main(String[] args) {

        // int currentYear = 2023;
        // sumOfInput();
        minAndMax();
        // System.out.println(getInputFromScanner(currentYear));

        // try{
        // System.out.println(getInputFromConsole(currentYear));

        // }catch(NullPointerException x ){
        // System.out.println(getInputFromScanner(currentYear));
        // }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ", null);

        System.out.println("Hi, " + name + ". Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year where you born ?", null);

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";

    }

    public static String getInputFromScanner(int currentYear) {
        boolean isValid = false;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi , What's your Name?");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + ". Thanks for taking the course");

        do {
            System.out.println("What year where you born?");
            String dateOfBirth = scanner.nextLine();

            try {
                if (checkData(currentYear, dateOfBirth) != -1) {
                    isValid = true;
                    age = checkData(currentYear, dateOfBirth);

                } else {
                    System.out.println("I am sorry that is not a valid age. Please try again");
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("I am sorry that is not a valid age. Please try again");
            }

        } while (!isValid);
        scanner.close();
        return "So you are " + age + " years old.";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);

    }

    public static void sumOfInput() {
        boolean isComplete = false;
        int sum = 0;
        int count = 0;
        int countTo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to add up?");
        countTo = Integer.parseInt(scanner.nextLine());

        do {

            try {
                count++;
                System.out.println("Enter number # " + count);
                sum = sum + Integer.parseInt(scanner.nextLine());
                if (count == countTo) {
                    isComplete = true;

                    System.out.println("Your total is " + sum);
                }

            } catch (NumberFormatException badUserData) {
                System.out.println("I am sorry that is not a valid number. Please try again");
                count--;
            }

        } while (!isComplete);
        scanner.close();
    }

    public static void minAndMax() {
        boolean q = false;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Please enter a number: ");
                int number = Integer.parseInt(scanner.nextLine());

                if (min == 0 && max == 0) {
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                System.out.println("Lowest Number:" + min + " Higest number: " + max);
            } catch (NumberFormatException badUserData) {
                System.out.println("Good Bye");
                q = true;
            }

        } while (!q);
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {
        boolean q = false;
        int sum = 0;
        int avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            try {

                System.out.println("Please enter a number: ");
                int number = Integer.parseInt(scanner.nextLine());
                sum = sum + number;
                avg = sum / count;

            } catch (NumberFormatException badUserData) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                q = true;
            }

        } while (!q);
        scanner.close();
    }

}
