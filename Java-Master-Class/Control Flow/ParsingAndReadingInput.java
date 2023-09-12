import java.util.Scanner;

public class ParsingAndReadingInput {
    
    public static void main(String[] args){

        int currentYear = 2023;

        System.out.println(getInputFromScanner(currentYear));

        // try{
        //     System.out.println(getInputFromConsole(currentYear));

        // }catch(NullPointerException x ){
        //     System.out.println(getInputFromScanner(currentYear));
        // }

    }


    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ", null);

        System.out.println("Hi, " + name + ". Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year where you born ?", null);

        int age = currentYear - Integer.parseInt(dateOfBirth);
        

        return "So you are " + age + " years old.";

    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Hi , What's your Name?");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + ". Thanks for taking the course");

        System.out.println("What year where you born?");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);
        

        return "So you are " + age + " years old.";
    }

}
