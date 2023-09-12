public class whileAndDoWhile {
    

    public static void main (String[] args){
        sumDigits(32123);
        // boolean isReady = false;
        // for ( int i = 1; i<=5; i ++){
        //     System.out.println(i);
        // }

        // while(j<=20){
            

        //     isEvenNumber(j);
        //     j++;
        // }

        // do{
        //     if(j>5){
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        // }while(isReady);



        // int number =0;
        // while (number < 50){
        //     number +=5;
        //     if (number % 25 ==0){
        //         continue;}
        //     System.out.println(number +"_");
        // }
    }

    // public static boolean isEvenNumber(int number){

    //     if(number% 2 ==0){
    //         System.out.println(number);
    //         return true;
    //     }
    //     return false;
    // }

    public static int sumDigits (int number){
        if(number >0){
            int sum = 0;

            boolean numbersLeft = true;
            do{
                sum = sum +(number %10);
                number = number /10;
                if(number == 0){
                    numbersLeft= false;
                }

            }while(numbersLeft);
                System.out.println(sum);
                return sum;
            
        }return -1;
    }
}
