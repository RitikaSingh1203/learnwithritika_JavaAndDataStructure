public class Switchcase {
    public static void main(String args[]){
        int day = 4;
        String dayName;
        //A switch statement checks the value of a
        //  variable and executes the matching case.
        switch(day){
            case 1: dayName = "Monday";
                    break; //break is used to stop the switch after a case runs.
                         //If break is not used, Java will continue executing
                         //  the next cases (this is called fall-through).
            case 2: dayName = "Tuesday";
                    break;
            case 3: dayName = "Wednesday";
                    break;
            case 4: dayName = "Thursday";
                    break;
            case 5: dayName = "Friday";
                    break;
            case 6: dayName = "Saturday";
                    break;
            case 7: dayName = "Sunday";
                    break;
            default: dayName = "Invalid Day";
        }
        System.out.println(dayName);
    }
}
