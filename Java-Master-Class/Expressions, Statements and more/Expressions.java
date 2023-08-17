public class Expressions {
    
    public static void main(String[] args){

        // boolean gameOver = true;
        // int score = 10000;
        // int levelCompleted = 8;
        // int bonus = 200;
        // int finalScore = score;
    
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final Score was " + highScore);   
    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted,int bonus) {
         


        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            
        }
        return finalScore;

    }

    // method overloading

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + "points");
        return score *1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed player scored " + score + "points");
        return score *1000;
    }

    public static int calculateScore(){
        return 0;
    }


    // Method over loading challenge 

    public static double convertToCentimeters( double inches){
        double cent = inches * 2.54;
        System.out.println(cent);

        return cent;
    }

    public static double convertToCentimeters( double feet, double inches){
        double totalInches =  (feet * 12) + inches;
        convertToCentimeters(totalInches);
        System.out.println(totalInches);
        return totalInches;
    }
}
    