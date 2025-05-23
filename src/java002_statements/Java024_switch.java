package java002_statements;

public class Java024_switch {
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println(Day.MONDAY);
        
        switch(day) {
        case MONDAY : System.err.println("월"); break;
        case TUESDAY : System.err.println("화"); break;
        case WEDNESDAY : System.err.println("수"); break;
        case THURSDAY : System.err.println("목"); break;
        case FRIDAY : System.err.println("금"); break;
        case SATURDAY : System.err.println("토"); break;
        case SUNDAY : System.err.println("일"); break;
        }
    }

}
