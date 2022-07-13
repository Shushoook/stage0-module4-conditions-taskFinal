package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean b = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if(year > 0 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
            System.out.println(31);
        }else if (year > 0 && (month == 4 || month == 6 || month == 9 || month == 11)){
            System.out.println(30);
        }else if (year > 0 && b && month == 2){
            System.out.println(29);
        }else if (year > 0 && !b && month == 2){
            System.out.println(28);
        }else{
            System.out.println("invalid date");
        }
    }
}
