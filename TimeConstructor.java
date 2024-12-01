import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Time {
    int hr;
    int min;
    int sec;

    public Time() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void printTime() {
        LocalTime time = LocalTime.of(hr, min, sec);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Time: " + time.format(formatter));
    }
}

class Main {
    public static void main(String[] args) {
        Time defaultTime = new Time();
        defaultTime.printTime();

        Time customTime = new Time(14, 30, 45);
        customTime.printTime();
    }
}
