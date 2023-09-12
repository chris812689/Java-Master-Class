public class Challenge2 {
    
    public static void main(String[]args) {


        // isPalindrome(-222);
        // getEvenDigitSum(123456789);
        // hasSharedDigit(19,99);
        // hasSameLastDigit(9, 99, 19);
        // isValid(9);
        // printFactors(9);
        // getGreatestCommonDivisor(12, 16);
        // isPerfectNumber(6);
        // numberToWords(1);
        // reverse(-2);
        // getDigitCount(1235);

        canPack(5,3,24);





    //     char letter = 'A';
    //     switch(letter){
    //         case 'A': 
    //            System.out.println("Able");
    //             break;
    //         case 'B': 
    //             System.out.println("Baker");
    //             break;
    //         case 'C': 
    //             System.out.println("Charlie");
    //             break;
    //         case 'D': 
    //             System.out.println("Dog");
    //             break;
    //         case 'E': 
    //             System.out.println("Easy");
    //             break;
    //         default:
    //             System.out.println("Not Found");

    //     }

    //     printDayOfWeek(1);

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

    public static boolean isPalindrome(int number){
            int originalNumber = number;
             int newNumber = 0;
             int a =10;
             boolean numbersLeft = true;
             boolean palindrome= false;

                
                do{

                    newNumber = (newNumber*a)+ (number%10);
                    number= number/10;

                    System.out.println(newNumber);

                    if(number == 0){
                        numbersLeft = false;
                        System.out.println(newNumber +" = "+ originalNumber);
                        if(newNumber == originalNumber){
                            palindrome = true;
                            System.out.println(palindrome);
                        }
                        
                    }
                    
                }while(numbersLeft);
                return palindrome;
            }

    
    public static int sumFirstAndLastDigit(int number){
        int newNumber =0;
        if (number< 10 && number >=0){
            newNumber = number *2;
            return newNumber;
        }else if(number>0){
            
            boolean numbersLeft = true;
            newNumber = (newNumber)+ (number%10);
            do{
                number= number/10;
                if(number<10){
                    newNumber= number+newNumber;
                   numbersLeft = false;
                }     
            }while(numbersLeft);

            return newNumber;         
            }
        return -1;

    }


    public static int getEvenDigitSum(int number){
        int newNumber =0;
        boolean numbersLeft = true;
         if(number>0){
            do{
                
                if(number%2 ==0 & number !=0){
                    System.out.println("Is Even:"+newNumber);
                    newNumber= (number%10)+newNumber;
                    number= number/10;
                    System.out.println(newNumber);
                    System.out.println(number+ "part 1");
                    continue;
                    
                    
                   
                } else if(number%2 ==0 && number<10){
                    number= number/10;
                    newNumber= (number%10)+newNumber;
                    System.out.println("Last Even Number"+newNumber);
                    System.out.println(number+ "part 2");
                    numbersLeft = false;

                } else if (number<10){
                    System.out.println("Last Odd Number:"+ number);
                    number= number/10;
                    numbersLeft = false;
                    
                    System.out.println(newNumber + " part 3");
                }else{
                    number= number/10;
                    System.out.println("Odd Number:"+newNumber);
                    System.out.println(number+ "part 4");
                    
                }

            }while(numbersLeft);

            return newNumber;         
            }
        return -1;

    }


    public static boolean hasSharedDigit(int start, int end){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        if((start >= 10 && start <= 99)&& (end >= 10 && end <= 99)){


            if(start > 10){
                a = start % 10;
                b = start /10;
                System.out.println("a =" + a);
                System.out.println("b =" + b);
            }
            if(end > 10){
                c = end % 10;
                d = end /10;
                System.out.println("c =" + c);
                System.out.println("d =" + d);
            }

            if (a == c || a == d || b == c || b == d){
                System.out.println("Returned True");
                return true;
                
            }


        }
        System.out.println("Returned False");
            return false;



        
    }

    public static boolean hasSameLastDigit (int start, int middle, int end){
        int a = 0;
        int b = 0;
        int c = 0 ;

        if (isValid(start) == true && isValid(middle) == true && isValid(end) == true){
            a = start % 10;
            b = middle % 10; 
            c = end % 10;

            if (a == b || b ==c || a == c){
                System.out.println("Returned True");
                return true;
                
            }
        }
        System.out.println("Returned False");
            return false;
       
    }


    public static boolean isValid (int start){
        if((start >= 10 && start <= 1000)){
            System.out.println("Returned True");
            return true;
        }
        System.out.println("Returned False");
        return false; 
    }


    public static void printFactors(int x){
        if (x >= 1){
            String s = "";
            for(int i =1; i <= x; i ++){
                if(x % i  == 0 ){
                s= s + " " +Integer.toString(i);
                }
            }
            System.out.println(s);
        }else{
        System.out.println("Invalid Value");
        }
    }

    public static int getGreatestCommonDivisor(int x, int y){        
        if (x >= 10 && y >= 10){
            int a = 0; 
            int b = 0;
            int c = 0;
             
            for(int i =1; i <= x; i ++){
                if(x % i  == 0 ){
                    a = i;
                    for( int j = 1; j <= i; j++){
                        if(y % j  == 0 ){
                            b =j;
                             if (a == b && c < a){
                                c = a;
                        }
                        }

                    }
                }
              
            }
            return c;
        }
        return -1;
    }
    

    public static boolean isPerfectNumber(int x){
        int a = 0;
        if(  x >1){
            for(int i =1; i < x; i ++){
                if(x % i  == 0 ){
                    System.out.println(i);

                    a = a + i;
                }
              
            }
            if( a == x ){
                return true;
            }
        }
        return false; 
    }

    public static void numberToWords(int x ){
        int a = 0; 
        String s ="";
        Boolean going = true;
        if (x > 0){
            do{
                a = x % 10;
                x=x/10;
                switch(a){
                    case 0:
                        s= "Zero " + s; 
                        break;
                    case 1:
                        s= "One " + s;
                        break;
                    case 2:
                        s= "Two " + s;
                        break; 
                    case 3:
                        s= "Three " + s; 
                        break;
                    case 4:
                        s= "Four " + s; 
                        break;
                    case 5:
                        s= "Five " + s; 
                        break;
                    case 6:
                        s= "Six " + s;
                        break;
                    case 7:
                        s= "Seven " + s; 
                        break;
                    case 8:
                        s= "Egiht " + s;
                        break; 
                    case 9:
                        s= "Nine " + s;
                        break;          
                }
                if(x == 0){
                    going = false;
                    System.out.println(s);
                }
                
                

            }while(going);

        }else{
            System.out.println("Invalid Value");
        }
    }


    public static int reverse(int x){
        int a = 10; 
        int y = 0;
        boolean going = true;
        boolean negative = false;
        if (x !=0){
            if (x<0){
                negative = true;
                    }
            
            do{

                y = (y*a)+ (x % 10);
                x= x /10;
                if(x == 0){
                    going = false;
                }

            }while(going);

        }
        if(negative == true){
            y= - y ;
            System.out.println(-y);            

        }
        System.out.println("testing");
        System.out.println(y);
        return y;
    }

    public static int getDigitCount(int x ){
        int a = 0; 
        boolean going = true;
        if (x > 0){
            do{
                a++;
                x = x / 10;
                if (x == 0){
                    going = false;
                }

            }while(going);

        return a; 
        }

        return -1;

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int x =0;
        int y =0;
        if(bigCount >= 0 && smallCount >= 0 && goal >= 0){
            
            if(bigCount *5 == goal || smallCount == goal){
                return true;
            }
            
            x = goal / 5;
            y = goal % 5;

            x = bigCount - x;
            if(x > 0 && smallCount < y){
                x=0;
            }
            x = x * -5 + y ;
            x = x - smallCount;

            if(x <= 0){
                return true;
            }

        }
        return false;
    }





}
