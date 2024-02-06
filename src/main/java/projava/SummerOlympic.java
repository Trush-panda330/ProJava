package projava;

import java.lang.management.PlatformLoggingMXBean;

public class SummerOlympic {
    public void main(String[] args) {
        new Olympic().isSummerOlympicYear();
    }
    public class Olympic {

    }

    /**
     *
     * @param year
     * @return
     * @throws IllegalArgumentException
     */
    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException{
        if(2032 < year) {
            throw new IllegalArgumentException();
        }
        return year % 4 == 0;
    }
}
