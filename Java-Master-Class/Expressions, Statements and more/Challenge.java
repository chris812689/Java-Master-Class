public class Challenge {

    public static void main(String[] args){
        int highScorePosition= calculateHighScore(1500);
        displayHighScorePosition("Chris", highScorePosition);

        highScorePosition= calculateHighScore(900);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition= calculateHighScore(300);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition= calculateHighScore(11);
        displayHighScorePosition("Dave", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int playerRanking){
        System.out.println(playerName + " managed to get into postion "
                            + playerRanking + " on the high score list ");      
    }
    
    public static int calculateHighScore(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
         return 4;
    }

    public static void checkNumber (int number){
        if (number >0){
            System.out.println("positive");
        }
        else if (number < 0){
            System.out.println("negative");
        }
        else{
            System.out.println("Zero");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remaninder = ((megaBytes * 1024) - kiloBytes);
        if (kiloBytes <0 ){
            System.out.println("Invalid Value");
        }
        else{
        System.out.println(kiloBytes + " KB = " + megaBytes +" and "
                    + remaninder + " KB");
        }
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if ((hourOfDay >7 && hourOfDay < 23 )|| hourOfDay >23 ||(hourOfDay <0) || (barking = false) ){
            return false;
        } 
        return true;
    }


    public static boolean isLeapYear(int year){
        if (year < 1 || year >9999){
            return false;
        }else  if(year %4 == 0 || year % 100 ==0 ||year % 400 ==0){
            return true;
        } return false;
    }

    public static boolean hasTeen(int number, int num, int nums){
        if (number <=19 || number >=13 || num <=19 || num >=13 || nums >=19 || nums<=13){
            return true;
        }return false;
    }

}

