public class PrimeNumberChallenge {
    
    public static void main(String[] args){

        System.out.println("0 is "+ (isPrime(0)? "":"NOT ")+ "a prime number.");
        System.out.println("1 is "+ (isPrime(1)? "":"NOT ")+ "a prime number.");
        System.out.println("2 is "+ (isPrime(2)? "":"NOT ")+ "a prime number.");
        System.out.println("3 is "+ (isPrime(3)? "":"NOT ")+ "a prime number.");


        primeNumberCounter(999, 10001);
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
}
