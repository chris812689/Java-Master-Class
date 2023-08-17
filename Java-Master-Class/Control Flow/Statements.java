public class Statements {

        //Switch Statements 
    public static void main(String[]args) {

        String month = "April";
        System.out.println(getQuarter(month));
        int value = 1;
        // if (value ==1){
        //     System.out.println("Value was 1");
        // }else if (value == 2){
        //     System.out.println("Value was 2");
        // } else {
        //     System.out.println("Value was not 1 or 2");
        // }

        switch( value){
            case 1:
                System.out.println ("Value was 1");
                break;
            case 2:
                System.out.println ("Value was 2");
                break;
            case 3: case 4: case 5: // case grouping 
                System.out.println("Was a 3, 4, or 5");
                System.out.println("The Value was "+ value);
                break;
            default: 
                System.out.println("Value was not 1 or 2");
                break;
        }
    }

        //enhanced switch statement
    public static String getQuarter(String month){

        return switch(month){
            case "January","February","March"->  "1st";
            case "April","May","June"->  "2nd";
            case "July","August","September"->  "3rd";
            case "October","November","Decemeber"->  "4th";
            default -> "bad";
        };

        // Noice that the return is listed before the switch statment and then you do not have to rewrite it for every case
        // a default is required when this statment is used as an expression 
        // if you need to return a differenet responce inside the return swtich the key word is yield // must be in a code block 
        
    }

}