public class Testing {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-45818521);
    }

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

    public static void toTime(int seconds){
        if (seconds < 0 ){
            System.out.println("Invalid number of seconds");
        }else{
        int minutes = (seconds /60);

         toTime(minutes,seconds);
        } 
    }
    public static String toTime(int minutes, int seconds){
        String outPut = "";
        if (seconds <0 && seconds > 60){
            outPut =("Invalid number of seconds");
        }else if (minutes <0){
            outPut =("Invalid number of minutes");
        }else{
        int newMinutes = (seconds /60) + minutes;
        int hours = (minutes / 60);
        seconds= seconds %60;
        newMinutes = newMinutes % 60; 
        outPut = hours + "h "+ newMinutes +"m " + seconds + "s"; 
        }
        System.out.println(outPut);
        return outPut; 
    }

    public static double area(double x){
        double result = 0;
        if (x < 0){
            result = -1.0;
            

        }else{
             result = x*x *Math.PI;
        }System.out.println(result);
        return result;
    }

    public static double area(double x, double y){
        double result = 0;
        if (x < 0 || y< 0){
            result = -1.0;
            

        }else{
             result = x*y;
        }System.out.println(result);
        return result;
    }

    public static void printYearsAndDays(long minutes){
        if (minutes <0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes / 525600;
            long days = minutes /1440;
            System.out.println(minutes + " min = "
                    + years+ " y and " + days + " d");
        }

    }

    public static void printEqual(int x, int y, int z){
        if(x<0 || y< 0 || z<0){
            System.out.println("Invalid Value");
        }else if (x == y && y ==z){
            System.out.println("All numbers are equal");
        }else if(x != y && y!=z && x !=z){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer == true && temperature <=45 && temperature >=25){
            return true;
        }else if(summer == false && temperature <=35 && temperature >=25 ){
            return true;
        }
        return false;
    }
}
