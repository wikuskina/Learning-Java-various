package Homework6;

public class Week {
    enum DaysWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {

        DaysWeek i = DaysWeek.TUESDAY;
        switch (i) {
            case MONDAY:
                System.out.println("This is weekday.");
                break;
            case TUESDAY:
                System.out.println("This is weekday.");
                break;
            case WEDNESDAY:
                System.out.println("This is weekday.");
                break;
            case THURSDAY:
                System.out.println("This is weekday.");
                break;
            case FRIDAY:
                System.out.println("This is weekday.");
                break;
            case SATURDAY:
                System.out.println("This is weekend.");
                break;
            case SUNDAY:
                System.out.println("This is weekend.");
                break;
            default:
               throw new AssertionError("Unrecognized enum type!"); // programming error

        }


    }

}
