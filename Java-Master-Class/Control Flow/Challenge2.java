public class Challenge2 {
    
    public static void main(String[]args) {
        char letter = 'A';
        switch(letter){
            case 'A': 
               System.out.println("Able");
                break;
            case 'B': 
                System.out.println("Baker");
                break;
            case 'C': 
                System.out.println("Charlie");
                break;
            case 'D': 
                System.out.println("Dog");
                break;
            case 'E': 
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not Found");

        }

        printDayOfWeek(1);

    }
    
        
        public static void printDayOfWeek(int day){
            switch(day){
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuseday");
                case 3 -> System.out.println("Wendseday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                default-> System.out.println("Invalid Day");
            }

        }

        public static void printNumberInWord(int number){
            switch(number){
                case 0 :
                System.out.println("ZERO");
                break;
                case 1 :
                System.out.println("ONE");
                break;
                case 2 :
                System.out.println("TWO");
                break;
                case 3 :
                System.out.println("THREE");
                break;
                case 4 :
                System.out.println("FOUR");
                break;
                case 5 :
                System.out.println("FIVE");
                break;
                case 6 :
                System.out.println("SIX");
                break;
                case 7 :
                System.out.println("SEVEN");
                break;
                case 8 :
                System.out.println("EGIHT");
                break;
                case 9 :
                System.out.println("NINE");
                break;
                default:
                System.out.println(123);
                break;
            }

        }
    
    
}
