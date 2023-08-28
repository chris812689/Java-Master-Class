public class PrimeNumberChallenge {
    
    public static void main(String[] args){

        // System.out.println("0 is "+ (isPrime(0)? "":"NOT ")+ "a prime number.");
        // System.out.println("1 is "+ (isPrime(1)? "":"NOT ")+ "a prime number.");
        // System.out.println("2 is "+ (isPrime(2)? "":"NOT ")+ "a prime number.");
        // System.out.println("3 is "+ (isPrime(3)? "":"NOT ")+ "a prime number.");


        // primeNumberCounter(999, 10001);
        sumOdd(1, 7);

        //    int count = 0;

        // for(int i= 1;i <=1000; i++){

        //     if (count == 5){
        //     System.out. println("The Sum of the numbers add is "+ sum);
        //     break;
        //    } else if (i %3 ==0 && i %5 ==0){
        //     System.out.println("One number that is divisable by 3 and 5 is "+ i);
        //     sum = sum + i;
        //     count++;
        //    }

        // }
    }

    public static boolean isPrime(int number){
        if (number<= 2){
            return (number == 2);
        }

        for (int divisor =2; divisor <= number /2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }

        return true;
    }

    public static int primeNumberCounter(int min, int max){
        if (min <=1000){
            if(max >1000){
                max = 1000;
            }
            int counter = 0;
            for(int i=1; min <= max; i++ ){
                if(i == 1){
                    if(isPrime(min)==true){
                      System.out.println(min+" is "+ (isPrime(min)? "":"NOT ")+ "a prime number.");
                      counter ++;  
                    }

                }
                    min ++;
                    if(isPrime(min)==true){
                      System.out.println(min+" is "+ (isPrime(min)? "":"NOT ")+ "a prime number.");  
                      counter++;
                    }
                    if(counter ==3){
                        break;
                    }
            }

        }
        return -1;
    }

    public static boolean isOdd(int num){

        if ( num >0 && num % 2 !=0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start <= end){
            for (int i = start; i<= end; i ++ ){
            if (isOdd(i)== true){
            sum = sum + i;
                System.out.println(sum);
            }  
        }return sum;
        
        } return -1;

    }

}
